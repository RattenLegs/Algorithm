package upgradeFunction;

import java.util.Scanner;

public class practice {


	//��Һ�
	static void question1() {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("�� ������ �ִ밪�� ���մϴ�.");
		System.out.println("a�� ��:");
		int a = stdIn.nextInt();
		System.out.println("b�� ��:");
		int b = stdIn.nextInt();
		System.out.println("c�� ��:");
		int c = stdIn.nextInt();

		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		System.out.println("�ִ밪�� " + max + " �Դϴ�.");
		returnMain();

	}
	
	//����Ǻ�
	static void question2() {
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
		returnMain();

	}
	
	//���� ȭ������ ����
	static void returnMain() {
		System.out.println("���� ȭ������ ���ư����� 0�� �����ּ���.");
		Scanner stdIn = new Scanner(System.in);
		
		int d = stdIn.nextInt();
		if(d==0) {
			question();
		} else {
			System.out.println("�߸� �����̽��ϴ�.");
			System.out.println("�ý����� �����մϴ�.");
		}
	}
	
	//����
	static void question() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("��Һ񱳸� ���ϸ� 1, ��� �Ǻ��� ���ϸ� 2�� �����ּ���.");
		
		int n = stdIn.nextInt();
		
		if(n==1) {
			System.out.println("��Һ� ����");
			question1();
		} else if(n==2) {
			System.out.println("����Ǻ� ����");
			question2();
		} else {
			System.out.println("�߸� �����̽��ϴ�.");
			System.out.println("���͸� ���ϸ� 0�� �����ּ���.");
			
			int e = stdIn.nextInt();
			if(e==0) {
				question();
			} else {
				System.out.println("�ý����� �����մϴ�.");
			}
		}
	}
	
	
	public static void main(String[] args) {
		question();
	}

}