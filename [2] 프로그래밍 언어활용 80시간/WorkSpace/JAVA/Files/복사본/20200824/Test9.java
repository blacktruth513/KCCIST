
public class Test9 {
	public static void message() { System.out.println("message");}
	public static void main(String[] args) {
		message();
		Test9 t = new Test9();
		t.message2();		
	}
	public void message2() { System.out.println("message2");}	
}
