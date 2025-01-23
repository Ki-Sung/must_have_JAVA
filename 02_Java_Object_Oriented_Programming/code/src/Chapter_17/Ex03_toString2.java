package Chapter_17;

// 클래스 정의 - Book3
class Book3 {
    String author;                  // author라는 문자열 타입의 맴버 변수를 가지고 있음
}

// 자바 프로그램 실행
public class Ex03_toString2 {
    public static void main(String[] args) {
        Book3 myBook = new Book3();                 // 객체 생성 - Book3 클래스의 새로운 객체 myBook을 생성 - 이 객체는 author 맴버 변수를 포함하고 있음
        myBook.author = "홍길동";                     // 맴버 변수 초기화 - myBook 객체의 author 맴버 변수에 값 할당
        System.out.println(myBook.author);          // 맴버 변수의 값 출력 - myBook 객체의 author 변수 출력
        System.out.println(myBook);                 // 객체 자체 출력 - myBook 객체 출력 -  이 경우, Book3 클래스의 toString() 메서드가 호출 됨
                                                    // 하지만 Book3 클래스에 toString() 메서드가 오버라이드되지 않았기 때문에, 기본 Object 클래스의 toString() 메서드가 호출됨 -> 객체의 해시코 드를 포함한 문자열 반환
    }
}
