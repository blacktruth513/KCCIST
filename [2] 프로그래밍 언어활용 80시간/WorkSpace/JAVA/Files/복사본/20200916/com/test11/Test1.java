package com.test11;
interface Drawable {
	void draw();
}
public class Test1 {
	public static void main(String[] args) {
		Drawable d = new Drawable() {
			public void draw() { System.out.println("Draw");}
		};
		d.draw();
		Drawable d2 = () -> { System.out.println("Draw");};
		d2.draw();
	}
}
