package Array;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No10807 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String input = sc.nextLine();

        BufferedReader br = toBufferedReader(input);

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.valueOf(st.nextToken());            // 계산할 금액(가치의 합)

        int[] array = new int[a];                            // 동전의 종류를 담을 배열

        for (int i = 0; i < N; i++) {                       // 반복문을 돌려 동전의 종류를 담음
            array[i] = Integer.valueOf(br.readLine());
        }

    }

    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

}
