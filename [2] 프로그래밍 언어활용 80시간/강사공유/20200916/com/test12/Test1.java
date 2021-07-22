package com.test12;
interface Calc {
	int add(int a, int b);
}
public class Test1 {
	static void test(Calc d) {} // Calc d = c;
	public static void main(String[] args) {
		Calc c = (x, y) -> { return x + y;};
		int d = c.add(10, 20);
		System.out.println(d);
		test(c);
	}
}
