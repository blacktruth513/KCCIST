package QUIZE.Workshop.Java2ws3.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import QUIZE.Workshop.Java2ws3.entity.Airplane;
import QUIZE.Workshop.Java2ws3.entity.Car;
import QUIZE.Workshop.Java2ws3.entity.Ship;
import QUIZE.Workshop.Java2ws3.entity.Vehicle;


/*
 * ��������� �迭���� ���̳��� Ȯ�屸���� ����ϱ� ���� ArrayList�� ���
 */
public class VehicleManager {
	//�Ʒ� �ڵ�� �迭�� �����ϴ� ������ ������ ���̴�.
	//ArrayList�� �����ϵ��� ���ο� ������ �����Ͻÿ�.(��������  vehicleList)
	
	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	/*
	2. VehicleManager Ŭ���� ���� ������(Constructor)�� �ϼ��Ѵ�.
		A. Vehicle ��ü�� ���� �� �ִ� ArrayList ��ü�� �����Ѵ�.
		B. Airplane, Car, Ship ��ü���� �����ϸ鼭 �����ڸ� �̿��� ����	�ʱ�ȭ�ϰ� ArrayList �� �߰��Ѵ�.
	*/
	public VehicleManager() {
		//�Ʒ� �ڵ�� �迭�� �̿��ϵ��� �ۼ��Ǿ���.
		//ArrayList�� ����ϵ��� �����Ͻÿ�.
		vehicleList.add(new Airplane("����747", 1300, 300, 4));
		vehicleList.add(new Airplane("F-16", 1600, 1, 1));
		vehicleList.add(new Car("�ҳ�Ÿ3", 180, 5, 10));
		vehicleList.add(new Car("Ƽ��", 130, 4, 15));
		vehicleList.add(new Car("��Ÿ����", 150, 10, 11));
		vehicleList.add(new Ship("ũ����2", 30, 400, 35000));
		vehicleList.add(new Ship("��ƿ����", 25, 150, 15000));
		
	}
	
	public void displayVehicles(String title) {
		//�Ʒ� �ڵ�� �迭�� ����Ű�� ��� ��ü�� ������ ����ϵ��� �ۼ��Ǿ���.
		//ArrayList�� vehicleList�� ��� ��� ��ü�� ����ϵ��� �����Ͻÿ�.
		
		System.out.println(title);
		
		for (Vehicle v : vehicleList) {
			v.displayInfo();
		}
		
		System.out.println();
	}
	/*
	3. sortByModelName() �޼��带 �ۼ��Ѵ�.
		A. ��ü���� ������ ������ ����� ���� ������ �����ϴ�. 
		���� ��ü �������� ���ų� �����ϴ� ����� �迭(array)�� �ٸ� ���̴�.
		B. ArrayList �� �޼��带 Ȱ���ؼ� ��ü�� modelName �� �������� 
		������������ �����ϵ��� �޼����� ����� �ϼ��Ѵ�.
	 */
	public void sortByModelName() {
		//�Ʒ� �ڵ�� �迭�� ���ؼ� ������ �����ϴ� ���̴�.
		//ArrayList�� vehicleList�� ���ؼ� ������ �����ϴ� �ڵ�� ��ȯ�Ͻÿ�.
		
		/*
sort
public void sort(Comparator<? super E> c)

Description copied from interface: List

Sorts this list according to the order induced by the specified Comparator. 
All elements in this list must be mutually comparable using thespecified comparator (that is, c.compare(e1, e2) must not throwa ClassCastException for any elements e1 and e2in the list). 

If the specified comparator is null then all elements in thislist must implement the Comparable interface and the elements' natural ordering should be used. 

This list must be modifiable, but need not be resizable.
Specified by:sort in interface List<E>Parameters:c - the Comparator used to compare list elements.A null value indicates that the elements' natural ordering should be used

		 * �� ��ü�� ���ϱ� ���� Comparator ���
		 * ���Ĵ�� : vehicleList
		 * �񱳱��� : Vehicle�� ModelName
		 */
		
		Collections.sort(vehicleList,new Comparator<Vehicle>() {

			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				System.out.println("\t\t *** Soarting .... ***");
				System.out.println("\t\t o1 : "+o1.getModelName()+", o2 : "+o2.getModelName());
				
				/*
				if (o1.getModelName().compareTo(o2.getModelName()) > 0) {
					return 1;
				} else if (o1.getModelName().compareTo(o2.getModelName()) < 0){
					return -1;
				} else {
					return 0;
				}
				 */
				
				/*
				 * ��������� ���� ���׿����� ���
				 * o1.getModelName().compareTo(o2.getModelName()) < 0 : ��������
				 * o1.getModelName().compareTo(o2.getModelName()) > 0 : ��������
				 */
				return (o1.getModelName().compareTo(o2.getModelName()) < 0 ? -1 : (o1.getModelName() == o2.getModelName() ? 0 :1) );
			}
		});
		
	}

	/*
	4. displayVehicles1() �޼��带 �ۼ��Ѵ�.
		A. ���ο� for ������ �̿��Ͽ� ArrayList �κ��� ����� ��ü�� ���������� ����.
		B. �� ��ü�� ������ �ִ� displayInfo() �޼��带 ȣ���Ѵ�.
	 */
	public void displayVehicles1(String title) {
		
		System.out.println(title);
		
		for (Vehicle v : vehicleList) {
			v.displayInfo();
		}
		System.out.println();
	}
	
	/*
	5. displayVehicles2() �޼��带 �ۼ��Ѵ�.
		A. ArrayList �κ��� Iterator �� ���� �������� ���� �����Ѵ�.
		B. while �ȿ��� iterator �� �̿��� ���������� ����� ��ü�� ���� 
		�������� ���� ����, �� ��ü�� ������ �ִ� displayInfo() �޼��带 ȣ���Ѵ�.
	 */
	public void displayVehicles2(String title) {
		System.out.println(title);
		Iterator v = vehicleList.iterator();
		while (v.hasNext()) {
			Vehicle vv = (Vehicle)v.next();
			vv.displayInfo();
		}
		
	}
	
}

