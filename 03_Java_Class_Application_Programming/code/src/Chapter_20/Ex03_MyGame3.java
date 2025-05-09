package Chapter_20;

// Npc3 클래스 - Npc 유닛을 나타내는 클래스
class Npc3 {
    public String toString() {
        return "This is a Npc3";                        // Npc3 객체임을 나타내는 문자열 반환
    }
}

// Tank3 클래스 - Tank 유닛을 나타내는 클래스
class Tank3 {
    public String toString() {
        return "This is a Tank3";                       // Tank3 객체임을 나타내는 문자열 반환
    }
}

// Camp3 클래스 - 게임 종족(Camp)을 나타내는 클래스
class Camp3 {
    private Object unit;                                // 어떤 종류의 객체를 담을 수 있는 Obejct 타입의 unit 필드

    // unit 필드에 객체를 설정하는 메소드
    public void set(Object unit) {
        this.unit = unit;                               // 파라미터로 받은 객체를 unit 필드에 저장
    }

    // unit 필드에 저장된 객체를 가져오는 메소드 (Object 타입으로 변환)
    public Object get() {
        return unit;                                    // 저장된 객체를 Object 타입 그대로 반환
    }
}

public class Ex03_MyGame3 {
    public static void main(String[] args) {
        // 게임 종족 생성
        Camp3 human = new Camp3();                      // human 객체 선언
        Camp3 machine = new Camp3();                    // machine 객체 선언

        // 게임 종족에 유닛을 생성해 담기
        // 우리가 만든 유닛을 넣어야 하는데...
        human.set("난 공룡");                             // human Camp에 문자열 "난 공룡"을 설정 (Object 타입으로 저장됨)
        machine.set("난 우주인");                          //  machine Camp에 문자열 "난 우주인"을 설정 (Object 타입으로 저장됨)

        // 게임 종족에서 유닛을 가져오기
        // 꺼낼 때 당연히 게임 유닛을 기대하는데...
        Npc3 hUnit = (Npc3)human.get();                 // human Camp에서 가져온 객체를 Npc3 타입으로 강제 형변환 시도 -> 실제 저장된 객체는 문자열("난 공룡")이므로 Npc3으로 변환 불가능
        Tank3 mUnit = (Tank3)machine.get();             // machine Camp에서 가져온 객체를 Tank3 타입으로 강제 형변환 시도 -> 제 저장된 객체는 문자열("난 우주인")이므로 Tank3으로 변환 불가능

        // 결과 출력 -> 에러로 인해 해당 코드들은 출력되지 않음
        System.out.println(hUnit);
        System.out.println(mUnit);
    }
}
