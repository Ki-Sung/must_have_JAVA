package Chapter_14;

// 클래스 정의
public class Ex02_RefCompare {
    // Java 프로그램 시작점 - main 메서드
    public static void main(String[] args) {
        // 문자열 객체 생성
        // str1, str2 모두 new 연산자를 사용하여 String 객체를 생성 - 두 객체는 서로 다른 메모리 위치에 저장
        String str1 = new String("자바프로그래밍");
        String str2 = new String("자바프로그래밍");
        // str3, str4 문자열 리터럴을 사용하여 문자열 생성 - Java 문자열 리터럴 풀을 사용하여 동일한 문자열을 공유, 둘 다 같은 메모리 위치 참조
        String str3 = "자바프로그래밍";
        String str4 = "자바프로그래밍";

        /// 참조 비교
        if (str1 == str2)                                       // 1번 조건문 - str1과 str2 비교 -> 객체의 참조를 비교
            System.out.println("str1과 str2는 동일한 객체 참조");    // 만약 동일하다면, 메시지 출력
        else                                                    // 만약 동일하지 않다면
            System.out.println("str1과 str2는 다른 객체 참조");      // 메시지 출력

        if (str3 == str4)                                       // 2번 조건문 - str1과 str2 비교 - 먄약 동일하다면
            System.out.println("str3과 str4는 동일한 객체 참조");     // 메시지 출력
        else                                                    // 동일 하지 않다면
            System.out.println("str3과 str4는 다른 객체 참조");      // 메시지 출력
    }
}
