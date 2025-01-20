package Chapter_16;

// 필요 클래스 임포트
import java.util.Scanner;                           // 특정값을 키보드로 입력받는 클래스 (프롬프트)

public class Ex07_CatchThrowable {

    // myMethod() 정의
    public static void myMethod() {
        myMethod2();                                // myMethod2 메서드를 호출
    }

    // myMethod2() 정의
    public static void myMethod2() {
        Scanner sc = new Scanner(System.in);        // Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비 - System.in은 표준 입력(즉, 키보드)을 의미

        int num1 = sc.nextInt();                    // 예외 발생 지점 1 - 사용자로부터 정수를 입력받아 num1 변수에 저장 - 만약 정수가 아닌 값을 입력하면 InputMismatchException 발생
        int num2 = 10 / num1;                       // 예외 발생 지점 2 - 10을 num1로 나누고 결과를 num2에 저장 - 만약  num1이 0이라면, 이 줄에서 ArithmeticException이 발생
        System.out.println(num2);                   // 결과 출력 - 계산 결과를 출력
    }

    // 자바 프로그램 실행
    public static void main(String[] args) {
        // try 블록
        try {
            myMethod();                             // myMethod() 호출 - 해당 메서드가 실행되면 myMethod2에서 예외가 발생할 수 있음

            // catch 블록 - 예외 처리
        } catch (Throwable e) {                     // Throwable을 사용하여 모든 종류의 예외를 처리 - Throwable은 모든 에러와 예외의 기본 클래스이므로, 이 블록은 발생할 수 있는 모든 예외를 포괄적으로 처리
            e.printStackTrace();                    // 예외 발생시 처리 - 예외가 발생했을 때 스택 트레이스를 출력하여 오류 발생 위치를 보여 줌
            // System.out.println(e.getMessage());  // 주석 처리 - 예외 메시지 출력
        }
    }
}
