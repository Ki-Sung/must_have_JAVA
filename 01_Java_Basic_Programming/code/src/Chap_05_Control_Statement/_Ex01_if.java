package Chap_05_Control_Statement;

public class _Ex01_if {
    public static void main(String[] args) {
        int num = 100;

        if (num > 50) {
            System.out.println("num 변수의 값이 50보다 큽니다.");             // 1번
        }

        // 한 줄만 실행하면 중괄호를 생략
        if (num > 50)
            System.out.println("num 변수의 값이 50보다 큽니다.");             // 2번

        // 같은 줄에 작성 가능. 실행 문장의 끝은 세미콜론(;)으로 구분
        if (num > 50) System.out.println("num 변수의 값이 50보다 큽니다.");   // 3번

        // 의도치 않은 결과
        if (num < 50)                                                   // 4번
            System.out.println(num);                                    // num 변수의 값이 궁금해 출력 - 5번
            System.out.println("num 변수의 값이 50보다 작습니다.");            // 6번
    }
}
