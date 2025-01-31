package Chapter_17;

public class Ex09_UtilMethod {
    public static void main(String[] args) {
        // 객체 선언
        Integer n1 = Integer.valueOf(5);                      // 정수 객체 선언 - 기본 타입 int를 Integer 객체로 변환 - 오버로딩
        Integer n2 = Integer.valueOf("1024");                // 문자열을 정수로 변환

        // 결과 출력 1 - 선언된 값들 출력
        System.out.println("큰 수: " + Integer.max(n1, n2));      // 최대값 출력
        System.out.println("작은 수: " + Integer.min(n1, n2));     // 최소값 출력
        System.out.println("합: " + Integer.sum(n1, n2));         // 합계 출력
        System.out.println();                                    // 빈줄 출력

        // 결과 출력 2 - 지정된 값 n진수로 출력
        System.out.println("12의 2진 표현: 0B" + Integer.toBinaryString(12));   // 12를 2진수로 출력
        System.out.println("12의 8진 표현: 0" + Integer.toOctalString(12));     // 12를 8진수로 출력
        System.out.println("12의 16진 표현: 0x" + Integer.toHexString(12));     // 12를 16진수로 출력
    }
}