package com.test3;
import java.util.*;
class A {}
class B extends A{}
class C extends A{}
public class Test1 {
	static void testList(List<? extends Number> list) {
		for(Number a: list) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		List<A> list1 = new ArrayList<A>();
		List<B> list2 = new ArrayList<B>();
	}
}
