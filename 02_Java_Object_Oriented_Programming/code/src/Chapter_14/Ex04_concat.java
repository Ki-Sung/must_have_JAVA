package Chapter_14;

// 클래스 선언
public class Ex04_concat {
    public static void main(String[] args) {        // Java 프로그램 시작점인 main 메서드
        String str1 = "기초";                        // str1 변수 선언
        String str2 = "프로그래밍";                    // str2 변슈 선언

        String str3 = str1.concat(str2);            // concat() 메서드를 이용하여 String끼리 합친 값을 str3 변수에 저장
        System.out.println(str3);                   // str3 값 출력

        String str4 = "자바".concat(str3);           // 문자열 리터럴과 String(str3 값) 합치기
        System.out.println(str4);                   // str4 값 출력
    }
}
