package study.ifSwitch.Problem.Baek.loop;

import java.util.Scanner;

/* 반복문을 활용한 a+b 구하기 */
public class No10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 + num2);
        }
    }
}
