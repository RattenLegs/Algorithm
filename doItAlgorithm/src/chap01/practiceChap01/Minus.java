package chap01.practiceChap01;

import java.util.Scanner;

public class Minus {

	private static void question() {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a�� �Է��ϼ���.");
		int a = stdIn.nextInt();
		System.out.println("b�� �Է��ϼ���.");
		int b = stdIn.nextInt();

		if (a >= b) {
			System.out.println("a���� ū ���� �Է��ϼ���!");
			question(); //���ư�������~ �̷��� �����ϸ� �ǳ�
		} else {
			int minus = b - a;
			System.out.println("b-a�� " + minus + "�Դϴ�.");
		}
		stdIn.close();

	}

	public static void main(String[] args) {
		System.out.println("���� b-a�� ���մϴ�.");
		question();

	}

}
