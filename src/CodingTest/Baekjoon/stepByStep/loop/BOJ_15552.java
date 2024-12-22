package CodingTest.Baekjoon.stepByStep.loop;

import java.io.*;

public class BOJ_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

       for(int i = 0; i < count; i++) {
           String str = br.readLine();
           String[] num = str.split(" ");

           int num1 = Integer.parseInt(num[0]);
           int num2 = Integer.parseInt(num[1]);

           bw.write((num1 + num2) + "\n");
       }
       bw.flush();
    }

}
