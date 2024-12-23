package Chapter_14;

// 클래스 선언 - 문자열 길이 구하기
public class Ex07_length {
    public static void main(String[] args) {
        String str = "apple";                       // str 변수에 문자열 초기화
        // for loop 시작
        for (int i = 0; i < str.length(); i++) {    // str.length() 메서드를 호출하여 문자열 길이를 구함 -> "apple"의 길이는 5 / i는 0에서 부터 문자열 길이(5) 보다 작은 동안 반복
            char ch = str.charAt(i);                // charAt(i) 메서드를 사용하여, 인덱스 i에 해당 문자를 읽어 ch 변수에 저장

            // 조건식
            if (ch == 'l')                          // 읽은 문자가 'l'인지 확인, 만약 'l'이라면
                break;                              // break를 통해 for loop 종료
            System.out.println(ch);                 // 현재 읽힌 문자열 출력
        }
    }
}
