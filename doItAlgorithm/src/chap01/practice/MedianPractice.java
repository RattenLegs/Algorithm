package chap01.practice;

import java.util.Scanner;

public class MedianPractice {

	static int median3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}
			else if(a<=c) {
				return a;
			}
			else {
				return c;
			}
		} else if(a>c) {
			return c;
		} else {
			return b;
		}
		//������ �ٸ��� ����?
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in); 
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.println("a�� ��:");
		int a = stdIn.nextInt(); 
		System.out.println("b�� ��:");
		int b = stdIn.nextInt();
		System.out.println("c�� ��:");
		int c = stdIn.nextInt();
		System.out.println("�߾Ӱ��� " + median3(a, b, c)  + " �Դϴ�.");
		
		stdIn.close();
		
	}

}
