package JAVA����._20200825.TEST04;

public class Test01 {
	public static void main(String[] args) {
		message();
		String msg = message2();
		System.out.println(msg);
		
	}
	
	public static void message() {
		System.out.println("MESSAGE");
	}
	
	public static String message2() {
		return "�ȳ��ϼ���";
	}
	
}

class MyClass {
	public static void message() {
		
	}
	
	public static String message2() {
		return null;
	}
	
}