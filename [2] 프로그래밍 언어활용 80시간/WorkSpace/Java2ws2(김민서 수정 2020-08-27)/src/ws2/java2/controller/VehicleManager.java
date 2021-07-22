package ws2.java2.controller;

import java.util.Arrays;
import java.util.Scanner;

import ws2.java2.entity.*;

public class VehicleManager {

	/*
	 * 2020-09-14
	Airplane[] airplaneArr;
	Car[] carArr;
	Ship[] shipArr;
	 */

	static Vehicle[] vehicleArr = new Vehicle[7];;
	static String modelName;
	static int maxSpeed;
	static int numberLimit;
	void input(int num) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�𵨸� : ");
		modelName = scan.nextLine();
		
		System.out.print("�ְ�ӵ� : ");
		maxSpeed = scan.nextInt();
		
		System.out.print("���Ѽ��� : ");
		numberLimit = scan.nextInt();
		
	}
	
	public VehicleManager() {
		
		/*
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
		 */
		
		
		//String modelName, int maxSpeed, int numberLimit
		
		int i=0;
		int cnt = 1;
		while (i < vehicleArr.length) {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("["+cnt+"/"+vehicleArr.length+"]� ������ Ż��? [1.�װ�,2.��,3.�ڵ���] :");
			int model = scan.nextInt();
			
			
			if (model==1) {
				input(i);
				System.out.print("�������� : ");
				int numOfEngine = scan.nextInt();
				vehicleArr[i] = new Airplane(modelName,maxSpeed,numberLimit,numOfEngine);
				System.out.println("============================");
			}else if(model==2) {
				input(i);
				System.out.print("����� : ");
				int replacement = scan.nextInt();
				vehicleArr[i] = new Ship(modelName,maxSpeed,numberLimit,replacement);
				System.out.println("============================");
			}else if(model==3) {
				input(i);
				System.out.print("��տ��� : ");
				int mileage = scan.nextInt();
				vehicleArr[i] = new Ship(modelName,maxSpeed,numberLimit,mileage);
				System.out.println("============================");
			}
			i++;
			cnt++;
		}
		
		/*
		vehicleArr[0] = new Airplane("����747", 1300, 300, 4);
		vehicleArr[1] = new Airplane("F-16", 1600, 1, 1);

		vehicleArr[2] = new Car("�ҳ�Ÿ3", 180, 5, 10);
		vehicleArr[3] = new Car("Ƽ��", 130, 4, 15);
		vehicleArr[4] = new Car("��Ÿ����", 150, 10, 11);

		vehicleArr[5] = new Ship("ũ����2", 30, 400, 35000);
		vehicleArr[6] = new Ship("��ƿ����", 25, 150, 15000);
		*/
	}

	public void displayVehicles(String title) {
		System.out.println(title);
		for (int inx = 0; inx < vehicleArr.length; inx++) {
			vehicleArr[inx].displayInfo();
			vehicleArr[inx].setAvailable(true);
		}
		/*
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
		*/
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
		
		System.out.println("*********** \t[1]. ���\t***********");
		for (int i = 0; i < vehicleArr.length; i++) {
			System.out.println("[ " + i + " ]" +vehicleArr[i].getModelName()+"\t : "+ (int)(vehicleArr[i].getModelName()).charAt(0));
		}//the end of for i
		
		System.out.println("*********** \t[2]. ���� ����\t***********");
		boolean changed = false;
//		for (int i = 0; i < vehicleArr.length-1; i++) {
		for (int i = 0; i < vehicleArr.length; i++) {
//			for (int j = 0; j < vehicleArr.length-1-i; j++) {
				for (int j = 0; j < vehicleArr.length; j++) {
				try {
					
//					System.out.print("[" + i + "][" + j + "]" + (vehicleArr[j].getModelName())+":"+(vehicleArr[j+1].getModelName())+"\t");
					if ( (int)(vehicleArr[j].getModelName()).charAt(0) > (int)(vehicleArr[j+1].getModelName()).charAt(0) ) {
						Vehicle temp = vehicleArr[j];
						vehicleArr[j] = vehicleArr[j+1];
						vehicleArr[j+1] = temp;
						changed = true;
					}
					if (! changed) {
						break; 
					}
					
				} catch (NullPointerException|ArrayIndexOutOfBoundsException e) {
//					System.out.println("[" + i + "][" + j + "]���� null �߻�");
					// TODO: handle exception
				}//the end of try catch
				System.out.print("[" + i + "][" + j + "]" + (vehicleArr[j].getModelName())+"\t");
			}// the end of for j
			System.out.println("");
		}//the end of for i
		
		for (int i = 0; i < vehicleArr.length; i++) {
			System.out.println("[ " + i + " ]" +vehicleArr[i].getModelName()+"\t : "+ (int)(vehicleArr[i].getModelName()).charAt(0));
		}//the end of for i
		
	
		System.out.println("*********** \t[3]. ���\t***********");
		for (int i = 0; i < vehicleArr.length; i++) {
			System.out.println("[ " + i + " ]" +vehicleArr[i].getModelName()+"\t : "+ (int)(vehicleArr[i].getModelName()).charAt(0));
		}//the end of for i
		
	}// the end of method sortByModelName
	
}//the end of class
