package practiceChap01;
// ���� �������� �ڸ����� ���Ͽ� ���
//�̳༮ �ٽ� ����

import java.util.Scanner;

class DigitsNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("���� �������� �ڸ����� ���մϴ�.");

		int n;
		do {
			System.out.print("������ : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0;         // �ڸ���
		while (n > 0) {
			n /= 10;         // n�� 10���� �����ϴ�
			no++;
		}

		System.out.println("�� ���� " + no + "�ڸ��Դϴ�.");
		stdIn.close();
	}
}
