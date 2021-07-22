package com.test23;
class Orange {}
class Box<T>{
	private T o;
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		return this.o;
	}
}
public class Test1 {
	public static void main(String[] args) {
		Box<String> b = new Box<String>();
		b.set("ȫ�浿");
		System.out.println(b.get());
		Box<Orange> b2 = new Box<Orange>();
	}
}
