public class Test4 {
	public static void main(String[] args) {
		int result1 = Calculator.add(1, 2);
		int result2 = Calculator.divide(4, 2);
		int result3 = Calculator.multiply(8, 2);
		int result4 = Calculator.subtract(4, 2);
		System.out.println(result1 + ", " + result2 +
				", " + result3 + ", " + result4);
		
		Calculator2 c;
		c = new Calculator2();
		int result5 = c.add(1, 2);
		int result6 = c.divide(4, 2);
		int result7 = c.multiply(8, 2);
		int result8 = c.subtract(4, 2);
		System.out.println(result5 + ", " + result6 +
				", " + result7 + ", " + result8);
		
	}
}
