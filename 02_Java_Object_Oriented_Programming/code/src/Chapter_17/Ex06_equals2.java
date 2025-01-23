package Chapter_17;

// 클래스 정의 - Book6
class Book6 {
    String author;                                      // author라는 문자열 타입의 멤버 변수를 포함
    public boolean equals(Object obj) {                 // equals() 메서드 오버라이드 - Object obj는 비교할 객체를 매개변수로 받음
        if (this.author.equals(((Book6)obj).author))    // this 객체의 author와 매개변수로 받은 객체의 author를 비교 함 - 이때, 매개변수 obj를 Book6 타입으로 캐스팅하여 사용
            return true;                                // 만약 같으면 true를 반환
        else                                            // 다르다면
            return false;                               // false를 반환
    }
}

// 자바 프로그램 시작
public class Ex06_equals2 {
    public static void main(String[] args) {
        // 객체 생성 및 초기화
        Book6 myBook1 = new Book6();                    // 객체1 생성 - Book5 클래스의 새로운 객체 myBook1을 생성 - 이 객체는 author 맴버 변수를 포함하고 있음
        myBook1.author = "홍길동";                        // 맴버 변수 초기화 - myBook1 객체의 author 맴버 변수에 값 할당

        Book6 myBook2 = new Book6();                    // 객체2 생성 - Book5 클래스의 새로운 객체 myBook2를 생성 - 이 객체는 author 맴버 변수를 포함하고 있음
        myBook2.author = "홍길동";                        // 맴버 변수 초기화 - myBook2 객체의 author 맴버 변수에 값 할당

        // 동등성 비교 - myBook1과 myBook2 객체를 equals() 메서드를 사용하여 비교
        if (myBook1.equals(myBook2))                    // 만약 두 객체의 author 값이 같다면
            System.out.println("두 객체의 author 변수의 값은 같습니다.");    // 첫 번째 메시지 출력
        else                                                          // 만약 같지 않다면
            System.out.println("두 객체의 author 변수의 값은 다릅니다.");    // 두 번째 메시지 출력
    }
}
