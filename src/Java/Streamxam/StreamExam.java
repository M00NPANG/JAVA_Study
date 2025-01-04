package Java.Streamxam;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamExam {
    public static void main(String[] args) {
//        exam1();
//        exam2();
//        exam3();
//        exam4();
//        exam5();
    }


    public static void exam5() {
        int[] arr = {1,2,3,4,5};

        String[] strNums = Arrays.stream(arr)
                .mapToObj(i -> i + '번')
                .toArray(String[]::new);

        // 이러면 에러
        // 최조 시작은 int 배열로 시작을 해서 string으로 받아들이지 않음 ! 따라서 에러가 생긴 것!
    }

    public static void exam4() {
        String[] strNums = {"1번", "2번", "3번", "4번", "5번"};

        // 문제
        // strNums에서 홀수만 뽑아서 int 배열로 만들기

        // 람다 ==> 축약식
        // 만약, 하나의 요소를 하나하나 확인해가며 계산하는 방식이면 return 필요, 전체 요소를 그냥 단순히 연산한다면 return 필요 X
        int[] arr = Arrays.stream(strNums) // 스트림 생성
                .mapToInt(s -> Character.getNumericValue(s.charAt(0))) // 앞 글자를 정수로 변환
                .filter(i -> i % 2 == 1)
                .toArray(); // 배열로 변환

        System.out.println("result:");
        Arrays.stream(arr)
                .forEach(System.out::println);
        System.out.println("\n");
    }

    public static void exam3() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // arr의 값이 각각 2배열된 배열 만들기
        int[] arr2 =  Arrays.stream(arr)
                .map((i) -> i * 2)
                .toArray();
        int[] arr3 =  Arrays.stream(arr)
                .map((i) -> i * 3)
                .toArray();
        int[] arr10 =  Arrays.stream(arr)
                .map((i) -> i * 10)
                .toArray();

        // 각각의 배열 출력
        System.out.println("배열 arr2:");
        Arrays.stream(arr2)
                .forEach(System.out::print);
        System.out.println("\n");

        System.out.println("배열 arr3:");
        Arrays.stream(arr3)
                .forEach(System.out::print);
        System.out.println("\n");

        System.out.println("배열 arr10:");
        Arrays.stream(arr10)
                .forEach(System.out::print);
        System.out.println("\n");


    }

    public static void exam2() {
        // 1부터 10까지 수중에서 짝수만 따로 뽑아서 짝수 배열
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("=== 명령형 ===");
        int[] everArr = new int[arr.length];

        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                everArr[index++] = arr[i];
            }
        }

        for(int i : everArr) {
            System.out.println(i);
        }

        System.out.println("=== 스트림 ===");

        int[] arr2 = IntStream.rangeClosed(1, 10)
                .filter((num) -> {
                    if(num % 2 == 0) {
                        return true;
                    }
                    return false;
                })
                .toArray(); // 처리하고 끝

        System.out.println(arr2.length);

    }

    public static void exam1() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // 전부 출력
        // 명령형 -> 실수할 확률 높음, 코드가 조금 복잡해지면 의도가 잘 안보인다.
        // 장점 : 직관적, 높은 자유도
        System.out.println("=== 명령형 ===");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 선언형 -> 뭘 하겠다 선언
        // (arr.stream 하면 알아서 적용)
        System.out.println("=== 스트림 ===");
        Arrays.stream(arr)
                .forEach(StreamExam::test);  // forEach 안에는 만들어져있는 명령 ==> 메서드 레퍼런스
        // arr에서 요소 하나씩 빼냄. -> 출력하겠다 선언

        // System.out.println("hihi"); 호출/실행
        // System.out::println(); 호출에 대한 메서드 레퍼런스

        // ------------------------------------------------------------------------------------------------------------

        System.out.println("=== 스트림 짝수 호출 ===");
        IntStream.rangeClosed(1,100)
                .forEach(StreamExam::even);

        // ------------------------------------------------------------------------------------------------------------

        // 람다 -> 익명함수
        // 기본은 람다를 쓰되,
        // 람다 안에서 사용하는게 재사용성이 높거나, 가독성이 떨어지는 복잡한 코드가 => 함수 정의
        System.out.println("=== 스트림 짝수 호출_람다1 ===");
        IntStream.rangeClosed(1,100)
                .forEach((num) -> {
                    if(num % 2 == 0) {
                        System.out.println(num);
                    }
                });

        // ------------------------------------------------------------------------------------------------------------

    }

    public static void test(int num) {
        System.out.println("숫자 : " + num);
    }

    public static void even(int num) {
        if(num % 2 == 0) {
            System.out.println(num);
        }
    }

}
