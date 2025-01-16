package Chapter_16;

// 필요 클래스 임포트
import java.util.Scanner;                       // 특정값을 키보드로 입력받는 클래스 (프롬프트)
import java.util.InputMismatchException;        // 입력된 값이 예상한 데이터 타입과 일치하지 않을 때 발생하는 예외 클래스

// 자바 프로그램 실행
public class Ex02_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비 - System.in은 표준 입력(즉, 키보드)을 의미

        // try 블록
        try {
            // 변수 입력 및 저장
            int num1 = sc.nextInt();                    // 사용자로부터 정수를 입력받아 num1 변수에 저장 - 만약 정수가 아닌 값을 입력하면 InputMismatchException 발생
            int num2 = 10 / num1;                       // 10을 num1로 나누고 결과를 num2에 저장 - 만약  num1이 0이라면, 이 줄에서 ArithmeticException이 발생

            // 결과 출력
            System.out.println(num2);                   // num2의 값 출력
            System.out.println("Good bye~~!");          // 나눗셈이 정상적으로 수행되었으면 결과 출력 후 해당 메시지 출력

        // 예외 처리 1
        } catch (ArithmeticException e) {               // try 블록에서 ArithmeticException이 발생하면 해당 블록으로 이동 - 이 예외는 주로 0으로 나누기를 시도할 때 발생
            // 예외 메시지 가져오기
            String str = e.getMessage();                // 발생한 예외의 메시지를 가져와 str 변수에 저장 - 나누기가 실패할 경우 "/by zero"라는 메시지 출력
            System.out.println(str);                    // 저장한 예외 메시지 결과 출력

            // 0으로 나누기 확인
            if (str.equals("/ by zero"))                // 예외 메시지가 "/by zero"와 같으면
                System.out.println("0으로 나눌 수 없습니다.");   // 해당 메시지 출력

        // 예외 처리 2
        } catch (InputMismatchException e) {            // try 블록에서 InputMismatchException이 발생하면 해당 블록으로 이동 - 사용자가 정수가 아닌 값을 입력한 경우 발생
            System.out.println(e.getMessage());         // 빌셍힌 예외 메시지 출력
            //e.printStackTrace();                      // 주석처리 - 만약 주석을 해제하면 예외의 스택 트레이스를 출력하여, 예외 발생 원인을 더 자세하게 확인할 수 있음
        }
    }
}
