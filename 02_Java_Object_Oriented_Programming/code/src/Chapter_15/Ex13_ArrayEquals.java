package Chapter_15;

// Arrays 클래스에서 제공하는 메서드를 사용하기 위한 임포트
import java.util.Arrays;

// 클래스 정의 - 프로그램 실행
public class Ex13_ArrayEquals {
    public static void main(String[] args) {
        // 배열 생성 및 초기화
        int[] arr1 = {1, 2, 3, 4, 5};                   // arr1이라는 이름의 정수형 배열 초기화 - 초기화 값 지정
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);  // Arrays.copyOf 메소드르 이용하여 arr1의 모든 요소를 복사한 arr2 배열을 생성 -> arr1과 동일한 값을 갖게됨

        // 배열 내용 비교 및 확인
        boolean bCheck = Arrays.equals(arr1, arr2);     // Arrays.equals 메소드를 사용하여 arr1과 arr2의 요소가 동일한지 비교 -> 동일하면 true, 다르면 false
        System.out.println(bCheck);                     // 비교 결과 출력
    }
}
