package chap01.practice;

import java.util.Scanner;

public class Triangle {

	static void triangleLB(int n) {
	
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("삼각형 ㄱㄱ");
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("몇 줄로 해드릴까요오오오오");
			n = stdIn.nextInt();
		} while (n<=0);
		
		System.out.println("번호를 눌러 삼각형을 선택해주세요.");
		System.out.println("왼쪽 아래가 직각이면 1, ");
		System.out.println("왼쪽 위가 직각이면 2, ");
		System.out.println("오른쪽 아래가 직각이면 3, ");
		System.out.println("오른쪽 위가 직각이면 4, ");
		
		int k = stdIn.nextInt();
		
		if(k == 1) {
			System.out.println("왼쪽 아래 직각삼각형입니다. ");
			triangleLB(n);
		} else if(k == 2) {
			System.out.println("왼쪽 위 직각삼각형입니다. ");
		} else {
			System.out.println("잘못 눌렀습니다.");
		}
		stdIn.close();
		
		
	}

}
