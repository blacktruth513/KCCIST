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
public class Test07 {
	public static void main(String[] args) {
		int c = 10;
		message(10);
		Student student = new Student();
		student.name = "ȫ�浿";
		student.age = 30;
		student.gender = "����";
		message2(student);
	}//end of main
	
	public static void message(int count) {
		System.out.println(count);
	}
	public static void message2(Student student2) {
		System.out.println(student2.name);
		student2.study();
	}
	
}//end of class