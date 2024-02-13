package swcamp;

import java.util.Arrays;
import java.util.Scanner;

public class No1417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int person = sc.nextInt();
        int[] arr = new int[person];

        for (int i = 0; i < person; i++) {
            arr[i] = sc.nextInt();
        }

        int dasom = arr[0];

        int total = 0;
        arr[0] = 0;
        if (person != 1) {
            while (dasom < arr[person-1]) {
                Arrays.sort(arr);
                arr[person-1] --;
                dasom ++;
                total ++;
            }
            System.out.println(total + 1);
        }
        System.out.println(0);



//        int total = 0;
//        for (int i = 0; i < person; i++) {
//            total += arr[i];
//        }
//        if (person == 1) {
//            System.out.println("0");
//        } else {
//            System.out.println((total % person) + 1);
//        }
    }
}
