package javaStudy.DevCourse20241219;

import java.util.Scanner;

public class EnhancedCondition {
    /** 양자택일 : 소지금 정도에 따른 대중교통 선택
     * input : 소지금
     * output : 10000원 이상일 시 택시, 기준 이하이면
     */
    public static void cashInHand() {
        int cashInHand;     // 소지금

        Scanner sc = new Scanner(System.in);
        System.out.println("가지고 있는 돈이 얼마인가요??");
        cashInHand = sc.nextInt();

        if (cashInHand >= 10000) {
            System.out.println("택시 타고 가자~~");
        } else {
            System.out.println("무슨 택시야. 버스나 타자~");
        }
    }

    /** 삼자택일 : 나이에 따른 학교 판별
     *
     */
    public static void age() {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("나이가 몇 살인가요");
        age = sc.nextInt();

        if(age < 14) {
            System.out.println("초등학생");
        }
        else if(age < 17) {
            System.out.println("중학생");
        }
        else if (age<20) {
            System.out.println("고등학생");
        }
        else {
            System.out.println("성인입니당");
        }

    }

    /** 과제 2 : 조건문 _ 학적 산출
     *
     */
    public static void score() {
        int score;

        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력해주세요.");
        score = sc.nextInt();

        if(score >= 90) {
             System.out.println("A");
        }
        else if(score >= 80) {
            System.out.println("B");
        }
        else if(score >= 70) {
            System.out.println("C");
        }
        else if(score >= 60) {
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }



    public static void main(String[] args) {
        cashInHand();
        age();
        score();
    }
}
