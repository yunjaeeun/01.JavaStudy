package Array;

import java.util.Scanner;

/* 바구니 갯수와 반복 횟수 입력받고 공 바꾸기 */
public class No10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int loop = sc.nextInt();
        int[] basket = new int[a];

        for (int i = 0; i < a; i++) {
            basket[i] = i + 1;
        }

        int b;
        for (int i = 0; i < loop; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            b = basket[num1 - 1];
            basket[num1 - 1] = basket[num2 - 1];
            basket[num2 - 1] = b;
        }

        for (int i = 0; i < a; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
