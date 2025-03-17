package Chapter_18;

// 인터페이스 정의 - Unit6
// 인터페이스는 특정 메서드를 구현해야 하는 계약을 정의하여, 이를 통해 다양한 클래스가 동일한 메서드를 가질 수 있도록 함
interface Unit6 {
    @Deprecated                                     // 이 메서더는 더 이상 사용되지 않음을 나타내는 어노테이션
    public void move(String str);                   // 문자열을 매개변수로 받는 move 메서드 정의
    public void run(String str);                    // 문자열을 매개변수로 받는 run 메서드 정의
}

// 클래스 정의 - Human6
class Human6 implements Unit6 {                     // Human6 클래스가 Unit6 인터페이스를 구현
    @Override                                       // 인터페이스의 메서드를 오버라이드함을 나타냄
    @SuppressWarnings("deprecation")                // Deprecated 경고를 무시하겠다는 어노테이션 -> 해당 메서드를 사용할 때 경고 메시지 출력 X
    public void move(String str) {                  // move 메서드 구현
        System.out.println(str);                        // 전달된 문자열 출력
    }
    @Override                                       // 인터페이스의 메서드를 오버라이드함을 나타냄
    public void run(String str) {                   // run 메서드 구현
        System.out.println(str);                        // 전달된 문자열 출력
    }
}

public class Ex06_SuppressWarnings {
    // 프로그램 실행
    @SuppressWarnings("deprecation")                // Deprecated 경고를 무시하겠다는 어노테이션
    public static void main(String[] args) {        // 포로그램 실행인 main 메서드 정의
        Unit6 unit = new Human6();                      // Unit6 타입의 변수 unit을 선언하고 Human6 객체를 할당
        unit.move("인간형 유닛이 이동합니다.");           // move 메서드를 호출하여 문자열 출력
        unit.run("인간형 유닛이 달립니다.");             // run 메서드를 호출하여 문자열 출력
    }
}
