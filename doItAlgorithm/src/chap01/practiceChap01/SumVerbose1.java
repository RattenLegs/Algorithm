package chap01.practiceChap01;
import java.util.Scanner;

//sumVerbose 시리즈는 몰라서 해답 봄
//짱구 굴려서 안되면 답 보며 생각합시다

class SumVerbose1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");
        
        //음수 배제를 위한 do-while문
        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);//while문이 false일 경우 종료
        //이 경우에는 n>0이면 종료되니까 바로 for로 넘어가겠네

        int sum = 0;        // 합

        for (int i = 1; i <= n; i++) {
            if (i < n)        // i<n
                System.out.print(i + " + ");
            else              // i=n
                System.out.print(i + " = ");
            sum += i;         // sum에 i를 더함
        }

        System.out.println(sum);
        stdIn.close();
    }
}