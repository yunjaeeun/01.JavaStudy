package study.ifSwitch.Problem.SelfStudy;

public class Study0125 {
    public static void main(String[] args) {
        /* 문제.
         *  두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
         */

        // 경우의 수 (1 + 5) , (2 + 4) , (3 + 3)

//        int dice1 = (int)(Math.random() * 6 + 1);
//        int dice2 = (int)(Math.random() * 6 + 1);


//        if (dice1 == 1 ) {
//
//        }
//        for(int dice1 =1; dice1<=6; dice1++){
//            for(int dice2=1; dice2<=6; dice2++){
//                if(dice1 + dice2 == 6)
//                    System.out.println("(" + dice1 + "," + dice2 + ")");
//            }
//            System.out.println();
//        }

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if( i + j == 6) {
                    System.out.println("6이 되는 경우의 수: " + i + " + " + j );
                }
            }
        }

        /* 문제2.
         *  방정식 2x+4y =10의 모든 해를 구하시오.(x,y는0이상,10이하 정수이다.)
         */

        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if ((2 * x) + (4 * y) == 10){
                    System.out.println("경우의 수 : " +  "x = " + x + ", y = " + y );
                }
            }
        }
    }
}
