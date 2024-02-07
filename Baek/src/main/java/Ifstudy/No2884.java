package Ifstudy;

import java.util.Scanner;

/* 입력 시간에 45분을 빼는 코드 */
public class No2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int minuit = sc.nextInt();

        if (time >= 0 && minuit >= 45) {
            System.out.println(time + " " + (minuit - 45));
        } else if (time > 0 && minuit < 45) {
            System.out.println((time - 1) + " " + (minuit + 15));
        } else if (time == 0 && minuit < 45) {
            time = 23;
            System.out.println(time + " " + (minuit + 15));
        }
    }
}
