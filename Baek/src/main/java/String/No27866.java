package String;

import java.util.Scanner;

/* 문자열과 위치를 입력받고 그 위치에 해당하는 문자 출력 */
public class No27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = sc.nextInt() - 1;

        System.out.println(str.charAt(a));
    }
}
