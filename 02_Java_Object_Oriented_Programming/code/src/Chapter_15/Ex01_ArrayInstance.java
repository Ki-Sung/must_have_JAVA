package Chapter_15;

// 클래스 정의 1 - 빈 클래스
class BoxA1 {

}

// 클래스 정의 2 - 공개 클래스
public class Ex01_ArrayInstance {
    public static void main(String[] args) {
        // 길이가 5인 int형 1차원 배열 생성 - 배열의 각 요소는 기본값인 0으로 초기화
        int[] ar1 = new int[5];

        // 길이가 7인 double형 1차원 배열 생성 - 배열의 각 요소는 기본값인 0.0으로 초기화
        double[] ar2 = new double[7];

        // 배열의 참조 변수와 객체 생성 분리 - 길이가 9인 float형 1차원 배열을 생성(배열의 각 요소는 기본값인 0.0으로 초기화 )
        float[] ar3;
        ar3 = new float[9];

        // 객체 대상 1차원 배열 -배열의 각 요소는 null로 초기화(아직 객체가 생성되지 않았기 때문)
        BoxA1[] ar4 = new BoxA1[5];

        // 배열의 객체 변수 접근 / 메서드 사용 - 결과 값 출력
        System.out.println("배열 ar1 길이: " + ar1.length);
        System.out.println("배열 ar2 길이: " + ar2.length);
        System.out.println("배열 ar3 길이: " + ar3.length);
        System.out.println("배열 ar4 길이: " + ar4.length);
    }
}