package com.test15;
interface Printable{	void print(); }
interface Showable{ void print(); }
class A7 implements Printable, Showable {
	public void print() {
		System.out.println("A7");
	}
}
public class Test1 {
	public static void main(String[] args) {
		A7 a = new A7();
		a.print();

	}

}
