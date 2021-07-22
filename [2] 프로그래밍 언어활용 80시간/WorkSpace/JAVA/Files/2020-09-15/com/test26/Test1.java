// 499

package com.test26;
public class Test1 {
	static <E> void displayArray(E[] elements) {
		for(E e : elements) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Integer[] arr = {10, 20, 30};
		Test1.<Integer>displayArray(arr);
		displayArray(arr);
	}
}


