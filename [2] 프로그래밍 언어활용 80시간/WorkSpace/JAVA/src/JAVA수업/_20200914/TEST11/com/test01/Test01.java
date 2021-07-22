package JAVA����._20200914.TEST11.com.test01;

class Student_Instance {
	public String name;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void gotoSchool() {
		System.out.println(this.name +"�� �б��� ����");
	}
	
}

class Student_Static {
	public static String name;
	
	
	
	public static String getName() {
		return name;
	}
	
	
	
	public static void setName(String nm) {
		name = nm;
	}
	
	
	
	public static void gotoSchool() {
		System.out.println(name +"�� �б��� ����");
	}
	
}

class Employee {
	private String name;
	
	public Employee() {
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	public void work() {
		System.out.println(this.name + "�� ���� �Ѵ�.");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Test01 {
	
	public static void main(String[] args) {
		Student_Instance stu = new Student_Instance();
		stu.setName("ȫ�浿[Instance]");
		stu.gotoSchool();
		
		Student_Static.setName("ȫ�浿[Static]");		
		Student_Static.gotoSchool();	
		
		Employee emp = new Employee("�̼���");
		System.out.println(emp.getName());
		emp.work();
	}

}
