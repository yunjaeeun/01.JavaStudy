package Array;

import java.util.Arrays;
import java.util.Scanner;

public class No10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = i + 1;
        }

        int b = sc.nextInt();

        int change = 0;
        for (int i = 0; i < b; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (c - d == -1) {
                change = arr[c - 1];
                arr[c - 1] = arr[d - 1];
                arr[d - 1] = change;
            } else {
                do {
                    change = arr[c - 1];
                    arr[c - 1] = arr[d - 1];
                    arr[d - 1] = change;
                    c++;
                    d--;
                } while (c >= d); {
                    change = arr[c - 1];
                    arr[c - 1] = arr[d - 1];
                    arr[d - 1] = change;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
