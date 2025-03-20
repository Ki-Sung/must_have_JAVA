package Chapter_19;

// 임포트
import java.util.Scanner;                                   // Scanner 클래스 임포트

public class BubbleSortStep2 {
    // 배열에 정수를 입력받는 메서드 정의 - getNumber
    public static void getNumber(int[] num) {
        Scanner sc = new Scanner(System.in);                // 사용자 입력을 받기 위한 Scanner 객체 생성
        System.out.println("10개의 정수를 무작위로 입력하세요!");   // 사용자에게 입력을 요청하는 메시지

        // 배열의 각 요소에 사용자 입력값을 지정
        for (int i=0; i<num.length; i++) {                  // 배열의 길이 만큼 반복
            num[i] = sc.nextInt();                          // 사용자로부터 입력받은 정수를 배열에 저장
        }
    }

    // 프로그램 실행
    public static void main(String[] args) {
        int[] num = new int[10];                            // 정수형 배열 num을 선언하고 크기를 10으로 초기화
        getNumber(num);                                     // getNumber 메서드를 호출하여 배열에 사용자 입력값을 저장

        // 입력 확인용 출력
        for (int i=0; i<num.length; i++) {                  // 배열의 모든 요소를 출력하기 위한 반복문
            System.out.print(num[i] + " ");                 // 배열의 각 요소를 출력
        }
        System.out.println();                               // 출력 후 줄바꿈
    }
}
