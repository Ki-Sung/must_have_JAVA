package Chapter_14;

// 클래스 선언
public class Ex03_ContentsCompare {
    public static void main(String[] args) {            // Java 프로그램의 시작점인 main 메서드
        // 문자열 초기화
        String str1 = new String("Apple");      // str1 문자열 변수 초기화
        String str2 = new String("apple");      // str2 문자열 변수 초기화
        String str3 = new String("Banana");     // str3 문자열 변수 초기화
        int cmp;                                        // compareTo 메서드를 이용하여 문자열 비교를 위해 int 타입의 cmp 변수 선언

        // 인스턴스 내용 비교
        // equals 메서드 - 문자열이 같은지 내용을 비교
        if(str1.equals(str3))                           // 만약 str1과 str3의 문자열이 같다면
            System.out.println("두 문자열을 같습니다.");      // 두 문자열이 같다라는 메시지 출력
        else                                            // 만약 아니라면
            System.out.println("두 문자열은 다릅니다.");      // 두 문자열은 다르다는 메시지 출력

        // compareTo() 메서드 - 문자열을 사전순으로 비교
        // A.comapreTo(B) -> 0일 경우: 두 문자열 동일
        // A.comapreTo(B) -> 음수일 경우: 첫 번쨰(A) 문자열이 두 번째(B) 문자열보다 사전순으로 앞에 있음
        // A.comapreTo(B) -> 양수일 경우: 첫 번쨰(A) 문자열이 두 번째(B) 문자열보다 사전순으로 뒤에 있음
        cmp = str1.compareTo(str2);                     // str1과 str2를 사전순으로 비교하여 결과를 cmp에 저장 - 이때 대소문자를 구분함

        // 사전순 비교 결과 출력
        if(cmp == 0)                                    // 만약 cmp 결과 0과 동일하다면
            System.out.println("두 문자열은 일치합니다.");    // 두 문자열이 일치하다는 결과 출력
        else if (cmp < 0)                                       // 만약 cmp 결과가 0보다 작을(음수) 경우
            System.out.println("사전의 앞에 위치하는 문자: " + str1);  // 사전 앞에 위치 문자 "Apple" 출력
        else                                                    // 만약 cmp 결과가 0보다 클(양수) 경우
            System.out.println("사전의 앞에 위치하는 문자: " + str2);  // 사전 앞에 위치 문자 "apple" 출력

        // 대소문자 구분 없는 비교
        // compareToIgnoreCase() 메서드 - 대소문자 구분없이 사전순 비교
        if(str1.compareToIgnoreCase(str2) == 0)                 // 만약 A.compareToIgnoreCase(B)가 0과 같은 경우
            System.out.println("두 문자열은 같습니다.");              // 문자열이 같다라는 결과 출력
        else                                                    // 같지 않다면
            System.out.println("두 문자열은 다릅니다.");              // 문자열이 다르다라는 결과 출력
    }
}
