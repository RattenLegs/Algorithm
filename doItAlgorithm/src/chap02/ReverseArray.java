package chap02;


import java.util.Arrays;
import java.util.Scanner;

class ReverseArray {
    //--- �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ� ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
    }

    //--- �迭 a�� ��Ҹ� �������� ���� ---//
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("��ڼ�: ");
        int num = stdIn.nextInt();         // ��ڼ�

        int[] x = new int[num];            // ��ڼ��� num�� �迭

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);        // �迭 a�� ��Ҹ� �������� ����

        System.out.println("��Ҹ� �������� �����߽��ϴ�.");
        System.out.println("x = " + Arrays.toString(x));
        stdIn.close();
    }
}