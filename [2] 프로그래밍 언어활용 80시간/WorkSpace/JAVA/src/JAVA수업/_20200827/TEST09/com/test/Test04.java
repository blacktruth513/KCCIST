package JAVA����._20200827.TEST09.com.test;

public class Test04 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		String ln = "\n";
		String line = "==========================================";
		System.out.println(ln.concat(line));
		String test = "ABCDEFGH";
		String subString = test.substring(2);
		System.out.println("test : "+test);
		System.out.println("test.substring(2) : "+subString);
		System.out.println("test.charAt(1) : "+test.charAt(1));
		System.out.println("test.charAt(2) : "+test.charAt(2));
		System.out.println("test.charAt(3) : "+test.charAt(3));
		System.out.println("test.charAt(4) : "+test.charAt(4));
		System.out.println("test.charAt(5) : "+test.charAt(5));
		System.out.println("test.charAt(6) : "+test.charAt(6));
		System.out.println("test.charAt(7) : "+test.charAt(7));
		for (int i = 0; i < 10; i++) {
		try {
				System.out.println("test.charAt("+i+") : "+test.charAt(i));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("test.charAt("+i+")�� �ε������� ���� �߻� : "+e.getStackTrace());
			System.out.println("getStackTrace() : "+e.getMessage());
			}
		}
		subString = test.substring(2,5);
		System.out.println("test.substring(2,5) : "+subString);
		System.out.println("==========================================\n\tint a=0; \n\tint b = 0;\n");
		System.out.println("\tif (a == b)");
		if (a == b) {
			System.out.println("\tOK\n==========================================");
		}
		
		String s = new String("A");	//���ο� ��ü ���� > ���ο� �ּҰ� �Ҵ�
		String s2 = new String("A");//���ο� ��ü ���� > ���ο� �ּҰ� �Ҵ�
		System.out.println("\tString s = new String(\"A\");\n\tString s2 = new String(\"A\");\n");
		System.out.println("\tif (s == s2) {");
		if (s == s2) {
			System.out.println("\t���� �ּҰ��� �ٶ󺸰� �ִ�.\n==========================================");
		}else {
			System.out.println("\t���� �ٸ� �ּҰ��� �ٶ󺸰� �ִ�.\n==========================================");
		}
		
		System.out.println("\tif (s.equals(s2))\n");
		if (s.equals(s2)) {
			System.out.println("\t���ڿ��� ����.\n==========================================");
		}else {
			System.out.println("\t���ڿ��� ���� �ٸ���\n==========================================");
		}
		
		String s3 = s;
		System.out.println("\tString s3 = s;\n");
		System.out.println("\tif (s == s3)");
		if (s == s3) {
			System.out.println("\t���� �ּҰ��� �ٶ󺸰� �ִ�.\n==========================================");
		}else {
			System.out.println("\t���� �ٸ� �ּҰ��� �ٶ󺸰� �ִ�.\n==========================================");
		}
		
		String s4 = "A";
		String s5 = "A";
		System.out.println("\tString s4 = \"A\";\n\tString s5 = \"A\";\n");
		System.out.println("\tif (s4 == s5)");
		if (s4 == s5) {
			System.out.println("\t���� �ּҰ��� �ٶ󺸰� �ִ�.\n==========================================");
		}else {
			System.out.println("\t���� �ٸ� �ּҰ��� �ٶ󺸰� �ִ�.\n==========================================");
		}
	}
}
