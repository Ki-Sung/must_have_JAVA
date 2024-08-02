package Chap_03_Operator;

public class _EX06_Logical {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;
        boolean result;

        result = (num1 > 1) && (num1 < 10);                      // 1번
        System.out.println("1 초과 10 미민인가? -> " + result);     // 1번 결과 출력

        result = ((num2 % 2) == 0) || ((num2 % 3) == 0);        // 2번
        System.out.println("2 또는 3의 배수인가? -> " + result);    // 2번 결과 출력
    }
}
