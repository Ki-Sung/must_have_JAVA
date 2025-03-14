package Chapter_18;

// 인터페이스 정의 - Unit5
interface Unit5 {
    @Deprecated                                 // 해당 메서드는 더 더이상 사용하지 않음을 나타내는 어노테이션
    public void move(String str);               // 문자열을 매개변수로 받는 move 메서드 정의
    public void run(String str);                // 문자열을 매개변수로 받는 run 메서드 정의
}

class Human5 implements Unit5 {                 // Human5 클래스가 Unit5 인터페이스를 구현
    @Override
    public void move(String str) {              // move 메서드 구현
        System.out.println(str);                // 전달된 문자열을 출력
    }
    @Override
    public void run(String str) {               // run 메서드 구현
        System.out.println(str);                // 전달된 문자열을 출력
    }
}

public class Ex05_Deprecated {
    // 프로그램 실행
    public static void main(String[] args) {
        Unit5 unit = new Human5();                  // 프로그램의 시작점인 main 메서드 정의
        unit.move("인간형 유닛이 이동합니다.");       // move 메서드 호출
        unit.run("인간형 유닛이 달립니다.");         // run 메서드 호출
    }
}
