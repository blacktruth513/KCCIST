package JAVA����._20200825.TEST04.com.test.run;

import JAVA����._20200825.TEST04.com.mycompany.module.MyClass2;

public class Test01 {
	public static void main(String[] args) {
		MyClass c = new MyClass();//���� ��Ű����ο� ������ import�� �ʿ����.
		c.aMethod();
		
		//��Ű�� ��ΰ� �ٸ� ��� import�� ����Ѵ�.
		MyClass2 c2 = new MyClass2();
		c2.aMethod();
	}
}
