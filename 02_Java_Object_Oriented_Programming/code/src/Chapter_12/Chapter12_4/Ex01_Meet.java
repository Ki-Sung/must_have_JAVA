package Chapter_12.Chapter12_4;

// 인터페이스 정의 1
interface Great {
    void greet();               // greet라는 메서드 선언 - 추상 메서드
}

// 인터페이스 정의 2
interface Talk {
    void talk();                // talk라는 메서드 선언 - 추상 메서드
}

// 클래스 정의
class Morning implements Great, Talk {         // Morning 이라는 이름의 클래스를 정의 후 Great, Talk 두 개의 인터페이스를 구현한다고 명시
    public void greet() {                       // greet() 메서드 구현 - 해당 메서드는 누구나 호출 가능
        System.out.println("안녕하세요!");         // 콜솔에 "안녕하세요!"라는 메시지 출력 반환
    }

    public void talk() {                        // talk() 메서드 구현 - 해당 메서드는 누구나 호출 가능
        System.out.println("날씨가 좋네요!");       // 콜솔에 "날씨가 좋네요!"라는 메시지 출력 반환
    }
}

// 프로그램 실행
public class Ex01_Meet {                        // 클래스 선언 - 프로그램 시작점
    public static void main(String[] args) {    // main 메서드 정의 - 프로그램 실행
        Morning morning = new Morning();        // Morning 클래스의 새로운 객체 선언 후 morning 변수에 저장
        morning.greet();                        // morning 객체의 greet 메서드를 호출
        morning.talk();                         // morning 객체의 talk 메서드를 호출
    }
}
