package chap01.practice;

//����1-9
//���� b���� ���� a�� �� ���� ���մϴ�(b > a�� �ǵ��� �Է¹���)

import java.util.Scanner;

class Difference {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();

		int b;
		while (true) {
			System.out.print("b�� �� : ");
			b = stdIn.nextInt();
			if (b > a) break; //break �ͼ�������
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}

		System.out.println("b - a�� " + (b - a) + "�Դϴ�.");
		
		stdIn.close();
	}
}
