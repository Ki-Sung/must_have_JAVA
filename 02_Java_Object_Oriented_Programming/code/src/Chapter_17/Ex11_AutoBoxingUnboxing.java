package Chapter_17;

public class Ex11_AutoBoxingUnboxing {
    public static void main(String[] args) {
        // 오토 박싱
        Integer iObj = 10;                          // 기본형 int 값이 자동으로 Integer 객체로 변환
        Double dObj = 3.14;                         // 기본형 double 값이 자동으로 Double 객체로 변환

        // 오토 언박싱
        int num1 = iObj;                            // num1은 iObj의 값을 기본형 int로 자동 변환하여 할당 받음
        double num2 = dObj;                         // num1은 dObj의 값을 기본형 double로 자동 변환하여 할당 받음

        // 결과 출력
        System.out.println(num1 + " : " + iObj);
        System.out.println(num2 + " : " + dObj);
    }
}