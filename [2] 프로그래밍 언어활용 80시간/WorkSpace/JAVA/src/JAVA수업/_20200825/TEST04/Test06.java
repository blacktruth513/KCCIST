package JAVA����._20200825.TEST04;

public class Test06 {
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.name = "ȫ�浿";
		student.age = 20;
		System.out.println(student.toString());
		
		student.setNameAge("������", 50);
		System.out.println(student.toString());
		
	}
}

class Student{
	public String name;
	public int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setNameAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}