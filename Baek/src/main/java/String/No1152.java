package String;

import java.util.Scanner;

public class No1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();

        if (a.equals("")) {
            System.out.println(0);
            return;
        }

        String[] b = a.split(" ");

        System.out.println(b.length);
    }
}
