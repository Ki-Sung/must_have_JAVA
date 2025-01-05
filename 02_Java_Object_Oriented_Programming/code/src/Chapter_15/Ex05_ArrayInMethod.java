package Chapter_15;

public class Ex05_ArrayInMethod {
    // main 메서드 - 프로그램 실행을 위한 메서드
    public static void main(String[] args) {
        int[] arr = makeInArray(5);             // makeInArray 메서드를 호출하여 길이가 5인 배열을 생성하고, 그 결과를 arr 변수에 저장

        int sum = sumOfArray(arr);                  // sumOfArray 메서드를 호출하여 배열 arr의 합계를 계산하고, 그 결과를 sum 변수에 저장

        System.out.println(sum);                    // sum의 값을 출력 - 배열의 모든 요소의 합계를 출력
    }

    // makeInArray 메서드 정의 - 지정한 길이에 따라 배열 생성
    public static int[] makeInArray(int len) {      // 길이를 매개변수로 받아 해당 길이의 배열을 생성, 반환 타입은 int[]
        int[] arr = new int[len];                   // 길이가 len인 int형 배열 arr을 생성, 배열의 각 요소는 기본값인 0으로 초기화

        for(int i = 0; i < len; i++) {              // 0부터 len-1까지 반복 작업
            arr[i] = i;                             // 배열 arr의 각 요소에 인덱스 i의 값을 저장
        }
        return arr;                                 // 초기화 된 배열 arr을 반환
    }

    // sumOfArray 메서드 정의
    public static int sumOfArray(int[] arr) {       // int형 배열을 매개변수로 받아 그 합계를 계산
        int sum = 0;                                // sum 변수 초기화

        for(int i = 0; i < arr.length; i++) {       // for 루프를 사용하여 배열 arr 길이만큼 반복
            sum = sum + arr[i];                     // 현재 인덱스의 배열 요소를 sum에 더함
        }
        return sum;                                 // 계산된 합계 sum을 반환 
    }
}
