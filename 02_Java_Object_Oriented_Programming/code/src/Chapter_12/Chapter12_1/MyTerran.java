package Chapter_12.Chapter12_1;

// 부모 클래스 - 유닛의 공통 속성과 기능을 정의
class Unit {
    String name;                            // 인스턴스 변수 1 - 유닛 이름
    int hp;                                 // 인스턴스 변수 2 - 유닛 체력

    // 메서드 정의 - 유닛의 이름과 체력을 출력하는 기능
    void printUnit() {
        System.out.println("이름 : " + name);     // 유닛 이름 출력
        System.out.println("HP : " + hp);       // 유닛 체럭 출력
    }
}

// 자식 클래스 1 Marine - 부모인 Unit 클래스를 상속 받아 정의 (extends 사용)
class Marine extends Unit {
    int attack;                                 // 추가 속성 - 공격력

    // 메서드 정의 - 유닛의 이름, 체력, 공격력을 출력하는 기능
    void printMarine() {
        printUnit();                                // 부모 클래스의 printUnit() 메서드를 호출 - 이름, 체력 출력
        System.out.println("공격력 : " + attack);     // 추가 속성인 공격력 출력
    }
}

// 자식 클래스 2 Medic - 부모인 Unit 클래스를 상속 받아 정의 (extends 사용)
class Medic extends Unit {
    int heal;                                   // 추가 속성 - 치유력

    // 메서드 정의 - 유닛의 이름, 체력, 공격력을 출력하는 기능
    void printMedic() {
        printUnit();                            // 부모 클래스의 printUnit() 메서드를 호출 - 이름, 체력 출력
        System.out.println("치유량 : " + heal);   // 추가 속성인 치유력 출력
    }
}

public class MyTerran {
    public static void main(String[] args) {
        // 각각의 유닛 객체 생성 및 속성 설정
        Marine unit1 = new Marine();            // Marine 객체 생성
        unit1.name = "마린";                     // 이름 속성 설정
        unit1.hp = 100;                         // HP 속성 설정
        unit1.attack = 20;                      // 공격력 속성 설정

        Medic unit2 = new Medic();              // Medic 객체 생성
        unit2.name = "메딕";                     // 이름 속성 설정
        unit2.hp = 120;                         // HP 속성 설정
        unit2.heal = 10;                        // 치유력 속성 설정

        // 메서드 호출 및 출력
        unit1.printMarine();                    // printMarine() 메서드를 호출하여 마린 유닛 정보 출력
        System.out.println();                   // 빈 줄 출력 - 줄 바꿈
        unit2.printMedic();                     // printMedic() 메서드를 호출하여 메딕 유닛 정보 출력
    }
}
