# 18 열거형, 가변 인수, 어노테이션
- 자바 프로그래밍을 할 때 큰 개념은 아니지만 프로그래밍을 편하게 해주는 소소한 요소들이 있습니다. 
- 바로 열거형, 가변 인수, 어노테이션 입니다. 이번시간에는 이 3가지를 알아보도록 하겠습니다.

## 1 열거형
서로 관련 있는 상수들을 모아 놓고 대표할 수 있는 이름을 정의한 것을 열거형이라고 합니다. 자바에서 열거형은 클래스처럼 사용됩니다. 예를 들어 계절이나 음계는 열거형으로 지정해 사용하면 유용합니다. 열거형 선언 방법은 다음과 같이 간단합니다.
```
enum 이름 {
    // 요소 나열 
}
```

요소 접근에는 `이름.요소`처럼 .(점)연사자를 사용하면 됩니다. 

### 1-1. final 상수를 사용했을 때 모호함 
예전에는 다음과 같이 코딩을 하기도 했습니다. 
```
interface MyNum {
    int SPRING = 0;  // 1번 
    int SUMMER = 1;
    int FALL = 2;
    int WINTER = 3;

    int DO = 0;      // 2번
    int RE = 1;
    int MI = 2;
    int FA = 4;
    int SOL = 5;
    int RA = 6;
    int SI = 7;
}
```

앞에서 배웠듯이 인터페이스에 사용된 변수는 앞에 public static final이 생략된 겁니다.

그런데 위의 코드에서 `1번`SPRING과 `2번`DO는 결국 같은 값을 가지고 있습니다. 그러기 때문에 잘못 사용하면 의미 전달에 있어서 모호함이 나타날 수 있습니다. 인터페이스의 final 상수를 사용해 발생하는 모호한 경우를 예제로 살펴봅시다.

![383_constants_example](https://github.com/user-attachments/assets/36114f1d-458f-4d2a-8d9f-4f0d0852f174)
![384_constants_example_result](https://github.com/user-attachments/assets/c34c0dbb-8ac8-4084-bd86-4250b4bd889d)

`1번`과 `2번`은 public static final이 생략된 final 상수 입니다. 

`3번`메서드에 알맞은 의미의 상수값을 인수로 넘겼습니다. `4번`메서드에 실수로 다른 의미의 상수값을 인수로 넘겼습니다. 

하지만 에러는 발생하지 않습니다. 상수를 정의해서 사용한 의미는 다르지만, 결국은 숫자 1로 판정되었기 때문입니다. 비록 실행 중에 에러가 발생하지는 않았지만 의도했다면 잘못 생각한 것이고, 그렇지 않다면 실수가 있는 프로그램입니다. 이 예제에서는 치명적인 에러는 아니었지만, 실제 프로그램을 개발할 때는 치명적인 에러로 연결될 수도 있습니다. 

### 1-2. 열거형으로 모호함 피하기
상수를 사용했을 때 이런 의미의 모호함을 해결하는데 열거형을 사용하게 됩니다. 열거형은 내부적으로는 상수처럼 0부터 시작하는 값을 가지지만, 클래스처럼 사용되기 때문에 앞과 같은 코드를 작성했을 때 에러가 발생하게 됩니다. 

![385_enum_example](https://github.com/user-attachments/assets/223e8776-1222-4ee1-99d0-9b2432cfd76c)
![386_enum_example_result](https://github.com/user-attachments/assets/942e4e95-920a-4d3f-a6e7-ff86e4d5a084)

`1번`열거형 데이터 값을 설정합니다. 이름응ㄹ 정하고 사용할 데이터 종류만 넣으면 됩니다. 

`2번`올바른 타입을 넣으면 인수로 사용할 수 있습니다. `3번`은 `5번`의 매개변수가 Machine2형이기 때문에 Human2형 값을 넣으면 에러가 발생합니다. 

![387_enum_example_result_error](https://github.com/user-attachments/assets/f671572e-0bd5-49b9-b49f-c093b5c8cd10)

`4번`열거형 값도 내부적으로는 0부터 값을 가지고 자동으로 증가하지만, 값으로 바로 비교하지 않습니다. 이렇게 비교하면 클래스와 기본 자료형을 비교한 것이기 때문에 에러가 발생합니다. 

`6번`case문에 사용할 때는 `Machine2.`를 생략합니다.

열거형은 클래스 안쪽에 정의할 수도 있습니다. 클래스 안쪽에 정의를 하면 해당 클래스에서만 사용할 수 있습니다.
```
class Customer {
    enum Gender { MALE, FEMALE }  // 1번

    public Gender gen;

    public String toString() {
      if(gen == Gender.MALE)      // 2번
          return "Thank you, Mr " + name;
      else
          return "Thank you, Mrs " + name;
    }
}
```

`1번`클래스 안에 열거형이 정의되었습니다. `2번`클래스 내에서 열거형을 사용할 수 있습니다. 그러나 다른 클래스에서는 이 열거형을 사용할 수 없습니다.
