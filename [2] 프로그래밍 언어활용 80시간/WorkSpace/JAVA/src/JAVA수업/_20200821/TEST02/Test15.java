package JAVA����._20200821.TEST02;

import java.util.Scanner;
/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * Page : 119
 */
@SuppressWarnings("unused")
public class Test15 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				continue; //�ٽ� for������ �̵�
			}
			System.out.println(i);
		}
		
		System.out.println("===");
		
		int j = 1;
		while (j <= 10) {
			if (j==5) {
//				j++;
				continue;
			}
			System.out.println(j);
			j++;
		}
		
	}// the end of main
}// the end of class