package javaStudy.DevCourse20241219;

public class Function {

    public static void main(String[] args) {
        // 메인 함수(메서드)
        // 함수는 클래스 안에 있어야 한다.
        // 함수는 함수 안에 만들 수 없다.
        // 함수 사용하면 코드 중복 없앨 수 있음
            work();
            // 여러가지 다른 코드

            work();

            // 여러가지 다른 코드

            work();

        }

        public static void work() {
            System.out.println("작업1");
            System.out.println("작업2");
            System.out.println("작업3");
        }
}
