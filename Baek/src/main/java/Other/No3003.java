package Other;

import java.util.Scanner;

public class No3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];

        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        a[3] = 2;
        a[4] = 2;
        a[5] = 8;

        int c = 0;
        for (int i = 0; i < a.length; i++) {
            c = sc.nextInt();
            if (c != a[i]) {
                c = a[i] - c;
            } else {
                c = 0;
            }
            System.out.print(c + " ");
        }

    }
}
