package com.test11;
class CheckAgeException 
extends Exception { CheckAgeException() { super("당신의 나이는 20살이상입니다.");}}
public class Test1 {
	static void validate(int age) throws CheckAgeException {
		if(age > 20)
			throw new CheckAgeException();
		else 
			System.out.println("문제없음");	
	}
	public static void main(String[] args) {
		try { validate(30); } catch (CheckAgeException e) {
			System.out.println("오류발생하였습니다. " + e.getMessage());
		}
	}
}
