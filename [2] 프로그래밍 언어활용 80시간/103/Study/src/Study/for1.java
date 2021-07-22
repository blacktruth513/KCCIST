package Study;
/*for(반복문)
for(int i=0; i<4; i++) { 처리할 명령들 } 
: 정수 값을 담는 i라는 변수 0을 대입하고 i를 1씩 증가시키면서, i가 4보다 작을 동안 {}안을 반복하라.
[for문(반복문) 선언]
 1) for를 적용 -> for
 2-1) ()안에 반복에 대한 조건을 적음 -> for()
 2-2) 카운터를 선언하고 초기화함 -> for(int i=0;)
 2-3) 반복을 계속하기 위한 조건을 적음 -> for(int i=0; i<4;)
 2-4) 카운터의 증가/감소 방법을 적음 -> for(int i=0; i<4; i++)
 3) {}안에 반복하여 처리할 명령들을 적음 -> for(int i=0; i<4; i++) { 처리할 명령들 }
 ** System.out.println()을 4번 반복 예제
 */

class for1 {
	public static void main(String[] args) {
		String str[] = { "Hello", "Java", "Nice to meet you", "Bye!" };
		for (int i = 0; i < 4; i++) {
//정수값을 담는 i라는 변수에 0을 저장하고 i를 1씩 증가시키면서 i가 4보다 작을 동안 {}안을 반복
			System.out.println(str[i]);
		}

	}

}
