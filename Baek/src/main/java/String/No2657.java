package String;

import java.util.Scanner;

public class No2657 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            String c = sc.next();
            char[] arr = new char[c.length()];
            for (int j = 0; j < c.length(); j++) {
                arr[j] = c.charAt(j);
                for (int k = 0; k < b; k++) {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
