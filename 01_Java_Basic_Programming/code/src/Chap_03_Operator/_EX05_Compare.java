package Chap_03_Operator;

public class _EX05_Compare {
    public static void main(String[] args) {
        System.out.println("2 >= 1: " + (2 >= 1));
        System.out.println("2 <= 1: " + (2 <= 1));

        // 비교 연산 시에도 형변환이 일어남
        System.out.println("1.0 == 1: " + (1.0 == 1));
        System.out.println("1.0 != 1: " + (1.0 != 1));
    }
}
