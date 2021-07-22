package com.test6;
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("10"); al.add("20");
		List<String> al2 = new ArrayList<String>();
		al2.add("100"); al2.add("200");
		Iterator<String> s = al.iterator();
		while(s.hasNext()) {
			String str = s.next();
			System.out.println(str);
		}
		for(Iterator<String> s2 = al2.iterator();s2.hasNext();) {
			String str = s2.next();
			System.out.println(str);
		}
		

	}

}
