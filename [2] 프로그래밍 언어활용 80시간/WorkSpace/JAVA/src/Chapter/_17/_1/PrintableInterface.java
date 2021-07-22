package Chapter._17._1;
/*
 * Interface : ������, ����, �� ���̸� �����ϴ� �Ű�ü
 * 	- ������ �������̽��� ����� �� Ű���� Implements ���
 * 	- �� Ŭ�������� �� �̻��� �������̽� ���� ����
 *  - ��Ӱ� ������ ���ÿ� ����
 */
interface Printable {
	public void print(String doc);
}

class Printer implements Printable {

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println(doc);
	}
	
}

public class PrintableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable printableInterfaceInctance = new Printer();
		
		/*
		 * Ŭ������ ���ó�� (�θ� Ŭ������ �޼ҵ� ȣ��)
		 * �������̽��� ���ǵ� �߻� �޼ҵ� ȣ�� ����
		 */
		printableInterfaceInctance.print("Hello Java");
	}

}
