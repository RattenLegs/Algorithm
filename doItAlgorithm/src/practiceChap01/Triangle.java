package practiceChap01;

import java.util.Scanner;

public class Triangle {
	//--- ���� �Ʒ��� ������ �����ﰢ����  ��� ---//
		static void triangleLB(int n) {
			for (int i = 1; i <= n; i++) {            // i ��( i = 1, 2, ... , n )
				for (int j = 1; j <= i; j++)            // i ���� '*'��  ���
					System.out.print('*');
				System.out.println();                  // �ٹٲ�
			}
		}

		//--- ���� ���� ������ �����ﰢ����  ��� ---//
		static void triangleLU(int n) {
			for (int i = 1; i <= n; i++) {            // i ��( i = 1, 2, ... , n )
				for (int j = 1; j <= n-i+1; j++)         // n - i + 1 ���� '*'��  ���
					System.out.print('*');
				System.out.println();                  // �ٹٲ�
			}
		}

		//--- ������ ���� ������ �����ﰢ����  ��� ---//
		static void triangleRU(int n) {
			for (int i = 1; i <= n; i++) {            // i ��( i = 1, 2, ... , n )
				for (int j = 1; j <= i - 1; j++)         // i - 1 ���� ' '��  ���
					System.out.print(' ');
				for (int j = 1; j <= n - i + 1; j++)   // n - i + 1 ���� '*'��  ���
					System.out.print('*');
				System.out.println();                  // �ٹٲ�
			}
		}

		//--- ������ �Ʒ��� ������ �����ﰢ����  ��� ---//
		static void triangleRB(int n) {
			for (int i = 1; i <= n; i++) {            // i ��( i = 1, 2, ... , n )
				for (int j = 1; j <= n - i; j++)         // n - i ���� ' '��  ���
					System.out.print(' ');
				for (int j = 1; j <= i; j++)            // i ���� '*'��  ���
					System.out.print('*');
				System.out.println();                  // �ٹٲ�
			}
		}

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			int n;

			System.out.println("�ﰢ����  ����մϴ�.");

			do {
				System.out.print("�ܼ��£�");
				n = stdIn.nextInt();
			} while (n <= 0);

			System.out.println("���� �Ʒ� �����ﰢ��");
			triangleLB(n);			// ���� �Ʒ��� ������ �����ﰢ��

			System.out.println("���� �� �����ﰢ��");
			triangleLU(n);			// ���� ���� ������ �����ﰢ��

			System.out.println("������ �� �����ﰢ��");
			triangleRU(n);			// ������ ���� ������ �����ﰢ��

			System.out.println("������ �Ʒ� �����ﰢ��");
			triangleRB(n);			// ������ �Ʒ��� ������ �����ﰢ��
			
			stdIn.close();
		}
}
