class Employee2 {
	public String name; // Member variable

	public Employee2(String nm) { // Constructor
		name = nm;

	}

	public void setName(String nm) { // setter
		name = nm;
	}

	public String getName() {// Getter
		return name;
	}
}

public class Test9 {

	public static void main(String[] args) {
		Employee2 emp = new Employee2("�̼���");
		String name = emp.getName();
		System.out.println(name);
		emp.setName("������");
		String name2 = emp.getName();
		System.out.println(name2);
	}

}
