package CodingTest.Baekjoon.stepByStep.conditional;

import java.util.Scanner;

public class BOJ_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M < 45 ) {
            H -= 1;
            M = (M -45) + 60;
        } else {M -= 45;}

        if(H < 0) {H = 23;}

        System.out.println(H + " " + M);
    }
}
