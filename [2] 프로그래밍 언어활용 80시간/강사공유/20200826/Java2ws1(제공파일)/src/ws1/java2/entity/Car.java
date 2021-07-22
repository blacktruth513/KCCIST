package ws1.java2.entity;

public class Car {
	public String modelName;
	public int maxSpeed;
	public int numberLimit;
	public int mileage;
	public boolean available;
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 평균연비 : " + mileage + "km/l");
	}
}
