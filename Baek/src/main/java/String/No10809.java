package String;

import java.util.Scanner;

public class No10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
