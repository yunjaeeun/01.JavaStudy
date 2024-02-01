package study.ifSwitch.Problem.Baek;

import java.util.Scanner;

public class No2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(" ");
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
