package Chapter_11;

// 덧셈을 위한 계산기 클래스
public class MyCalculator {                     // 클래스 정의
    // 두 개의 정수 n1, n2를 매개변수로 받아 두 수의 합을 반환 하는 adder 이라는 메서드 정의 -> static을 사용하면 클래스의 인스턴스를 생성하지 않고 호출 가능
    public static int adder(int n1, int n2) {
        return n1 + n2;
    }
}
