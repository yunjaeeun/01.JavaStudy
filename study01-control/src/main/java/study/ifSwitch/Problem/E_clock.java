package study.ifSwitch.Problem;

import java.util.Scanner;

public class E_clock {
    public void clock() {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요: ");
        int hour = sc.nextInt();
        System.out.print("분을 입력하세요: ");
        int minute = sc.nextInt();

        if (hour > 0 && minute < 45) {
            System.out.println((hour - 1) +"시 "+ (15 + minute) + "분 입니다.");
        } else if (hour > 0 && minute >= 45) {
            System.out.println(hour + "시 " + (minute - 45) + "분 입니다.");
        } else if (hour == 0 && minute < 45) {
            System.out.println(23 + "시 " + (15 + minute) + "분 입니다.");
        } else if (hour == 0 && minute >= 45) {
            System.out.println(23 + "시 " + (minute - 45) + "분 입니다.");
        } else {
            System.out.println("다시 입력해 주세요.");
        }
    }
}
