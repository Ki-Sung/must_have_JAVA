package Chapter_14;

// 클래스 선언 - 문자열 Index 찾기
public class Ex05_indexOf {
    public static void main(String[] args) {
        String str = "AppleBananaOrange";                   // str 변수에 문자열 초기화
        int num1 = str.indexOf("a");                        // indexOf() 메서드 호출 - 해당 메서드는 str에서 첫 번째로 나타나는 "a"의 인텍스를 찾음 -> 대소문자 구분하므로 "a" 첫 번째 인덱스 위치는 '6'
        int num2 = str.indexOf("a", num1+1);  // num1(6) + 1의 값은 7, 즉 7 번째 인텍스로 부터 검색 -> 7번째 부터 검색하면 "a"의 인덱스 위치는 '8' => indexOf("검색할 String 대상", 조건)

        // 결과 출력
        System.out.println(num1);
        System.out.println(num2);
    }
}
