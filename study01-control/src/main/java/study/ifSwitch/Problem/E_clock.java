package study.ifSwitch.Problem;

import java.util.Scanner;

public class E_clock {
    public void clock() {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int hour = sc.nextInt();
            int minute = sc.nextInt();

            if (hour > 0 && minute < 45) {
                System.out.println((hour - 1) + " " + (15 + minute));
            } else if (hour > 0 && minute >= 45) {
                System.out.println(hour + " " + (minute - 45));
            } else if (hour == 0 && minute < 45) {
                System.out.println(23 + " " + (15 + minute));
            } else {
                System.out.println(23 + " " + (minute - 45));
            }
    }
}
