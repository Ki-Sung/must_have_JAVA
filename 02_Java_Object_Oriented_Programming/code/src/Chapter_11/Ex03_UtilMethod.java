package Chapter_11;

public class Ex03_UtilMethod {
    public static void main(String[] args) {            // 프로그램 시작 지점
        MyCalculator calc1 = new MyCalculator();        // 객체 생성 - MyCalculator 클래스의 인스턴스인 calc1을 생성
        int num1 = calc1.adder(1, 2);                   // adder 메서드를 사용하여 1, 2를 더함
        System.out.println(num1);                       // num1 값 출력

        int num2 = MyCalculator.adder(2, 3);            // 새로 객체를 생성하지 않고 adder 메서드를 사용하여 2, 3 -> static 메서드이므로
        System.out.println(num2);                       // num2 값 출력
    }
}
