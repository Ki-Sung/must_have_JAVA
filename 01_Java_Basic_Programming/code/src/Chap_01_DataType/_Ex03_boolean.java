package Chap_01_DataType;

public class _Ex03_boolean {
    public static void main(String[] args) {
        // 변수 선언 - boolean
        boolean check1 = true;      // 직접 값 대입 - true
        boolean check2 = false;     // 직접 값 대입 - false
        boolean check3 = (1 < 2);   // 연산 결과를 값으로 대입

        // 결과 출력
        System.out.println("직접 입력한 값 1: " + check1);
        System.out.println("직접 입력한 값 2: " + check2);
        System.out.println("연산 결과: " + check3);
    }
}
