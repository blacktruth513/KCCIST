package Chapter._17._2;

/*
 * 1. �������̽� ����߰� ���
 * �������̽� �� ��� ����
 *  - �� Ŭ���� ������ ����� extends�� ����Ѵ�.
 *  - �� �������̽� ������ ��ӵ� extends�� ����Ѵ�.
 *  - �������̽��� Ŭ���� ������ ������ implements�� ����Ѵ�.
 */

//MS���� �����ϴ� Interface
interface MS_Printable3 {
	public void print(String doc);//������
}

//MS_Printable3�������̽��� ����ϴ� �������̽� [extends] 
interface ColorPrintable extends MS_Printable3 {
	void printCMYK(String doc);
}

//�Ｚ ��������� ����̹�
class Samsung_PrintDriver_Prn909Drv implements ColorPrintable {

	//��� ���
	@Override
	public void print(String doc) {
		System.out.println("From MD-909 Black & White ver");
		System.out.println(doc);
	}

	//�÷� ���
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
	
}

public class PrinterDriver3 {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		ColorPrintable prn = new Samsung_PrintDriver_Prn909Drv();
		prn.print(myDoc);
		System.out.println();
		prn.printCMYK(myDoc);
	}
}
