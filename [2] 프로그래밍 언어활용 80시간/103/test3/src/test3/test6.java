package test3;
// 학생 
// 상태(특징) : 나이, 이름, 성별
// 동작(행위) : 공부한다
class Student {
	public String name;
	public int age;
	public String gender; // 순서대로 처리되지 않음
	public void study() {
		System.out.println(name + "," + age + "," + gender + "," + "공부를 한다.");
	}
}
public class test6 {
	public static void main(String[] args) {
		Student s;
		s = new Student();
		// Student s = new student();
		s.name = "이순신";
		s.age = 30;
		s.gender = "남자";
		s.study();
		Student s2 = new Student();
		s2.name = "강감찬";
		s2.age = 20;
		s2.gender = "남자";
		s2.study();
		
		Student s3 = s2;

	}
}