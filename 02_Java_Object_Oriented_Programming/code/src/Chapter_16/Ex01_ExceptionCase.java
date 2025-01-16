package Chapter_16;

// 필요한 클래스 임포트
import java.util.Scanner;                       // 특정값을 키보드로 입력받는 클래스 (프롬프트)

// 자바 프로그램 실행
public class Ex01_ExceptionCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Scanner 객체 생성 - System.in은 표진 입력(키보드)을 의미함
        int num1 = sc.nextInt();                    // Scanner를 이용하여 사용자로 부터 정수를 입력받아 num 변수에 저장
        int num2 = 10 / num1;                       // 10을 입력한 정수 num1로 나누고 결과를 num2에 저장 - 만약 num1이 0이라면, 이 줄에서 ArithmeticException이 발생
        System.out.println(num2);                   // 결과 출력

        // Mybook book1 = new MyBook();             // 주석 처리 - MyBook이라는 클래스의 인스턴스 생성 -> Mybook이라는 클래스가 정의 되지 않아 주석 처리 (해제할 경우 컴파일 오류 발생)
    }
}
