package JAVA����._20200826.TEST08.com.test;

class Student3{
	String name;
	static String school = "�������б�";
}

public class Test12 {
	
	public static void main(String[] args) {
		Student3 student = new Student3();
		student.name = "ȫ�浿";
		System.out.println(student.name + ", " + student.school);
		Student3 student2 = new Student3();
		student2.name = "�������";
		System.out.println(student2.name + ", " + student2.school);
		
		//����ƽ ������ ����
		student2.school = "��õ����б�";

		System.out.println(student.name + ", " + student.school);
		System.out.println(student2.name + ", " + student2.school);
	}

}
