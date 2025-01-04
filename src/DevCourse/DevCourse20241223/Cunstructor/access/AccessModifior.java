package DevCourse.DevCourse20241223.Cunstructor.access;

public class AccessModifior {
    public static void main(String[] args) {
        //  접근제어자
        // private(비공개), public(공개)
        // 공개, 비공개의 기준은 class (class가 공개를 하느냐, 하지 않는냐!)

        Test t1 = new Test();
        t1.print();

        t1.SetData(20);
        t1.print();

        t1.SetData(0);
        t1.print();

        System.out.println(t1.getData());
    }
}

// class는 변수/함수(메소드) 선언 및 초기화만 가능. 연산 X
// ex. data = 2;
class Test{
    // 데이터를 만들 때 default 값은 private.
    private int data = 10;      // 선언 및 초기화

    public void print() {
        System.out.println(data/10);
    }

    public void SetData(int data) {
        if(data == 0) {
            this.data = 50;
            return;
            // return;
        }
        this.data = data;
    }

    public int getData() {
        return data;
    }

}
