package Array;

import java.util.Arrays;
import java.util.Scanner;

/* 최소값과 최대값을 출력 */
public class No10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] ar = new int[a];
        for (int i = 0; i < a; i++) {
            ar[i] = Integer.valueOf(sc.nextInt());
        }

        Arrays.sort(ar);

        System.out.print(ar[0] + " " + ar[a - 1]);


        /* 배열에 담지 않고 바로 값 비교해주기 */
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        Integer.parseInt(br.readLine());	//첫 줄 N 은 안쓰이므로 입력만 받는다.
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//
//        int max = -1000001;           // 문제에서의 최소값, 최대값
//        int min = 1000001;
//
//        while(st.hasMoreTokens()) {
//            int val = Integer.parseInt(st.nextToken());
//            if(val>max) {
//                max = val;            // 이 전에 입력된 값보다 크면 최대값 초기화
//            }
//            if(val<min) {
//                min = val;            // 이 전에 입력된 값보다 작으면 최소값 초기화
//            }
//        }
//        System.out.println(min + " " + max);
    }
}
