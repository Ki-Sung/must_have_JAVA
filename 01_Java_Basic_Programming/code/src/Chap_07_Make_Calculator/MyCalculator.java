package Chap_07_Make_Calculator;

// 클래스 호출
import java.util.Scanner;                                           // 입력처리 클래스 선언

public class MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        // 입력 처리 객체 선언

        while (true) {                                              // 반복 작업 수행
            showMenu();                                             // 메뉴 출력 메서드 호출

            char myChar = sc.nextLine().charAt(0);                  // 입력 코드 - 메뉴 선택 번호
            if ( !checkNum(myChar) ) {                              // 압력한 데이터가 숫자인지 확인
                System.out.println("메뉴를 잘못 선택했습니다.");           // 만약 잘못 입력했을 경우 해당 결과 출력
                continue;                                           // 다시 메뉴 선택으로 가기
            }

            int num = myChar - '0';                                 // 입력한 숫자(문자열) 연산
            // System.out.println(num);                             // 연산된 결과 확인
            if (num == 0) {                                         // 입력된 숫자가 0일 경우
                break;                                              // (반복)멈추기
            }
            else {                                                  // 그외 조건 설정
                if (num > 4) {                                      // 입력 받는 숫자가 4를 초과할 경우
                    System.out.println("메뉴를 잘못 선택했습니다.");       // 잘못된 메뉴선택 안내 출력
                    continue;                                       // 반복문 계속 진행
                }

                // 더하기, 빼기, 곱하기, 나누기 실행
                // 숫자 입력 부분
                System.out.print("첫 번째 숫자: ");
                int num1 = sc.nextInt();
                sc.nextLine();

                System.out.print("두 번째 숫자: ");
                int num2 = sc.nextInt();
                sc.nextLine();

                // 입력된 메뉴 숫자에 따라 메소드 호출 후 동작
                if (num == 1)                                       // 메뉴에서 1을 선택했을 경우
                    addNum(num1, num2);                             // 사칙연산 덧셈 실행
                else if (num == 2)                                  // 메뉴에서 2을 선택했을 경우
                    minusNum(num1, num2);                           // 사칙연산 뺄셈 실행
                else if (num == 3)                                  // 메뉴에서 3을 선택했을 경우
                    multiplyNum(num1, num2);                        // 사칙연산 곱셈 실행
                else if (num == 4)                                  // 메뉴에서 4를 선택했을 경우
                    divideNum(num1, num2);                          // 사칙연산 나눗셈 및 나머지 계산 실행
            }
        }
        System.out.println("계산기를 종료합니다.");                      // 종료 메시지
    }

    // 메서드 만들기 부분 - 메뉴 명시, 사칙 연산 기능 정의
    // 메뉴 출력 메서드 만들기
    public static void showMenu() {
        System.out.println("메뉴를 선택하세요.");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("0. 끝내기");
    }

    // 사칙 연산 기능 메서드 만들기
    // 더하기
    public static void addNum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    // 빼기
    public static void minusNum(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    // 곱하기
    public static void multiplyNum(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(num1 + " X " + num2 + " = " + result);
    }

    // 나누기 및 나머지
    public static void divideNum(int num1, int num2) {
        int result1 = num1 / num2;
        System.out.println(num1 + " ÷ " + num2 + " = " + result1);

        int result2 = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result2);
    }

    // 숫자 0에서 9 사이의 값인지 확인, 숫자이면 true, 아니면 false 반환
    public static boolean checkNum(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        else {
            return false;
        }
    }
}