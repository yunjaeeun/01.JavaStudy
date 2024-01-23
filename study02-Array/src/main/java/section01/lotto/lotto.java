package section01.lotto;

import java.util.Arrays;

public class lotto {
    public static void main(String[] args) {

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            int lotto;
            boolean isTrue;

            do {
                lotto = (int)(Math.random() * 45 +1);
                isTrue = false;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == lotto){
                        isTrue = true;
                        break;
                    }
                }
            } while (isTrue);
            arr[i] = lotto;
        }

        Arrays.sort(arr);                                   // 정렬
        System.out.println(Arrays.toString(arr));           // 배열 출력

    }
}
