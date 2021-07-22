import java.util.Scanner;
public class QuizAnswer01 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("#######1"
					+ "###############");
			System.out.println("# 1. 구구단 계산 ");
			System.out.println("# 2. 종료 ");
			System.out.println("######################");
			System.out.print("메뉴를 입력해주세요. : ");		
			int num = sc.nextInt();
			if(num == 1) { 
				System.out.println("단수를 입력해주세요. : ");
				int num2 = sc.nextInt();
					for(int i = 1; i < 10; i++) {
							System.out.println(num2 + " x " + i + " = " + (num * i));
					}
			} else if(num == 2) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
