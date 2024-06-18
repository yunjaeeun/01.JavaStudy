package String;

import java.util.Scanner;

public class No1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < a.length(); i++) {

            switch (a.charAt(i)) {
                case 'A':
                    arr[0] += 1;
                    break;
                case 'B':
                    arr[1] += 1;
                    break;
                case 'C':
                    arr[2] += 1;
                    break;
                case 'D':
                    arr[3] += 1;
                    break;
                case 'E':
                    arr[4] += 1;
                    break;
                case 'F':
                    arr[5] += 1;
                    break;
                case 'G':
                    arr[6] += 1;
                    break;
                case 'H':
                    arr[7] += 1;
                    break;
                case 'I':
                    arr[8] += 1;
                    break;
                case 'J':
                    arr[9] += 1;
                    break;
                case 'K':
                    arr[10] += 1;
                    break;
                case 'L':
                    arr[11] += 1;
                    break;
                case 'M':
                    arr[12] += 1;
                    break;
                case 'N':
                    arr[13] += 1;
                    break;
                case 'O':
                    arr[14] += 1;
                    break;
                case 'P':
                    arr[15] += 1;
                    break;
                case 'Q':
                    arr[16] += 1;
                    break;
                case 'R':
                    arr[17] += 1;
                    break;
                case 'S':
                    arr[18] += 1;
                    break;
                case 'T':
                    arr[19] += 1;
                    break;
                case 'U':
                    arr[20] += 1;
                    break;
                case 'V':
                    arr[21] += 1;
                    break;
                case 'W':
                    arr[22] += 1;
                    break;
                case 'X':
                    arr[23] += 1;
                    break;
                case 'Y':
                    arr[24] += 1;
                    break;
                case 'Z':
                    arr[25] += 1;
                    break;
            }
        }
        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
            System.out.println(ch);
    }
}
