package study.ifSwitch.Problem.Baek.loop;

import java.util.Scanner;

/* 반복문을 활용한 별찍기 변형 */
/* 입력: 5
 * 출력:
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 */
public class No2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = i; j < input - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
