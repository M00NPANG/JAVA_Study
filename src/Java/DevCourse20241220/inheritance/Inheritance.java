package Java.DevCourse20241220.inheritance;

public class Inheritance {
    public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.bark();
//        d1.eat();
//
//        Cat c1 = new Cat();
//        c1.meow();
//        c1.eat();

        Cat c2 = new Cat();
        c2.ability = "담을 뛰어넘는 능력이 있습니다.";
        c2.meow();
        c2.setAbility();

        Cat c3 = new Cat();
        c3.ability = "미래를 예측하는 능력이 있습니다.";
        c3.meow();
        c3.setAbility();

        Person p1 = new Person();
        p1.eat();

    }
}

// 상속
class Animal{
    String ability;

    public void eat() {
        System.out.println("냠냠");
    }

    public void setAbility() {
        System.out.println(ability);
    }

}

// 쉽게 Animal에 있는 거 참고해! 이런 느낌으로 받아들이면 좋을 듯
class Dog extends Animal{
    public void bark() {
        System.out.println("멍멍");
    }

}

class Cat extends Animal{
    public void meow() {
        System.out.println("야옹");
    }
}

class Person extends Animal { }

