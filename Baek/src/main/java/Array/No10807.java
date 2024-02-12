package Array;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* N개의 정수가 주어졌을 때 정수 v가 몇개인지 구하는 코드 */
public class No10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] ar = new int[a];                      // 길이가 a인 배열 선언
        for (int i = 0; i < a; i++) {               // 입력값을 배열에 담는 반복문
            ar[i] = Integer.valueOf(sc.nextInt());
        }
        int c = sc.nextInt();
        int total = 0;

        for (int i = 0; i < a; i++) {               // 0번 인덱스 값부터 마지막 인덱스까지 비교후 값이 같으면 갯수를 1 올림
            if (ar[i] == c){
                total++;
            }
        }

        System.out.println(total);

    }
}
