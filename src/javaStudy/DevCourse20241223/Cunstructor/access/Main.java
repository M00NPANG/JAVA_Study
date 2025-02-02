package javaStudy.DevCourse20241223.Cunstructor.access;

// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        // 구현시작
        p1.setId(20);
        System.out.println("제 번호는 " + p1.getId()+ "입니다.");
        // 구현끝

        // 출력 : 제 번호는 20 입니다.
    }
}

class Person {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}