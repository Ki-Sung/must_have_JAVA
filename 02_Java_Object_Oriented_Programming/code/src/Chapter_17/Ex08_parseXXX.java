package Chapter_17;

public class Ex08_parseXXX {
    public static void main(String[] args) {
        String str = "100";                             // 문자열 선언
        int a = Integer.parseInt(str);                  // 정수형으로 변환
        double b = Double.parseDouble("3.14");       // 실수형으로 변환

        System.out.println(a + " : " + b);              // 결과 출력
    }
}