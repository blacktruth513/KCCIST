package JAVA����._20200826.TEST08.com.test;

public class Test08 {
	
	public static void main(String[] args) {
		Student2[] stu = new Student2[3];
//		stu[0].setName("ȫ�浿"); // ������ Ÿ�Ը� ����� ����
		
		stu[0] = new Student2();
		stu[1] = new Student2();
		stu[2] = new Student2();
		
		stu[0].setName("�̼���");
		stu[1].setName("������");
		stu[2].setName("��μ�");
		
		System.out.println(stu[0].getName());
		System.out.println(stu[1].getName());
		System.out.println(stu[2].getName());

	}
}

class Student2{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}