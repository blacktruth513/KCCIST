package com.test1;

import java.util.ArrayList;
import java.util.List;

abstract class Shape { 
	abstract void draw();
}
class Circle extends Shape { void draw() { System.out.println("Circle draw");}}
class Rectangle extends Shape { void draw() { System.out.println("Rectangle draw");}}
public class Test1 {
	static void drawShapes(List<? extends Shape> lists) {
		for(Shape s : lists) {
			s.draw();
		}
	}
	public static void main(String[] args) {
		ArrayList<Circle> list1 = new ArrayList<Circle>();
		list1.add(new Circle()); list1.add(new Circle());
		ArrayList<Rectangle> list2 = new ArrayList<Rectangle>();
		list2.add(new Rectangle()); list2.add(new Rectangle());
		drawShapes(list1);
		drawShapes(list2);
	}
}
