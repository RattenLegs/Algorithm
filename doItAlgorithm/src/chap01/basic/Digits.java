package chap01.basic;
// 연습1-10
// 양의 정숫값의 자릿수를 구하여 출력

import java.util.Scanner;

class Digits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.println("입력: ");
			no = stdIn.nextInt();
		} while(no<10 || no>99); //do-while을 하면 do가 아닐 시 자동으로 while 반복이 되는구나!
		
		System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");
		stdIn.close();
	}
}
