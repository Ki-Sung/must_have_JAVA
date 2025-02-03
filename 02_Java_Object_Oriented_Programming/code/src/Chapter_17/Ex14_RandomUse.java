package Chapter_17;

// 모듈 임포트
import java.util.Random;

public class Ex14_RandomUse {
    public static void main(String[] args) {

        // 첫 번째 난수 생성기 - 매번 다른 난수 생성
        Random rand1 = new Random();                            // Random 클래스의 인스턴스 rand1을 생성 - 아무 매개변수를 주지 않으면, 시스템의 현재 시간 등을 기반으로 난수를 생성

        // 난수 출력 -  0부터 9까지의 난수를 생성
        for (int i = 0; i < 10; i++)
            System.out.print(rand1.nextInt(10) + " ");  // 10번을 반복하여 생성된 난수를 출력

        // 문단 줄 바꾸기
        System.out.println();

        // 두 번째 난수 생성기 - 시드 지정 -> 매번 똑같은 난수를 생성
        Random rand2 = new Random(12);                      // 난수 생성기 초기화 - Random 클래스의 인스턴스 rand2를 생성할 때, 12라는 특정 시드를 사용

        // 난수 출력 - 0부터 9까지의 난수
        for (int i = 0; i < 10; i++)
            System.out.print(rand2.nextInt(10) + " ");      // 10번을 반복하여 생성된 난수를 출력

        System.out.println();
    }
}
