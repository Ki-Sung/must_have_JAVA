package Chapter_13;

// 클래스 임포트
import Chapter_13.com.study.Banana;         // Banana 클래스를 Chapter_13.com.study 패키지에서 가져옴

public class Ex04_ImportUse {
    public static void main(String[] args) {
        Banana banana = new Banana();       // Banana 클래스의 객체를 생성하고 banana라는 변수에 할당
        banana.showName();                  // banana 객체의 showName() 메서드를 호출
    }
}