package javaStudy.DevCourse20241219;

public class Loop {
    public static void main(String[] args) {

        // 순환, 반복
        // while은 반복문
        // 반복 제어가 중요

        int num = 0;

        while (num < 10) {
            System.out.println("hello world");
            num++;
        }

        System.out.println("byebye"); // while문이 끝나면 실행됨

        // 간이문제 : 숫자 30부터 80까지 출력
        num  = 30;

        while (num >=30 &&num <=80) {
            System.out.printf(num + " ");
            num++;
        }




    }
}
