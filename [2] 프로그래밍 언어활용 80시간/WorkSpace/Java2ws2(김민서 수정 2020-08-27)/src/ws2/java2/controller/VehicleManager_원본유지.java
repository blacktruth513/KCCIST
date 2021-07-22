package ws2.java2.controller;

import ws2.java2.entity.*;

public class VehicleManager_�������� {
	Airplane[] airplaneArr;
	Car[] carArr;
	Ship[] shipArr;

	static Vehicle[][] vehicleArr;

	public VehicleManager_��������() {
		airplaneArr = new Airplane[2];
		carArr = new Car[3];
		shipArr = new Ship[2];

		airplaneArr[0] = new Airplane("����747", 1300, 300, 4);
		airplaneArr[1] = new Airplane("F-16", 1600, 1, 1);

		carArr[0] = new Car("�ҳ�Ÿ3", 180, 5, 10);
		carArr[1] = new Car("Ƽ��", 130, 4, 15);
		carArr[2] = new Car("��Ÿ����", 150, 10, 11);

		shipArr[0] = new Ship("ũ����2", 30, 400, 35000);
		shipArr[1] = new Ship("��ƿ����", 25, 150, 15000);
	}

	public void displayVehicles(String title) {
		System.out.println(title);

		for (int inx = 0; inx < airplaneArr.length; inx++) {
			airplaneArr[inx].displayInfo();
			airplaneArr[inx].setAvailable(true);
		}

		for (int inx = 0; inx < carArr.length; inx++) {
			carArr[inx].displayInfo();
			carArr[inx].setAvailable(true);
		}

		for (int inx = 0; inx < shipArr.length; inx++) {
			shipArr[inx].displayInfo();
			shipArr[inx].setAvailable(true);
		}

		System.out.println();
	}

