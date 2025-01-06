package Chapter_15;

// 클래스 정의 1 - 사용자 정의 클래스
class BoxA6 {           // 빈 클래스
}

// 클래스 정의 2 - 공개 클래스 (자바 코드 실행)
public class Ex06_ArrayInit {
    public static void main(String[] args) {
        int[] arr1 = new int[3];                // 길이가 3인 int형 배열 arr1을 생성 - 배열의 초기값으로 0 설정
        int[] arr2 = new int[] {1, 2, 3};       // 길이가 3인 int형 배열 arr2를 생성 - 배열의 초기값으로 {1, 2, 3} 설정
        double[] arr3 = {1.0, 2.0, 3.0};        // 길이가 3인 double 배열 arr3을 생성 - 배열의 초기값으로 {1.0, 2.0, 3.0} 설정
        double[] arr4 = new double[3];          // 길이가 3인 double 배열 arr4를 생성 - 배열의 초기값으로 0.0 설정
        BoxA6[] arr5 = new BoxA6[3];            // 길이가 3인 BoxA6 객체 배열 arr5를 생성 - 배열의 초기값으로 null로 초기화 (아직 객체가 생성되지 않았기 때문)

        // for 루프를 이용하여 결과 출력
        for (int i = 0; i < arr1.length; i++) {     // for 루프를 사용하여 배열 arr1의 길이 만큼 반복
            System.out.print(arr1[i] + " ");        // arr1 값 출력 - 배열 길이만 설정하고 값을 설정하지 않았기 때문에 모든 요소는 초기값 0
            System.out.print(arr2[i] + " ");        // arr2 값 출력 - 배열 길이와 설정된 값인 1, 2, 3 출력
            System.out.print(arr3[i] + " ");        // arr3 값 출력 - 배열 길이와 설정된 값인 1.0, 2.0, 3.0 출력
            System.out.print(arr4[i] + " ");        // arr4 값 출력 - 배열 길이만 설정하고 값을 설정하지 않았기 때문에 모든 요소는 초기값 0.0
            System.out.print(arr5[i] + " ");        // arr5 값 출력 - BoxA6 클래스에 객체가 생성되지 않았기 때문에 모든 요소는 초기값 null
            System.out.println();
        }
    }
}
