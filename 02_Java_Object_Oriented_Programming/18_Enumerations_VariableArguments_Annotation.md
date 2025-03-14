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

`1번`열거형 데이터 값을 설정합니다. 이름을 정하고 사용할 데이터 종류만 넣으면 됩니다. 

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

## 2. 가변 인수
가변 인수(variable length argument)란 메서드 인수 개수가 가변적인(바꿀수 있는) 것을 말합니다. 예를 들어 System.out.printf() 메서드는 다음과 같이 정의되어 있습니다. 가변 인수에는 다음과 같이 말줄임표 ...를 붙입니다. 
```
PrintStream printf(String format, Object ... args)
```

가변 인수가 아닌 인수와 함께 사용할 때는 가변 인수 매개변수가 항상 마지막에 와야 합니다. 
```
myMethod(int a, int b, int ... v)
```

가변 인수 선언에 대한 컴파일러의 처리는 컴파일러가 다음과 같이 배열 기반 코드로 수정해 처리하게 됩니다. 

![388_varargs_structure](https://github.com/user-attachments/assets/0d63739d-a70d-4c06-89fe-04baa57f0c7e)

![389_varargs_example](https://github.com/user-attachments/assets/971c7fef-85b4-494b-a45d-6914e718d945)
![390_varargs_example_result](https://github.com/user-attachments/assets/81040769-ef54-4962-bfc9-33e69ce0525b)

`1번` 가변 인수는 말줄임표 ...를 사용하여 표시합니다. 

`2번` 배열과 같은 방식으로 사용할 수 있습니다. 향상된 기능의 for문을 이용하여 데이터를 하나씩 꺼내올 수 있습니다. vargs.length 맴버 변수도 사용할 수 있습니다. vargs[0]처럼 지정해서 특정 요소의 값을 가져올 수도 있습니다. 

## 3. 어노테이션
자바 어노테이션(annotation)은 자바 소스 코드에 추가하여 사용할 수 있는 메타 데이터의 일종입니다. `@`기호를 앞에 붙여서 사용합니다. 자바 5이상에서 사용 가능합니다. 여기서는 다음 세 가지만 살펴보고자 합니다. 
- @Override
- @Deprecated
- @SuppressWarnings

### 3-1. @Override 
오버라이딩을 올바르게 했는지 컴파일러가 체크합니다. 오버라이딩할 때 메서드 명을 잘못 적는 실수를 하는 경우가 많은데 이런 점을 방지하는데 사용합니다.

![391_annotation_example](https://github.com/user-attachments/assets/4f28868e-29f0-4ed0-87fd-3e599cde6722)
![392_annotation_example_result](https://github.com/user-attachments/assets/edf7dddd-9ec0-45a7-bb57-533b4dd21eb5)

`1번`move() 메서드를 오버라이딩 했습니다. 예를 들어 본인은 오버라이딩을 했다고 생각했지만, 오타가 났다면 오버라이딩이 아니고 컴파일러는 프로그래머가 새로운 메서드를 만들었다고 판단하게 됩니다. 그러나 @override 어노테이션이 있기 때문에 새로운 메서드가 아니고 오타라고 판단해 줍니다. 

### 3-2. @Deprecated
이 어노테이션이 적용된 메서드는 문제의 발생소지가 있거나 개선된 기능이 다른 것으로 대체되어서 더 이상 필요 없게 되었음을 뜻합니다. 아직은 호환성 유지를 위해서 존재하지만 이후에 사라질 수 있는 클래스 또는 메서드를 가리켜 Deprecated(더 이상 사용되지 않음)되었다고 합니다.

![393_depreacted_example](https://github.com/user-attachments/assets/cd884e3f-c5f4-498b-bb36-a1d7c786ea06)
![394_depreacted_example_result](https://github.com/user-attachments/assets/36e09154-ea4f-435c-a147-d24075f1abd9)

`2번`move() 메서드를 대체할 run() 메서드가 추가되었기에 이후에 사용을 하지 말라고 `1번`에 어노테이션을 붙여주었습니다.

[명령 프롬프트]에서 `javac -encoding UTF-8`명령으로 직접 컴파일을 하면 다음과 같은 메시지가 출력됩니다. 

컴파일은 되었지만, Deprecated된 메서드가 포함되어 있다는 메시지를 보여준 겁니다. 
![395_command_line_example](https://github.com/user-attachments/assets/f1d24033-916d-4301-a470-21c09508a9b3)
