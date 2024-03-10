package chap01.practice;

import java.util.Scanner;

public class MedianPractice {

	static int median3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}
			else if(a<=c) {
				return a;
			}
			else {
				return c;
			}
		} else if(a>c) {
			return c;
		} else {
			return b;
		}
		//예제랑 다른게 뭐임?
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in); 
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값:");
		int a = stdIn.nextInt(); 
		System.out.println("b의 값:");
		int b = stdIn.nextInt();
		System.out.println("c의 값:");
		int c = stdIn.nextInt();
		System.out.println("중앙값은 " + median3(a, b, c)  + " 입니다.");
		
		stdIn.close();
		
	}

}
