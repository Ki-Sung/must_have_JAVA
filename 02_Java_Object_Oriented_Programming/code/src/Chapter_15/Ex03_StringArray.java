package Chapter_15;

public class Ex03_StringArray {
    public static void main(String[] args) {
        String[] name = new String[7];              // 길이가 7인 문자열 배열 생성

        name[0] = new String("홍길동");       // 배열 첫 번째 요쇼 지정
        name[1] = new String("전우치");       // 배열 두 번째 요소 지정
        name[2] = new String("손오공");       // 배열 세 번째 요소 지정
        name[3] = new String("강감찬");       // 배열 네 번째 요소 지정
        name[4] = new String("이순신");       // 배열 다섯 번째 요소 지정
        name[5] = new String("을지문덕");      // 배열 여섯 번째 요소 지정
        name[6] = new String("양만춘");       // 배열 일곱 번째 요소 지정

        // 배열에 저장된 문자열의 총 문자수 계산을 위해 정수 초기화
        int cnum = 0;

        // 배열 크기 및 문자열 갯수 계산을 위한 반복 작업
        for(int i = 0; i < name.length; i++) {      // name의 길이 만큼 반복
            System.out.println(name[i]);            // 현재 인덱스(배열)의 문자열 출력
            cnum += name[i].length();               // 현재 문자열의 길이를 구하여 cnum에 더함
        }

        System.out.println("총 문자의 수: " + cnum);   // cnum에 저장된 총 문자열의 수 출력
    }
}
