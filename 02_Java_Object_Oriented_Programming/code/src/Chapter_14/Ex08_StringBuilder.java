package Chapter_14;

// 클래스 선언 - StringBuilder
public class Ex08_StringBuilder {
    public static void main(String[] args) {
        StringBuilder buf = new StringBuilder("동해물과");      // StringBuilder 객체 buf를 생성, 초기 문자열 설정

        buf.append("백두산이");                                 // buf에 다른 문자열 추가 - append 메서드를 이용하여 초기 문자열 뒤에 붙임
        System.out.println(buf.toString());                  // buf의 문자열 추가 - 형변환 후 출력

        buf.append(12345);                                   // buf에 정수형 추가 - append 메서드를 이용하여 문자열 뒤애 붙임
        System.out.println(buf.toString());                  // buf에 문자열 추가 - 형변환 후 출력

        buf.delete(0, 4);                                    // 인덱스 0부터 4까지의 문자를 삭제
        System.out.println(buf.toString());                  // 형변환 후 출력

        buf.replace(4, 8, "ABC");              // 인덱스 4부터 8까지의 문자열을 "ABC"로 대체
        System.out.println(buf.toString());                  // 형변환 후 출력

        buf.reverse();                                       // buf의 문자열을 반전(순서 거꾸로)
        System.out.println(buf.toString());                  // 형변환 후 출력
    }
}
