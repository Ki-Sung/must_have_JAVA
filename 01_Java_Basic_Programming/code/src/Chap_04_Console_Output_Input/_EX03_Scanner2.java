package Chap_04_Console_Output_Input;

import java.util.Scanner;                           // Scanner 클래스 임포트

public class _EX03_Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("홍길동 전우치 손오공 이렇게 입력하고 엔터를 입력하세요.");
        String name1 = sc.nextLine();               // 1번 - 줄 단위 입력 처리

        System.out.println("홍길동 전우치 손오공 이렇게 입력하고 엔터를 입력하세요.");
        String name2 = sc.next();                   // 2번(13번 ~ 15번 코드 라인) - 공백이나 탭 단위 처리
        String name3 = sc.next();
        String name4 = sc.next();

        System.out.printf("[%s] [%s] [%s] [%s]", name1, name2, name3, name4);
    }
}
