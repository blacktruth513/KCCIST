package com.test15;
class MyInteger {
	private int i;
	MyInteger(){}
	MyInteger(int i){ this.i = i; }
	public int getValue() { return this.i; }
	public void setValue(int i) { this.i =i; }
	public String toString() { return Integer.toString(i); }
}
public class Test1 {
	public static void main(String[] args) {
		MyInteger m = new MyInteger(10);
		System.out.println(m);
	}
}
