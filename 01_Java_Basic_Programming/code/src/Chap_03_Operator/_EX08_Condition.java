package Chap_03_Operator;

public class _EX08_Condition {
    public static void main(String[] args) {
        // 변수 대입
        int num1 = 50;
        int num2 = 100;

        // 조건 연산자 사용 1
        int big = (num1 > num2) ? num1 : num2;       // 1번 - false
        System.out.println("큰 수: " + big);          // 출력 - big이 false, 두 번째 사항인 num2를 출력

        // 조건 연산자 사용 2
        int diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);    // 2번 - false
        System.out.println("두 수의 차: " + diff);                     // 출력 - diff가 false, 두 번째 사항인 "(num2 - num1)" 실행 후 출력
    }
}
