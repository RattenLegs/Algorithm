package practiceChap01;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("���簢���� ����մϴ�.");

		do {
			System.out.print("���� ���� : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}
		stdIn.close();
	}
}
