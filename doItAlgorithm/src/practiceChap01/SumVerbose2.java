package practiceChap01;

//1, 2, ��, n�� �հ� �� ���� ���ϴ� ������ ���(2)

import java.util.Scanner;

class SumVerbose2 {
 public static void main(String[] args) {
     Scanner stdIn = new Scanner(System.in);
     int n;
     System.out.println("1���� n������ ���� ���մϴ�.");

     do {
         System.out.print("n��: ");
         n = stdIn.nextInt();
     } while (n <= 0); //while���� false�� ��� ����
     //�� ��쿡�� n>0�̸� ����Ǵϱ� �ٷ� for�� �Ѿ�ڳ�

     int sum = 0;        // ��

     for (int i = 1; i < n; i++) {
         System.out.print(i + " + ");
         sum += i;        // sum�� i�� ����
     }
     
     System.out.print(n + " = ");
     sum += n;            // sum�� n�� ����
     System.out.println(sum);
 }
}