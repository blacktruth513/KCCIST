package JAVA����._20200914.TEST11.com.test03;

class Man {
	public String name;
	
	Man() {
		System.out.println("Default Man Constructor");
		this.name = "������";
	}
	
	Man(String name){
		this.name = name;
	}
	
//	public void tellYourName() {
	private void tellYourName() {
		System.out.println(this.name);
	}
	
}

class BusiniessMan extends Man {
	public String telNo;
	public BusiniessMan() {
		super("�������");
		System.out.println("Default Business Constructor");
//		this.name = "�̼���";
		this.telNo = "000";
	}
	
	BusiniessMan(String name, String telNo) {
		super(name);
		this.telNo = telNo;
	}
	
	public void tellYourInfo() {
		System.out.println(this.name + " " + this.telNo);
	}
}

public class Test01 {
	public static void main(String[] args) {
		BusiniessMan b1 = new BusiniessMan();
		b1.tellYourInfo();
		
		BusiniessMan b2 = new BusiniessMan("ȫ�浿","111");
		b2.tellYourInfo();
	}
}
