package String;

import java.util.Scanner;

/* 문자열 앞뒤 비교 */
public class No10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        StringBuilder b = new StringBuilder(a);

        if (a.equals(b.reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
