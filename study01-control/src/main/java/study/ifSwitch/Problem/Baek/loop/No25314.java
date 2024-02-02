package study.ifSwitch.Problem.Baek.loop;

import java.util.Scanner;

public class No25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String result = "";


        for (int i = 0; i < input; i++) {
            if (i % 4 == 0){
                result = (result + "long ");
            }
        }
        System.out.println(result + "int");
    }
}
