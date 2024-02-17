package Array;

import java.util.*;

/* 숫자를 10개 입력받고 그 숫자들을 42로 나눈 값의 갯수(중복 제외) */
public class No3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }

        System.out.println(set.size());
    }
}
