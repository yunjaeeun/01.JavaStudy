package String;

import java.util.Scanner;

/* 문자열 갯수와 문자열을 입력받고 입력받은 문자열들의 첫 글자와 마지막 글자 출력 */
public class No9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < a; i++) {
            String str = sc.nextLine();
            int b = str.length() - 1;
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(b));
        }
    }
}
