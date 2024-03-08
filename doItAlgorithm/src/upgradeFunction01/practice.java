package upgradeFunction01;

import java.util.Scanner;

public class practice {
	//내일은 배열 끝을 봅시다
	//대소비교
	static void question1() {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.println("a의 값:");
		int a = stdIn.nextInt();
		System.out.println("b의 값:");
		int b = stdIn.nextInt();
		System.out.println("c의 값:");
		int c = stdIn.nextInt();

		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		System.out.println("최대값은 " + max + " 입니다.");
		returnMain();
		
		stdIn.close();

	}
	
	//양수판별
	static void question2() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int n = stdIn.nextInt();
		
		if(n>0) {
			System.out.println("이 수는 양수입니다.");
		} else if(n<0) {
			System.out.println("이 수는 음수입니다.");
		} else {
			System.out.println("이 수는 0입니다.");
		}
		returnMain();
		stdIn.close();
	}
	
	//메인 화면으로 복귀
	static void returnMain() {
		System.out.println("메인 화면으로 돌아가려면 0을 눌러주세요.");
		Scanner stdIn = new Scanner(System.in);
		
		int d = stdIn.nextInt();
		if(d==0) {
			question();
		} else {
			System.out.println("잘못 누르셨습니다.");
			System.out.println("시스템을 종료합니다.");
		}
		stdIn.close();
	}
	
	//질문
	static void question() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("대소비교를 원하면 1, 양수 판별을 원하면 2를 눌러주세요.");
		
		int n = stdIn.nextInt();
		
		if(n==1) {
			System.out.println("대소비교 실행");
			question1();
		} else if(n==2) {
			System.out.println("양수판별 실행");
			question2();
		} else {
			System.out.println("잘못 누르셨습니다.");
			System.out.println("복귀를 원하면 0을 눌러주세요.");
			
			int e = stdIn.nextInt();
			if(e==0) {
				question();
			} else {
				System.out.println("시스템을 종료합니다.");
			}
		}
		stdIn.close();
	}
	
	
	public static void main(String[] args) {
		question();
	}

}
