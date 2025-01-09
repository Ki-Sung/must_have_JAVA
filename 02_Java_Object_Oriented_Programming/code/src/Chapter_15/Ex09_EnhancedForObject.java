package Chapter_15;

// 클래스 정의 - 호수와 사는 사람을 저장하는 역할
class House {
    // 속성 선언
    private int houseNum;                  // 속성 1 houseNum: 아파트 호수(정수형) -> private로 선언되어 외부에서 직접 접근 불가
    private String name;                   // 속성 2 - name: 해당 호수에 사는 사람(문자열) -> private로 선언되어 외부에서 직접 접근 불가

    // 생성자 정의
    House(int houseNum, String name) {      // House 객체가 생성될 때 호출, 매개변수로 받은 houseNum과 name을 클래스 속성에 할당
        this.houseNum = houseNum;           // 현재 객체 참조
        this.name = name;                   // 현재 객체 참조
    }

    // 게터(Getter) 메서드는 클래스의 private 속성에 접근하기 위한 방법을 제공
    // 게터(Getter) 메서드는를 사용함으로써 객체의 내부 상태를 외부에서 안전하게 읽을 수 있지만, 직접 수정은 불가능

    // 메서드 정의 1 getHouseNum() - houseNum 속성의 값을 반환하는 게터 메서드
    public int getHouseNum() {
        return houseNum;
    }

    // 메서드 정의 2 getName() - name 속성의 값을 반환하는 게터 메서드
    public String getName() {
        return name;
    }
}

// 프로그램 실행
public class Ex09_EnhancedForObject {
    public static void main(String[] args) {
        // 배열 생성 및 초기화
        House[] arr = new House[5];                             // 길이가 5인 House 객체 배열 arr 생성- 기본값 null로 초기화

        // 객체 생성 후 배열의 각 요소 저장 - 집 호수와 이름
        arr[0] = new House(101, "홍길동");        // 첫 번째 요소 저장
        arr[1] = new House(102, "전우치");        // 두 번째 요소 저장
        arr[2] = new House(103, "손오공");        // 세 번째 요소 저장
        arr[3] = new House(104, "해리포터");       // 네 번째 요소 저장
        arr[4] = new House(105, "멀린");          // 다섯 번째 요소 저장

        // for 루프를 사용하여 배열 arr의 모든 요소 반복 작업 진행
        for (House e: arr) {                                 // 향상된 기능의 for문 사용 - 여기서 e는 현재 방복 중인 House 객체를 나타냄
            if (e.getHouseNum() == 102)                      // e의 집 번호가 102인지 확인
                System.out.println(e.getName());             // 조건이 참이라면, 해당 객체의 이름(name의 속성 값) 출력
        }
    }
}