package javaStudy.DevCourse20241219;

public class Operation2 {
    public static void main(String[] args) {

        // 복합 연산
        int num = 10;

        // System.out.println(num + 1);
        // 이렇게 하면 그냥 변수에 +1을 해주는 것! 변수의 값이 변하지 않음.

        //num 값을 1 증가시키고 싶다. 위치 중요
        // num = num+1;
        num += 1;
        System.out.println(num);

        int num2 = 10;
        num2 -=2;
        System.out.println(num2);

        int num3 = 10; // 2배 증가
        int num4 = 10; // 2배 감소

        num3 *=2;
        num4 /= 2;

        System.out.println(num3);
        System.out.println(num4);

        int num5 = 0;
        // 증가에 대한 코드
        num5 = num5 + 1;
        num5 += 1;
        num5++;

        //감소에 대한 코드
        int num6 = 10;
        num6 = num6 - 1;
        num6 -=1;
        num6--;

        int num7 = 10;
        System.out.println(num7++); //  후위 연산 - 코드 실행 후 변수 값 변경
        System.out.println(++num7); //  전위 연산 - 변수 값 변경 후 코드 실행



        // 논리 연산
    }
}
