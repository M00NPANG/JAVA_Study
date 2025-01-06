package javaStudy.DevCourse20241223.Cunstructor;

public class Contructor {
    public static void main(String[] args) {

    // 객체가 올바르게 작동하는 규칙 -> 올바른 데이터 세팅
    Person p1 = new Person(20, "홍길동", "서울");
    p1.showInfo();
    Person p2 = new Person();
    Person p3 = new Person(30, "아산");

    p3.name = "이순신";
    }
}

class Person {
    int age;
    String name;
    String home;

    // 생성자 -> 리턴타입 X, 함수명이 클래스명과 동일
//    public Person() {
//        System.out.println("생성자가 실행됩니다.");
//    }

    // 메서드 오버로딩 -> 매개변수 개수 or 매개변수 타입이 달라야 합니다.

    public Person() {}

    public Person(int age, String home) {
        this.age = age;
        this.home = home;
    }

    public Person(int age, String name, String home) {
        this.age = age;
        this.name = name;
        this.home = home;
    }

    // 함수가 지역변수/인스턴스변수 를 사용해서 기능 수행
    // 변수가 올바라야 함수가 잘 작동
    public void showInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}