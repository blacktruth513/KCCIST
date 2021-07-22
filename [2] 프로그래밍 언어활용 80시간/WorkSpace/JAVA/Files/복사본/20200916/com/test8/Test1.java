package com.test8;
enum Gender {
	MAN(10), WOMAN(20);
	int a;
	private Gender(int a) {
		this.a = a;
	}
}
public class Test1 {	
	public static void main(String[] args) {
		Gender g = Gender.MAN;
		System.out.println(g + ", " + g.a);
		System.out.println(g.valueOf("MAN").ordinal());
		System.out.println(g.valueOf("MAN").a);

	}

}
