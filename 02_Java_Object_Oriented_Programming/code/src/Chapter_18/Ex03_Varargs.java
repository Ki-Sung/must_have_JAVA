package Chapter_18;

public class Ex03_Varargs {
    // 가변 인수를 사용하는 메서드 정의
    public static void helloEverybody(String...vargs) {         // 가변 인수 표시 - vargs는 문자열을 여러개 받을 수 있는 매개변수
        for (String s : vargs)                                  // 가변 인수 사용 - vargs의 각 요소를 s에 대입하여 반복 함
            System.out.print(s + '\t');                         // s를 출력하고 탭 간격을 추가
        System.out.println();                                   // 줄 바꿈
    }

    // 프로그램의 시작점인 main 메서드 정의
    public static void main(String[] args) {
        helloEverybody("홍길동");                        // "홍길동"을 인수로 사용하여 helloEverybody 메서드 호출
        helloEverybody("홍길동", "전우치");                // 두 개의 인수를 사용하여 helloEverybody 메서드 호출
        helloEverybody("홍길동", "전우치", "손오공");        // 세 개의 인수를 사용하여 helloEverybody 메서드 호출
    }
}
