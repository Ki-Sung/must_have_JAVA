package Chap_01_DataType;

public class _Ex04_DoubleError2 {
    public static void main(String[] args) {

        // 변수 0.0 실수형으로 초기화
        double dNum = 0.0;

        // 반복문으로 0.0 부터 0.1을 1000번 더하기
        for (int i = 0; i < 1000; i = i + 1) {

            // 수식 0.1 = 0.0 + 0.1 -> 0.2 = 0.1 + 0.1 -> ....
            dNum = dNum + 0.1;
        }
        // 결과 출력
        System.out.println(dNum);
    }
}
