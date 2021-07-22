package Chapter._17._2;

/*
 * 2. �������̽� ��� �߰� ���
 * �������̽��� ����Ʈ �޼ҵ�
 *  - ������� ��ɺ����� ���� ��� �������̽��� �ּ� �Ѱ� �̻��� �߻� �޼ҵ带 �߰��ؾ��� ��
 *  - �������̽��� �⺻������ public�� ����� ����
 *  - default ���
 */

//MS���� �����ϴ� Interface
interface MS_Printable4 {
	public void print(String doc);//������
	//�������̽��� ����Ʈ�޼ҵ� �߰�
	default void printCMYK(String doc) {}
}

class Prn731Drv implements MS_Printable4 {
	@Override
	public void print(String doc) {
		System.out.println("From Prn731 printer");
		System.out.println(doc);
	}
}

class Prn909Drv implements MS_Printable4 {
	@Override
	public void print(String doc) {
		System.out.println("From MD-909 Black & White ver");
		System.out.println(doc);
	}
	
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		MS_Printable4.super.printCMYK(doc);
	}
}

public class PrinterDriver4 {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		MS_Printable4 prn = new Prn731Drv();
		prn.print(myDoc);
		System.out.println();
		
		MS_Printable4 prn2 = new Prn909Drv();
		prn2.print(myDoc);
		prn2.printCMYK(myDoc);
	}
}
