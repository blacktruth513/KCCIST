package com.test10;
public class Test1 {
	public static void main(String[] args) {
		try {
			int a = 10/0;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());		
		} catch(Exception e) {
			
		} finally {
			System.out.println("End");
		}
	}

}
