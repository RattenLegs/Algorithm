package chap01.practiceChap01;

import java.util.Scanner;

public class SumIf {

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
			System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
			
			stdIn.close();
		} 
	


}
