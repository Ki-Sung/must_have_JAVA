package Chapter_16;

// 필요 클래스 임포트
import java.util.Scanner;                           // 특정값을 키보드로 입력받는 클래스 (프롬프트)

public class Ex08_WhyThrow {
    // 메서드 정의 1 - myMethod() -> 메서드는 예외를 처리하기 위해 myMethodA를 호출
    public static void myMethod() {
        // try 블럭
        try {
            myMethodA();                            // 여기로 예외가 넘어옴 - myMethodA()를 호출하여 예외가 발생할 가능성이 있는 코드를 실행, 예외가 발생하면 catch 블럭으로 넘어감
            // catch 블럭
        } catch (Throwable e) {                     // Throwable 클래스를 사용하여 모든 종류의 예외를 포괄적으로 처리
            System.out.println("에러!!!");           // 예외가 발생하면 메시지 출력 - 한글 메시지
        }
    }

    // 메서드 정의 2 - myMethod2() -> 메서드는 예외를 처리하기 위해 myMethodA를 호출
    public static void myMethod2() {
        // try 블럭
        try {
            myMethodA();                            // 여기로 예외가 넘어옴 - myMethodA()를 호출하여 예외가 발생할 가능성이 있는 코드를 실행, 예외가 발생하면 catch 블럭으로 넘어감
            // catch 블럭
        } catch (Throwable e) {                     // Throwable 클래스를 사용하여 모든 종류의 예외를 포괄적으로 처리
            System.out.println("Error!!!");         // 예외가 발생하면 메시지 출력 - 영문 메시지
        }
    }

    // 메서드 정의 3 - myMethodA() -> 사용자로부터 입력을 받고 계산을 수행하는 메서드
    public static void myMethodA() {
        Scanner sc = new Scanner(System.in);        // Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비 - System.in은 표준 입력(즉, 키보드)을 의미

        int num1 = sc.nextInt();                    // 사용자로부터 정수를 입력받음 - 사용자가 정수가 아닌 값을 입력하거나 0을 입력하면 예외가 발생
        int num2 = 10 / num1;                       // num1로부터 10을 나누는 연산 시도 -  num1이 0이라면 ArithmeticException이 발생하고, 잘못된 형식을 입력하면 InputMismatchException이 발생
        System.out.println(num2);                   // 계산 결과 출력 - 만약 앞에서 예외가 발생하면 이 줄은 실행되지 않음
    }

    // 자바 프로그램 시작
    public static void main(String[] args) {
        myMethod();                                 // myMethod()를 호출하여 예외 발생 시 한글 메시지를 출력
        myMethod2();                                // myMethod2()를 호출하여 예외 발생 시 영문 메시지를 출력
    }
}