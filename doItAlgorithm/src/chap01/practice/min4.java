package chap01.practice;

import java.util.Scanner;

public class min4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); 
		
		System.out.println("�� ������ �ּҰ��� ���մϴ�.");
		System.out.println("a�� ��:");
		int a = stdIn.nextInt(); 
		System.out.println("b�� ��:");
		int b = stdIn.nextInt();
		System.out.println("c�� ��:");
		int c = stdIn.nextInt();
		System.out.println("d�� ��:");
		int d = stdIn.nextInt();

		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;
		
		System.out.println("�ּҰ��� " + min + " �Դϴ�.");
		stdIn.close();
	}

}
