package Chapter_20;

// Npc1 클래스 정의 - 게임 내 Npc를 나타내는 클래스
class Npc1 {
    public String toString() {                          // toString() - 객체를 문자열로 표현하는 메서드
        return "This is a Npc1.";                       // Npc1 객체를 지정된 문자열로 반환
    }
}

// HumanCamp1 클래스 정의 - 인간 진영을 나타내는 클래스
class HumanCamp1 {
    private Npc1 unit;                              // Npc1 타입의 멤버 변수 unit -> 인간 진영에 속한 유닛을 저장

    public void set(Npc1 unit) {
        this.unit = unit;                           // 매개변수로 받은 Npc1 객체를 맴버 변수 unit에 할당
    }

    public Npc1 get() {                             // get()메서드로 인간 진영에서 유닛을 가져옴 -> get(): 객체의 멤버 변수 값을 반환하는 메서드
        return unit;                                // 맴버 변수 unit에 저장된 Npc1 객체를 반환
    }
}

// Tank1 클래스 정의 - 탱크 유닛을 나타내는 클래스
class Tank1 {
    public String toString() {                      // toString() - 객체를 문자열로 표현하는 메서드
        return "This is a Tank1.";                  // Tank1 객체를 지정된 문자열로 반환
    }
}
// MachineCamp1 클래스 정의 - 기계 진영을 나타내는 클래스
class MachineCamp1 {
    private Tank1 unit;                             // Tank1 타입의 맴버 변수 unit -> 기계 진영에 속한 탱크 유닛을 저장

    public void set(Tank1 unit) {                   // set() 메서드로 기계 진영에 유닛을 설정 -> set(): 객체의 멤버 변수 값을 설정하는 메서드
        this.unit = unit;                           // 매개변수로 받은 Tank1 객체를 맴버 변수 unit에 할당
    }
    public Tank1 get() {                            // get()메서드로 기계 진영에서 유닛을 가져옴 -> get(): 객체의 멤버 변수 값을 반환하는 메서드
        return unit;                                // 맴버 변수 unit에 저장된 Tank1 객체를 반환
    }
}

public class Ex01_MyGame1 {
    // 프로그램 실행
    public static void main(String[] args) {
        // 게임 종족 생성
        HumanCamp1 human = new HumanCamp1();            // HumanCamp1 객체 생성 - 인간 진영을 나타냄
        MachineCamp1 machine = new MachineCamp1();      // MachineCamp1 객체 생성 - 기계 진영을 나타냄

        // 게임 종족에 유닛을 생성해 담기
        human.set(new Npc1());                          // 인간 진영에 Npc1 유닛을 생성하여 설정
        machine.set(new Tank1());                       // 기계 진영에 Tank1 유닛을 생성하여 설정

        // 게임 종족에서 유닛을 가져오기
        Npc1 hUnit1 = human.get();                      // 인간 진영에 Npc1 유닛을 가져오기
        Tank1 mUnit1 = machine.get();                   // 기계 진영에 Tank1 유닛을 가져오기

        // 가져온 유닛 출력
        System.out.println(hUnit1);                     // hUnit1의 객체의 toString() 메서드 결과 출력
        System.out.println(mUnit1);                     // mUnit1의 객체의 toString() 메서드 결과 출력
    }
}
