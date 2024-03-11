package chap01.upgrade;

import java.util.Scanner;

public class MultiTableUpgrade {

	public static void main(String[] args) {

		/*
		 * Multi99TableEx���� i�� j���� �Է¹޴� ����ǥ�� ����� ���ô�.
		 * 
		 * 1. ���м� ���� i�� j�� ���� ������� �����.(�Ϸ�) 
		 * 2. ���м��� �ΰ� ���м��� i�� j���� ���� ���� �� �ְ� �Ѵ�.(�Ϸ�) 
		 * 3. ���ڸ��� �Ѿ�� ������� �ʴ� ������ ����(�Ϸ�)
		 */

		int a;
		int b;

		System.out.println("���� �Է�");
		Scanner stdIn = new Scanner(System.in);
		do {
			System.out.println("���� i���� �Է����ּ���.");
			a = stdIn.nextInt();
			System.out.println("���� j���� �Է����ּ���.");
			b = stdIn.nextInt();
		} while (a * b >= 100);

		//�ֻ��
		System.out.print("   |");
		for (int j = 1; j <= b; j++) {
			System.out.printf("%3d", j);
		}

		//�ߴ� ���м�
		System.out.print("\n---+");
		for (int j = 1; j <= b; j++) {
			System.out.print("---");
		}
		System.out.println();

		//����
		for (int i = 1; i <= a; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= b; j++) {
				System.out.printf("%3d", i * j);

			}
			System.out.println();
		}

		stdIn.close();

	}

}
