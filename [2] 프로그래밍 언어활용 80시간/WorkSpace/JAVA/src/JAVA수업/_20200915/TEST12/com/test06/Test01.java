package JAVA����._20200915.TEST12.com.test06;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		
		al1.add(10);			//int
		al1.add("ȫ�浿");	//String
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(10);
		al2.add(20);
		
		for (Integer i : al2) {
			System.out.println(i);
		}
		
		ArrayList<String> al3 = new ArrayList<String>();
		
		al3.add("������");
		al3.add("�̼���");
		
		for (String m : al3) {
			System.out.println(m);
		}
		
	}
}
