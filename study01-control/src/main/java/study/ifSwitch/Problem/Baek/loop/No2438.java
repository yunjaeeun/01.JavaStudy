package study.ifSwitch.Problem.Baek.loop;

import java.util.Scanner;

/* 반복문을 활용한 별찍기 */
/* 입력: 5
 * 출력
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */
public class No2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
