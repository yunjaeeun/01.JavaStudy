package String;

import java.util.Scanner;

public class No2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = null;

        for (int i = 2; i >= 0; i--) {
            if (i == 2) {
                c = String.valueOf(a.charAt(i));
            } else {
                c = c.concat(String.valueOf(a.charAt(i)));
            }
        }

        int num1 = Integer.parseInt(c);

        for (int i = 2; i >= 0; i--) {
            if (i == 2) {
                c = String.valueOf(b.charAt(i));
            } else {
                c = c.concat(String.valueOf(b.charAt(i)));
            }
        }

        int num2 = Integer.parseInt(c);

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
