package section01.lotto;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int input = sc.nextInt();

//        for (int i = 1; i <= input; i++) {
//            System.out.print(" ");
//            for (int j = 0; j <= input-i; j++) {
//                System.out.print("*");
//            }
//                System.out.println();
//        }

        for (int i = 1; i <= input; i++) {
            for (int j = 0; j <= input - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
