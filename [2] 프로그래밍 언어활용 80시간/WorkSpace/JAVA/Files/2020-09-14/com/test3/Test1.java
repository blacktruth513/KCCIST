package com.test3;
class Man {
	Man() { System.out.println("Default Man Constructor");  this.name = "°­°¨Âù";}
	Man(String name) { this.name = name; }
	public String name;
	private void tellYourName() { System.out.println(this.name); }
}
class BusinessMan extends Man{
	BusinessMan() { 
		super("¼¼Á¾´ë¿Õ");
		System.out.println("Default Business Constructor"); 
		this.telNo = "000"; 
	}
	BusinessMan(String name, String telNo){
		super(name);		
		this.telNo = telNo;
	}
	public String telNo;
	public void tellYourInfo() {		
		System.out.println(this.name + " "	+ this.telNo); 
	}
}
public class Test1 {
	public static void main(String[] args) {		
//		BusinessMan b = new BusinessMan();
//		b.tellYourInfo();
		BusinessMan b2 = new BusinessMan("È«±æµ¿", "111");
		b2.tellYourInfo();
		
		
	}
}
