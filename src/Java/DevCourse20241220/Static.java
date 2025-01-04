package Java.DevCourse20241220;

public class Static {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "맥스";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "루시";
        d2.bark();

        d1.name = "톰";
        d1.bark();
        d2.bark();

        System.out.println(d1.avgLife);

        d1.avgLife = 15; // d1을 통해 avgLife를 바꾸면 d2도 바뀜

        System.out.println(d2.avgLife);

    }
}

// 일반적으로는 객체에 static을 잘 사용하지 않음.
// class 만들 때 static 넣지 말자
class Dog {
    String name; // static은 모든 Dog 객체가 공유하는 변수
    int age;
    // 개의 평균 수명
    static int avgLife = 13; // static을 붙이면 모든 Dog 객체가 공유하는 변수가 됨

    public void bark() {
        System.out.println(name + "이/가 멍멍");
    }
}