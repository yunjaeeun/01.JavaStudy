package study.ifSwitch.Problem.Baek;

import java.util.Scanner;

public class No11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repeat = sc.nextInt();

        for (int i = 0; i < repeat; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + (num1 + num2));
        }
    }
}
