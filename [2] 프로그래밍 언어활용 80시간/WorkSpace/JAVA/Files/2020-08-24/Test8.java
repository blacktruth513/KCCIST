// 강아지
// 특성 : 색깔, 크기, 종
// 행위 : 짖는다, 먹는다, 달린다.
class Dog {
	// member variables
	public String color;
	public int size;
	public String species;
	// member methods
	public void bark() { System.out.println("개가 짖는다.");}
	public void eat() { System.out.println("먹는다.");}
	public void run() { System.out.println("달린다.");}
	public void display() { System.out.println(color + ", " + size 
			+", " + species);
	}
}
public class Test8 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.color = "검은색";
		dog.size = 140;
		dog.species = "도사견";
	    dog.bark();
	    dog.eat();
	    dog.run();
	    dog.display();
		
	}
}
