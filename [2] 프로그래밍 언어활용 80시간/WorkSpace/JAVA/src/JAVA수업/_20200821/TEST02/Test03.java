package JAVA����._20200821.TEST02;

/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * 104Page
 */
public class Test03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int age = 20;
		int age = 16;
		int grade = 1;
		
		/*True*/
		if(age > 17) {	// (��ȣ ������ ��) > True False 
			System.out.println("True : 17�캸�� ũ��\n �����ϴ�");
		}else {
			System.out.println("False : 17���� �۽��ϴ�.");
		}
		
		/*False*/
		if(age < 17) {	// (��ȣ ������ ��) > True False 
			System.out.println("���� ��� : 17�캸�� ũ��");
		}
		
		/* 
		 * == 	: �񱳿�����
		 * =	: ���Կ�����
		 */
		if (grade  == 1) {
			System.out.println("����� ����� 1�Դϴ�.");
		}
		
		/*
		 * ���ǹ��� ������ �� ��ȣ������ �����ϴ�
		 */
		
		if (grade  == 1) 
			System.out.println("����� ����� 1�Դϴ�.");
		
	}

}
