import java.util.*;
public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է����ּ���.");
		int age = sc.nextInt();
		if(age > 18) {
			System.out.println("����� �����Դϴ�.");
		} else {
			System.out.println("����� �̼������Դϴ�.");
		}
		System.out.println("����� ���̴� " + age);
	}

}
