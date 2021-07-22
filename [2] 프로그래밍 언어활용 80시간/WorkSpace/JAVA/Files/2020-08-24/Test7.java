
public class Test7 {
	public static void message(int count) { // int count = c
		System.out.println(count);
	}
	public static void message2(Student s2) { // Student s2 = s;
		System.out.println(s2.name);
		s2.study();
	}
	public static void main(String[] args) {
		int c = 10;
		message(c);
		Student s = new Student();
		s.name = "È«±æµ¿";
		s.age = 30;
		s.gender = "³²";
		message2(s);
		
	}
}
