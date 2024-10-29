package Chapter_12.Chapter12_3;

// 부모 클래스 정의(추상 클래스) - 유닛의 공통 속성과 기능을 정의 -> 추상 클래스는 인스턴스(실체)를 생성할 수 없음
abstract class Unit {
    abstract void doMove();         // 추상 메서드 정의 - 유닛 이동 기능
}

// 자식 클래스 1 Marine - 부모인 Unit 클래스를 상속 받아 정의 (extends 사용)
class Marine extends Unit {
    void doMove() {                 // 추상 클래스의 메서드를 구현 - 마린 이동 방법
        System.out.println("마린은 두 발로 이동합니다.");
    }
}

// 자식 클래스 2 Zergling - 부모인 Unit 클래스를 상속 받아 정의 (extends 사용)
class Zergling extends Unit {
    void doMove() {                // 추상 클래스의 메서드를 구현 - 저글링 이동 방법
        System.out.println("저글링은 네 발로 이동합니다.");
    }
}

// 메인 클래스 MyStarcraft - 실행 클래스
public class MyStarcraft {
    public static void main(String[] args) {
        Marine unit1 = new Marine();            // Marine 클래스의 객체 unit1 생성
        unit1.doMove();                         // doMove() 메서드를 호출하여 마린 이동 방법 출력

        Zergling unit2 = new Zergling();        // Zergling 클래스의 객체 unit2 생성
        unit2.doMove();                         // doMove() 메서드를 호출하여 저글링 이동 방법 출력
    }
}
