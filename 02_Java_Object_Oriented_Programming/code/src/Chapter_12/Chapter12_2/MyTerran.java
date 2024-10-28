package Chapter_12.Chapter12_2;

// 부모 클래스 정의 - 유닛의 공통 속성과 기능을 정의
class Unit {
    String name;                    // 인스턴스 변수 1 - 유닛 이름
    int hp;                         // 인스턴스 변수 2 - 유닛 체력

    // 메서드 정의 - 유닛의 기본 이동 동작을 출력
    void doMove() {
        System.out.println("이동속도 10으로 이동");
    }
}

// 자식 클래스 정의 1 Marine - 부모인 Unit 클래스를 상속 받아 정의 (extends 사용)
class Marine extends Unit {
    int attack;                 // 추가 속성 - 공격력

    // 부모 메서드와 같은 이름의 자식 메서드 - Marine 클래스에서 오버라이드된 메서드
    void doMove() {
        super.doMove();         // 부모 클래스(Unit)의 doMove() 메서드를 호출하여 기본 이동 동작을 실행
        System.out.println(attack + " 공격");     // Marine의 공격력을 출력
    }
}

// 자식 클래스 정의 2 Medic - 부모인 Unit 클래스를 상속 받아 정의 (extends 사용)
class Medic extends Unit {
    int heal;                   // 추가 속성 - 치유력

    // 부모 메서드와 같은 이름의 자식 메서드 - Medic 클래스에서 오버라이드된 메서드
    void doMove() {
        System.out.println("이동속도 8로 이동");       // Medic의 이동속도 출력
        System.out.println(heal + " 치유");         // Medic의 치유력을 출력
    }
}

//  메인 클래스 MyTerran - 실행 클래스
public class MyTerran {
    public static void main(String[] args) {
        // 각각의 유닛 객체 생성 및 속성 설정
        Marine unit1 = new Marine();            // 마린 객체 생성
        unit1.name = "마린";                     // 이름 속성 설정
        unit1.hp = 100;                         // HP 속성 설정
        unit1.attack = 20;                      // 공격력 속성 설정

        Medic unit2 = new Medic();              // 메딕 객체 생성
        unit2.name = "메딕";                     // 이름 속성 설정
        unit2.hp = 120;                         // HP 속성 설정
        unit2.heal = 10;                        // 치유력 속성 설정

        // 메서드 호출 및 출력
        unit1.doMove();                         // doMove() 메서드를 호출하여 이동 동작과 공격력 출력
        System.out.println();                   // 빈 줄 출력 - 줄 바꿈
        unit2.doMove();                         // doMove() 메서드를 호출하여 메딕 유닛 정보 출력
    }
}
