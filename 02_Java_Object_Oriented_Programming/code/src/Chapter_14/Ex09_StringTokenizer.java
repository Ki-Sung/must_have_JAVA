package Chapter_14;

// 클래스 임포트
import java.util.StringTokenizer;

// 클래스 선언 - StringTokenizer
public class Ex09_StringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("a b c");          // StringTokenizer 객체 st1을 생성하고, 초기 문자열로 "a b c"를 설정 - 기본적으로 공백을 구분자로 사용
        // StringTokenizer st2 = new StringTokenizer("1,2,3", ",");  // StringTokenizer 객체 st2을 생성하고, 문자열을 쉼표를 기준으로 분할

        while (st1.hasMoreTokens()) {                                // st1에 토큰이 있는지 확인 - hasMoreTokens() 메서드는 다음에 읽을 수 있는 토큰이 있는지 여부를 반환
            System.out.println(st1.nextToken());                     // st1에서의 토큰을 가져와 출력하기 - nextToken() 메서드는 현재 토큰을 반환하고 다음 토큰으로 이동
        }
    }
}
