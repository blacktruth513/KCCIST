package QUIZE.Workshop.Java2ws2_InheritanceAndPolymorphism.driver;

import QUIZE.Workshop.Java2ws2_InheritanceAndPolymorphism.controller.VehicleManager;

//import ws2.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles(">> ��� ��� <<");
		vm.sortByModelName();
		vm.displayVehicles(">> �𵨸����� ���ĵ� ��� ��� <<");
	}
}