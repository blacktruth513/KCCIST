package com.test22;

import java.util.Arrays;
class Student implements Comparable {
	int rollno;
	String name;
	int age;
	Student(int rollno, String name, int age){
		this.rollno = rollno; this.name = name; this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Student stu = (Student)o;
		if(this.age ==  stu.age) 
			return 0;
		else if(this.age > stu.age)
			return 1;
		else 
			return -1;
	}
}
public class Test1 {
	public static void main(String[] args) {
		Student[] stus = { new Student(1111, "이순신", 20),
				new Student(2222, "홍길동", 16),
				new Student(3333, "강감찬", 40) };
			Arrays.sort(stus);
			for(Student s : stus) {
				System.out.println(s.rollno + ", " + s.name + ", " + s.age);
			}
		}
}
