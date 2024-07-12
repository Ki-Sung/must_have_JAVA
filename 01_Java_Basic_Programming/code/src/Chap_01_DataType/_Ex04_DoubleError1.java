package Chap_01_DataType;

public class _Ex04_DoubleError1 {
    public static void main(String[] args) {

        // 부동소수점의 오차 결과 1
        double num1 = 1.0000001;        // 첫 번째 실수 선언
        System.out.println(num1);       // 결과 출력

        double num2 = 2.0000001;        // 두 번쨰 실수 선언
        System.out.println(num2);       // 결과 출력

        double result = num1 + num2;    // 첫 번째 실수와 두 번째 실수 연산
        System.out.println(result);     // 연산 결과 출력
    }
}
