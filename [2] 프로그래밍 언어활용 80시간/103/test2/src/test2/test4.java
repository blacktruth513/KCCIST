package test2;

import java.util.*;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��� �ּ���.");
		int age = sc.nextInt(); // I(����_�빮��)
		if (age > 18) {
			System.out.println("����� �����Դϴ�.");
		} else {
			System.out.println("����� �̼������Դϴ�.");
		}
		System.out.println("����� ���̴� " + age);
	}

}
