package ws2.java2.entity;

public class Vehicle {
	
	//���뺯��
	String modelName;
	int maxSpeed;
	int numberLimit;
	boolean available;
	
	//Default Constructor
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	//�ٸ� ��Ű������ �����ϱ� ���� public ���������� ����
	public Vehicle(String modelName, int maxSpeed, int numberLimit) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
	}
	
	//��ӹޱ� ���� displayInfo method
	public void displayInfo() {
		
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + modelName);
		System.out.println(" �ְ�ӵ� : " + maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + numberLimit + "��");
	}
	
	//���뺯���� ���� getter, setter
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getNumberLimit() {
		return numberLimit;
	}
	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}
