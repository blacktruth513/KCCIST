package JAVA����._20200827.TEST09.com.test;

class Student2 {
	String name;
	public Student2() {
		// TODO Auto-generated constructor stub
//		this.name = "�л�";
//		this("��");
		this("�ʶ�"," ��");
	}
	public Student2(String name) {
		this.name = name;
	}
	public Student2(String you, String me) {
		this.name = you.concat(me);
	}
	public void gotoSchool() {
		System.out.println(this.name+"��(��) �б��� ����.");
	}
}

class MiddleStudent2 extends Student2 {
	public void study() {
		System.out.println("���л��� �����Ѵ�.");
	}
}

public class Test05 {
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.gotoSchool();
		Student2 stu2 = new Student2("��");
		stu2.gotoSchool();
		
		MiddleStudent2 mstu = new MiddleStudent2();
		mstu.gotoSchool();
		mstu.name = "���л�";
		mstu.gotoSchool();
		mstu.study();;
	}
}
