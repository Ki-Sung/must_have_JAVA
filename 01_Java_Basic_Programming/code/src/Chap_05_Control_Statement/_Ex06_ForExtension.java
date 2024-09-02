package Chap_05_Control_Statement;

public class _Ex06_ForExtension {
    public static void main(String[] args) {
        // 2의 배수 출력
        int i = 0;
        for ( ; i<10; i++) {                        // 1번 - 초기식 생략
            if (i % 2 == 0)                         // 2번 - 2의 배수이면
                System.out.print(i + " ");
        }
        System.out.println();

        i = 0;                                      // 3번 - 초기화
        for ( ; i<10; ){                            // 4번 - 초기식, 증감식 생략
            if (i % 2 == 0)
                System.out.print(i + " ");

            i ++ ;                                  // 5번 - 증감식
        }
        System.out.println();

        for (int j=0; j<10; j=j+2) {                // 6번 - 증감식에 대한 연산 수식
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
