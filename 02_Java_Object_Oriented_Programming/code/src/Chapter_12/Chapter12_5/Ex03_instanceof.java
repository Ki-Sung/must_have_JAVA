package Chapter_12.Chapter12_5;

// 인터페이스 정의
interface Cry {                            // Cry 인스턴스 정의
    void cry();                            // cry() 메서드 선언 - 해당 메서드는 구현 클래스에서 반드시 정의해야 함
}

// 클래스 정의 1
class Cat implements Cry {                  // Cry 인터페이스를 구현할 Cat 클래스 정의
    public void cry() {                     // cry() 메서드를 오버라이드 해서 "야옹~"이라는 문자열 출력
        System.out.println("야옹~");
    }
}

// 클래스 정의 2
class Dog implements Cry {                  // Cry 인터페이스를 구현할 Dog 클래스 정의
    public void cry() {                     // cry() 메서드를 오버라이드 해서 "멍멍!"이라는 문자열 출력
        System.out.println("멍멍!");
    }
}

// 메인 클래스 및 메서드 - 코드 동작
public class Ex03_instanceof {
    public static void main(String[] args) {        // 자바 프로그램의 시작점
        Cry test1 = new Cat();                      // Cry 타입의 변수 test1을 선언하고, Cat 객체 생성 후 할당
        // Cry test1 = new Dog();                   // Cry 타입의 변수 test1을 선언하고, Dog 객체 생성 후 할당 (선택)

        if (test1 instanceof Cat) {                 // instanceof 연산자를 통해 객체가 특정 클래스의 인스턴스인지 확인 - 만약 test1이 Cat 타입일 경우
            test1.cry();                            // cry() 메서드를 호출해 "야옹~"을 출력
        } else if (test1 instanceof Dog) {          // 만약 만약 test1이 Dog 타입일 경우
            System.out.println("고양이가 아닙니다.");    // cry() 메서드를 호출해 "고양이가 아닙니다."를 출력
        }
    }
}
