package Chap_03_Operator;

public class _EX04_PrefixPostfix {
    public static void main(String[] args) {
        int num = 10;               // 1번 - 변수 선언
        System.out.println(++num);  // 2번 - num값 하나 증가 후 출력
        System.out.println(num);    // 3번 - num 값이 증가되어 있음

        System.out.println(num++);  // 4번 - 출력 후에 값이 증가
        System.out.println(num);    // 5번 - 9행에서 증가된 값 확인
    }
}
