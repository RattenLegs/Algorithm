package chap02;


import java.util.Arrays;

class CloneArray {

 public static void main(String[] args) {
     int[] a = {1, 2, 3, 4, 5};
     int[] b = a.clone();            // b�� a�� ������ �迭�� ����

     b[3] = 0;                                    // �� ��Ҹ� ���� ����

     System.out.println("a = " + Arrays.toString(a)); //toString�� �ǹ̴�?
     System.out.println("b = " + Arrays.toString(b));
 }
}
