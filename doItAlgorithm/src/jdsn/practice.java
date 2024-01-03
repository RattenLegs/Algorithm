package jdsn;

import java.util.Scanner;

public class practice {

	
	static String question1(String a) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int n = stdIn.nextInt();
		
		if(n>0) {
			System.out.println("이 수는 양수입니다.");
		} else if(n<0) {
			System.out.println("이 수는 음수입니다.");
		} else {
			System.out.println("이 수는 0입니다.");
		}
		return a;
	}
	
	static String question2(String a) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int n = stdIn.nextInt();
		
		if(n>0) {
			System.out.println("이 수는 양수입니다.");
		} else if(n<0) {
			System.out.println("이 수는 음수입니다.");
		} else {
			System.out.println("이 수는 0입니다.");
		}
		return a;
	}
	
	public static void main(String[] args) {

	}

}
