package Chapter._20._3;

import java.util.Random;
import java.util.Scanner;

/**
 * [������ ����]
 * ���α׷� ����ڷκ��� ������ ���� A�� Z�� �Է¹޴´�.
 * �׸��� A�� Z�� �����Ͽ� �� ���̿� �ִ� ���� 10���� �����Ͽ� 
 * ����ϴ� ���α׷��� �ۼ��غ���
 */

public class Quize {
	public static void main(String[] args) {
		//���α׷� ����ڷκ��� ������ ���� A�� Z�� �Է¹޴´�.
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		System.out.print("������ ����A : ");
		String input1 = scan.nextLine();
		System.out.println();
		System.out.print("������ ����Z : ");
		String input2 = scan.nextLine();
		
//		System.out.println("ū   ��	: "+Integer.max(n1, n2));
//		System.out.println("���� ��	: "+Integer.min(n1, n2));
		
		int min = Integer.min(input1.charAt(0), input2.charAt(0));
		int max = Integer.max(input1.charAt(0), input2.charAt(0));
		
		System.out.println("MIN : "+min+"\nMAX : "+max);
		System.out.println((Integer.compare(min, max)));
		
		for (int i = 0; i < 10; i++) {
			// 0�̻� 1000�̸� ���� ����, �ߺ�����
			System.out.println((Math.random()*(Integer.compare(min, max))));
		} 
	}
}
