package test3;

public class test5 {

	public static void main(String[] args) {
		// Method Overloading
		add(1,2);
		add(1,2,3);
		add("1","2");
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add("1","2"));
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	public static String add(String a, String b) {
	}
}