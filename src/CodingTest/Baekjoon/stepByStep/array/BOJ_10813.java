package CodingTest.Baekjoon.stepByStep.array;


import java.util.Scanner;

public class BOJ_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N ; i++) {
            arr[i] = i + 1;
        }

        for (int l = 0; l < M; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = 0;

            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;

        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
