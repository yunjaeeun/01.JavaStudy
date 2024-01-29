package study.ifSwitch.Problem.Baek;

import java.util.Scanner;

public class No25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myMoney = sc.nextInt();
        int repeat = sc.nextInt();
        int total = 0;

        for (int i = 0; i < repeat; i++) {
            int price = sc.nextInt();
            int howMany = sc.nextInt();
            total += price * howMany;
        }

        if (myMoney == total){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
