package Chapter_16;

// 필요 클래스 임포트
import java.util.Scanner;                       // 특정값을 키보드로 입력받는 클래스 (프롬프트)
import java.util.InputMismatchException;        // 입력된 값이 예상한 데이터 타입과 일치하지 않을 때 발생하는 예외 클래스

// 클래스 정의 - 자바 프로그램 실행
public class Ex04_CatchConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비 - System.in은 표준 입력(즉, 키보드)을 의미

        // try 블록
        try {
            int num1 = sc.nextInt();                // 사용자로부터 정수를 입력받아 num1 변수에 저장 - 만약 정수가 아닌 값을 입력하면 InputMismatchException 발생
            int num2 = 10 / num1;                   // 10을 num1로 나누고 결과를 num2에 저장 - 만약  num1이 0이라면, 이 줄에서 ArithmeticException이 발생
            System.out.println(num2);               // 계산 결과인 num2 값 출력

            // 예외 처리 - catch 블럭
        } catch (ArithmeticException | InputMismatchException e) {        // ArithmeticException과 InputMismatchException 두 가지 예외를 동시에 처리. 두 개의 예외를 | 연산자로 연결하여 하나의 블록에서 처리
            // System.out.println(e.getMessage());                      // 주석 처리 1 - 예외 발생 메시지 출력
            // e.printStackTrace();                                     // 주석 처리 2 - 예외의 스택 트레이스를 출력
            System.out.println("예외 발생");            // 예외 발생 메시지 출력
        }

        // 종료
        System.out.println("Good bye~~!");          // 종료 메시지 출력
    }
}
