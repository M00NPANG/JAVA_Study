package Java.DevCourse20241220.Test;

public class Game {
    public static void main(String[] args) {
        로봇오리 a로봇오리 = new 로봇오리();
        a로봇오리.날다();
        a로봇오리.수영하다();
    }
}

class 날개 {
    public void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 고무날개 {
    public void 날다() {
        System.out.println("저는 못 날아요 ㅠㅠ");
    }
}

class 발 {
    void 수영하다() {
        System.out.println("물갈퀴로 수영합니다.");
    }
}

class 고무발 {
    public void 수영하다() {
        System.out.println("물에 둥둥 뜹니다.");
    }
}


class 오리 {
    날개 wing = new 날개();
    발 foot = new 발();

    public void 날다() {
        wing.날다();
    }

    public void 수영하다() {
         foot.수영하다();
    }
}

class 고무오리 extends 오리 {
    고무날개 wing = new 고무날개();
    고무발 foot = new 고무발();

    public void 날다() {
        wing.날다();
    }

    public void 수영하다() {
        foot.수영하다();
    }

}
class 로봇오리{
    고무날개 wing = new 고무날개();
    발 foot = new 발();

    public void 날다() {
        wing.날다();
    }

    public void 수영하다() {
        foot.수영하다();
    }
}
