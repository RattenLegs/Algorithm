package practiceChap01;
import java.util.Scanner;

//sumVerbose �ø���� ���� �ش� ��
//¯�� ������ �ȵǸ� �� ���� �����սô�

class SumVerbose1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1���� n������ ���� ���մϴ�.");
        
        //���� ������ ���� do-while��
        do {
            System.out.print("n��: ");
            n = stdIn.nextInt();
        } while (n <= 0);//while���� false�� ��� ����
        //�� ��쿡�� n>0�̸� ����Ǵϱ� �ٷ� for�� �Ѿ�ڳ�

        int sum = 0;        // ��

        for (int i = 1; i <= n; i++) {
            if (i < n)        // �߰� ����
                System.out.print(i + " + ");
            else              // ������ ����
                System.out.print(i + " = ");
            sum += i;         // sum�� i�� ����
        }

        System.out.println(sum);
    }
}