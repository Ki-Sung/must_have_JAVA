package Chapter_17;

public class Ex10_BoxingUnboxing {
    public static void main(String[] args) {
        // 박싱
        Integer iObj = Integer.valueOf(10);             // 기본형 int 값을 Integer 객체로 변환
        Double dObj = Double.valueOf(3.14);             // 기본형 double 값을 Double 객체로 변환

        // 메서드 호출을 통한 언박싱
        int num1 = iObj.intValue();                         // Integer 객체 iObj의 값을 기본형 int로 변환하여 num1에 저장
        double num2 = dObj.doubleValue();                   // Double 객체 dObj의 값을 기본형 double로 변환하여 num2에 저장

        // 결과 출력
        System.out.println(num1 + " : " + iObj);
        System.out.println(num2 + " : " + dObj);
        System.out.println();

        // 래퍼 인스턴스 값의 증가 방법
        iObj = Integer.valueOf(iObj.intValue() + 10);        // intValue()를 호출하여 현재 iObj의 값을 가져온 후, 10을 더하고, 다시 Integer.valueOf()를 통해 Integer 객체로 변환하여 iObj에 저장
        dObj = Double.valueOf(dObj.doubleValue() + 1.2);    // dObj.doubleValue()를 호출하여 현재 dObj의 값을 가져온 후, 1.2를 더하고, 다시 Double.valueOf()를 통해 Double 객체로 변환하여 dObj에 저장

        // 결과 출력
        System.out.println(iObj);
        System.out.println(dObj);
    }
}