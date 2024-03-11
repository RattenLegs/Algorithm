package chap01.practice;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("정사각형 변의 길이 몇으로 할까요? : ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		stdIn.close();
	}

}
