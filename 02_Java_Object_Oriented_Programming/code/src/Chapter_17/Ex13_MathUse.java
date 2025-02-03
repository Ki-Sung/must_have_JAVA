package Chapter_17;

public class Ex13_MathUse {
    public static void main(String[] args) {
        // 제곱근 계산 - 어떤 수를 자기 자신과 곱했을 때 주어진 수가 되는 값
        System.out.println("4의 제곱근: " + Math.sqrt(4));              // 4의 제곱근 계산
        // 로그 계산 - 어떤 수를 특정한 수(밑)로 몇 번 곱해야 주어진 수가 되는지 나타내는 값
        System.out.println("log2(8): " + baseLog(8, 2));    // 8을 2를 밑으로 하는 로그로 변환 - 로그 함수 호출
        // 거듭제곱 계산
        System.out.println("2의 3승: " + Math.pow(2, 3));             // 2의 3승을 계산
        System.out.println();                                        // 문단 띄우기

        // 원주율
        System.out.println("원주율: " + Math.PI);                               // 원주율 값 출력
        // 라디안(원의 반지름에 대한 호의 길이) 에서 각도로 변환
        System.out.println("파이에 대한 Degree: " + Math.toDegrees(Math.PI));    // π를 라디안에서 각도(degree)로 변환
        // 2π 변환
        System.out.println("2 파이에 대한 Degree: " + Math.toDegrees(2.0 * Math.PI));    // 2π를 라디안에서 각도로 변환
        System.out.println();

        // 삼각 함수 계산
        double radian45 = Math.toRadians(45);                           // 각도 45도를 라디안으로 변환

        // 사인 함수 계산 - 직각삼각형의 빗변과 높이의 비 (높이)
        System.out.println("싸인 45: " + Math.sin(radian45));            // 45도의 싸인 값 계산
        // 코사인 함수 계산 - 직각삼각형의 빗변과 밑변의 비(밑변)
        System.out.println("코싸인 45: " + Math.cos(radian45));          // 45도의 코싸인 값 계산
        // 탄젠트 함수 계산 - 사인 코사인의 비율
        System.out.println("탄젠트 45: " + Math.tan(radian45));          // 45도의 탄젠트 값 계산
    }

    // 로그 함수 정의
    public static double baseLog(double x, double base) {
        return Math.log(x) / Math.log(base);                // 주어진 수 x를 특한한 밑 base로 하는 로그를 계산
    }
}