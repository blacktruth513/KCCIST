package QUIZE.Workshop.Java2ws3.driver;

import QUIZE.Workshop.Java2ws3.controller.VehicleManager;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles(">> ��� ��� <<");
		vm.sortByModelName();
		vm.displayVehicles(">> �𵨸����� ���ĵ� ��� ��� <<");
		vm.displayVehicles1(">> displayVehicles1() << ���ο� for ����");
		vm.displayVehicles2(">> displayVehicles2() <<");
	}
}
