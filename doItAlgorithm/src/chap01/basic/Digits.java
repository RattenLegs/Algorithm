package chap01.basic;
// ����1-10
// ���� �������� �ڸ����� ���Ͽ� ���

import java.util.Scanner;

class Digits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
		
		do {
			System.out.println("�Է�: ");
			no = stdIn.nextInt();
		} while(no<10 || no>99); //do-while�� �ϸ� do�� �ƴ� �� �ڵ����� while �ݺ��� �Ǵ±���!
		
		System.out.println("���� no�� ���� " + no + "��(��) �Ǿ����ϴ�.");
		stdIn.close();
	}
}