package Chapter;

import java.util.Scanner;

import JAVA����._20200824.TEST03.Calculator;
import JAVA����._20200824.TEST03.Calculator2;

//Ŭ���� ������ public�� ���� Ŭ������ �������� ������ �����ؾ��Ѵ�.
public class Test04 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("value1 ���� �Է� �Ͻÿ� :");
		int value1 = scan.nextInt();
		System.out.print("value2 ���� �Է� �Ͻÿ� :");
		int value2 = scan.nextInt();
		
		//Static Method�� �ν��Ͻ��� �������� �ʾƵ� ����� �����ϴ�.
		Calculator calculator = new Calculator();
		calculator.pluse(value1, value2);
		Calculator.minus(value1, value2);
		calculator.multiply(value1, value2);
		Calculator.divide(value1, value2);
		
		//�ν��Ͻ� Method�� �ν��Ͻ��� �����ؾ� ����� �� �ִ�.
		Calculator2 calculator2 = new Calculator2();
		calculator2.pluse(value1, value2);
		calculator2.minus(value1, value2);
		calculator2.multiply(value1, value2);
		calculator2.divide(value1, value2);
		
		/**
		 * �ν��Ͻ���?
		 * Stack heap
		 */
		
	}
	
}//end of class