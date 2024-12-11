package Chapter_12.Chapter12_5;

// 추상 클래스 - 상위(부모) 클래스
abstract class Calc {                   // Calc 추상 클래스 정의
    int a = 5;                          // 초기화된 int형 변수 1
    int b = 6;                          // 초기화된 int형 변수 2
    abstract void plus();               // 추상 메서드 -> 여기서 구현 하지 않고, 반드시 하위 클래스(자식 클래스)에서 구현 해야함
}

// 하위(자식) 클래스
class MyCalc extends Calc {             // Calc 추상 클래스를 상속받은 MyCalc 클래스 정의
    void plus() {                       // plus 메서드 구현 - a와 b의 합을 출력
        System.out.println(a + b);
    }
    void minus() {                      // minus 메서드 구현 - a와 b의 차를 출력
        System.out.println(a - b);
    }
}

// 메인 클래스 - 코드 실행
public class Ex01_Polymorphism1 {
    public static void main(String[] args) {        // main 메서드 정의 -> 자바 프로그램의 시작
        // 상위 클래스인 Calc를 상속 받은 MyCalc 클래스 객체 선언 및 메서드 호출
        MyCalc myCalc1 = new MyCalc();              // MyCalc 클래스의 객체 선언
        myCalc1.plus();                             // MyCalc 클래스의 plus 메서드 호출
        myCalc1.minus();                            // MyCalc 클래스의 minus 메서드 호출

        // 다형성 - 하위 클래스인 MyCalc를 상위 클래스인 Calc 객체에 대입
        Calc myCalc2 = new MyCalc();                // 상위 클래스 타입의 변수에 하위 클래스 객체 대입 후 객체 선언
        myCalc2.plus();                             // Calc 클래스의 plus 메서드 호출
        // 아래의 메서드는 상위 클래스인 Calc에 정의되어 있지 않으므로 사용할 수 없다.
        //  myCalc2.minus();                        // 주석을 풀면 오류 발생
    }
}
