package test3;

public class test1 {

	public static void main(String[] args) {
		Test3.CheckEvenOdd(1);
		CheckEvenOdd(2);
	}

	public static void CheckEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("Event");
		} else {
			System.out.println("Odd");
		}
	}

}
