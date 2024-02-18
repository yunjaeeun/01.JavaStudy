package Array;

import java.util.Arrays;
import java.util.Scanner;

public class No10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = i + 1;
        }

        int temp = 0;
        for (int i = 0; i < b; i++) {
            int c = sc.nextInt() - 1;
            int d = sc.nextInt() - 1;

            while (c < d) {
                temp = arr[c];
                arr[c++] = arr[d];
                arr[d--] = temp;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
