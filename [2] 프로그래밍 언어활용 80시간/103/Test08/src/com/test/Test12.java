package com.test;
class Student3{
	String name;
	static String school = "서울고등학교";
}
public class Test12 {
	public static void main(String[] args) {
	Student3 stu = new Student3();
	stu.name = "홍길동";
	System.out.println(stu.name + "," + stu.school);
	Student3 stu2 = new Student3();
	stu2.name = "세종대왕";
	System.out.println(stu2.name + "," + stu2.school);
	stu.school="부천고등학교";
	System.out.println(stu.name + "," + stu.school);
	System.out.println(stu2.name + "," + stu2.school);
	}
}
