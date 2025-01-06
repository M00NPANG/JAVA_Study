package javaStudy.DevCourse20241220;

public class LocalVariable {
    public static void main(String[] args) {

        int a = 10;
        String b = "hello";

        work();

        System.out.println("work2");

    }

    public static void work() {
        // 함수에서 만드는 모든 변수는 지역변수
        // 지역 변수는 함수가 끝나면 사라진다.
        // 효율적인 메모리 사용을 위해 그렇다.
        int c = 10;
        String d = "hello";

        System.out.println(c);
        System.out.println(d);
    }
}