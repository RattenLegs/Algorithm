package chap01.basic;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		int n;
		
		do {
			System.out.println("n�� ��:");
			n = stdIn.nextInt();
		} while(n<=0);
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("1���� " + n +"������ ���� " + sum + "�Դϴ�.");
		stdIn.close();
	}

}
