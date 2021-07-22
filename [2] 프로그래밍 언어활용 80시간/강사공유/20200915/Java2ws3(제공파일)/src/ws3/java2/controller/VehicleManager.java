package ws3.java2.controller;

import ws3.java2.entity.*;

public class VehicleManager {
	//�Ʒ� �ڵ�� �迭�� �����ϴ� ������ ������ ���̴�.
	//ArrayList�� �����ϵ��� ���ο� ������ �����Ͻÿ�.(��������  vehicleList)
	Vehicle[] vehicleArr;
	
	public VehicleManager() {
		//�Ʒ� �ڵ�� �迭�� �̿��ϵ��� �ۼ��Ǿ���.
		//ArrayList�� ����ϵ��� �����Ͻÿ�.
		
		vehicleArr = new Vehicle[7];
		
		vehicleArr[0] = new Airplane("����747", 1300, 300, 4);
		vehicleArr[1] = new Airplane("F-16", 1600, 1, 1);
		vehicleArr[2] = new Car("�ҳ�Ÿ3", 180, 5, 10);
		vehicleArr[3] = new Car("Ƽ��", 130, 4, 15);
        vehicleArr[4] = new Car("��Ÿ����", 150, 10, 11);
        vehicleArr[5] = new Ship("ũ����2", 30, 400, 35000);
		vehicleArr[6] = new Ship("��ƿ����", 25, 150, 15000);
	}
	
	public void displayVehicles(String title) {
		//�Ʒ� �ڵ�� �迭�� ����Ű�� ��� ��ü�� ������ ����ϵ��� �ۼ��Ǿ���.
		//ArrayList�� vehicleList�� ��� ��� ��ü�� ����ϵ��� �����Ͻÿ�.
		
		System.out.println(title);
		
		for (int inx = 0 ; inx < vehicleArr.length ; inx++) {
			vehicleArr[inx].displayInfo();
			vehicleArr[inx].setAvailable(true);
		}
		
		System.out.println();
	}
	
	public void sortByModelName() {
		//�Ʒ� �ڵ�� �迭�� ���ؼ� ������ �����ϴ� ���̴�.
		//ArrayList�� vehicleList�� ���ؼ� ������ �����ϴ� �ڵ�� ��ȯ�Ͻÿ�.
		
		for (int inx = 0 ; inx < vehicleArr.length - 1 ; inx++) {
			for (int jnx = inx + 1 ; jnx < vehicleArr.length ; jnx++) {
				if (vehicleArr[inx].getModelName().compareTo(vehicleArr[jnx].getModelName()) > 0) {
					Vehicle temp = vehicleArr[inx];
					vehicleArr[inx] = vehicleArr[jnx];
					vehicleArr[jnx] = temp;
				}
			}
		}
	}
}

