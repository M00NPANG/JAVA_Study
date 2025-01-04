package Java.DevCourse20241223.Cunstructor.ArrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";

        // 1. 네 사람을 ArrayList에 저장
        ArrayList<Person> arrPerson =  new ArrayList();
        arrPerson.add(p1);
        arrPerson.add(p2);
        arrPerson.add(p3);
        arrPerson.add(p4);

        // 3. 30대인 사람에게만 자기소개 시키기
        // for(int i = 0; i < arrPerson.size(); i++){}
        for(Person t1 : arrPerson) {
            if(t1.age >= 30) {
                t1.자기소개();
            }
        }

    }
}

class Person {
    int age;
    String name;

    // 2. 네 사람에게 자기소개 시키기 (자기소개 문구 : 안녕하세요 ~~살 ~~~입니다.)
    public void 자기소개() {
        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
    }

}

