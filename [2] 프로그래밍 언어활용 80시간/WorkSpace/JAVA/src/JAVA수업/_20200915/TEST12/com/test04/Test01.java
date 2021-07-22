package JAVA����._20200915.TEST12.com.test04;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * �������� ����
 */

class Student implements Comparable {
	
	private int rollno;
	private String name;
	private int age;
	
	public Student(int rollno,String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	//Sorting ������ ���ϱ� ���� compareTo�� �����Ѵ�
	@Override
	public int compareTo(Object o) {
		Student p = (Student)o;
		System.out.println("compareTo : "+o.toString());
		
		if (this.rollno > p.rollno) {
			return 1;
		} else if (this.rollno < p.rollno) {
			return -1;
		} else {
			return 0;
		}
	}//the end of method

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
}//the end of class

public class Test01 {
	public static void main(String[] args) {
		
		Student[] ar = new Student[3];
		ar[0] = new Student(1111,"�̼���", 29);
		ar[1] = new Student(2222,"ȫ�浿", 15);
		ar[2] = new Student(3333,"������", 37);
		
		Arrays.sort(ar);
		System.out.println("���İ��");
		for (Student p : ar) {
			System.out.println(p);
		}
	
	}//The end of Main Method
}//The end of class