package Chapter._20._3;

import java.util.Random;
/*
 * ����(Random Number)�� ����
 */
public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i = 0; i < 7; i++) {
			// 0�̻� 1000�̸� ���� ����, �ߺ�����
			System.out.println(rand.nextInt(1000));
		} 
		
	}
}
