package practiceChap01;

import java.util.Scanner;

public class Minus {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� b-a�� ���մϴ�.");
		
		System.out.println("a�� �Է��ϼ���.");
		int a = stdIn.nextInt();
		System.out.println("b�� �Է��ϼ���.");
		int b = stdIn.nextInt();
		
		if(a>=b) {
			System.out.println("a���� ū ���� �Է��ϼ���!");
			//if���� �ٽ� ���ư� �� ����?
		} else {
			int minus = b-a;
			System.out.println("b-a�� " + minus + "�Դϴ�.");
		}
		stdIn.close();

	}

}
