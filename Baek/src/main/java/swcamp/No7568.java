package swcamp;

import java.util.Scanner;

/* 키와 몸무게를 비교하여 덩치 순위 매기기 */
public class No7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int body = sc.nextInt();
        int[][] arr = new int[body][2];

        /* 사람들의 키와 몸무게를 2차원 배열에 담음. */
        for (int i = 0; i < body; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] grade = new int[body];
        for (int i = 0; i < body; i++) {
            grade[i] = 1;
        }

        for (int i = 0; i < body; i++) {
            for (int j = 0; j < body; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    grade[i]++;
                }
            }
        }

        for (int i = 0; i < body; i++) {
            System.out.print(grade[i] + " ");
        }

//        while (grade[body - 1] != body) {
//            for (int i = 0; i < body - 1; i++) {
//                if (arr[i][0] > arr[i + 1][0] && arr[i][1] > arr[i + 1][1]) {
//                    grade[i] = grade[i] - 1;
//                } else if (arr[i][0] >= arr[i + 1][0] && arr[i][1] <= arr[i + 1][1]) {
//
//                } else if (arr[i][0] < arr[i + 1][0] && arr[i][1] > arr[i + 1][1]) {
//
//                }
//            }
//        }
//
//        for (int i = 0; i < body - 1; i++) {
//            for (int j = 0; j < body; j++) {
//                if (arr[i][0] > arr[i + 1][0] && arr[i][1] > arr[i + 1][1]) {
//                    grade[i] --;
//                } else if (arr[i][0] >= arr[i + 1][0] && arr[i][1] <= arr[i + 1][1]) {
//                    grade[i] = grade[i + 1];
//                }
//            }
//        }
//
    }
}
