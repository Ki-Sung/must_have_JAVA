package Chap_03_Operator;

public class _EX09_Order {
    public static void main(String[] args) {
        System.out.println();               // 1번 - println()을 이용한 줄바꿈
        System.out.print("\n");             // 2번 - 특수 문자를 이용한 줄바꿈
        System.out.println("---------------------");

        int num = 5;

        System.out.print(num + '\n');     // 3번 - 기본 자료형끼리는 산술 연산
        System.out.println("---------------------");
        System.out.print(num + "\n");     // 4번
        System.out.println("3 >= 2 : " + (3 >= 2));     // 5번
        // System.out.println("3 >= 2 : " + 3 >= 2);    // 6번
    }
}
