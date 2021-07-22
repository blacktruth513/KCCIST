package ws1.java2.controller;

import ws1.java2.entity.*;

public class VehicleManager {
	Airplane[] airplaneArr;
	Car[] carArr;
	Ship[] shipArr;
	
	public VehicleManager() {
		airplaneArr = new Airplane[2];
		carArr = new Car[3];
		shipArr = new Ship[2];
		
		airplaneArr[0] = new Airplane();
		airplaneArr[0].modelName = "보잉747"; 
		airplaneArr[0].maxSpeed = 1300;
		airplaneArr[0].numberLimit = 300;
		airplaneArr[0].numOfEngine = 4;
		
		airplaneArr[1] = new Airplane();
		airplaneArr[1].modelName = "F-16"; 
		airplaneArr[1].maxSpeed = 1600;
		airplaneArr[1].numberLimit = 1;
		airplaneArr[1].numOfEngine = 1;
		
		carArr[0] = new Car();
		carArr[0].modelName = "소나타3";
		carArr[0].maxSpeed = 180;
		carArr[0].numberLimit = 5;
		carArr[0].mileage = 10;
		
		carArr[1] = new Car();
		carArr[1].modelName = "티코";
		carArr[1].maxSpeed = 130;
		carArr[1].numberLimit = 4;
		carArr[1].mileage = 15;

		carArr[2] = new Car();
		carArr[2].modelName = "스타렉스";
		carArr[2].maxSpeed = 150;
		carArr[2].numberLimit = 10;
		carArr[2].mileage = 11;

		shipArr[0] = new Ship();
		shipArr[0].modelName = "크루즈2";
		shipArr[0].maxSpeed = 30;
		shipArr[0].numberLimit = 400;
		shipArr[0].replacement = 35000;
			
		shipArr[1] = new Ship();
		shipArr[1].modelName = "노틸러스";
		shipArr[1].maxSpeed = 25;
		shipArr[1].numberLimit = 150;
		shipArr[1].replacement = 15000;
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int inx = 0 ; inx < airplaneArr.length ; inx++) {
			airplaneArr[inx].displayInfo();
			airplaneArr[inx].available = true;
		}
		
		for (int inx = 0 ; inx < carArr.length ; inx++) {
			carArr[inx].displayInfo();
			carArr[inx].available = true;
		}
		
		for (int inx = 0 ; inx < shipArr.length ; inx++) {
			shipArr[inx].displayInfo();
			shipArr[inx].available = true;
		}
		
		System.out.println();
	}
}

