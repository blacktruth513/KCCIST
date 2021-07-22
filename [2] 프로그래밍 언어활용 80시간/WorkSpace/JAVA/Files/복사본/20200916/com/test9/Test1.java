package com.test9;
public class Test1 {
	static void display(String... vars) {
		for(String s : vars) {
			System.out.println(s);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		display("홍길동");
		display("이순신", "홍길동");
		display("강감찬", "홍길동", "이순신");
	}
}
