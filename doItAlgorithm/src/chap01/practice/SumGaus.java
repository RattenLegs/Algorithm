package chap01.practice;

import java.util.Scanner;

public class SumGaus {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("가우스 쓸거임. n 입력 ㄱ");
		int n;
		
		do {
			System.out.println("n의 값:");
			n = stdIn.nextInt();
		} while(n<=0);
		
		int sum = (1+n)*n/2;
		System.out.println(sum);
		
		stdIn.close();
	}
//가우스에 1+2+3+4+5 형식 넣어보기
}
