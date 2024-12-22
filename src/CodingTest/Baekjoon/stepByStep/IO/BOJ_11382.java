package CodingTest.Baekjoon.stepByStep.IO;


import java.io.*;

public class BOJ_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] splNum = str.split(" ");

        long A = Long.parseLong(splNum[0]);
        long B = Long.parseLong(splNum[1]);
        long C = Long.parseLong(splNum[2]);

        System.out.println(A+B+C);
    }
}
