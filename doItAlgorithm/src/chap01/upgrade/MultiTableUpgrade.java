package chap01.upgrade;

import java.util.Scanner;

public class MultiTableUpgrade {

	public static void main(String[] args) {

		/*
		 * Multi99TableEx에서 i와 j값을 입력받는 곱셈표를 만들어 봅시다.
		 * 
		 * 1. 구분선 없이 i와 j값 곱의 결과물만 만든다.(완료) 
		 * 2. 구분선을 두고 구분선이 i와 j값에 따라 변할 수 있게 한다.(완료) 
		 * 3. 두자리가 넘어가면 출력하지 않는 것으로 설정(완료)
		 */

		int a;
		int b;

		System.out.println("숫자 입력");
		Scanner stdIn = new Scanner(System.in);
		do {
			System.out.println("최종 i값을 입력해주세요.");
			a = stdIn.nextInt();
			System.out.println("최종 j값을 입력해주세요.");
			b = stdIn.nextInt();
		} while (a * b >= 100);

		//최상단
		System.out.print("   |");
		for (int j = 1; j <= b; j++) {
			System.out.printf("%3d", j);
		}

		//중단 구분선
		System.out.print("\n---+");
		for (int j = 1; j <= b; j++) {
			System.out.print("---");
		}
		System.out.println();

		//계산식
		for (int i = 1; i <= a; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= b; j++) {
				System.out.printf("%3d", i * j);

			}
			System.out.println();
		}

		stdIn.close();

	}

}
