package com.test17;
interface Drawable {
	void draw();
	default void msg() { System.out.println("msg"); }
	static void draw2() { System.out.println("draw2"); } 
}
class Rectangle implements Drawable {
	public void draw() {
		System.out.println("Rectangle");
	}	
}
public class Test1 {
	public static void main(String[] args) {
		Drawable d = new Rectangle();
		d.draw();
		Drawable.draw2();

	}

}
