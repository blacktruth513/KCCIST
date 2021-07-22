package com.test21;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("ȫ�浿");
		al.add(19.20);
		Object o = al.get(0);
		System.out.println(((Integer)o).intValue());
		Object o2 = al.get(1);
		String s = (String)o2;
		System.out.println(s);
	}
}
