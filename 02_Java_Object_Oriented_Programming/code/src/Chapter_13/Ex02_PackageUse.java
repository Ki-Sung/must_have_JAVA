package Chapter_13;

// Banana 클래스를 Chapter_13.com.study 패키지에서 가져오기
import Chapter_13.com.study.Banana;

public class Ex02_PackageUse {
    public static void main(String[] args) {    // Java 프로그램의 시작점
        Apple apple = new Apple();              // Apple 클래스 객체 생성 - apple이라는 변수에 할당
        apple.showName();                       // apple 객체의 showName() 메서드 호출

        // Banana banana = new Banana();
        Chapter_13.com.study.Banana banana = new Chapter_13.com.study.Banana(); // Banana 클래스의 객체를 생성 - Banana 클래스가 Chapter_13.com.study 패키지에 정의되어 있으므로, 패키지 이름을 포함하여 객체를 생성
        banana.showName();                      // banana 객체의 showName() 메서드 호출
    }
}