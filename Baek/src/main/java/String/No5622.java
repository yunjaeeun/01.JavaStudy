package String;

import java.util.Scanner;

public class No5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            a.charAt(i);

            if (a.charAt(i) == 'A' || a.charAt(i) == 'B' || a.charAt(i) == 'C') {
                sum += 3;
            } else if (a.charAt(i) == 'D' || a.charAt(i) == 'E' || a.charAt(i) == 'F') {
                sum += 4;
            } else if (a.charAt(i) == 'G' || a.charAt(i) == 'H' || a.charAt(i) == 'I') {
                sum += 5;
            } else if (a.charAt(i) == 'J' || a.charAt(i) == 'K' || a.charAt(i) == 'L') {
                sum += 6;
            } else if (a.charAt(i) == 'M' || a.charAt(i) == 'N' || a.charAt(i) == 'O') {
                sum += 7;
            } else if (a.charAt(i) == 'P' || a.charAt(i) == 'Q' || a.charAt(i) == 'R' || a.charAt(i) == 'S') {
                sum += 8;
            } else if (a.charAt(i) == 'T' || a.charAt(i) == 'U' || a.charAt(i) == 'V') {
                sum += 9;
            } else if (a.charAt(i) == 'W' || a.charAt(i) == 'X' || a.charAt(i) == 'Y' || a.charAt(i) == 'Z') {
                sum += 10;
            } else {
                sum += 11;
            }
        }

        System.out.println(sum);

    }
}
