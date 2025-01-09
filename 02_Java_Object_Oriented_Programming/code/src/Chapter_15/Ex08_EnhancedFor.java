package Chapter_15;

// 클래스 정의
public class Ex08_EnhancedFor {
    public static void main(String[] args) {
        // 정수형 배열 arr 생성 후, 초기값 설정 - 이 배열의 길이는 5
        int[] arr = {1, 2, 3, 4, 5};

        // 배열 요소 전체 출력
        for (int e: arr) {
            System.out.print(e + " ");          // 공백으로 구분되어 출력
        }
        System.out.println();                   // 줄바꿈

        // sum 변수 초기화 - 배열의 모든 요소의 합계를 저장하는데 사용
        int sum = 0;

        // 배열 요소의 전체 합 출력
        for (int e: arr) {
            sum = sum + e;
        }
        System.out.println("sum: " + sum);      // 최종적으로 계산된 합계 sum 출력
    }
}
