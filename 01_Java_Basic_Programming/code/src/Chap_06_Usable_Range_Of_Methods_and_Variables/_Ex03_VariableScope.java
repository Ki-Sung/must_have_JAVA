package Chap_06_Usable_Range_Of_Methods_and_Variables;

public class _Ex03_VariableScope {
    public static void main(String[] args) {
        boolean myState = true;
        int num1 = 11;

        if (myState) {
            // int num1 = 22;           // 1번 - 에러
            num1++;
            System.out.println(num1);
        }

        {
            int num2 = 33;
            num2++;
            System.out.println(num2);
        }                               // 2번

        // System.out.println();        // 3번 - 에러

        for (int i=0; i<3; i++) {
            System.out.println(i);
        }

        // System.out.println();        // 4번 - 에러
    }
}
