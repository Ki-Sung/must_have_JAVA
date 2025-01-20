package Chapter_16;

public class Ex06_ExceptionThrow {

    // myMethod() 정의 - 정수 n을 매개변수로 받음
    public static void myMethod(int n) {
        myMethod2(n, 0);                                // 정수 n을 매개변수로 받아 myMethod2 메서드를 호출, 두 번째 매개변수로 0을 전달 함
    }

    // myMethod2() 정의 - 정수 n1, n2를 매개변수로 받음
    public static void myMethod2(int n1, int n2) {
        int r = n1 / n2;                                // 예외 발생 지점 -  정수 n1과 n2를 매개변수로 받아 n1을 n2로 나누는 작업을 수행 -> n2가 0이기 때문에 ArithmeticException이 발생
    }

    // 자바 프로그램 실행
    public static void main(String[] args) {
        myMethod(3);                                 // myMethod(3);를 호출하여 myMethod를 실행 -> myMethod2를 호출하고, 그때 0을 전달하여 나누기 시도
        System.out.println("Exception Throw!!!");       // myMethod 호출 후에 출력되는 메시지
    }
}
