package javaStudy.DevCourse20241220;

public class Casting {
    public static void main(String[] args) {
        // 숫자 타입 형변환
        // 1. 자동 형변환 (작은 타입 -> 큰 타입)
        // 2. 수동 형변환 (강제로 하면 문제가 발생할 수 있다.)


        // 클래스 타입 형변환
        // 1. 자동 형변환 (작은 타입 -> 큰 타입)
        // 2. 수동 형변환 (강제로 하면 문제가 발생할 수 있다.)


        칼 sword = new 칼();
        활 bow = new 활();
        // 도끼, 창, 지팡이, ....

        무기 weapon = new 칼(); // 칼이 무기로 변환되어야만 가능.


        weapon.사용(); // 칼을 휘두르다

        weapon = new 활();

        weapon.사용(); // 화살을 날린다


    }
}

// 오버라이팅은 부모가 물려준 메소드랑 똑같아야 하고, 내부 내용은 달라도 괜찮다!
class Worrior {

    무기 weapon = new 활();

}

class 무기 {
    // 45강 참고
    // 추상클래스는 new 사용 불가 -> 실체가 존재하지 않기 때문에!!!!
    // 실제로 구체적으로 사용할 일이 거의 없기 때문에 사용하기 위한 트리거 정도로 남겨두는게 좋음
    // 추상 클래스를 상속 받는 클래스는 추상 메소드를 반드시 구현해야함!!!
    public void 사용() {}


}

class 칼 extends 무기 {
    public void 사용() {
        System.out.println("칼을 휘두르다.");
    }
}

class 활 extends 무기 {
    public void 사용() {
        System.out.println("화살을 날린다.");
    }
}
