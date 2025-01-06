package javaStudy.DevCourse20241219;

public class Casting {
    public static void main(String[] args) {
        //형변환
        int i = 10;

        long l = 20000000000000L;

//      i = l; // 자바는 타입이 다르면 대입이 안된다. 기본. 에러가 난다.

        l = i; // int는 long변수에 들어갈 수 없다. 자동 형변환

        // int가 long 변수에 저장되는 것이 아니다. int가 long으로 변환돼서 저장되는 것이다.
        System.out.println(l);

        int i2 = 10;
        long l2 = 20000000000000L;

        i2 = (int)l2; // 데이터가 유실되든 말든 내가 알아서 할게. 진행시켜. 수동 형변환
        System.out.println(i2); // 실제로 데이터가 이상하게 나온다.

        int num3 = 10;
        int num4 = 4;

        System.out.println((double)num3/num4); // 2.5

        // 정수와 정수의 계산에는 정수가 나온다.
        // 실수와 실수의 계산에는 실수가 나온다.
        // 정수와 실수랑 계산 -> 정수가 실수로 자동 형변환 된다. 왜? 실수가 정수보다는 범위가 넓기 때문에!

    }
}
