package CodingTest.Baekjoon.stepByStep.conditional;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = {0,0,0};

        dice[0] = sc.nextInt();
        dice[1] = sc.nextInt();
        dice[2] = sc.nextInt();
        Arrays.sort(dice);
        int result;

        if(dice[0] == dice[1] && dice[1] == dice[2]) { result = 10000 + (dice[0] * 1000);}
        else if(dice[0] != dice[1] && dice[1] != dice[2] && dice[0] != dice[2]) {
            result = dice[2] * 100;
        }
        else {
            if (dice[0] == dice[1]) {result = 1000 + (dice[1] * 100);}
            else {result = 1000 + (dice[1] * 100);}
        }

        System.out.println(result);
    }
}
