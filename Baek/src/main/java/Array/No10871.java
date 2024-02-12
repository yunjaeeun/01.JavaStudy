package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 배열을 입력하고 x보다 작은 값을 입력한 순서대로 출력 */
public class No10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] ar = new int[a];
        for (int i = 0; i < a; i++) {
            ar[i] = Integer.valueOf(sc.nextInt());
        }

        for (int i = 0; i < a; i++) {
            if (ar[i] < b) {
                System.out.print(ar[i] + " ");
            }
        }
    }
}
