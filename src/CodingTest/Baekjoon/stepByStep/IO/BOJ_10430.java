package CodingTest.Baekjoon.stepByStep.IO;

import java.util.Scanner;

public class BOJ_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println( ((A%C) * (B%C))%C);
    }
}
