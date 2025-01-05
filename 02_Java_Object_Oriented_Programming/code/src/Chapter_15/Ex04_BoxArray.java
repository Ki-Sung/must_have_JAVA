package Chapter_15;

// 클래스 정의 1 - 사용자 정의 클래스
class BoxA4 {
    public String name;         // name이라는 공용 문자열 속성 정의 -> 해당 속성은 BoxA4 클래스의 인스턴스에서 사용할 수 있음

    BoxA4(String name) {        // 생성자 정의 - BoxA4 클래스의 인스턴스가 생성될 때 호출되며, 매개변수로 받은 name의 값을 객체의 name 속성에 저장
        this.name = name;       // 매개변수 name을 클래스의 속성 name에 할당 -> 여기서 this 키워드는 현재 객체를 참조함
    }
}

// 클래스 정의 2 - 프로그램 실행을 위한 공개 클래스
public class Ex04_BoxArray {
    public static void main(String[] args) {
        BoxA4[] ar = new BoxA4[3];              // 길이가 3인 BoxA4 객체 배열 ar을 생성 - 배열의 각 요소는 기본값인 null로 초기화

        // 배열에 객체 저장
        ar[0] = new BoxA4("홍길동");       // 첫 번째 요소 저장 - 배열 ar의 첫 번째 요소에 "홍길동"이라는 문자열을 가진 BoxA4 객체를 생성하여 저장
        ar[1] = new BoxA4("전우치");       // 두 번째 요소 저장 - 배열 ar의 첫 번째 요소에 "전우치"이라는 문자열을 가진 BoxA4 객체를 생성하여 저장
        ar[2] = new BoxA4("손오공");       // 세 번째 요소 저장 - 배열 ar의 첫 번째 요소에 "손오공"이라는 문자열을 가진 BoxA4 객체를 생성하여 저장

        // 저장된 객체의 참조
        System.out.println(ar[0].name);         // 배열 ar의 첫 번째 요소에 저장된 BoxA4 객체의 name 속성을 출력
        System.out.println(ar[1].name);         // 배열 ar의 두 번째 요소에 저장된 BoxA4 객체의 name 속성을 출력
        System.out.println(ar[2].name);         // 배열 ar의 세 번째 요소에 저장된 BoxA4 객체의 name 속성을 출력
    }
}
