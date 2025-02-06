package Chapter_17;

// 임포트 패키지
import java.util.Arrays;                            // Arrays 클래스 불러오기

// INum2 클래스 정의 - 정수 값을 저장하고, 다른 INum2 객체와의 동등성을 비교할 수 있는 기능을 제공
class INum2 {
    private int num;                                // private 접근 제어자로 num 변수를 선언 (외부에서 접근 불가)

    public INum2(int num) {                         // 생성자: INum2 객체 생성 시 num 값을 초기화
        this.num = num;                             // 매개변수 num을 클래스의 num 변수에 할당
    }

    @Override
    public boolean equals(Object obj) {             // equals 메서드 재정의 - 두 객체가 같은지를 비교
        // obj가 null인지 확인
        if (obj == null) {
            return false;                           // null이면 false 반환
        }
        // obj가 INum2 타입인지 확인
        else if (!(obj instanceof INum2)) {
            return false;                           // INum2가 아니면 false 반환
        }
        // num 값 비교
        else {
            return this.num == ((INum2) obj).num;   // 현재 객체의 num과 비교 대상 객체의 num을 비교
        }
    }
}

public class Ex16_ArrayObjEquals2 {
    public static void main(String[] args) {
        INum2[] arr1 = new INum2[2];                // 크기가 2인 INum2 타입의 배열 arr1 생성
        INum2[] arr2 = new INum2[2];                // 크기가 2인 INum2 타입의 배열 arr2 생성

        arr1[0] = new INum2(1);                     // arr1의 첫 번째 요소에 num이 1인 INum2 객체 생성 및 할당
        arr2[0] = new INum2(1);                     // arr2의 첫 번째 요소에 num이 1인 INum2 객체 생성 및 할당

        arr1[1] = new INum2(2);                     // arr1의 두 번째 요소에 num이 2인 INum2 객체 생성 및 할당
        arr2[1] = new INum2(2);                     // arr2의 두 번째 요소에 num이 2인 INum2 객체 생성 및 할당

        System.out.println(Arrays.equals(arr1, arr2)); // 두 배열의 요소가 같은지를 비교하고 결과를 출력
    }
}
