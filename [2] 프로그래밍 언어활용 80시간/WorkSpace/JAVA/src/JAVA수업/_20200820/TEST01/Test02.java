package JAVA����._20200820.TEST01;

public class Test02 {
	public static void main(String[] args) {
		int a = 1;
		int b = a;
		
		Student student1 = new Student();
		
		student1.name = "�̼���";
		student1.age = 20;
		
		Student student2 = student1;
		
		System.out.println(student2.name);
		System.out.println(student2.age);
		
		student1.name = "�̼���2";
		student1.age = 21;
		
		System.out.println(student2.name);
		System.out.println(student2.age);
		
		Student student3 = student1;
	}
}
