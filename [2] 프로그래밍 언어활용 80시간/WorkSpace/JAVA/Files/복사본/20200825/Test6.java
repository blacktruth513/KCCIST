class Student{
	public String name;
	public int age;
	public void setNameAge(String nm, int ag) {
		name = nm;
		age = ag;
	}
}
public class Test6 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "ȫ�浿";
		stu.age = 20;
		System.out.println(stu.name + ", " + stu.age);
		stu.setNameAge("������", 50);
		System.out.println(stu.name + ", " + stu.age);
	}
}
