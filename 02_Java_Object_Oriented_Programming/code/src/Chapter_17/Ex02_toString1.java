package Chapter_17;

public class Ex02_toString1 {
    public static void main(String[] args) {
        String name = "홍길동";                        // 변수 선언 및 초기화 - 문자열 변수 선언
        System.out.println(name);                    // 출력 - name 변수 출력

        System.out.println(name.toString());        // name 변수의 toString() 메서드를 호출하여 값을 출력 -> toString() 메서드는 객체의 문자열 표현을 반환하는 메서드로, String 클래스에서 오버라이드되어 있음
    }
}
