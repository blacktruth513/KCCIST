package JAVA����._20200821.TEST02;

/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * Page : 119
 */
public class Test12 {
	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		int sum = 0;
		for (int j = 0; j <= 10; j++) {
			System.out.println(j);
			sum +=j;
		}
		System.out.println("sum = "+sum);
		
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.print(" ["+i+"ȸ��]\t[j:"+j+"����] ");
			}
			System.out.println();
		}
		
	}//the end of main
}//the end of class
