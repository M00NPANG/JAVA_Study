package CodingTest.Baekjoon;

import java.util.*;

public class BOJ_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }

        int M = sc.nextInt();

        for(int i = 0; i < M; i++) {
            int num = sc.nextInt();
            if(set.contains(num)) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }

        sc.close();
    }

}
