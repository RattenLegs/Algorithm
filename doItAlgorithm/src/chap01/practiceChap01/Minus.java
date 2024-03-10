package chap01.practiceChap01;

import java.util.Scanner;

public class Minus {

	private static void question() {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a를 입력하세요.");
		int a = stdIn.nextInt();
		System.out.println("b를 입력하세요.");
		int b = stdIn.nextInt();

		if (a >= b) {
			System.out.println("a보다 큰 값을 입력하세요!");
			question(); //돌아가버리기~ 이렇게 개조하면 되네
		} else {
			int minus = b - a;
			System.out.println("b-a는 " + minus + "입니다.");
		}
		stdIn.close();

	}

	public static void main(String[] args) {
		System.out.println("정수 b-a를 구합니다.");
		question();

	}

}
