package JAVA����._20200914.TEST11.com.test07;

public class Test01 {
	public static void main(String[] args) {
		
		int[] a = new int[5];
//		a[5] = 30/0;//���ܹ߻�
		
		try {
			a[5] = 30/0;//���ܹ߻�
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("By divide 0");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array index out of bounds");
		} catch (Exception e) {
			System.out.println("Others exceptions");
		}
		
	}
}
