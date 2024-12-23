package Chapter_14;

// 클래스 선언 - 문자열 자르기
public class Ex06_substring {
    public static void main(String[] args) {
        String str1 = "AppleBananaOrange";          // str1 변수 값 초기화
        int num1 = str1.indexOf("Banana");          // "Banana" 시작 위치를 찾고 num1에 저장 -> 반환 값은 5
        int num2 = str1.indexOf("Orange");          // "Orange" 시작 위치를 찾고 num2에 저장 -> 반환 값은 11

        // 구간 반환
        String str2 = str1.substring(num1, num2);   // substring(시작점, 끝점) 메서드 호출 - 헤당 메서드는 num1(5)에서 num2(11)까지의 문자열을 추출
        System.out.println(str2);                   // num1은 포함 num2는 불포함 -> "Banana" 출력

        // 특정 위치 이후 반환
        String str3 = str1.substring(num2);         // substring(시작점) 메서드 호출 - 해당 메서드는 num2(11)이후의 모든 문자열을 추출
        System.out.println(str3);                   // "Orange" 출력
    }
}
