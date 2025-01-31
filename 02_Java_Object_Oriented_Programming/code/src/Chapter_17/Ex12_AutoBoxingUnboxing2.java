package Chapter_17;

public class Ex12_AutoBoxingUnboxing2 {
    public static void main(String[] args) {
        Integer num = 10;                           // 오토 박싱 - 10이라는 기본형 int 값이 자동으로 Integer 객체로 변환(num은 Integer 객체를 참조하게 됨)

        // 증가 연산
        num ++;                                     //  num의 현재 값이 언박싱되어 int로 변환되고, 1이 더해진 후 다시 Integer 객체로 변환 -> 내부적으로 Integer.valueOf(num.intValue() + 1); 호출
                                                    // <-- 오토 박싱과 오토 언박싱 동시에 진행
        // 증가 연산 결과 출력
        System.out.println(num);

        // 더하기 연산 1
        num += 3;                                   // num이 언박싱되어 int로 변환되고, 3이 더해진 후 다시 Integer 객체로 변환 -> 내부적으로 Integer.valueOf(num.intValue() + 3); 호출
        // 더하기 연산 결과 출력
        System.out.println(num);

        // 더하기 연산 2
        int r = num + 5;                            // num이 언박싱되어 int로 변환되고, 5가 더해져 r에 저장
        // 빼기 연산
        Integer rObj = num - 5;                     // num이 언박싱되어 int로 변환되고, 5가 빼진 후 결과가 다시 Integer 객체로 변환 -> 내부적으로 Integer.valueOf(num.intValue() - 5)가 호출

        // 결과 출력
        System.out.println(r);                      // 더하기 연산2의 결과 출력
        System.out.println(rObj);                   // 빼기 연산의 결과 출력
    }
}
