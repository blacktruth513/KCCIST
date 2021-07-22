package com.test7;
public class Test1 {
	public enum Season {
		WINTER(100), SPRING(200), SUMMER(300), FALL(400);
		private int value;
		Season(int value){
			this.value = value;
		}
	}
	public static void main(String[] args) {
		Season s = Season.WINTER;
		System.out.println(s);
		for(Season s2 : Season.values()) {
			System.out.println(s2.value);
		}
		System.out.println(Season.valueOf("WINTER"));
		System.out.println(Season.valueOf("WINTER").ordinal());
		System.out.println(Season.valueOf("SUMMER").ordinal());
	}
}
