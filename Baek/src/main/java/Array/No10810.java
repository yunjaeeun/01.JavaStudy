package Array;

import java.util.Scanner;

/* 배열의 길이와 값을 넣을 횟수와 범위를 입력받고 최종 배열을 출력  */
public class No10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < b; i++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int value = sc.nextInt();
            for (int j = min; j <= max; j++) {
                arr[j - 1] = value;
            }
        }

        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
