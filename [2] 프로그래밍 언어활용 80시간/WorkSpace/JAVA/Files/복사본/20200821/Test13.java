// �������� ����Ͻÿ�.
// 2 x 1 = 2
// ...
// 9 x 1 = 9

// 2 x 1 = 2
// 2 x 2 = 4
// 2 x 3 = 6
//..
// 2 x 9 = 18

// 3 x 1 = 3
//...
// 3 x 9 = 27

public class Test13 {
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			//System.out.println(i);
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}






