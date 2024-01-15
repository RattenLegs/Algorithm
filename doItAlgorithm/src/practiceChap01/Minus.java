package practiceChap01;

import java.util.Scanner;

public class Minus {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		System.out.println("정수 b-a를 구합니다.");
		
		System.out.println("a를 입력하세요.");
		int a = stdIn.nextInt();
		System.out.println("b를 입력하세요.");
		int b = stdIn.nextInt();
		
		if(a>=b) {
			System.out.println("다시 입력해주세요.");
			//if문은 다시 돌아갈 수 없나?
		} else {
			int minus = b-a;
			System.out.println("b-a는 " + minus + "입니다.");
		}

	}

}
