class MyClass4{
	public int a;
	public String b;
}
public class Test4 {
	public static void main(String[] args) {
		MyClass4 c = new MyClass4();
		System.out.println(c.a);
		System.out.println(c.b);
		c.a = 10; // setter
		System.out.println(c.a); // getter
		c.b = "이순신";
		System.out.println(c.b);
		int a  = 1;
		int b = a;
		MyClass4 c2 = c;
		System.out.println(c2.a + ", " + c2.b);
		c2.a = 30; c2.b = "세종대왕";
		System.out.println(c.a + ", " + c.b);
		int x = 100;
		test(x);
		System.out.println(x);
		
	}
	static void test(int a) { // int a = x => a = 100
		System.out.println(a);
		a = 20;
	}
}
