package javaStudy.DevCourse20241219;

public class DeepShallow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 얕은 복사
        int[] arr2 = arr;

        // arr2 출력
        System.out.println("arr2 출력:");
        for (int i : arr2) {
            System.out.println(i);
        }

        // arr2 값 변경
        arr2[0] = 100;

        // arr2 출력
        System.out.println("변경 후 arr2 출력:");
        for (int i : arr2) {
            System.out.println(i);
        }

        // arr 출력
        System.out.println("arr 출력:");
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
