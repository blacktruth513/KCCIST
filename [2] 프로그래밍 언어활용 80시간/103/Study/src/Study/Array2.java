package Study;

class Array2 {
	public static void main(String[] args) {
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		/*정수 값을 담는 arr라는 이름의 2차원 배열을 선언하고 1행 각 배열 요소에 1,2,3을
		 * 2행 각 배열 요소에 4,5,6을 저장한다.
		 */

		System.out.println("arr2[0][0]: " + arr2[0][0]);
		System.out.println("arr2[0][1]: " + arr2[0][1]);
		System.out.println("arr2[0][2]: " + arr2[0][2]);
		System.out.println("arr2[1][0]: " + arr2[1][0]);
		System.out.println("arr2[1][1]: " + arr2[1][1]);
		System.out.println("arr2[1][2]: " + arr2[1][2]);
		
		// 문자열 "arr2[n][n]: " 다음에 arr2[n][n] 변수의 값을 시스템 콘솔에 출력하고 한 줄 띄운다.
	//System.out.println() : 화면에 괄호 안의 내용을 표시해라
	}
}
