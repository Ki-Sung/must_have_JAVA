package Chapter_15;

// Arrays 클래스에서 제공하는 메서드를 사용하기 위한 임포트
import java.util.Arrays;

// 클래스 정의
public class Ex12_ArrayCopy {
    public static void main(String[] args) {
        // 배열 생성 및 초기화
        int[] arr1 = new int[10];               // arr1이라는 이름의 정수형 배열 생성 - 10개 요소를 가지며, 초기값은 0
        int[] arr2 = new int[8];                // arr2라는 이름의 정수형 배열 생성 - 8개 요소를 가지며, 초기값은 0

        // 배열 arr1을 3으로 초기화
        Arrays.fill(arr1, 3);               // Arrays.fill 메서드를 사용하여 arr1의 모든 요소를 3으로 초기화

        // 배열 arr1을 arr2로 부분 복사
        System.arraycopy(arr1, 0, arr2, 3, 4);     // System.arraycopy 메서드를 이용하여 arr1의 0번 인덱스 부터 4개의 요소를 arr2의 3번 인덱스 부터 복사
        // -> 즉, arr1[0], arr1[1], arr1[2], arr1[3]의 값이 arr2[3], arr2[4], arr2[5], arr2[6]에 복사됨

        // arr1 모든 요소 출력
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println();

        // arr2 모든 요소 출력
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        System.out.println();

        // 배열 arr1을 arr3로 부분 복사
        int[] arr3 = Arrays.copyOfRange(arr2, 2, 5);             // Arrays.copyOfRange 메서드를 이용하여 arr2의 2번 인덱스부터 5번 인덱스까지 요소를 복사하여 arr3라는 새로운 배열 생성
        // -> 즉, arr3 요소는 arr2[2], arr2[3], arr2[4]가 됨

        // arr3 모든 요소 출력
        for (int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");
        System.out.println();
    }
}
