package study.ifSwitch.Problem.Baek.loop;

import java.util.Scanner;

public class No10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int sum1 = sc.nextInt();
            int sum2 = sc.nextInt();
            if (sum1 == 0 && sum2 == 0) {
                break;
            }
            System.out.println(sum1 + sum2);
        } while (true);
    }
}
