package CodingTest.Baekjoon.stepByStep.IO;

import java.util.Scanner;

public class BOJ_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 * ((num2%100)%10));     // (3)
        System.out.println(num1 * ((num2%100)/10));     // (4)
        System.out.println(num1 * (num2/100));          // (5)
        System.out.println(num1 * num2);                // (6)

    }
}
