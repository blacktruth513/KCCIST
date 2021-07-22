class Calc {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
}
public class Test1 {
	public static int add(int a, int b) { // a = x, b = y
		int c = a + b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = Test1.add(x, y);
		System.out.println(z);
		Calc c = new Calc();
		System.out.println(c.add(x, y));
	}

}
