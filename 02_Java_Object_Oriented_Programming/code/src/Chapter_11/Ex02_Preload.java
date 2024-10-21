package Chapter_11;

// 인스턴스 생성과 관계 없이 static 변수가 메모리 공간에 할당될 때 실행 됨

import java.util.Random;                   // 난수 생성을 위해 java.util 패키지에서 Random을 임포트

public class Ex02_Preload {                // 클래스 정의 - 해당 클래스는 public 접근 제어자를 가지고 있어 다른 패키지에도 접근 가능
    static int num;                        // 'num'이라는 int형 정적 변수 선언 - 해당 변수는 모든 인스턴스에 공유 가능 -> 클래스가 로드될 때 메모리에 할당

    // static 초기화 블록 - 클래스가 메모리에 로드될 때 한 번만 실행됨
    static {
        Random rand = new Random();        // Random 객체 생성

        // main() 실행 전에 이미 난숫값이 대입된다.
        num = rand.nextInt(100);    // 0과 99 사이의 난수를 대입 후 num 변수에 저장
    }

    // 프로그램(코드) 실행 블록
    public static void main(String[] args) {        // main 메서드 정의 - 프로그램 실행
        System.out.println(num);                    // 랜덤으로 저장된 num을 출력
    }
}
