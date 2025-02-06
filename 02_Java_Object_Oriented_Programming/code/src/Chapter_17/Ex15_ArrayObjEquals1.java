package Chapter_17;

// 임포트 패키지
import java.util.Arrays;                            // Arrays 클래스 불러오기

// 클래스 정의 - Array의 정수를 저장하는 기능
class INum1 {
    private int num;                                    // num 정수형 변수 선언 - 해당 변수는 외부에 접근할 수 없음

    public INum1(int num) {                             // INum1 생성자 선언(객체가 생성될 때 호출됨) - INum1 객체 생성시 num 값을 초기화
        this.num = num;                                 // 매개변수 num을 클래스의 num 변수에 할당 - 현재 객체의 num 변수를 나타냄
    }
}

public class Ex15_ArrayObjEquals1 {
    public static void main(String[] args) {
        INum1[] arr1 = new INum1[2];                    // 크기가 2인 INum1 타입의 배열 arr1 생성
        INum1[] arr2 = new INum1[2];                    // 크기가 2인 Inum1 타입의 배열 arr2 생성

        arr1[0] = new INum1(1);                         // arr1의 첫 번째 요소에 num이 1인 INum1 객체 생성 및 할당
        arr2[0] = new INum1(1);                         // arr2의 첫 번째 요소에 num이 1인 INum1 객체 생성 및 할당

        arr1[1] = new INum1(2);                         // arr1의 두 번째 요소에 num이 2인 INum1 객체 생성 및 할당
        arr2[1] = new INum1(2);                         // arr2의 두 번째 요소에 num이 2인 INum1 객체 생성 및 할당

        System.out.println(Arrays.equals(arr1, arr2));  // 배열 비교 결과 출력 - 배열의 요소가 서로 다른 객체 인스턴스 이므로 false가 됨
                                                        // false인 이유는 두 객체가 서로 다른 메모리 주소에 저장되기 때문
    }
}
