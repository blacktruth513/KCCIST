package com.test;

class Student2 {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

public class Test8 {

	public static void main(String[] args) {
		Student2[] stus = new Student2[2];
stus[0] = new Student2();
stus[1] = new Student2();
stus[0].setName("�̼���");
stus[1].setName("������");
System.out.println(stus[0].getName());
System.out.println(stus[1].getName());
	}

}
