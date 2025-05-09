package Chapter_20;

// Npc4 클래스 - Npc 유닛을 나타내는 클래스
class Npc4 {
    public String toString() {
        return "This is Npc4.";                 // Npc4 객체임을 나타내는 문자열 반환
    }
}

// Tank4 클래스 - Tank 유닛을 나타내는 클래스
class Tank4 {
    public String toString() {
        return "This is Tank4.";                // Tank4 객체임을 나타내는 문자열 반환
    }
}

// Camp4 클래스 - 게임 종족(Camp)을 나타내는 클래스
class Camp4 {
    private Object unit;                        // 어떤 종류의 객체를 담을 수 있는 Obejct 타입의 unit 필드

    // unit 필드에 객체를 설정하는 메소드
    public void set(Object unit) {
        this.unit = unit;                       // 파라미터로 받은 객체를 unit 필드에 저장
    }

    // unit 필드에 저장된 객체를 가져오는 메소드 (Object 타입으로 변환)
    public Object get() {
        return unit;                           // 저장된 객체를 Object 타입 그대로 반환
    }
}

public class Ex04_MyGame4 {
    public static void main(String[] args) {
        // 게임 종족 생성
        Camp4 human = new Camp4();               // human 객체 선언
        Camp4 machine = new Camp4();             // machine 객체 선언

        // 게임 종족에 유닛을 생성해 담기
        // 우리가 만든 유닛을 넣어야 하는데...
        human.set("난 공룡");                      // human Camp에 문자열 "난 공룡"을 설정 (Object 타입으로 저장됨)
        machine.set("난 우주인");                  // machine Camp에 문자열 "난 우주인"을 설정 (Object 타입으로 저장됨)

        // 결과 출력
        System.out.println(human.get());        // human Camp에서 가져온 객체(문자열 "난 공룡")를 출력
        System.out.println(machine.get());      // machine Camp에서 가져온 객체(문자열 "난 우주인")를 출력
    }
}
