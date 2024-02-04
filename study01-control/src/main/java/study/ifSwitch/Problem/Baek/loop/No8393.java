package study.ifSwitch.Problem.Baek.loop;

import java.util.Scanner;

/* 설명. 반복문을 활용한 1부터 N까지의 합 */
// 입력: 10
// 출력: 55
public class No8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int num1 = 0;

        for (int i = 1; i <= input; i++) {
            num1 = num1 + i;
        }
            System.out.println(num1);
    }
}
