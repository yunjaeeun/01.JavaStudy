package Array;

import java.util.Arrays;
import java.util.Scanner;

/* 숫자를 입력받고 최대값과 최대값을 입력한 순서를 출력 */
public class No2562 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] ar = new int[9];
        for (int i = 0; i < 9; i++) {
            ar[i] = sc.nextInt();
        }

//        int[] copyAr = ar;                            // 얕은 복사를 하게 되면 원본의 값도 변함.
        int[] copyAr = Arrays.copyOf(ar, 9);

        Arrays.sort(copyAr);

        System.out.println(copyAr[8]);
        for (int i = 0; i < 9; i++) {
            if (ar[i] == copyAr[8]) {
                System.out.print(i + 1);
            }
        }
    }
}
