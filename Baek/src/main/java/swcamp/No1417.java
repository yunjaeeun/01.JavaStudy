package swcamp;

import java.util.Arrays;
import java.util.Scanner;

public class No1417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int person = sc.nextInt();
        int[] arr = new int[person];
        int dasom = sc.nextInt();

        for (int i = 0; i < person - 1; i++) {
            arr[i] = sc.nextInt();
        }


        int total = 0;
        Arrays.sort(arr);
        if (person != 1) {
            while (dasom <= arr[person - 1]) {
                arr[person - 1] --;
                dasom++;
                total++;
                Arrays.sort(arr);
            }
            System.out.println(total);
        } else {
            System.out.println(0);
        }


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