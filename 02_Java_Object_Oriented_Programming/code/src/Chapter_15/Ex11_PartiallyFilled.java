package Chapter_15;

// 클래스 정의 - 부분으로 채워진 2차원 배열 사용 및 출력
public class Ex11_PartiallyFilled {
    public static void main(String[] args) {
        // 2차원 배열 초기화 - 각 행의 요소가 다르기 때문에 "가변 길이 배열"이라 불리움
        int[][] arr = {                                 // 부분적으로 채워진 2차원 배열 arr 초기화
            {11},                                       // 첫 번째 행 - 1개의 요소
            {22, 33},                                   // 두 번째 행 - 2개의 요소
            {44, 55, 66}                                // 세 번째 행 - 3개의 요소
        };

        // 배열의 구조대로 내용 출력 - 이중 for문 사용
        for (int i = 0; i < arr.length; i++) {          // arr 행 반복 - arr.length는 배열의 전체 행 수를 반환 (여기서는 3개의 행이므로 0 부터 2까지 반복)
            for(int j = 0; j < arr[i].length; j++) {    // 현재 행 i에 있는 요소 반복 - arr[i].length는 i번째 행의 요소 수를 반환 (각 행마다 요소가 다르므로 반복문 행에 따라 다르게 실행)
                System.out.print(arr[i][j] + "\t");     // 현재 요소 arr[i][j] 출력 - 요소 사이에 탭(\t) 문자를 추가하여 구분
            }
            System.out.println();                       // 줄 바꾸기
        }
    }
}
