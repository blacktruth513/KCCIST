package JAVA����._20200824.TEST03;

import java.util.Scanner;

/*
 *	Chapter11
 *	11-1 �޼ҵ忡 ���� ���ؿ� �޼ҵ��� ����
 *	Page : 241
 *
 *	Ŭ������ ������ �޼ҵ带 �Բ� ��� �����Ѵ�.
 */

/*
	�л��̶� ��ü�� ������
	�л��� Ư¡
		1. ����
		2. �̸�
		3. ����
	�л��� ����, ����
		1. �����Ѵ�.
 */
@SuppressWarnings("unused")
public class Test06 {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.age = 30;
		student.name = "�̼���";
		student.gender="����";
		student.study();
		System.out.println(student.toString());
		
		
		Student student2 = new Student();
		student2.age = 25;
		student2.name = "������";
		student2.gender="����";
		student2.study();
		System.out.println(student2.toString());
		
		Student s3 = student2;
		System.out.println(s3.toString());
	}//end of main
}//end of class

/*class Student{
	//public ���������� ���� ���� ���� �� ȣ���� ����
	public String name;
	public int age;
	public String gender;
	
	public void study() {
		System.out.println(name + ", "+age+", "+gender+" ���θ� �Ѵ�.");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}*/

