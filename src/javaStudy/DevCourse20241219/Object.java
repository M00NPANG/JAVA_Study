package javaStudy.DevCourse20241219;

public class Object {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4};      // 같은 타입만 저장
//
//        // 사람 (실제로 데이터들은 같은 종류에 다향한 값을 가지고 있음)
//        int age = 20;
//        int age2 = 23;
//        String name = "홍길동";
//        String name2 = "이순신";

        // 객체를 사용한다면 다른 타입의 변수를 저장할 수 있다.

        Person p1 = new Person();
        p1.age = 20;
        p1.name = "홍길동";
        p1.home = "서울";

        Person p2 = new Person();
        p2.age = 23;
        p2.name = "이순신";
        p2.home = "부산";

        System.out.println(p1.age);
        System.out.println(p2.age);


    }
    // class -> 객체를 만들기 위한 설계도, 붕어빵 틀!!
    public static class Person {
        int age;
        String name;
        String home;

    }
}
