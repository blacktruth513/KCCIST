package Chapter._20._3;

import java.util.Random;
/*
 * ����(Random Number)�� ����
 * ��¥ ����(Pseudo random number)
 */
public class PseudoRandom {
	public static void main(String[] args) {
		
		//�����ڿ� ���޵� ����(Seed Number, �õ尪)�� ������ ���� �������� �������� ���
		//�������� �˰����� �� ���ڸ� ������� ���ư��� ������ ���������� 100% ��ġ, �������
		Random rand = new Random(12);
		
		for (int i = 0; i < 7; i++) {
			// 0�̻� 1000�̸� ���� ����, �ߺ�����
			System.out.println(rand.nextInt(1000));
		} 
		
		System.out.println(System.currentTimeMillis());
	}
}
