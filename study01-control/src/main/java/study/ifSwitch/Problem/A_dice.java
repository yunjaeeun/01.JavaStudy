package study.ifSwitch.Problem;

import java.util.Scanner;

public class A_dice {
    public void controlDice() {
        /*
        * 문제.
        *   1부터 6까지 숫자가 적힌 주사위를 굴렸을 때 나온 숫자를 각각 a, b 라고 한다
        *   이 때 얻는 점수는
        *   1. a와 b가 모두 홀수라면  a2 + b2 점을 얻습니다.
        *   2. a와 b 중 하나만 홀수라면 2*(a+b)점을 얻습니다.
        *   3. a와 b 모두 홀수가 아니라면 | a - b | 점을 얻습니다.
        *   값을 return하는 함수를 작성해라.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("처음 나온 숫자를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("두 번째 나온 숫자를 입력하세요: ");
        int b = sc.nextInt();

        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println((a * a) + (b * b));
        } else if (a % 2 != 0 || b % 2 != 0) {
            System.out.println(2 * (a + b));
        } else {
            System.out.println(Math.abs(a-b));}
    }
}
