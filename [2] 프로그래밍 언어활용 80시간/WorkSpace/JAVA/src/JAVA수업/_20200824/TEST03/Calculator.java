package JAVA����._20200824.TEST03;
public class Calculator {
	public static int pluse(int value1, int value2) {
		int result = value1 + value2;
		System.out.println(value1 + " + " + value2 + " = " + result);
		return result;
	}

	public static int minus(int value1, int value2) {
		int result = value1 - value2;
		System.out.println(value1 + " - " + value2 + " = " + result);
		return result;
	}

	public static int multiply(int value1, int value2) {
		int result = value1 * value2;
		System.out.println(value1 + " X " + value2 + " = " + result);
		return result;
	}

	public static int divide(int value1, int value2) {
		int result = value1 / value2;
		System.out.println(value1 + " / " + value2 + " = " + result);
		System.out.println("�� : "+result);
		System.out.println("������ : "+value1%value2);
		return result;
	}
}//The end of class