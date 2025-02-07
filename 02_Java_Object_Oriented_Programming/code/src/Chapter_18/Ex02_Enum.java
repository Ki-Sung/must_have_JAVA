package Chapter_18;

// Human2라는 이름의 열거형(enum) 정의
enum Human2 {
    MAN,                                // 남성을 나타내는 열거형 상수
    WOMAN                               // 여성을 나타내는 열거형 상수
}

// Machine2라는 이름의 열거형(enum) 정의
enum Machine2 {
    TANK,                               // 탱크를 나타내는 열거형 상수
    AIRPLANE                            // 비행기를 나타내는 열거형 상수
}

public class Ex02_Enum {
    public static void main(String[] args) {
        createUnit(Machine2.TANK);          // Machine2의 TANK 상수를 사용하여 createUnit 메서드 호출
//        createUnit(Human2.MAN);           // Human2의 MAN 상수를 사용하여 createUnit 메서드 호출 (잘못된 상수 사용: 에러)

        // 참고: C 언어처럼 숫자로 비교하면 에러 발생
//        if (Human2.MAN == 0){             // 잘못된 상수 사용: 에러
//
//        }
    }

    // createUnit 메서드 정의: Machine2 타입의 kind 매개변수를 받음
    public static void createUnit(Machine2 kind) {
        // kind에 따라 다르게 동작하도록 switch 문 사용
        switch(kind) {
            case TANK:                                  // kind가 Machine2.TANK와 같으면
                System.out.println("탱크를 만듭니다.");     // 탱크 제작 메시지 출력
                break;                                  // switch 문 종료

            case AIRPLANE:                              // kind가 Machine2.AIRPLANE과 같으면
                System.out.println("비행기를 만듭니다.");   // 비행기 제작 메시지 출력
                break;                                 // switch 문 종료
        }
    }
}
