package chap01.practiceChap01;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		//입력을 받읍시다.
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("삼각형 ㄱㄱ");
		
		do {
			System.out.println("몇 줄로 해드릴까요오오오오");
			n = stdIn.nextInt();
		} while (n<=0);
		
		//삼각형 예시
		for(int i=1; i<=n; i++) {
//			System.out.println(i);
//			System.out.println("*");
			for(int j=1; j<=i; j++) {
				System.out.printf("*"); //1~10까지
			}
			System.out.println(); // 한번 끝나면 공백 하나
		}
		
	
		stdIn.close();
	}

}
