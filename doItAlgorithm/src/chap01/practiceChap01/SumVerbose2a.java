package chap01.practiceChap01;

//1, 2, ��, n �� ���� ���մϴ�.(���ϴ� ������ ���� ��� :��[����])

import java.util.Scanner;

class SumVerbose2a {

 public static void main(String[] args) {
     Scanner stdIn = new Scanner(System.in);
     int n;

     System.out.println("1���� n������ ���� ���մϴ�.");

     do {
         System.out.print("n �� : ");
         n = stdIn.nextInt();
     } while (n <= 0);

     int sum = 0;        // ��

     for (int i = 1; i < n; i++) {
         System.out.print(i + " + ");
         sum += i;        // sum�� i�� ����
     }

     System.out.println(n + " = " + (sum += n));
     
     stdIn.close();
 }
}
