// 버블 정렬 전체 코드
package Chapter_19;

// 임포트
import java.util.Scanner;                                       // Scanner 클래스 임포트

// 클래스 정의 - BubbleSort
public class BubbleSort {
    // 배열에 정수를 입력받는 메서드 정의 - getNumber
    public static void getNumber(int[] num) {                  // num 배열을 매개변수로 받음
        Scanner sc = new Scanner(System.in);                   // 사용자 입력을 받기 위한 Scanner 객체 생성
        System.out.println("10개의 정수를 무작위로 입력하세요!");      // 사용자에게 입력을 요청하는 메시지

        // 배열의 각 요소에 사용자 입력값을 지정
        for (int i=0; i<num.length; i++) {                      // 배열의 길이만큼 반복
            num[i] = sc.nextInt();                              // 사용자로부터 입력받은 정수를 배열에 저장
        }
    }

    // 버블 정렬을 수행하는 메서드 정의 - bubbleSort
    public static void bubbleSort(int[] num) {                  // num 배열을 매개변수로 받음
        for (int i=0; i<num.length; i++) {                      // 배열의 모든 요소에 대해 반복
            for (int j=0; j<num.length-i-1; j++) {              // 배열의 마지막 요소는 이미 정렬되었으므로 -1, 즉 이미 정렬된 마지막 요소를 제외하고 비교를 수행
                if (num[j] > num[j+1]) {                        // 현재 요소가 다음 요소보다 크면 아래의 코드 실행
                    int tmp = num[j];                           // 현재 요소를 tmp에 임시 저장
                    num[j] = num[j+1];                          // 현재 요소에 다음 요소의 값을 저장
                    num[j+1] = tmp;                             // 다음 요소에 tmp(원래 현재 요소의 값)을 저장
                }
            }
        }
    }

    // 프로그램 실행
    public static void main(String[] args) {
        int[] num = new int[10];                // 정수형 배열 num을 선언하고 크기를 10으로 초기화

        getNumber(num);                         // getNumber 메서드를 호출하여 사용자 입력값을 배열에 저장

        bubbleSort(num);                        // bubbleSort 메서드를 호출하여 배열을 정렬함

        // 입력 확인용 출력
        for (int i=0; i<num.length; i++) {      // 배열의 모든 요소를 출력하기 위한 반복문
            System.out.print(num[i] + " ");     // 배열의 각 요소를 출력
        }
        System.out.println();                   // 줄력 후 줄 바꿈
    }
}
