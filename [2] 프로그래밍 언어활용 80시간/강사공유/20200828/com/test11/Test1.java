package com.test11;
interface Calculate { int operate(int a, int b); }
class Plus implements Calculate {
	public int operate(int a, int b) {
		return a + b;
	}
}
class Minus implements Calculate {
	public int operate(int a, int b) {
		return a - b;
	}
}
class Divide implements Calculate {
	public int operate(int a, int b) {
		return a / b;
	}
}
class Calculator {
	Calculate c;
	Calculator(Calculate c){ // Calculate c = new Plus()
		this.c = c;
	}
	public int operate(int x, int y) {
		return c.operate(x, y);
	}
}
public class Test1 {
	public static void main(String[] args) {
		Calculator c = new Calculator(new Plus());
		System.out.println(c.operate(1,2));
		Calculator c2 = new Calculator(new Minus());
		System.out.println(c2.operate(4,2));
		Calculator c3 = new Calculator(new Divide());
		c3.operate(4, 2);
	}
}
