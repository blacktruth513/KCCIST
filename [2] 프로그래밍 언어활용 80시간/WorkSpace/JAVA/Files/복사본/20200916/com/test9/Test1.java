package com.test9;
public class Test1 {
	static void display(String... vars) {
		for(String s : vars) {
			System.out.println(s);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		display("ȫ�浿");
		display("�̼���", "ȫ�浿");
		display("������", "ȫ�浿", "�̼���");
	}
}
