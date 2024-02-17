package Array;

/* 새로운 평균을 구하는 예제 */
import java.util.Scanner;

public class No1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double[] arr = new double[a];
        double max = 0;
        for (int i = 0; i < a; i++) {
            double score = sc.nextLong();
            arr[i] = score;

            if (score > max) {
                max = score;
            }
        }

        double result = 0;
        for (int i = 0; i < a; i++) {
            result += (arr[i] / max) * 100;
        }

        System.out.println(result/a);
    }
}
