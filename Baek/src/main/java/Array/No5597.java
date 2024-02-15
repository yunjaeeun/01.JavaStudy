package Array;

import java.util.Scanner;

/* 30명의 학생 중 과제를 제출한 28명의 번호를 입력받고 제출하지 않은 학생의 번호 출력 */
public class No5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            for (int j = 1; j <= 30; j++) {
                if (j == a) arr[j - 1] = a;
            }
        }

        for (int i = 0; i < 30; i++) {
            if (arr[i] == 0) System.out.println(i + 1);
        }
    }
}
