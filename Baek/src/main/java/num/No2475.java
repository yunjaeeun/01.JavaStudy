package num;

import java.util.Scanner;

/* 검증수 구하기 */
public class No2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] a = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            a[i] = arr[i] * arr[i];
        }

        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }

        System.out.println(sum % 10);
    }
}
