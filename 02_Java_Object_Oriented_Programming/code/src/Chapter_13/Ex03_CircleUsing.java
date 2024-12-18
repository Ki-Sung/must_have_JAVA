package Chapter_13;

public class Ex03_CircleUsing {
    public static void main(String[] args) {
        Chapter_13.com.company.area.Circle c1 = new Chapter_13.com.company.area.Circle(3.5);   // area 패키지의 Circle 클래스를 사용하여 반지름이 3.5인 원의 객체 c1을 생성
        System.out.println("반지름 3.5 원 넓이: " + c1.getArea());            // getArea() 메서드를 호출하여 원의 넓이를 계산하고 출력

        Chapter_13.com.company.circumference.Circle c2 = new Chapter_13.com.company.circumference.Circle(3.5); // circumference 패키지의 Circle 클래스를 사용하여 또 다른 반지름이 3.5인 원의 객체 c2를 생성
        System.out.println("반지름 3.5 원 넓이: " + c2.getCircumference());   // getCircumference() 메서드를 호출하여 원의 둘레를 계산하고 출력
    }
}
