package study.ifSwitch.Problem;

public class Application2 {
    public static void main(String[] args) {
        /* 1. 주사위 점수 */
        A_dice aClass = new A_dice();
//        aClass.controlDice();

        /* 2. 윤년 판별 */
        B_year bClass = new B_year();
//        bClass.year();

        /* 3. 4분면 판별 */
        C_quadrantN cClass = new C_quadrantN();
//        cClass.quadrantN();

        /* 4. 등급 판별 */
        D_grade dClass = new D_grade();
//        dClass.grade();

        /* 5. 알람 시계 */
        E_clock eClass = new E_clock();
        eClass.clock();
    }
}
