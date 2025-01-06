package javaStudy.DevCourse20241220.composition;

public class Main {
    public static void main(String[] args) {
        홍길동 dong = new 홍길동();
        홍길순 soon = new 홍길순();


        dong.자바개발();
        soon.자바개발();
        soon.파이썬개발();


        이순신주식회사 leeCorp = new 이순신주식회사();

        leeCorp.자바개발(); // 자바23 개발을 합니다.
        leeCorp.파이썬개발(); // 파이썬 개발을 합니다.

    }
}

// 함수 호출은 중복 아님... 크게 보면 맞지만 그 정도는... 중복 취급하지 말죠...
class 이순신주식회사 {
    홍길동 길동연락처 = new 홍길동();
    홍길순 길순연락처 = new 홍길순();

    public void 자바개발() {
        길동연락처.자바개발();
    }

    public void 파이썬개발() {
        길순연락처.파이썬개발();
    }

}

class 홍길동 {
    public void 자바개발() {
        System.out.println("자바23 개발을 합니다.");
    }
}

// 객체가 다른 객체의 도움을 받아서 해결 -> 구성
class 홍길순 {

    int age;
    String name;
    String hobby;

    홍길동 길동이연락처 = new 홍길동();

    public void 자바개발() {
        길동이연락처.자바개발();
    }
    public void 파이썬개발() {
        System.out.println("파이썬 개발을 합니다.");
    }
}