package section01.lotto;

import java.util.Arrays;

public class lotto {
    public static void main(String[] args) {

        int[] arr = new int[6];
        int numLotto = (int)(Math.random() * 45 + 1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(numLotto);
//        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 45 + 1);
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
