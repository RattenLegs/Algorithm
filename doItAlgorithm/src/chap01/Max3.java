
//3���� �������� �Է��ϰ� �ִ밪�� ���մϴ�.
package chap01;
import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {

		//Ű����� ���ڿ� ���ڿ� �Է��ϴ� ���(1): Scanner
		Scanner stdIn = new Scanner(System.in); //System.in�� Ű����� ����� ǥ�� �Է� ��Ʈ��
		
		System.out.println("�� ������ �ִ밪�� ���մϴ�.");
		System.out.println("a�� ��:");
		int a = stdIn.nextInt(); //.nextInt()�� ȣ��Ǹ� Ű����� �Է��� �������� ���� �� �ִ�.
		System.out.println("b�� ��:");
		int b = stdIn.nextInt();
		System.out.println("c�� ��:");
		int c = stdIn.nextInt();

		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		System.out.println("�ִ밪�� " + max + " �Դϴ�.");
		
	}

}
/*
 * nextInt() �ø���
 * nextBoolean()~nextDouble(): ������ ����
 * next(): String(���ڿ�)
 * nextLine(): ���ڿ� 1��
 * 
 * */
