package JAVA����._20200821.TEST02;
/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * Page : 119
 */
public class Test10 {
	public static void main(String[] args) {
		
		System.out.println("ȣ��� �� ����[�ʱⰪ(0)�� +1�� ���¿��� ��µȴ�.]");
		int i = 1;
		int sum = 0;
		
		while(i<=10) {
			System.out.println(i);
			i++;	//ȣ��� �� ����
		}

		System.out.println("ȣ��ǰ� ����[�ʱⰪ(0)���� ȣ��ȴ�]");
		int j = 0;
		while(j<=10) {
			System.out.println(j);
			++j; 	//ȣ��ǰ� ����
		}
		
		System.out.println("ȣ��� �� �����Ǵ� sum");
		int ii = 1;
		while(ii<=10) {
			sum += ii;
			System.out.println("[sum :"+sum+"]\t [i :"+ii+"]");
			ii++;	
		}
		System.out.println("[sum :"+sum+"]\t [i :"+ii+"]");
		
		
	}
}
