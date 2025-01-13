package Chapter_15;

// Arrays 클래스에서 제공하는 메서드를 사용하기 위한 임포트
import java.util.Arrays;

// 클래스 정의 - 프로그램 실행
public class Ex14_ArraySort {
    public static void main(String[] args) {
        // 배열 생성 및 초기화
        int[] arr1 = {1, 2, 3, 4};                           // arr1이라는 이름의 정수형 배열 초기화 - 초기값 지정
        double[] arr2 = {4.4, 3.3, 2.2, 1.1};                // arr2라는 이름의 실수형 배열 초기화 - 초기값 지정
        String[] arr3 = {"홍길동", "전우치", "손오공", "멀린"};    // arr3라는 이름의 문자열 배열 초기화 - 초기값 지정

        // 배열 정렬
        Arrays.sort(arr1);                                  // Arrays.sort 메서드를 이용하여 arr1 배열 오름차순 정렬
        Arrays.sort(arr2);                                  // Arrays.sort 메서드를 이용하여 arr2 배열 오름차순 정렬
        Arrays.sort(arr3);                                  // Arrays.sort 메서드를 이용하여 arr3 배열 오름차순 정렬

        // 결과 출력 - 반복문 이용
        for (int n : arr1)                                  // arr1 모든 요소 출력
            System.out.print(n + "\t");
        System.out.println();

        for (double d : arr2)                               // arr2 모든 요소 출력
            System.out.print(d + "\t");
        System.out.println();

        for (String s : arr3)                               // arr3 모든 요소 출력
            System.out.print(s + "\t");
        System.out.println();
    }
}
