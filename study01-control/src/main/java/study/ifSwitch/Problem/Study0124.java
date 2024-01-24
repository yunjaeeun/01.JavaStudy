package study.ifSwitch.Problem;

import java.util.Scanner;

public class Study0124 {
    public static void main(String[] args) {
        /* 문제.
         * 정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고 입력받으세요.
         * 한 과목이라도 8개 미만인 경우, "불합격입니다!"를 출력하고 총 개수가
         * 60개이상이면 "합격입니다!"를 출력하는 프로그램을 만들어보세요.
         */

        /* 예시.
         * DB : 14
         * 전자계산기 구조: 11
         * OS: 5
         * 데이터통신: 6
         * 소프트웨어 공학: 15
         * 불합격입니다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("DB : ");
        int score1 = sc.nextInt();
        System.out.print("전자계산기 구조 : ");
        int score2 = sc.nextInt();
        System.out.print("OS : ");
        int score3 = sc.nextInt();
        System.out.print("데이터통신 : ");
        int score4 = sc.nextInt();
        System.out.print("소프트웨어 공학 : ");
        int score5 = sc.nextInt();

        int total = score1 + score2 + score3 + score4 + score5;
        if(score1 < 8 || score2 < 8) {
            System.out.println("불합격입니다.");
        } else if (score3 < 8 || score4 < 8) {
            System.out.println("불합격입니다.");
        } else if (score5 < 8 || total < 60) {
            System.out.println("불합격입니다.");
        } else {
            System.out.println("합격입니다!");
        }

        // 다른 코드를 보며 and 조건을 한번에 여러개 쓸 수 있다는 것을 알았음.
//        if(score1 < 8 || score2 < 8 || score3 < 8 || score4 < 8 || score5 < 8 || total < 60 ) {
//            System.out.println("불합격입니다.");
//        } else {
//            System.out.println("합격입니다!");
//        }

    }
}
