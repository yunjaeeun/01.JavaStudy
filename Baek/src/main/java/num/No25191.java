package num;

import java.util.Scanner;

/* 치킨갯수 */
public class No25191 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt()/2;
        int c = sc.nextInt();

        if (b + c > a) {
            System.out.println(a);
        } else {
            System.out.println(b + c);
        }
    }
}
