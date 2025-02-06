package Chapter_17;

// 임포트 패키지
import java.util.Arrays;                            // Arrays 클래스 불러오기

// Person 클래스 정의 - 나이 혹은 이름 별로 정렬하는 기능
class Person implements Comparable {                // Comparable 인터페이스 구현
    // 변수 설정
    private String name;                            // 이름을 저장할 private 변수
    private int age;                                // 나이를 저장할 private 변수

    // 생성자 설정
    public Person(String name, int age) {           // Person 객체 생성 시 이름과 나이를 초기화
        this.name = name;                           // 매개변수 name을 클래스의 name 변수에 할당
        this.age = age;                             // 매개변수 age를 클래스의 age 변수에 할당
    }

    public int compareTo(Object o) {                // Comparable 인터페이스의 compareTo 메서드 구현
        Person p = (Person)o;                       // 매개변수 o을 Person 타입으로 캐스팅

          // 이름 기준으로 비교 - 해당 주석을 해제하고 아래 나이 기준 비교 코드를 주석 처리 하면 동작함
//        int nNum = this.name.compareTo(p.name);     // 3번 - 이름 비교
//        return nNum;

        // 나이를 기준으로 비교 - 만약 이름 기준으로 비교 할 시 아래의 코드 모두 주석 처리
        if (this.age > p.age)                       // 현재 객체의 나이가 비교 대상의 나이보다 크면
            return 1;                               // 양수 변환 (현재 객체가 더 큼)
        else if (this.age < p.age)                  // 현재 객체의 나이가 비교 대상의 나이보다 작으면
            return -1;                              // 음수 변환 (현재 객체가 더 작음)
        else                                        // 두 나이가 같으면
            return 0;                               // 0을 반환 (동일함)
    }

    public String toString() {                        // toString 메서드 재정의
        return name + ": " + age;                     // 이름과 나이를 문자열 형태로 변환
    }
}

public class Ex17_ArrayObjSort {
    public static void main(String[] args) {
        Person[] arr = new Person[3];                   // 크기가 3인 Person 타입의 배열 arr 생성

        // Person 객체를 배열에 초기화
        arr[0] = new Person("홍길동", 29);     // 첫 번쨰 요소 초기화
        arr[1] = new Person("전우치", 15);     // 두 번째 요소 초기화
        arr[2] = new Person("손오공", 37);     // 세 번째 요소 초기화

        Arrays.sort(arr);                               // 배열 정렬 - compareTo 메서드를 기준으로 정렬됨

        for (Person p : arr)                            // 배열의 각 요소를 출력
            System.out.println(p);                      // Person 객체의 toString 메서드를 호출하여 출력
    }
}
