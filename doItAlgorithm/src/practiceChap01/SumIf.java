package practiceChap01;

import java.util.Scanner;

public class SumIf {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� ��");
		
		int n = stdIn.nextInt();
		
		if(n==7) {
			int sum = 0;
			int i = 1;
			
			while(i<=n) {
				sum += i;
				System.out.println(i);
				i++;
			}
			System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		} else {
			System.out.println("�� �ƴϾ�");
		}
	}

}
