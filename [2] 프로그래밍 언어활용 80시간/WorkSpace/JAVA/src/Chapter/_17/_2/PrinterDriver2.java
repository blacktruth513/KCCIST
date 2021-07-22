package Chapter._17._2;
/*
 * �������̽��� ����Ǵ� �޼ҵ�� ����
 * 	- �������̽��� ��� �޼ҵ�� public�� ����Ȱ����� ����
 *  - ������ ������ ����� ����
 */
//MS���� �����ϴ� Interface
interface MS_Printable2 {
	public void print(String doc);//������
}

//�Ｚ ��������� ����̹�
class Samsung_PrintDriver_Prn204Drv implements MS_Printable2 {

	@Override
	public void print(String doc) {
		System.out.println("From MD-204 Printer");
		System.out.println(doc);
	}
	
}

//LG ��������� ����̹�
class LG_PrintDriver_MD_731 implements MS_Printable2 {

	@Override
	public void print(String doc) {
		System.out.println("From MD-731 Printer");
		System.out.println(doc);
	}
	
}

public class PrinterDriver2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDoc = "This is a report about...";
		
		MS_Printable2 prn = new Samsung_PrintDriver_Prn204Drv();
		prn.print(myDoc);
		System.out.println();
		
		prn = new LG_PrintDriver_MD_731();
		prn.print(myDoc);
	}

}
