package study.ifSwitch.Problem.Baek.loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 설명.
 *  EOF(End of File) 처리
 *   파일의 끝을 나타내며 데이터 소스로부터 더 이상 읽을 수 있는 데이터가 없음을 나타낸다.
 */
public class No10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }

        /* BufferedReader의 경우 */
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
//
//        String input = "";
//
//        while((input = br.readLine()) != null) {
//        }
    }
}

