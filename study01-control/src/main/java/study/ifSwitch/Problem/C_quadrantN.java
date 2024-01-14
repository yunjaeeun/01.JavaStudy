package study.ifSwitch.Problem;

import java.util.Scanner;

public class C_quadrantN {
    public void quadrantN() {
        Scanner sc = new Scanner(System.in);

        System.out.print("X 좌표를 입력해주세요: ");
        int x = sc.nextInt();
        System.out.print("Y 좌표를 입력해주세요: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        }
    }
}
