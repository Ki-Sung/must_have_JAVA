package Chapter_09.Chapter09_4;

import java.rmi.StubNotFoundException;

// 클래스 정의 - Student1
// name과 age라는 두 개의 맴버 변수를 가지고 있음
// 접근 제한자가 없기 때문에 기본적으로 default 상태 -> 같은 패키지 내에 접근 가능
class Student1 {
    String name;                            // 이름을 저장하는 변수
    int age;                                // 나이를 저장하는 변수
}

// 클래스 정의 - Student2
// name을 public으로 선언하여 외부 접근 가능, age는 private로 선언하여 외부에 직접 접근 불가능
// 생성자는 두 개의 매개변수를 받아 name과 age를 초기화 함
class Student2 {
    public String name;                     // public 이름 변수
    private int age;                        // private 나이 변수 -> 외부에서 직접 접근 불가

    public Student2(String name, int age) {
        this.name = name;                   // 생성자에서 매개변수로 받은 name을 초기화
        this.age = age;                     // 생성자에서 매개변수로 받은 age를 초기화
    }

    // getter - 클래스의 private 맴버 변수의 값을 반환하는 메서드 (일반적으로 get이라는 접두사를 붙여 변수명 지정)
    public int getAge() {                   // 외부에서 객체 상태(속성)를 읽을 수 있도록 허용
        return age;                         // 나이를 반환
    }

    // setter - 클래스의 private 맴버 변수의 값을 설정하는 메서드 (일반적으로 set이라는 접두사를 붙여 변수명 지정)
    public void setAge(int age) {           // 외부에서 객체의 상태(속성)을 수정할 수 있도록 허용
        if (age < 0 || age > 150) {         // 유효성 검사 - 0보다 작거나 150보다 클 경우
            System.out.println("나이가 부적절 합니다.");     // 나이가 부적절 하다는 경고 메시지 출력
            this.age = 0;                              // 나이를 0으로 설정(잘못된 나이니 0으로 초기화)
            return;
        }
        this.age = age;                     // 유효한 나이일 경우, 설정한 나이로 설정
    }
}

public class PrivateUse {
    public static void main(String[] args) {
        Student1 student1 = new Student1();      // Student1 객체 생성
        student1.name = "홍길동";                  // 맴버 변수(이름)에 직접 접근
        student1.age = -20;                      // 맴버 변수(나이)에 직접 접근
        System.out.printf("%s의 나이는 %d살 입니다.\n", student1.name, student1.age);

        Student2 student2 = new Student2("전우치", 20);    // Student2 객체 생성
        student2.name = "손오공";                  // 맴버 변수에 직접 접근
        // student2.age = -10;                   // 에러 발생 - private 변수에 접근 시도
        student2.setAge(-10);                    // 세터를 사용한 접근
        int age = student2.getAge();             // 나이를 가져옴
        System.out.printf("%s의 나이는 %d살 입니다.\n", student2.name, age);    // 결과 출력
    }
}
