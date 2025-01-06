package CodingTest.Programmers.LV0;

import java.util.*;
import java.util.stream.Collectors;

public class Lessons120802 {
    public static void main(String[] args) {
        Solution sc = new Solution();



        // 버스
//        int[] truck_weights1 = {7, 4, 5, 6};
//        int[] truck_weights2 = {10};
//        int[] truck_weights3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
//
//        System.out.println(sc.solution(2, 10, truck_weights1)); // 출력: 8
//        System.out.println(sc.solution(100, 100, truck_weights2)); // 출력: 101
//        System.out.println(sc.solution(100, 100, truck_weights3)); // 출력: 110
    }
}

class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(arr)
                .forEach(i -> {
                    if (stack.isEmpty() || stack.peek() != i) {
                        stack.push(i);
                    }
                });

        List<Integer> list = new ArrayList<>(stack);
        Collections.reverse(list);

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}