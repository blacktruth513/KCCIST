package com.test;

public class Test9 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for(int v:a) {
			System.out.println(v);
		}
		
		String[] names = { "�̼���", "������", "�����ҹ�", "�������" };
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j] + ", " + names[j].length());
		}
		
		for(String s : names) {
			System.out.println(s + ", " + s.length());
		}
		
	}
}