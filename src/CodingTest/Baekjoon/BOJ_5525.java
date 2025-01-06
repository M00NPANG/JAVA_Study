package CodingTest.Baekjoon;

import java.io.*;

public class BOJ_5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        String PN = "I" + "OI".repeat(N);
        int answer = 0;
        int firstIndex = 0;
        int lastIndex = PN.length();

        if(N <= 100 && M  <= 10000) {
            while(lastIndex <= M) {
                String s = S.substring(firstIndex,lastIndex);
                if(s.equals(PN)) {
                    answer++;
                }
                firstIndex++;
                lastIndex++;
            }
        }

        System.out.println(answer);
    }
}
