package Chapter._20._1;

public class WrapperClassMethod {

	public static void main(String[] args) {
		
		/*Ŭ���� �޼ҵ带 ���� �ν��Ͻ� ���� ��� �� ����*/
		
		//���� ��� Integer �ν��Ͻ� ����
		Integer n1 = Integer.valueOf(5);
		//���ڿ� ��� Integer �ν��Ͻ� ����
		Integer n2 = Integer.valueOf("1024");
		
		
		/*��� �񱳿� ���� ����ϴ� Ŭ���� �޼ҵ�*/
		System.out.println("ū   ��	: "+Integer.max(n1, n2));
		System.out.println("���� ��	: "+Integer.min(n1, n2));
		System.out.println("��      : "+Integer.sum(n1, n2));
		System.out.println();
		
		/*������ ���� 2�� 8�� 16���� ǥ�� ����� ��ȯ�ϴ� Ŭ���� �޼ҵ�*/
		System.out.println("12�� 02�� ǥ�� : " + Integer.toBinaryString(12));
		System.out.println("12�� 08�� ǥ�� : " + Integer.toOctalString(12));
		System.out.println("12�� 16�� ǥ�� : " + Integer.toHexString(12));
		
	}
}
