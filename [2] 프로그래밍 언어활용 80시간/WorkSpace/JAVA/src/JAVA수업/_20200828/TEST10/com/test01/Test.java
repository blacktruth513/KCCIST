package JAVA����._20200828.TEST10.com.test01;

public class Test {
	public static void main(String[] args) {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ȳ��ϼ���";
		
		if (str1 == str2) {
			System.out.println("OK1");
		}
		String str3 = new String("�ȳ��ϼ���");
		String str4 = new String("�ȳ��ϼ���");
		if (str3 == str4) {
			System.out.println("OK2");
		}
		if (str3.equals(str4)) {
			System.out.println("OK3");
		}
	}
}
