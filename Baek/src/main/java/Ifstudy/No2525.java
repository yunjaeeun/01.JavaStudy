package Ifstudy;

import java.util.Scanner;

/* 입력한 시간에 설정한 분을 더하는 코드 */
public class No2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int minuit = sc.nextInt();
        int add = sc.nextInt();
        int plusTime = (minuit + add) / 60;

        if ((minuit + add) < 60) {
            System.out.println(time + " " + (minuit + add));
        } else if ((minuit + add) >= 60 && ((time * 60) + minuit + add) < 1440) {
            System.out.println((time + plusTime) + " " + (minuit + add) % 60);
        } else if ((minuit + add) >= 60 && ((time * 60) + minuit + add) >= 1440) {
            int a = ((time * 60) + minuit + add) / 60;
            System.out.println((a - 24) + " " + (minuit + add) % 60);
        }
    }
}
