package Chapter_15;

// 클래스 정의 - 공개 클래스
public class Ex02_intArray {
    public static void main(String[] args) {
        // 1 배열 생성
        int[] ar  = new int[3];             // 길이가 3인 int형 1차원 배열의 생성

        // 2 배열 값의 저장
        ar[0] = 100;                        // 첫 번째 요소
        ar[1] = 90;                         // 두 번째 요소
        ar[2] = 80;                         // 세 번째 요소

        // 3 배열 값의 참조
        int sum = ar[0] + ar[1] + ar[2];     // 배열 ar의 모든 요소를 참조하여 총합을 계산 후 sum 변수에 저장
        System.out.println("총점: " + sum);   // 총합 결과 출력
    }
}
