// ������
// Ư�� : ����, ũ��, ��
// ���� : ¢�´�, �Դ´�, �޸���.
class Dog {
	// member variables
	public String color;
	public int size;
	public String species;
	// member methods
	public void bark() { System.out.println("���� ¢�´�.");}
	public void eat() { System.out.println("�Դ´�.");}
	public void run() { System.out.println("�޸���.");}
	public void display() { System.out.println(color + ", " + size 
			+", " + species);
	}
}
public class Test8 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.color = "������";
		dog.size = 140;
		dog.species = "�����";
	    dog.bark();
	    dog.eat();
	    dog.run();
	    dog.display();
		
	}
}
