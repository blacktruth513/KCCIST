package com.test;

class Student {
	private String name;

	public Student() {
		this("ȫ�浿");
		this.eat();
	}

	public Student(String name) {
		this.name = name;
	}
	public void study() {
		System.out.println(this.name + "�� �����ϴ�.");
	}

	public void eat() {
		System.out.println(this.name + "�� ���� �Դ�.");
	}
}

public class Test3 {

	public static void main(String[] args) {
	}

}
