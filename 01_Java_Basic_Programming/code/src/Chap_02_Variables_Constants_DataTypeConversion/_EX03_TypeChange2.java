package Chap_02_Variables_Constants_DataTypeConversion;

public class _EX03_TypeChange2 {
    public static void main(String[] args) {

        // 코드 실행 X, 에러 표시 확인용 - 모두 주석 처리
        // int num1 = 2147483647;          // 1번 - OK
        // int num2 = 2147483648;          // 2번 - 에러 발생
        // long num3 = 2147483648;         // 3번 - 에러 발생
        // long num4 = 2147483648L;        // 4번 - OK

        // float num5 = 1.0;               // 5번 - 에러 발생
        // float num6 = 1.0F;              // 6번

        // double num7 = 30;               // 7번 - int -> double 자동 형변환
    }
}
