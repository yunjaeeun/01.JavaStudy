package Array;

import java.util.Scanner;

public class No3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            arr[i] = a % 42;
        }

        
    }
}
