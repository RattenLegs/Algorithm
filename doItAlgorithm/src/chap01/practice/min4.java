package chap01.practice;

import java.util.Scanner;

public class min4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); 
		
		System.out.println("네 정수의 최소값을 구합니다.");
		System.out.println("a의 값:");
		int a = stdIn.nextInt(); 
		System.out.println("b의 값:");
		int b = stdIn.nextInt();
		System.out.println("c의 값:");
		int c = stdIn.nextInt();
		System.out.println("d의 값:");
		int d = stdIn.nextInt();

		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;
		
		System.out.println("최소값은 " + min + " 입니다.");
		stdIn.close();
	}

}
