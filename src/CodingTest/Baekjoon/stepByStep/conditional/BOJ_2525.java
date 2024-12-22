package CodingTest.Baekjoon.stepByStep.conditional;

import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int needTime = sc.nextInt();

        int cookH = H + (needTime/60);
        int cookM = M + (needTime%60);

        if (cookM > 59) {
            cookH += 1;
            cookM -= 60;
        }

        if (cookH >= 24) {
            cookH -= 24;
        }

        System.out.println(cookH + " " + cookM);
    }
}
