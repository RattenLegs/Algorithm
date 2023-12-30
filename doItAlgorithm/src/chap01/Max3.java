
//3개의 정수값을 입력하고 최대값을 구합니다.
package chap01;
import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {

		//키보드로 숫자와 문자열 입력하는 방법(1): Scanner
		Scanner stdIn = new Scanner(System.in); //System.in은 키보드와 연결된 표준 입력 스트림
		
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.println("a의 값:");
		int a = stdIn.nextInt(); //.nextInt()가 호출되면 키보드로 입력한 정수값을 얻을 수 있다.
		System.out.println("b의 값:");
		int b = stdIn.nextInt();
		System.out.println("c의 값:");
		int c = stdIn.nextInt();

		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		System.out.println("최대값은 " + max + " 입니다.");
		
	}

}
/*
 * nextInt() 시리즈
 * nextBoolean()~nextDouble(): 숫자형 따라감
 * next(): String(문자열)
 * nextLine(): 문자열 1줄
 * 
 * */
