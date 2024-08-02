package Chap_03_Operator;

public class _EX07_ShortCircuitEvaluation {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        boolean result;

        result = ((x = x + 1) < 0) && ((y = y + 1) > 0);    // 1번

        System.out.println("result = " + result);
        System.out.println("x = " + x);
        System.out.println("y = " + y + '\n');

        result = ((x = x + 1) > 0) || ((y = y + 1) > 0);    // 2번

        System.out.println("result = " + result);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
