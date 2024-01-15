package practiceChap01;

//1, 2, …, n의 합과 그 값을 구하는 과정을 출력(2)

import java.util.Scanner;

class SumVerbose2 {
 public static void main(String[] args) {
     Scanner stdIn = new Scanner(System.in);
     int n;
     System.out.println("1부터 n까지의 합을 구합니다.");

     do {
         System.out.print("n값: ");
         n = stdIn.nextInt();
     } while (n <= 0); //while문이 false일 경우 종료
     //이 경우에는 n>0이면 종료되니까 바로 for로 넘어가겠네

     int sum = 0;        // 합

     for (int i = 1; i < n; i++) {
         System.out.print(i + " + ");
         sum += i;        // sum에 i를 더함
     }
     
     System.out.print(n + " = ");
     sum += n;            // sum에 n을 더함
     System.out.println(sum);
 }
}