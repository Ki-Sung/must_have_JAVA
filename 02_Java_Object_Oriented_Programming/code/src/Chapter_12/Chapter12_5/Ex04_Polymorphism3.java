package Chapter_12.Chapter12_5;

// 상위 클래스 - 추상 클래스 정의
abstract class Animal {                             // 추상 클래스인 Animal 클래서 정의
    abstract void doMove();                         // 추상 메서드 doMove() 선언 - 해당 메서드는 하위 클래스에서 반드시 구현해야 함
}

// 하위 클래스 정의 1
class Tiger extends Animal {                        // Animal 클래스를 상속받은 Tiger 클래스 정의
    void doMove() {                                 // doMove() 메서드 오버라이드 - "호랑이는 산을 달립니다" 라는 메시지 출력
        System.out.println("호랑이는 산을 달립니다.");
    }
}

class Lion extends Animal {                         // Animal 클래스를 상속받은 Lion 클래스 정의
    void doMove() {                                 // doMove() 메서드 오버라이드 - "사자는 평원을 달립니다" 라는 메시지 출력
        System.out.println("사자는 평원을 달립니다.");
    }
}

// 메인 클래스 및 메서드 - 코드 동작
public class Ex04_Polymorphism3 {
    public static void animalChoose(Animal obj) {       // animalChoose 라는 정적 메서드를 포함 - 이 메서드는 Animal 타입의 객체를 매개변수로 받음
        // instanceof 연산자를 통해 전달된 객체 확인
        if (obj instanceof Tiger) {         // 만약 객체가 Tiger 타입 경우
            Tiger tiger = (Tiger)obj;       // Tiger로 타입 캐스팅
            tiger.doMove();                 // doMove() 메서드 호출
        } else {                            // 그외인 경우
            Lion lion =(Lion)obj;           // Lion으로 타입 캐스팅
            lion.doMove();                  // doMove() 메서드 호출
        }
    }

    // 자바 프로그램의 시작점 - main 메서드
    public static void main(String[] args) {
        // animalChoose 메서드는 전달된 객체의 타입에 따라 적절한 doMove() 메서드 호출
        Tiger tiger = new Tiger();          // Tiger 객체 생성
        animalChoose(tiger);                // Tiger 객체를 animalChoose 메서드에 전달하여 메시지 출력

        Lion lion = new Lion();             // Lion 객체 생성
        animalChoose(lion);                 // Lion 객체를 animalChoose 메서드에 전달하여 메시지 출력
    }
}
