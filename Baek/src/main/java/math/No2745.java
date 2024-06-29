package math;

import java.util.Scanner;

public class No2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();
        int temp = 1;
        int result = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            char c = a.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (c - 55) * temp;
            } else {
                result += (c - 48) * temp;
            }
            temp *= b;

        }

        System.out.println(result);
    }
}
