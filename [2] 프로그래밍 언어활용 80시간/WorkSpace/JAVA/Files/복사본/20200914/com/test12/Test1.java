package com.test12;
import java.util.Scanner;
class CheckAge extends Exception {
	CheckAge(String message) { super(message); }
}
public class Test1 {
	static void checkAge(int age) throws CheckAge {
		if(age < 18) 
			throw new CheckAge("����� 18���� �ƴմϴ�.");
		else 
			System.out.println("����� 18�� �̻��Դϴ�.");
	}
	public static void main(String[] args) {
		System.out.print("����� ���̸� �Է����ּ���. : ");
		Scanner kb = new Scanner(System.in); 
		int age = kb.nextInt();
		try {
			checkAge(age);
		} catch(CheckAge e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {		
		} finally {
			System.out.println("����");
		}
		
	}
}
