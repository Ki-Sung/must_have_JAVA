package Chap_05_Control_Statement;

public class _Ex09_BreakLabel {
    public static void main(String[] args) {
        int sum = 0;

        myExit: while (true) {                                  // 1번 - 무한 반복
            for (int i=0; i<100; i++) {                         // 2번
                sum = sum + i;
                if (sum > 2000) {
                    System.out.printf("%d: %d\n", i, sum);
                    break myExit;                               // 3번
                }
            }
        }
    }
}
