package JAVA����._20200827.TEST09.com.test;

class Student {
	String name;
	public Student () {
		this("ȫ�浿");
		eat();
	}
	public Student(String name) {
		this.name = name;
	}
	
	public void study () {
		System.out.println(this.name + "�� �����Ѵ�");
	}
	
	public void eat () {
		System.out.println(this.name + "�� ���� �Դ´�");
	}
}

public class Test03 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Student stu = new Student();
		Student stu2 = new Student("�������");
		stu2.eat();
	}
}
