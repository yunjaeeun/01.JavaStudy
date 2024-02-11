package inputoutput;


import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int num1 = b % 10;
        int num2 = ((b - num1) % 100) / 10;
        int num3 = (b - num1 - num2) / 100;

        System.out.println(a * num1);
        System.out.println(a * num2);
        System.out.println(a * num3);
        System.out.println(a * b);
    }
}
