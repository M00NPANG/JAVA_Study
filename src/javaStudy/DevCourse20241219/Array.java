package javaStudy.DevCourse20241219;

public class Array {

    public static <Stirng> void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        //변수로 값을 저장하기에는 변수가 많아져서 힘들다.
        // 자바 배열
        int[] arr = {10,20,30};

        // 배열의 값을 사용하는 방법은 순서로 꺼내서 쓴다.
        // 배열의 시작 순서는 0부터
        // 배연은 length를 사용하여 자신의 길이를 알려준다.
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int j : arr) {
            System.out.println(j);
        }

        // 과제 : 배열을 사용하여  apple, banana, orange를 출력하기
        String[] fruit = {"apple", "banana", "orange"};

        for (String k : fruit) {
            System.out.println(k);
        }
    }
}
