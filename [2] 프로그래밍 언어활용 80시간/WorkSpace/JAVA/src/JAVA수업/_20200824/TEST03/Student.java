package JAVA����._20200824.TEST03;
public class Student{
	//public ���������� ���� ���� ���� �� ȣ���� ����
	public String name;
	public int age;
	public String gender;
	
	public void study() {
		System.out.println(name + ", "+age+", "+gender+" ���θ� �Ѵ�.");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}