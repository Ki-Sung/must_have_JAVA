package Chap_01_DataType;

public class _Ex02_char {
    public static void main(String[] args) {

        // 변수 선언 - 문자형 및 10진수, 16진수, 2진수 디코딩
        char ch1 = 'A';                 // 자바가 인코딩을 합니다.
        char ch2 = 65;                  // 10진수로 직접 문자의 값을 넣어줍니다.
        char ch3 = 0x41;                // 16진수로 직접 문자의 값을 넣어줍니다.
        char ch4 = 0b0000000001000001;  // 2진수로 직접 문자의 값을 넣어줍니다.

        // 결과 출력
        System.out.println("인코딩 대상 문자: " + ch1);
        System.out.println("10진수 디코딩 결과: " + ch2);
        System.out.println("16진수 디코딩 결과: " + ch3);
        System.out.println("2진수 디코딩 결과: " + ch4);
    }
}
