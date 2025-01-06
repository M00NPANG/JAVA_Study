package javaStudy.DevCourse20241219;

 import java.util.Scanner;

public class Operation3 {
    public static void main(String[] args) {
        // 논리 연산 (True, False)

        // &&(AND) : 둘 다 참이어야 참
        // ||(OR) : 둘 다 거짓이어야 거짓
        if(false && true) {
            System.out.println("참");
        }

        // 사잇값
        // num이 1이상 100이하
        int num = 200;

        if (num >= 1) {
            if(num <= 100) {
                System.out.println("1 이상 100이하");
            }
        }

        // 논리 연산을 사용하면 하나의 if문에서 여러 조건을 따질 수 있다.
        if (num >= 1 && num <=100) {
                System.out.println("1 이상 100이하");
        }

        // 간이 문제 : 나이가 20세 이상, 60세 미만이면 비할인대상
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력해주세요.");
        age = sc.nextInt();

        if(age >=20 && age <60) {
            System.out.println("비할인 대상입니다.");
        } else {
            System.out.println("할인 대상입니다.");
        }


    }
}
