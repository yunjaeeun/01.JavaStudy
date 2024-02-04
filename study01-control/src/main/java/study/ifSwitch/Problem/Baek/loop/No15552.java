package study.ifSwitch.Problem.Baek.loop;

import java.io.*;
import java.util.StringTokenizer;

/* 빠른 a+b */
public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        StringTokenizer st;                                 // 구분자로 나누기 워해 StringTokenizer 호출
        for (int i = 0; i < input; i++) {
            st = new StringTokenizer(br.readLine());        // 구분할 문자열을 지정해 주지 않으면 띄어쓰기를 구분자로 지정함.
            bw.write((Integer.parseInt(st.nextToken()) + (Integer.parseInt(st.nextToken()))) + "\n");   // 문자열간의 덧셈은 의도하지 않은 결과가 나오므로 Wrapper 클래스를 이용해 Int형으로 바꿔줌
        }
        br.close();         // 메모리 누수를 막기 위해 close

        bw.flush();
        bw.close();
    }
}

