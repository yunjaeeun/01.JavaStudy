package study.ifSwitch.Problem.Baek.loop;

import java.util.Scanner;

/* 반복문을 활용해 영수증에 적힌 금액과 구매한 총 금액과 일치하는지 검사 */
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
