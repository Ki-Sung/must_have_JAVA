package Chapter_11;

// 클래스 정의 - Cat
class Cat {
    static int a = 5;               // 모든 Cat 객체가 공유하는 정적 변수 -> 클래스에 속하며 클래스가 로드될 때 메모리에 할당
    int num = 3;                    // 각 Cat 객체에 속하는 인스턴스 변수

    // 메서드 정의
    void printValue(int num) {                      // num 값을 매개변수로 받아서
        this.num = num;                             // 객체의 num 값을 변경
        System.out.println("num: " + this.num);     // 현재의 num 값 출력
        System.out.println("a: " + a);              // 현재의 a값 출력
    }
}

public class Ex01_GlobalVariable {
    public static void main(String[] args) {        // 프로그램 시작 지점
        // 변수 초기화 - 지역 변수 선언
        int num1 = 5;
        int num2 = 2;

        // 지정된 변수 값 출력
        System.out.println(num1 + ", " + num2);

        Cat cat1 = new Cat();               // cat1이라는 Cat 객체 생성
        cat1.num = 1;                       // 인스턴스 변수 설정
        cat1.a = 10;                        // 정적 변수 접근 - cat1.a를 10으로 설정 -> 모든 Cat 객체에 공유
        cat1.printValue(20);           // 메서드 호출 - cat1의 num을 20으로 변경
        System.out.println(cat1.num);       // cat1.num 출력
        System.out.println(cat1.a);         // cat1.a 출력

        Cat cat2 = new Cat();               // cat2이라는 Cat 객체 생성
        cat2.num = 2;                       // 인스턴스 변수 설정
        cat2.a = 11;                        // 정적 변수 접근 - cat2.a를 11으로 설정 -> 모든 Cat 객체에 공유
        cat2.printValue(10);           // 메서드 호출 - cat2의 num을 10으로 변경
        System.out.println(cat2.num);       // cat2.num 출력
        System.out.println(cat2.a);         // cat2.a 출력
        System.out.println(cat1.a);         // cat1.a 출력
    }
}
