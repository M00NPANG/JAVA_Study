package CodingTest.Baekjoon.stepByStep.array;

import java.util.Scanner;

public class BOJ_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        for(int i:arr) {
            if(v == i) {
               count++;
            }
        }

        System.out.println(count);
    }
}
