package chap01.practiceChap01;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		//�Է��� �����ô�.
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("�ﰢ�� ����");
		
		do {
			System.out.println("�� �ٷ� �ص帱����������");
			n = stdIn.nextInt();
		} while (n<=0);
		
		//�ﰢ�� ����
		for(int i=1; i<=n; i++) {
//			System.out.println(i);
//			System.out.println("*");
			for(int j=1; j<=i; j++) {
				System.out.printf("*"); //1~10����
			}
			System.out.println(); // �ѹ� ������ ���� �ϳ�
		}
		
	
		stdIn.close();
	}

}
