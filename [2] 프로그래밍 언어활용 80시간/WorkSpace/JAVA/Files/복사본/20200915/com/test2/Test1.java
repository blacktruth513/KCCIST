package com.test2;
public class Test1 {
	static void test(Object a) {
		Integer i = (Integer)a;
		i.intValue();
	}
	static void test2(int b) {}
	public static void main(String[] args) {
		String str = "ÀÌ¼ø½Å"; // Reference type
		int a = 100; // Value type
		test(str); 
		test(a); // Object a = 100
		// Integer a = 100;
		Object o = new Integer(100);
		Object o2 = 100;
		int o3 = (Integer)o2;
	}
}
