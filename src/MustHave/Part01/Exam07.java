package MustHave.Part01;

public class Exam07 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i = i + 1)
        {
            System.out.print(2 * i + " ");
        }
        System.out.println();

        System.out.println("========================");

        // 반복문 : 구구단 2단에서 9단 출력
        for (int i = 2; i < 10; i++)
        {
            // 반복문 안에서 반복문을 적용할 대상이 또 있음
            System.out.print(2 * i + " ");
            System.out.print(3 * i + " ");
            System.out.print(4 * i + " ");
            System.out.print(5 * i + " ");
            System.out.print(6 * i + " ");
            System.out.print(7 * i + " ");
            System.out.print(8 * i + " ");
            System.out.print(9 * i + " ");
            System.out.println();
        }

        System.out.println("========================");

        // 반복문의 중첩
        for(int i = 2 ; i < 10; i++) {
            for(int j = 2;  j < 10; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
