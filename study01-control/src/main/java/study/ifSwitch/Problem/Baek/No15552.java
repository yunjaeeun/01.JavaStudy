package study.ifSwitch.Problem.Baek;

import java.io.*;
import java.util.StringTokenizer;

public class No15552 {
    static int repeat;

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }


    public static void main(String[] args) throws IOException {
        String input = "";
        BufferedReader br = toBufferedReader(input);
        repeat = Integer.valueOf(br.readLine());
        for (int i = 0; i < repeat; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.valueOf(str.nextToken());
            int b = Integer.valueOf(str.nextToken());
            int result = a + b;
            System.out.println(result);
        }
    }
}
