package javaStudy.DevCourse20241223.Cunstructor.ArrayList;

import java.util.*;

public class MapExam {

    public static void main(String[] args) {
        // amp -> 동적 배열
        // 다양한 Map이 존재하지만 가장 많이 사용하는 건 Hash라는 자료구조를 사용하는 Map을 주로 사용함
        // 키, 벨류 값으로 구분
        Map<String, String> map = new HashMap<>();
        map.put("사과", "apple");
        map.put("바나나", "banana");
        map.put("오렌지", "orange");

        // 키 값을 출력하면 벨류가 출력되게 됨!
        // System.out.println(map.get("사과"));

        // ArrayList는 for문을 돌려서 내부를 다 출력했다면, Map은 keySet을 사용한다.
        // 순서는 내가 저장한 순서대로 출력하지는 않음. 순서 보장 XX
        // 그래서 순서가 필요하면 ArrayList 쓰라는 말이 있는데... LinkedHashMap이라고 순서 보장이 되는 Map이 존재!
        // but 그냥 HashMap이 더 빠름
        for(String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
