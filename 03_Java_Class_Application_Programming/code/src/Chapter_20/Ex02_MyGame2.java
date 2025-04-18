package Chapter_20;

// Npc2 클래스 정의 - 게임 내 Npc를 나타내는 클래스
class Npc2 {
    public String toString() {                              // toString() 메서드 - 객체의 정보를 문자열 형태로 반환하는 메서드. 모든 클래스는 해당 메서드를 상속받음
        return "This is a Npc2.";                           // Npc2 객체를 지정된 문자열로 반환 -> System.out.println() 메서드에 객체를 전달하면 자동으로 이 메서드가 호출되어 객체의 정보를 출력
    }
}

// Tank2 클래스 정의 - 개임 내 Tank를 나타내는 클래스
class Tank2 {
    public String toString() {                              // toString() 메서드 - 객체의 정보를 문자열 형태로 반환하는 메서드. 모든 클래스는 해당메서드를 상속받음
        return "This is a Tank2.";                          // Tank2 객체를 지정된 문자열로 반환 -> System.out.println() 메서드에 객체를 전달하면 자동으로 이 메서드가 호출되어 객체의 정보를 출력
    }
}

// Camp2 클래스 정의 - 진영을 나타내는 클래스, 모든 종류의 유닛을 담을 수 있음
class Camp2 {
    // private 접근 제어자 - unit 변수는 Camp2 클래스 내에서만 접근 가능. 캡슐화(Encapsulation)를 통해 데이터의 무결성을 보호.
    // Object 타입의 멤버 변수 unit - 모든 종류의 객체를 참조할 수 있는 변수. Java의 모든 클래스는 Object 클래스를 상속받으므로, Object 타입 변수에 어떤 객체든 담을 수 있음.
    private Object unit;

    // set() 메서드 - 진영에 유닛을 설정
    public void set(Object unit) {                          // Object 타입의 unit 파라미터 - 어떤 종류의 객체든 받을 수 있음
        this.unit = unit;                                   // 파라미터로 받은 unit 객체를 현재 객체의 멤버 변수 unit에 할당
    }

    // get() 메서드 - 진영에서 유닛을 가져옴
    public Object get() {
        return unit;                                        // 멤버 변수 unit에 저장된 Object 객체를 반환. 반환 타입이 Object이므로, 호출하는 쪽에서는 반환된 객체를 실제 타입으로 형변환해야 함
    }
}

public class Ex02_MyGame2 {
    // 프로그램 실행
    public static void main(String[] args) {
        // 게임 종족 생성
        Camp2 human = new Camp2();                          // Camp2 객체 생성 - human 변수는 Camp2 클래스의 인스턴스를 참조. new 키워드는 새로운 객체를 힙(Heap) 메모리 영역에 생성
        Camp2 machine = new Camp2();                        // Camp2 객체 생성 - machine 변수는 Camp2 클래스의 인스턴스를 참조. new 키워드는 새로운 객체를 힙(Heap) 메모리 영역에 생성

        // 게임 종족에 유닛을 생성해 담기
        // 자식 객체를 부모 타입의 변수에 대입
        human.set(new Npc2());                              // human 객체의 set() 메서드를 호출하여 Npc2 객체를 human 진영에 설정. Npc2 객체는 Object 타입으로 자동 형변환되어 저장됨(Upcasting).
        machine.set(new Tank2());                           // machine 객체의 set() 메서드를 호출하여 Tank2 객체를 machine 진영에 설정. Tank2 객체는 Object 타입으로 자동 형변환되어 저장됨(Upcasting).

        // 게임 종족에서 유닛을 가져오기
        // 꺼낼 때 형변환이 필요함 -> 형변환: 부모 클래스 타입의 객체를 자식 클래스 타입으로 변환하는 것을 의미. 형변환을 통해 객체의 실제 타입에 맞는 메서드를 호출할 수 있음.
        Npc2 hUnit = (Npc2)human.get();                     // human 객체의 get() 메서드를 호출하여 Object 타입의 객체를 반환받고, 이를 Npc2 타입으로 강제 형변환 함(Downcasting).
        Tank2 mUnit = (Tank2)machine.get();                 // machine 객체의 get() 메서드를 호출하여 Object 타입의 객체를 반환받고, 이를 Tank2 타입으로 강제 형변환 함(Downcasting).

        // 가져온 유닛 출력
        System.out.println(hUnit);                          // hUnit 객체의 toString() 메서드 결과를 출력
        System.out.println(mUnit);                          // mUnit 객체의 toString() 메서드 결과를 출력
    }
}
