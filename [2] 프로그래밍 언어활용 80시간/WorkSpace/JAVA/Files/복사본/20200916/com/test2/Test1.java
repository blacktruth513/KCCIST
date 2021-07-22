package com.test2;
import java.util.*;
public class Test1 {
	static <T> void test(List<T> list) {}
	static void test3(List<? extends Number> list) {}
	static Double add(ArrayList<? extends Number> num) {
		double sum = 0.0;
		for(Number n : num) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10); al.add(20);
		System.out.println(add(al));
	}
}
