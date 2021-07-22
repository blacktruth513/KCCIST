package Chapter._17._1;
/*
 * Interface�� ������ �ǹ�
 * 	- �������̽� �ϳ��� ����� ��� ��ü�� ����
 * 	- �ϳ��ϳ� ������ ������ �� ���� �� �������̽� �ϳ��� �ξ� ���� ������ �� �ֵ��� �ϱ� ����
 */
//MS���� �����ϴ� Interface
interface MS_Printable1 {
	public void print(String doc);
}

class Samsung_PrintDriver1 implements MS_Printable1 {

	@Override
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
	}
	
}

class LG_PrintDriver1 implements MS_Printable1 {

	@Override
	public void print(String doc) {
		System.out.println("From LG Printer");
		System.out.println(doc);
	}
	
}

public class PrinterDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDoc = "This is a report about...";
		
		//�Ｚ ������ ���
		MS_Printable1 prn = new Samsung_PrintDriver1();
		prn.print(myDoc);
		System.out.println();
		
		//�Ｚ ������ ���
		prn = new LG_PrintDriver1();
		prn.print(myDoc);
	}

}
