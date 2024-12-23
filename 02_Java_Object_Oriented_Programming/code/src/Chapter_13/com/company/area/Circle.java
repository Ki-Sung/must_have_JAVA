package Chapter_13.com.company.area;

// Circle 클래스 정의 - 넓이 계산
public class Circle {
    // 변수 정의
    double rad;                 // 원의 반지름을 저장하는 변수 - 데이터 타입: 실수
    final double PI;            // 원주율을 저장하는 변수 - final 키워드로 선언되어 초기화 후 변경할 수 없음(데이터 타입: 실수)

    // 생성자 Circle 정의
    public Circle(double r) {
        rad = r;                // 생성자에서 매개변수 r을 rad에 할당
        PI = 3.14;              // PI를 3.14로 초기화
    }

    // getArea() 메서드 정의 - 원의 넓이 반환
    public double getArea() {
        return (rad * rad) * PI;    // 원의 넓이를 계산하여 반환 - 넓이는 PI X r제곱
    }
}