package practiceChap01;

import java.util.Scanner;

public class SumOf {

	static int sumof(int a, int b) {
		int sum = 0; 
		if(a>b) {
			//for
			for(int i=b; i<=a; i++) 
				sum += i;
		} else if(b>a) { 
			//while
			while(a<=b) {
				sum += a;
				a++;
			}
		} else {
			sum = a+b;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//���� �Է�
		System.out.println("a �Է�");
		int a = stdIn.nextInt();
		System.out.println("b �Է�");
		int b = stdIn.nextInt();
		
		int sum = 0;
		
		System.out.println(sumof(a, b));
		
		
	}

}
