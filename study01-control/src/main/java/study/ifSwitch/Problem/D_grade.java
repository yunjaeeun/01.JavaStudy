package study.ifSwitch.Problem;

import java.util.Scanner;

public class D_grade {
    public void grade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("시험 점수를 입력하세요: ");
        int score = sc.nextInt();
        
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
