package JAVA����._20200825.TEST04;

public class Test08 {
	public static void main(String[] args) {
		Employee defaulContstuctor = new Employee();
		Employee onveloadingContstuctor = new Employee("������");
		
		System.out.println(defaulContstuctor.toString());
		System.out.println(onveloadingContstuctor.toString());
	}
}

class Employee {
	public String name;
	
	/*Default Contstuctor*/
	public Employee() {
		System.out.println("Default Constructor");
		this.name = "�̼���";
	}
	/*Overloading Contstuctor*/
	public Employee(String name) {
		super();
		System.out.println("Overloading Contstuctor");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}