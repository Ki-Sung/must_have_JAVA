package Chapter_17;

// 클래스 정의 - Book4
class Book4 {
    String author;                              // author라는 문자열의 타입의 맴버 변수 포함
    public String toString() {                  // toString() 메서드를 오버라이드
        return author;                          // 객체를 문자열로 표현할 때 author 맴버 변수를 반홚
    }
}

// 자바 프로그램 실행
public class Ex04_toString3 {
    public static void main(String[] args) {
        Book4 myBook = new Book4();             // 객체 생성 - Book4 클래스의 새로운 객체 myBook을 생성 - 이 객체는 author 맴버 변수를 포함하고 있음
        myBook.author = "홍길동";                 // 맴버 변수 초기화 - myBook 객체의 author 맴버 변수에 값 할당
        System.out.println(myBook.author);      // 맴버 변수의 값 출력 - myBook 객체의 author 변수 출력
        System.out.println(myBook);             // 객체 자체 출력 - 이 경우, toString() 메서드가 호출되어 author 맴버 변수의 값 출력
    }
}
