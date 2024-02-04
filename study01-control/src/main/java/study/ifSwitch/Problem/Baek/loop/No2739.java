package study.ifSwitch.Problem.Baek.loop;

import java.util.Scanner;

/* 설명. 반복문을 활용한 구구단 계산 */
// 입력: 4
// [출력]
// 4 * 1 = 4
// 4 * 2 = 8
// 4 * 3 = 12
// 4 * 4 = 16
// 4 * 5 = 20
// 4 * 6 = 24
// 4 * 7 = 28
// 4 * 8 = 32
// 4 * 9 = 36
public class No2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(num+ " * " + i +" = " + (num * i));
        }
    }
}
