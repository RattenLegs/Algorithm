package jdsn;

import java.util.Scanner;

public class practice {

	
	static String question1(String a) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		int n = stdIn.nextInt();
		
		if(n>0) {
			System.out.println("�� ���� ����Դϴ�.");
		} else if(n<0) {
			System.out.println("�� ���� �����Դϴ�.");
		} else {
			System.out.println("�� ���� 0�Դϴ�.");
		}
		return a;
	}
	
	static String question2(String a) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		int n = stdIn.nextInt();
		
		if(n>0) {
			System.out.println("�� ���� ����Դϴ�.");
		} else if(n<0) {
			System.out.println("�� ���� �����Դϴ�.");
		} else {
			System.out.println("�� ���� 0�Դϴ�.");
		}
		return a;
	}
	
	public static void main(String[] args) {

	}

}
