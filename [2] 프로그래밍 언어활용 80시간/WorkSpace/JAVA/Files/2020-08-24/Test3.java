class Checker {
	public static void CheckEvenOdd(int num) {
		if(num % 2 == 0) {
			System.out.println("Event");
		} else {
			System.out.println("Odd");
		}
	}
}
public class Test3 {
	public static void main(String[] args) {
		Checker.CheckEvenOdd(1);
		Checker.CheckEvenOdd(2);
	}	
}
