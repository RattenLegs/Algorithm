package chap01.practice;

import java.util.Scanner;

public class SumGaus {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���콺 ������. n �Է� ��");
		int n;
		
		do {
			System.out.println("n�� ��:");
			n = stdIn.nextInt();
		} while(n<=0);
		
		int sum = (1+n)*n/2;
		System.out.println(sum);
		
		stdIn.close();
	}
//���콺�� 1+2+3+4+5 ���� �־��
}
