package Chap_02_Variables_Constants_DataTypeConversion;

public class _EX02_TypeChange1 {
    public static void main(String[] args) {

        // 코드 실행 X, 에러 표시 확인용
        int num1 = 1;          // 1번
        byte num2 = 1;
        byte num3 = 127;       // 2번
        byte num4 = 128;       // 3번

        short num5 = 1;

        num2 = num5;           // 4번
        num2 = (byte)num5;     // 5번
    }
}
