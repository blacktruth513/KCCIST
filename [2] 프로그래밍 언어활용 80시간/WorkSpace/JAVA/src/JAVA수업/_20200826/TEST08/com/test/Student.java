package JAVA����._20200826.TEST08.com.test;

public class Student {
	
	//Ŭ���� ���� �ܿ��� �� ������ �����ϱ� ���� private ����
	private String name;
	private static String test;
	
	public Student() {
		super();
	}

	public Student(String name) {
		super();
		this.name = name;
//		this.test
	}

	//getter and setter�� ������ �� ���� ���� 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
