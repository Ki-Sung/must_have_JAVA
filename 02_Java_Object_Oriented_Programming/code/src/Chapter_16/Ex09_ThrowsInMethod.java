package Chapter_16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09_ThrowsInMethod {
    public static void myMethod() {                 // 1번
        myMethod2();
    }

    public static void myMethod2() throws ArithmeticException, InputMismatchException {  // 2번
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();                   // 에러 발생 지점
        int num2 = 10 / num1;                      // 에러 발생 지점
        System.out.println(num2);
    }

    public static void main(String[] args) {
        try {
            myMethod();
        } catch (ArithmeticException | InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("-------");
    }
}
