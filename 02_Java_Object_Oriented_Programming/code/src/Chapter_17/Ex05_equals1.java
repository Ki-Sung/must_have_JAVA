package Chapter_17;

// 클래스 정의 - Book5
class Book5 {
    String author;                              // author라는 문자열의 타입의 맴버 변수 포함
}

// 자바 프로그래밍 시작
public class Ex05_equals1 {
    public static void main(String[] args) {
        // 객체 생성 및 초기화
        Book5 myBook1 = new Book5();            // 객체1 생성 - Book5 클래스의 새로운 객체 myBook1을 생성 - 이 객체는 author 맴버 변수를 포함하고 있음
        myBook1.author = "홍길동";                // 맴버 변수 초기화 - myBook1 객체의 author 맴버 변수에 값 할당

        Book5 myBook2 = new Book5();            // 객체2 생성 - Book5 클래스의 새로운 객체 myBook2를 생성 - 이 객체는 author 맴버 변수를 포함하고 있음
        myBook2.author = "홍길동";                // 맴버 변수 초기화 - myBook2 객체의 author 맴버 변수에 값 할당

        // 동등성 비교 - 기본적으로 Object 클래스의 equals() 메서드는 두 객체의 참조(메모리 주소)를 비교함
        if (myBook1.equals(myBook2))                        // myBook1과 myBook2를 비교
            System.out.println("두 개의 참조 id는 같습니다.");    // 만약 같다면 첫 번째 결과 출력
        else
            System.out.println("두 개의 참조 id는 다릅니다.");    // 다르다면 두 번째 결과 출력
    }
}