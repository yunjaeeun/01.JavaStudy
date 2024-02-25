package String;

import java.util.Scanner;

/* 문자열을 분리하여 전부 더하기 */
public class No11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        int total = 0;

        for (int i = 0; i < a; i++) {
            int c = b.charAt(i) - '0';
            total += c;
        }

        System.out.println(total);
    }
}
