package com.test;
class Student { // public, default
	// public, private, protected, default
	private static String name;
	public static void setName(String mn) { name = mn; }
	public static String getName() { return name; }
	public static void gotoSchool() { System.out.println(name + "�� �б��� ����."); }
}
class Employee {
	private String name;
	Employee() {}
	Employee(String name) { this.name = name; }
	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }
	public void work() { System.out.println(this.name + "�� ���� �Ѵ�."); }
}
public class Test1 {
	public static void main(String[] args) {
		Employee emp = new Employee("�̼���");
		System.out.println(emp.getName());
		emp.work();
//		Student.setName("ȫ�浿");
//		Student.gotoSchool();
//		Student stu = new Student();
//		stu.setName("ȫ�浿");
//		stu.gotoSchool();
	}
}
