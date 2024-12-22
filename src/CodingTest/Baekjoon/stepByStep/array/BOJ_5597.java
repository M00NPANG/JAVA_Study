package CodingTest.Baekjoon.stepByStep.array;

import java.util.Scanner;

public class BOJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] std = new boolean[30];

        for(int i = 0; i < 30; i++) {
            int num = sc.nextInt();
            std[num - 1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!std[i]) {
                System.out.println(i + 1);
            }
        }

    }
}
