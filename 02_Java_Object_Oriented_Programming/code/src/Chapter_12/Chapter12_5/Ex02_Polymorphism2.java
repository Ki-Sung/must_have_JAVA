package Chapter_12.Chapter12_5;

// 상위 클래스 - 추상 클래스
abstract class Human {                      // Human 추상 클래스 정의
    abstract void print();                  // 추상 메서드 -> 여기서 구현 하지 않고, 반드시 하위 클래스(자식 클래스)에서 구현 해야함
}

// 하위 클래스 1
class Man extends Human {                   // 상위 클래스인 Human을 상속받은 Man 클래스를 정의
    void print() {                          // print() 메서드 구현 - '남자 생성' 메시지 출력
        System.out.println("남자 생성");
    }
}

// 하위 클래스 2
class Woman extends Human {                 // 상위 클래스인 Human을 상속받은 Woman 클래스를 정의
    void print() {
        System.out.println("여자 생성");      // print() 메서드 구현 - '여자 생성' 메시지 출력
    }
}

// 메인 클래스 및 메서드 - 코드 동작
public class Ex02_Polymorphism2 {
    public static Human humanCreate(int kind) {     // humanCreate() 메서드 -> 해당 메서드는 정수형 매개변수 kind를 받고, 그 값에 따라 Man 또는 Woman 객체를 생성하여 반환함
        if (kind == 1) {                    // 만약 kind가 1일 경우
            // Human m = new Man();
            // return m;
            return new Man();               // Man 객체를 자동 반환
        } else {                            // 만약 kind가 1외의 숫자일 경우
            // Human w = new Woman();
            // return w;
            return new Woman();             // Woman 객체를 반환
        }
    }

    public static void main(String[] args) {        // 자바 프로그램의 시작점

        // 생성된 객체가 남자인지 여자인지 중요하지 않음
        // 여기서 생성된 객체의 프린트 기능만 쓸 것이라고 명시
        // 만약 남자이면 남자애가 가진 기능을 할 것이고,
        // 만약 여자이면 여자애가 가진 기능을 할 것이다.

        Human h1 = humanCreate(1);              // humanCreate 메서드를 호출하여 Man 객체를 생성하고, h1 변수에 저장
        h1.print();                                  // h1의 print() 메서드를 호출하여 "남자 생성" 메시지를 출력

        Human h2 = humanCreate(2);              // humanCreate 메서드를 호출하여 Woman 객체를 생성하고, h2 변수에 저장
        h2.print();                                  // h2의 print() 메서드를 호출하여 "여자 생성" 메시지를 출력
    }
}
