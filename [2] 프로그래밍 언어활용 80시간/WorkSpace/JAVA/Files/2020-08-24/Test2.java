public class Test2 {
	public static void main(String[] args) {
		int x = add(1,2);
		System.out.println(x);
//		int y = add2(1,2);
		add2(1,2);
	}	
	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	public static void add2(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
}