	public void sortByModelName() {

		/*
		 * �߰��� �޼��� ������ 
		 * �迭�� ���� ��������(vehicleArr)�� �̿��Ͽ� 
		 * �迭 ���� ��ü�鿡 ���ؼ� 
		 * �𵨸�(modelName)�� ������������ ������ �����ϵ��� 
		 * ���� for ���� ����� �ڵ带 �ۼ��Ѵ�
		 */
		
		System.out.println("*********** [1]. vehicleArr�� ����");
		vehicleArr = new Vehicle[3][3];
		for (int i = 0; i < vehicleArr.length; i++) {
			for (int j = 0; j < vehicleArr.length; j++) {
				try {
					if (i == 0) {
						vehicleArr[0][j] = airplaneArr[j];
						System.out.println("[" + i + "][" + j + "]"+vehicleArr[0][j].getModelName());
					} else if (i == 1) {
						vehicleArr[1][j] = carArr[j];
						System.out.println("[" + i + "][" + j + "]"+vehicleArr[1][j].getModelName());
					} else if (i == 2) {
						vehicleArr[2][j] = shipArr[j];
						System.out.println("[" + i + "][" + j + "]"+vehicleArr[2][j].getModelName());
					}
				} catch (ArrayIndexOutOfBoundsException e) {
//					System.out.println("[" + i + "][" + j + "]���� null �߻�");
					// TODO: handle exception
				}//the end of try ~ catch
			}//the end of for j
		}//the end of for i
		
		System.out.println("*********** [2]. ���� ��� ���");
		for (int i = 0; i < vehicleArr.length; i++) {
			for (int j = 0; j < vehicleArr.length; j++) {
				try {
					System.out.println("[" + i + "][" + j + "]"+vehicleArr[i][j].getModelName()+"\t" + (int)(vehicleArr[i][j].getModelName()).charAt(0));
//						System.out.println(vehicleArr[i][j].toString());
				} catch (NullPointerException e) {
//					System.out.println("[" + i + "][" + j + "]���� null �߻�");
					// TODO: handle exception
				}//the end of try ~ catch
			}//the end of for j
		}//the end of for i
		
		System.out.println("*********** [3]. ���� ����");
		System.out.println("i = 0");
		for (int i = 0; i < vehicleArr.length-1; i++) {
			boolean changed = false;
			for (int j = 0; j < vehicleArr.length-1-i; j++) {
				try {
					
//					System.out.println("[" + i + "][" + j + "]" + (int)(vehicleArr[i][j].getModelName()).charAt(0));
					if (((int)(vehicleArr[0][j].getModelName()).charAt(0)>(int)((vehicleArr[0][j+1].getModelName()).charAt(0))) && (vehicleArr[1][j] != null)) {
						Vehicle temp = vehicleArr[0][j];
						vehicleArr[0][j] = vehicleArr[0][j+1];
						vehicleArr[0][j+1] = temp;
						changed = true;
//						System.out.println("[" + i + "][" + j + "]�ڸ��ٲ�!");
					}
					if (! changed) break; 
					
				} catch (NullPointerException e) {
//					System.out.println("[" + i + "][" + j + "]���� null �߻�");
					// TODO: handle exception
				}//the end of try catch
			}// the end of for j
		}//the end of for i
		
		System.out.println("i = 1");
		for (int i = 0; i < 3-1; i++) {
			boolean changed = false;
			for (int j = 0; j < 3; j++) {
				try {
					
//					System.out.println("[" + i + "][" + j + "]" + (int)(vehicleArr[1][j].getModelName()).charAt(0));
//					System.out.println("[" + i + "][" + (j+1) + "]" + (int)(vehicleArr[1][j+1].getModelName()).charAt(0));
					if ((int)(vehicleArr[1][j].getModelName()).charAt(0)>(int)((vehicleArr[1][j+1].getModelName()).charAt(0))) {
						Vehicle temp = vehicleArr[1][j];
						vehicleArr[1][j] = vehicleArr[1][j+1];
						vehicleArr[1][j+1] = temp;
//						changed = true;
//						System.out.println("[" + i + "][" + j + "]�ڸ��ٲ�!");
					}
//					if (! changed) break; 
					
				} catch (NullPointerException|ArrayIndexOutOfBoundsException e) {
//					System.out.println("[" + i + "][" + j + "]���� null �߻�");
					// TODO: handle exception
				}//the end of try ~ catch
			}// the end of for j
		}//the end of for i
		
		System.out.println("i = 2");
		for (int i = 0; i < 3-1; i++) {
			boolean changed = false;
			for (int j = 0; j < 3-1; j++) {
				try {
					
					if (((int)(vehicleArr[2][j].getModelName()).charAt(0)>(int)((vehicleArr[2][j+1].getModelName()).charAt(0))) && (vehicleArr[2][j] != null)) {
						Vehicle temp = vehicleArr[2][j];
						vehicleArr[2][j] = vehicleArr[2][j+1];
						vehicleArr[2][j+1] = temp;
						changed = true;
//						System.out.println("[" + i + "][" + j + "]�ڸ��ٲ�!");
					}
					if (! changed) break; 
					
				} catch (NullPointerException e) {
//					System.out.println("[" + i + "][" + j + "]���� null �߻�");
				}//the end of try ~ catch
			}//the end of for j
		}//the end of for i
		
		System.out.println("*********** [4]. ��� ���");
		for (int i = 0; i < vehicleArr.length; i++) {
			for (int j = 0; j < vehicleArr.length; j++) {
				try {
//					System.out.println("[" + i + "][" + j + "]" + (int)(vehicleArr[i][j].getModelName()).charAt(0));
					System.out.println("[" + i + "][" + j + "]" + (vehicleArr[i][j].getModelName()));
//						System.out.println(vehicleArr[i][j].toString());
				} catch (NullPointerException e) {
//					System.out.println("[" + i + "][" + j + "]���� null �߻�");
					// TODO: handle exception
				}//the end of try ~ catcy
			}//the end of for j
		}//the end of for i
		
	}// the end of method sortByModelName
	
}//the end of class
