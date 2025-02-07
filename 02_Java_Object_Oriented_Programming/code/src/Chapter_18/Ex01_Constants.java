package Chapter_18;

// 인터페이스 정의 1 - Human1
interface Human1 {
    int MAN = 1;                    // 남성에 대한 상수 정의
    int WOMAN = 2;                  // 여성에 대한 상수 정의
}

// 인터페이스 정의 2 - Machine1
interface Machine1 {
    int TANK = 1;                   // 탱크에 대한 상수 정의
    int AIRPLANE = 2;               // 비행기에 대한 상수 정의
}

// 자바 프로그램 실행
public class Ex01_Constants {
    public static void main(String[] args) {
        createUnit(Machine1.TANK);                      // Machine1 인터페이스의 TANK 상수를 사용하여 createUnit 메서드 호출 -> 올바른 상수 사용

        createUnit(Human1.MAN);                         // Human1 인터페이스의 MAN 상수를 사용하여 createUnit 메서드 호출 -> 잘못된 상수 사용 (switch 문에서 처리되지 않음)
    }                                                   // createUnit 메서드의 경우 Machine1의 종류만 처리하도록 설계됨 값이 같기 때문에 에러없이 Tank로 출력되지만 잘못된 상수 사용!

    // createUnit 메서드 정의: 매개변수로 정수 kind를 받음
    public static void createUnit(int kind) {
        // kind에 따라 다르게 동작하도록 switch 문 사용
        switch(kind) {
            case Machine1.TANK:                         // kind가 Machine1.TANK와 같으면
                System.out.println("탱크를 만듭니다.");     // 탱크 제작 메시지 출력
                break;                                  // switch문 종료

            case Machine1.AIRPLANE:                     // kind가 Machine1.AIRPLANE 같으면
                System.out.println("비행기를 만듭니다.");    // 비행기 제작 메시지 출력
                break;                                  // switch문 종료
        }
    }
}
