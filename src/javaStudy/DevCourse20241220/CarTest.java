package javaStudy.DevCourse20241220;

public class CarTest {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.model = "아반떼";
        c1.speed = "200";

        c2.model = "싼타페";
        c2.speed = "150";

        c3.model = "모닝";
        c3.speed = "100";

        c1.run();
        c2.run();
        c3.run();

        // 아반떼이/가 시속 200km로 달립니다.
        // 싼타페이/가 시속 150km로 달립니다.
        // 모닝이/가 시속 100km로 달립니다.

    }
}

class Car {
    String model;
    String speed;

    public void run() {
        System.out.println(model + "이/가 시속 " + speed + "km로 달립니다.");
    }
}