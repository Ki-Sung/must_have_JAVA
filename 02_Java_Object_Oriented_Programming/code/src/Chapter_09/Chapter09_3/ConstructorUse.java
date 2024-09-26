package Chapter_09.Chapter09_3;

// 클래스 정의
class Book {
    String title;                   // 책 제목을 저장하는 변수
    int price;                      // 책 가격을 저장하는 변수
    int num = 0;                    // 주문 수량을 지정하는 변수, 기본값 0

    // 디폴트 생성자에 기능 부여
    Book() {
        title = "자바 프로그래밍";      // 기본 제목 설정
        price = 30000;              // 기본 가격 설정
    }

    // 생성자의 오버로딩
    Book(String t, int p) {
        title = t;                  // 매개변수로 값을 받아 맴버 변수의 값을 초기화 - 매개변수 t로 title 초기화
        price = p;                  // 매개변수로 값을 받아 맴버 변수의 값을 초기화 - 매개변수 t로 title 초기화
    }

    // 메서드 정의 - 책의 제목, 가격, 주문 수량, 그리고 합계 금액을 출력
    void print() {                                  // 책 정보를 출력하는 메서드
        System.out.println("제   목 : " + title);
        System.out.println("가   격 : " + price);
        System.out.println("주문수량 : " + num);
        System.out.println("합계금액 : " + price * num);    // 가격과 수량을 곱함
    }
}

public class ConstructorUse {
    public static void main(String[] args) {
        Book book1 = new Book();                            // 디폴트 생성자 사용
        book1.print();                                      // print() 메서드로 책 정보 출력

        Book book2 = new Book("자바 디자인패턴", 35000);   // 오버로딩 생성자 사용
        book2.num = 10;                                     // 주문 수량 설정
        book2.print();                                      // print() 메서드로 책 정보 출력
    }
}
