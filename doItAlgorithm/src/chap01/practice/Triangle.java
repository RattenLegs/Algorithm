package chap01.practice;

import java.util.Scanner;

public class Triangle {

	static void triangleLB(int n) {
	
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("�ﰢ�� ����");
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("�� �ٷ� �ص帱����������");
			n = stdIn.nextInt();
		} while (n<=0);
		
		System.out.println("��ȣ�� ���� �ﰢ���� �������ּ���.");
		System.out.println("���� �Ʒ��� �����̸� 1, ");
		System.out.println("���� ���� �����̸� 2, ");
		System.out.println("������ �Ʒ��� �����̸� 3, ");
		System.out.println("������ ���� �����̸� 4, ");
		
		int k = stdIn.nextInt();
		
		if(k == 1) {
			System.out.println("���� �Ʒ� �����ﰢ���Դϴ�. ");
			triangleLB(n);
		} else if(k == 2) {
			System.out.println("���� �� �����ﰢ���Դϴ�. ");
		} else {
			System.out.println("�߸� �������ϴ�.");
		}
		stdIn.close();
		
		
	}

}
