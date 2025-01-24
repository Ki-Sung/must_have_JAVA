package Chapter_17;

public class Ex07_Number {
    // 자바 프로그램 실행
    public static void main(String[] args) {
        // Integer num1 = new Integer(20);          // 자바 4까지의 문법 - Integer 객체를 생성하는 방법
        Integer num1 = Integer.valueOf(20);      // Integer 객체 생성 - valueOf() 메서드를 사용하여 생성
        System.out.println(num1.intValue());        // 정수값 출력
        System.out.println(num1.doubleValue());     // 실수값 출력

        Double num2 = Double.valueOf(3.14);     // Double 객체 생성 - Double 객체를 생성하는 방법
        System.out.println(num2.intValue());       // 정수값 출력
        System.out.println(num2.doubleValue());    // 실수값 출력
    }
}
