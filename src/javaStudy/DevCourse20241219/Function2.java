package javaStudy.DevCourse20241219;

public class Function2 {
    public static void main(String[] args) {
//        work(1, 2);
//      CircleArea(3);

        // 반지름이 10인 원의 넓이를 2배
        System.out.println(CircleArea(10) * 2);

        // 반지름이 5인 원의 넓이를 2로 나누기
        System.out.println(CircleArea(5) / 2);
    }

    // 원의 넓이 구하는 함수
    public static double CircleArea(double radius) {
        // System.out.println(radius * radius * 3.14);
        return radius;
    }

    // 매개변수 개수, 타입 일치해야 됨.
    public static void work(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
