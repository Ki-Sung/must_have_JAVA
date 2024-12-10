package Chapter_12.Chapter12_4;

// 건물의 기본 설계도 - 해당 클래스는 추상 클래스이다.
// * 추상 클래스는 인스턴스를 생성할 수 없으며, 다른 클래스에 의해 상속되어야 한다.
abstract class Building {           // 추상 클래스 Building 정의
    int health;                     // 건물의 체력을 나타내는 속성
    abstract void doBuild();        // 건물 짓기 메서드 - 해당 메서드는 구체적인 구현이 없으며, 상속받는 클래스에서 반드시 구현해야 한다
}

// 건물이 날 수 있는 기능 구현 - 건물의 일반적인 기능은 아님
// * 해당 기능은 인터페이스 이다. 인터페이스는 클래스가 구현해야할 메소드의 집합을 정의한다. 인터페이스를 통해 서로 다른 클래스가 공토된 기능을 가지게 한다.
interface Fly {                     // 인터페이스 Fly 정의
    void flyBuilding();             // 건물을 날 수 있는 기능 가진 메서드 - Fly 인터페이스를 구현하는 클래스에서 정의해야 한다
}

// 인간형 유닛을 생산하는 건물 - 여차하면 날아서 이동 가능
class Barracks extends Building implements Fly {                  // Barracks 클래스 정의, Building 클래스를 상속 받고, Fly 인터페이스를 구현 한다.
    void doBuild() {
        System.out.println("인간형 유닛 생산 건물을 짓습니다.");           // Building 클래스의 추상 메소드를 구현하여 건물을 짓는 방식에 대한 메시지 출력
    }

    void doMakeMarine() {
        System.out.println("총으로 공격하는 마린 유닛을 생산합니다.");       // Barracks가 마린 유닛을 생산하는 기능을 제공 - 여기서는 메시지만 출력
    }

    // 모든 건물이 날면 안되므로 인터페이스로 나는 기능 제공
    public void flyBuilding() {
        System.out.println("건물이 날아서 이동하게 합니다.");             // Fly 인터페이스의 메소드를 구현하여 Barracks가 날 수 있는 기능을 정의 - 여기서는 메시지만 출력
    }
}

// 기갑형 유닛을 생산하는 건물 - 여차하면 날아서 이동 가능
class Factory extends Building implements Fly {                  // Factory 클래스 정의, Building 클래스를 상속 받고, Fly 인터페이스를 구현 한다.
    void doBuild() {
        System.out.println("기갑형 유닛 생산 건물을 짓습니다.");          // Factory의 건물 짓기 방식을 구현 - 여기서는 메시지만 출력
    }

    void doMakeTank() {
        System.out.println("탱크 유닛을 생산합니다.");                  // Factory가 탱크 유닛을 생산하는 기능 제공 - 여기서는 메시지만 출력
    }

    // 모든 건물이 날면 안되므로 인터페이스로 나는 기능 제공
    public void flyBuilding() {
        System.out.println("건물이 날아서 이동하게 합니다.");            // Fly 인터페이스의 메소드를 구현하여 Factory가 날 수 있는 기능을 정의 - 여기서는 메시지만 출력
    }
}

// 인간형 유닛을 숨겨서 보호하는 건물 - 날면 안 됨
class Bunker extends Building {                                 // Bunker 클래스 정의, Building 클래스는 상속하지만 Fly 인터페이스는 구현하지 않는다.
    void doBuild() {
        System.out.println("인간형 유닛이 숨을 건물을 짓습니다.");       // Bunker의 건물 짓기 방식을 구현 - 여기서는 메시지만 출력
    }

    void doDefence() {
        System.out.println("숨은 유닛을 적의 공격으로부터 보호합니다.");   // Bunker가 유닛을 방어하는 기능을 제공 - 여기서는 메시지만 출력
    }
}

// 실행 클래스
public class Ex02_Starcraft {
    public static void main(String[] args) {                    // 프로그램 시작점인 main 메소드를 포함
        Barracks barracks = new Barracks();                     // Barracks 클래스 선언
        barracks.doBuild();                                     // Barracks 클래스의 doBuild 메소드 호출
        barracks.doMakeMarine();                                // Barracks 클래스의 doMakeMarine 메소드 호출
        barracks.flyBuilding();                                 // Barracks 클래스의 flyBuilding 메소드 호출

        Factory factory = new Factory();                        // Factory 클래스 선언
        factory.doBuild();                                      // Factory 클래스의 doBuild 메소드 호출
        factory.doMakeTank();                                   // Factory 클래스의 doMakeMarine 메소드 호출
        factory.flyBuilding();                                  // Factory 클래스의 flyBuilding 메소드 호출

        Bunker bunker = new Bunker();                           // Bunker 클래스 선언
        bunker.doBuild();                                       // Bunker 클래스의 doBuild 메소드 호출
        bunker.doDefence();                                     // Bunker 클래스의 doDefence 메소드 호출
    }
}
