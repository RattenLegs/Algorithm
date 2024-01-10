package practiceChap01;

import java.util.Scanner;

public class SumIf {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값");
		
		int n = stdIn.nextInt();
		
		if(n==7) {
			int sum = 0;
			int i = 1;
			
			while(i<=n) {
				sum += i;
				System.out.println(i);
				i++;
			}
			System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		} else {
			System.out.println("응 아니야");
		}
	}

}
