
package chap01.practice;

public class Multi99TableEx {

	public static void main(String[] args) {
		System.out.println("����ǥ ��ȭ");

		//���
		System.out.print("   |");
		for (int i = 1;i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");
		
		//�ϴ�
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d |", i);
			for(int j=1; j<=9; j++) {

				System.out.printf("%3d", i * j);
			}
			System.out.println();

		}
	}

}
