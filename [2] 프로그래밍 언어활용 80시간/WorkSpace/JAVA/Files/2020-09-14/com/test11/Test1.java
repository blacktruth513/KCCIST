package com.test11;
class CheckAgeException 
extends Exception { CheckAgeException() { super("����� ���̴� 20���̻��Դϴ�.");}}
public class Test1 {
	static void validate(int age) throws CheckAgeException {
		if(age > 20)
			throw new CheckAgeException();
		else 
			System.out.println("��������");	
	}
	public static void main(String[] args) {
		try { validate(30); } catch (CheckAgeException e) {
			System.out.println("�����߻��Ͽ����ϴ�. " + e.getMessage());
		}
	}
}
