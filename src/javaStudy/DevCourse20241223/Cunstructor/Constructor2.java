package javaStudy.DevCourse20241223.Cunstructor;

public class Constructor2 {
    public static void main(String[] args) {
//        System.out.println("== 사람객체 생성시작 ==");
//        new 사람();
//        System.out.println("== 사람객체 생성끝 ==");
//
//        System.out.println("== 청둥오리객체 생성시작 ==");
//        new 청둥오리();
//        System.out.println("== 청둥오리객체 생성끝 ==");
//		/* 출력
//		== 청둥오리객체 생성시작 ==
//		생물이 생성되었습니다.
//		동물이 생성되었습니다.
//		오리가 생성되었습니다.
//		청둥오리 생성되었습니다.
//		== 청둥오리객체 생성끝 ==
//		*/

        new 사람();
        // 아래와 같이 출력되게 해주세요.

        // 동물(String 이름, int 나이) 실행됨!
        // 이름 : 홍길동
        // 나이 : 27
    }
}

//class 생물 {
//    생물() {
//        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
//        System.out.println("생물이 생성되었습니다.");
//    }
//}
class 동물 {
    // 생성자 정의를 하게되면 기본 생성자를 자동으로 만들지 않음!!!
    // 따라서 인자값이 존재하는 생성자를 생성했다면, 그것을 유의해서 사용해야 함.
    동물(String 이름) {
        System.out.println("동물(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    동물(String 이름, int 나이) {
        System.out.println("동물(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }

}
class 사람 extends 동물 {
    사람 () {
        super("홍길동", 27);
    }

}

//class 오리 extends 동물 {
//    오리() {
//        super();
//        System.out.println("오리가 생성되었습니다.");
//    }
//
//}
//
//class 청둥오리 extends 오리 {
//     청둥오리 () {
//         super();
//         System.out.println("청둥오리가 생성되었습니다.");
//     }
//
//}
