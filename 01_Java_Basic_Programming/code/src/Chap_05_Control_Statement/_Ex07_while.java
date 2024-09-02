package Chap_05_Control_Statement;

public class _Ex07_while {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;

        while((num++) < 100){                           // 1번
            // if((num % 5) != 0) || if((num % 7) != 0) // 2번
            // continue;                                // 3번 - 5와 7의 배수가 아니면 위로 이동

            if ( (num % 5) != 0 )                       // 4번
                continue;
            if ( (num % 7) != 0 )                       // 5번
                continue;

            count++;                                    // 6번 - 5와 7의 배수이면 실행
            System.out.println(num);                    // 7번 - 5와 7의 배수이면 실행
        }

        System.out.println("count: " + count);          // 8번
    }
}
