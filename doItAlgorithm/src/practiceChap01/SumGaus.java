package practiceChap01;

import java.util.Scanner;

public class SumGaus {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���콺 ������. n �Է� ��");
		int n = stdIn.nextInt();
		
		int sum = (1+n)*n/2;
		System.out.println(sum);
	}

}
