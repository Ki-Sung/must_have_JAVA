package Chapter_14;

public class Ex01_StringUse {
    public static void main(String[] args) {
        // 문자열 객체 생성
        // str1, str2 모두 new 연산자를 사용하여 String 객체를 생성 - 두 객체는 서로 다른 메모리 위치에 저장
        String str1 = new String("자바프로그래밍");
        String str2 = new String("자바프로그래밍");
        // str3, str4 문자열 리터럴을 사용하여 문자열 생성 - Java 문자열 리터럴 풀을 사용하여 동일한 문자열을 공유, 둘 다 같은 메모리 위치 참조
        String str3 = "자바프로그래밍";
        String str4 = "자바프로그래밍";

        // 문자열 출력
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
