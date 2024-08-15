package Chap_04_Console_Output_Input;

import java.util.Scanner;                           // 1번 - Scanner 클래스 임포트

public class _EX02_Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 2번 - Scanner 객체 생성

        System.out.println("숫자를 1 2 3 이렇게 입력하고 엔터를 입력하세요.");    // 3번 입력 대기

        int num1 = sc.nextInt();                    // 4번
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();                    // 5번

        System.out.println("숫자를 1 입력하고 엔터를 입력하세요.");
        int num4 = sc.nextInt();
        System.out.println("숫자를 2 입력하고 엔터를 입력하세요.");
        int num5 = sc.nextInt();
        System.out.println("숫자를 3 입력하고 엔터를 입력하세요.");
        int num6 = sc.nextInt();

        // 결과 출력
        System.out.printf("%d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);
    }
}
