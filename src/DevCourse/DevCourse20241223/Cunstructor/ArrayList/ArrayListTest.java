package DevCourse.DevCourse20241223.Cunstructor.ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 배열의 단점 -> 크기 고정
        int[] arr = new int[1000];

        arr[0] = 1;

        // 단점 해결 -> ArrayList
        // 엄청난 최적화가 아닌 이상은 거의 ArrayList를 사용한다고 생각하기

        // <>안에는 무조건 객체(참조) 타입이 와야 한다.
        ArrayList<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);

        int num1 = list.get(0);
        System.out.println(num1);
        int num2 = list.get(1);
        System.out.println(num2);
        int num3 = list.get(2);
        System.out.println(num3);

        // Wrapper 클래스
        // int -> Integer
        // char -> Character

        // double -> Double
        // long -> Long
    }
}
