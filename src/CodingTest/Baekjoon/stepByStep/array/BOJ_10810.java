package CodingTest.Baekjoon.stepByStep.array;

import java.util.*;

public class BOJ_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for(int l = 0; l < M; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int x = i; x <= j; x++) {
                arr[x-1] = k;
            }
        }

        for(int ar : arr) {
            System.out.println(ar);
        }
    }

}
