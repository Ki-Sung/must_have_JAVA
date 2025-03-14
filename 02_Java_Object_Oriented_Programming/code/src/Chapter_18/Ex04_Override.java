package Chapter_18;

// 인터페이스 정의 - Unit4
interface Unit4 {
    public void move(String str);           // 메서드의 시그니처 정의 (구현은 없음)
}

// 클래스 정의
class Human4 implements Unit4 {             // Human4 클래스가 Unit4 인터페이스를 구현
    @Override                               // 메서드 오버라이딩을 명시적을 표시
    public void move(String str) {          // move() 메서드를 오버라이딩 -> Unit4 인터페이스의 move 메서드를 구현
        System.out.println(str);            // 전달된 문자열 출력
    }
}

public class Ex04_Override {
    // 프로그램 시작
    public static void main(String[] args) {
        Unit4 unit4 = new Human4();             // Unit4 타입의 변수 unit4를 선언하고 Human4 객체를 생성하여 할당
        unit4.move("인간형 유닛이 이동합니다.");   // unit4를 통해 move 메서드 호출
    }
}
