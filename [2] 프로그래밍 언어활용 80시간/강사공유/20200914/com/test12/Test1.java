package com.test12;
import java.util.Scanner;
class CheckAge extends Exception {
	CheckAge(String message) { super(message); }
}
public class Test1 {
	static void checkAge(int age) throws CheckAge {
		if(age < 18) 
			throw new CheckAge("당신은 18세가 아닙니다.");
		else 
			System.out.println("당신은 18세 이상입니다.");
	}
	public static void main(String[] args) {
		System.out.print("당신의 나이를 입력해주세요. : ");
		Scanner kb = new Scanner(System.in); 
		int age = kb.nextInt();
		try {
			checkAge(age);
		} catch(CheckAge e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {		
		} finally {
			System.out.println("종료");
		}
		
	}
}
