
public class Test6 {
	public static void main(String[] args) {
		Student s;
		s = new Student();
//		Student s = new Student();
		s.name = "�̼���";
		s.age = 30;
		s.gender = "����";
		s.study();
		
		Student s2 = new Student();
		s2.name = "������";
		s2.age = 20;
		s2.gender = "����";
		s2.study();
		
		Student s3 = s2;
		Student s4 = s2;
		Student s5 = s3;
//		s3.study();
		
		int a = 1;
		int b = a;

	}
}
