package com.test24;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10); // int
		al.add("ȫ�浿"); // String
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		for(Integer i : al2) {
			System.out.println(i);
		}
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("������");
		al3.add("�̼���");
		for(String m : al3) {
			System.out.println(m);
		}
	}
}
