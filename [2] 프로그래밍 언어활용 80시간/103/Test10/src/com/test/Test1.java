package com.test;
public class Test1 {
public static void main(String[] args) {
	String str1 = "�ȳ��ϼ���.";
	String str2 = "�ȳ��ϼ���.";
	if(str1 == str2) {System.out.println("O.K");}
	String str3 = new String("�ȳ��ϼ���.");
	String str4 = new String("�ȳ��ϼ���.");
	if(str3 == str4) {System.out.println("O.K2");}
	if(str3.equals(str4)) {System.out.println("O.K3");}
}
}
