package test2;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���. : ");
int score = sc.nextInt();
if(score <= 100 && score >=90) {
	System.out.println("A ���� �Դϴ�.");
}else if (score < 90 && score >= 80 ) {
	System.out.println("B ���� �Դϴ�.");
}else if (score < 80 && score >= 70) {
	System.out.println("C ���� �Դϴ�.");
	}else if(score < 70 && score >= 60) {
System.out.println("D ���� �Դϴ�.");
	}else if(score <60){
	System.out.println("F �����Դϴ�.");	
// A : 90<=����<=100
// B : 80<=����<90
// C : 70<=����<80
// D : 60<=����<70
// F : 60 ����

	}
}
}