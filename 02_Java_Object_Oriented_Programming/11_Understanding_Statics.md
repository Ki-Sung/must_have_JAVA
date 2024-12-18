# 11 스태틱의 이해 
- 스태틱 예약어 static은 변수 및 메서드, 그리고 지정한 영역에서 붙일 수 있습니다. 자바 프로그래밍에서 스태틱 예약어를 붙이면 어떻게 동작하는지 직접 보면서 확인하고 이해해보도록 하겠습니다. 추가적으로 스태틱의 다양한 사용 방법도 살펴보겠습니다.

## 1. 스태틱(Static)
앞에서 메서드 영역을 설명할 때 스태틱(static) 변수 및 스태틱(static) 메서드는 메서드 영역에 저장되며, 프로그램 시작 전에 로드되고 프로그램 종료 시 소멸된다라고 설명드렸습니다. 

`1번` 코드가 메서드 영역에 다 로딩되면 `2번` 그중에서 스태틱으로 지정된 변수와 메서드는 메서드 영역 내 스태택 영역으로 옮겨집니다. 

![179_static_structure](https://github.com/user-attachments/assets/3bcbb4f3-5422-45aa-a411-ded28e9980be)

먼저 추려내져야 하는 변수와 메서드가 있다면 static 예약어 표시를 하여 메모리의 특정 영역에 따로, 그리고 미리 로딩시켜놓은 것뿐입니다. 이때 스태틱 변수(정적 변수)는 값이 메모리에 로딩될 때 대입되고 블록이 있다면 메모리에 로딩될 때 실행됩니다. 메서드는 누가 호출해줘야 실행이 되는 것이기 때문에 로딩만 됩니다. 

## 2. 전역 변수로 사용
메서드 영역 내 스태틱 영역의 변수 및 메서드는 어떤 객체에서도 접근해서 사용할 수 있습니다. 그렇기에 스태택 변수를 전역 변수라고 부르기도 합니다. 

스태틱 변수를 전역 변수로 어떻게 사용할 수 있는지 예제를 통해 알아보겠습니다. 

먼저 프로젝트를 만들고 클래스 파일을 추가해 아래와 같이 코드를 작성해줍니다. 이번에는 .java 파일 하나에 클래스 두 개를 작성합니다. 스태틱 변수를 갖는 클래스의 객체 두 개를 만들어볼 겁니다. 그 안에 들어 있는 스태틱 변수가 각자 생기는지 하나인지 확인해보겠습니다. 

![180_static_example_code1](https://github.com/user-attachments/assets/185970fc-425f-42e6-96b6-fc61f65550d5)
![181_static_example_code1_result](https://github.com/user-attachments/assets/82b24eb6-6f91-4694-9cfb-4ef5d4185001)

`1번` Cat 클래스의 int형 변수 a에 static 예약어가 붙어 있습니다. 이 변수는 a는 프로그램이 시작하기도 전에 메서드 영역 내 스태틱 영역에 생성되어 있을 겁니다. 그리고 누구나 접근하여 사용할 수 있게 됩니다. 

프로그램이 실행되면 `2번`부터 실행이 됩니다. `3번`에서 main의 지역변수 num1, num2 변수가 선언되고 값을 대입받습니다. 

`4번`에서 Cat 클래스형의 cat1 변수를 스택 영역에 생성합니다. Cat 클래스형의 객체를 힙 영역에 생성합니다. cat 변수에 생성된 객체를 참조할 수 있는 id값을 대입합니다. 

이때 맴버 변수 a는 static 예약어가 붙어 있으므로 여기서 만들지 않습니다. 프로그램 실행 전에 미리 만들어져 있을 겁니다. 

`5번` cat1의 인스턴스(instance) 변수 num에 값을 대입합니다. num은 힙 영역에 생성된 객체 안에 있습니다. `6번` cat1의 스태틱(static) 변수 a에 값을 대입합니다. a는 메서드 영역 내 스태틱 영역에 생성되어 있던 겁니다. `7번` cat1의 메서드를 통해 맴버 변수의 값을 출력합니다. `8번` cat1의 인스턴스(instance) 변수 num에, `9번` cat1의 스태틱 변수 a에 직접 접근해서 값을 가져와 출력합니다. 

`10번` Cat 클래스형의 cat2 변수를 스택 영역에 생성합니다. Cat 클래스형의 객체를 힙 영역에 생성합니다. cat2 변수에 생성된 객체를 참조할 수 있는 id값을 대입합니다. 이때 맴버 변수 a는 static 예약어가 붙어 있으므로 여기서 만들지 않습니다. 프로그램 실행 전에 미리 만들어져 있을 겁니다. 

`11번` cat2의 인스턴스 변수 num에 값을 대입합니다. num은 힙 영역에 생성된 객체 안에 생성되어 있습니다. `12번` cat2의 스태틱 변수 a에 값을 대입합니다. a는 메서드 영역 내 스태틱 영역에 생성되어 있던 겁니다. `13번` cat2의 메서드를 통해 맴버 변수의 값을 출력합니다. 

`14번` cat2의 인스턴스 변수 num에 `15번` cat2의 스태틱 변수 a에 `16번` cat1의 스태틱 변수 a에 직접 접근해서 값을 가져와 출력합니다. 

cat2.a값을 바꾸었는데 cat1.a값도 바뀌었습니다. a는 스태틱 변수라서 cat2.a와 cat1.a 둘 다 같은 a를 가리키고 있기 때문입니다. 

위 과정을 자바의 메모리 모델에 그림으로 표현하면 다음과 같습니다. 

![182_static_var_structure](https://github.com/user-attachments/assets/83a45082-b986-4773-85c2-70a380696250)

생성된 위치 때문에 a는 스태틱 변수, num은 인스턴스 변수라고도 부릅니다. 그리고 스태틱 변수는 예제에서 본 것 처럼 모든 클래스에서 다 접근해서 사용할 수 있기 때문에 전역(global) 변수라고도 부릅니다. 

스태틱에 관련해서는 위 이미지에서 `3번` '코드가 로드되고 프로그램이 실행되기 전에 미리 로딩되어 있다'만 이해하면 쉽게 사용할 수 있을 겁니다.

## 3. `main()`보다 먼저 실행 
프로그램 실행 전에 스태틱 예약어가 붙은 변수에 값의 대입이 끝나 있는지 예제를 통해서 확인해 보겠습니다. 

스태틱 예약어는 변수, 영역, 메서드에 붙일 수 있습니다. 메서드는 호출을 해야 실행이 되는 것이므로 스태틱 예약어로 지정한 영역이 프로그램 실행 전 메모리에 먼저 로드가 되고 실행이 되는지 확인해보면 됩니다. 

코드는 아래와 같이 작성합니다. 
![183_preload_example_code](https://github.com/user-attachments/assets/a367c2f2-577f-40b4-a0f2-080fbfc805f5)

다음은 실행 결과입니다. 실행할 때 마다 다른 수가 출력됩니다.
![184_preload_example_code_result](https://github.com/user-attachments/assets/785871e4-1fdf-4fbd-b60a-0c2564a96106)

이번 예제에서는 임의의 수를 만들어낼 겁니다. 임의의 수를 만드는 기능이 자바에서는 Random 클래스에 이미 만들어져 있기에, 해당 클래스를 임포트해서 사용하겠습니다(이전에 입력 처리를 하면서 Scanner 클래스를 사용한 것 처럼).
`1번` 랜덤 클래스를 임포트 합니다.
`2번` 스태틱 변수를 맴버 변수로 선언합니다.
`3번` 스태틱 영역을 지정하고 안에 코드를 작성합니다. `4번` 임의의 숫자를 얻기 뒤해 Random 클래스를 이용하여 객체를 만듭니다. `5번` 만들어진 객체에서 `nexInt()` 메서드를 호출합니다. 정수로 100을 매개변수로 넣어주면 0에서 99 사이에서 임의의 숫자를 반환합니다. "5번" 만들어진 객체에서 `nextInt()` 메서드를 호출합니다. 정수로 100을 매개변수로 넣어주면 0에서 99 사이에서 임의의 숫자를 반환합니다. 

`7번` 프로그램이 시작합니다. `8번` 맴버 변수 num의 값을 출력합니다. 

맴버 변수 num은 스태틱 변수이기도 하기 때문에 프로그램 시작 전 메서드 영역의 스태틱 영역에 로드되면서 값이 대입되어 있을 겁니다. 기본 자료형은 기본값으로 0이 대입됩니다. 

그리고 `6번`도 스태틱으로 지정한 영역이기 때문에 프로그램 실행 전 미리 로드가 될 것이고 메서드가 아니기 때문에 실행이 되어버립니다. 이때 랜덤 객체를 만들고 그 객체로부터 임의의 수를 반환 받아 스태틱 변수 num에 대입시켜줍니다. 프로그램이 시작하고 `8번`에서 스태틱 변수의 값을 출력하면 main()에서 별다른 값을 변수에 대입하지 않았음에도 임의의 수가 이미 값으로 들어가 있는 것은 이런 이유입니다. 

이렇게 결과로 확인해보아도 되고, 코드 8번 라인에 브레이크포인트를 걸고 앞서 방법대로 디버그 모드로 확인해보아도 됩니다. 디버그 모드에서는 다음과 같은 순서로 실행됩니다. 
![185_debug_mode_start](https://github.com/user-attachments/assets/eea03e76-baa6-4507-bb97-83105799b170)

이처럼 스태틱 영역은 프로그램 시작 전에 로드되는 것을 확인할 수 있습니다.

그런데 모든 클래스에서 변수의 값을 공유할 수 있다고 스태틱 변수를 남발하여 사용하는 일은 지양해야 합니다. 다음과 같은 단점이 있습니다. 
- 사용하는 메모리의 정확한 크기 계산을 하지 않더라도 힙 영역을 사용하지 않고 메서드 영역의 일부분만 사용하므로 메모리 사용이 비효율적입니다.
- 한 객체가 가지고 있는 데이터들은 외부에서 함부로 접근하여 수정할 수 없도록 해야 한다는 객체지향 프로그래밍 원칙(캡슐화, 정보 은닉)에 위배됩니다.

그러므로 스태틱 변수는 꼭 필요한 경우에만 심사숙고해서 사용해야 합니다. 

## 4. 유틸 메서드로 사용 
스태틱 변수는 가급적 사용을 지양하라고 했지만, 스태틱 메서드는 유틸리티 성격의 프로그램에서 많이 사용합니다. 특정 기능이 필요한데 자주 사용된다면 많은 클래스에서 중복되어 만들어지지 않게 하려는 의도에서입니다. 

메서드에 스태틱 예약어를 붙여 만들어놓으면 스태틱 영역에 만들어지기 때문에 서로 다른 클래스에서 얼마를 사용하든 간에 메모리에는 딱 한번만 올라와 있게 됩니다. 예제를 만들어 확인해보겠습니다.

다음과 같이 계산기 프로그램을 클래스로 만듭니다. 비록 보이기는 매우 어설퍼 보이지만 매우 훌륭한 계산기라고 가정하겠습니다. 앞으로 만들 프로그램에서 계속 이 클래스의 기능을 사용할 예정입니다. 그래서 모든 클래스에서 가져다 쓰기 편하라고 adder() 메서드에 static 예약어를 붙여줍니다. 

![186_calculator_class](https://github.com/user-attachments/assets/669eed8c-3bd3-407b-a517-3cf445ce53c2)

그리고 다음과 같이 `main()` 코드를 작성하여, 계산기 클래스의 기능을 사용합니다.
![187_start_program_class](https://github.com/user-attachments/assets/0c43291b-b5b2-4620-a8c7-f0e65e830385)
![188_start_program_class_result](https://github.com/user-attachments/assets/8c376833-53d5-4ce6-9abd-8b47fe739c3f)

`1번` 객체를 생성하여 변수에 대입한 후 사용합니다. 우리가 기존에 사용하던 방식입니다. 객체가 만들어지기는 했지만 스태틱의 성격상 프로그램이 실행되기 이전에 이미 메서드 영역 내 스태틱 영역에 로드가 되어 있었을 겁니다. 따라서 코드 5번 라인에서 계산기 객체가 만들어지면 수행한 작업은 껍데기만 있는 객체를 만든 겁니다. 낭비적인 작업입니다.

이럴 떄는 `2번`처럼 클래스명으로 바로 메서드를 호출해줄 수 있습니다. 스태틱을 메서드에 붙여주면 이렇게 객체 생성 없이 **클래스명.메서드명** 형식으로 유틸 메서드를 사용할 수 있습니다(이런 이유로 static이 붙은 변수를 클래스 변수, 메서드를 클래스 메서드라고 부릅니다). 

만약 계산기 클래스가 다른 패키지, 즉 다른 폴더에 있었다면 import 기능을 사용해야 사용할 수 있습니다. 그러나 같은 패키지, 즉 같은 폴더에 있기 때문에 import를 사용하지 않아도 계산기 클래스를 사용할 수 있습니다.

여기까지 배운 것을 바탕으로, `System.out.println(...)`에 대해서 조금 더 말할 수 있을 것 같습니다. 

`System`은 대문자로 시작합니다. 
- 우리가 그동안 배운 네이밍 톨에 의하면 첫 글자가 대문자로 시작하므로 클래스입니다.

그리고 점(`.`) 연산자를 이용하여 `System.out`이라고 사용하고 있습니다. 
- 객체를 만들지 않고 바로 클래스명으로 접근해 사용했으므로 out에는 static이 붙어 있다라는 것을 알 수 있습니다.

그런데 out에는 메서드의 특징인 소괄호가 없습니다. 
- out은 우리 예제처럼 메서드가 아니고 맴버 변수입니다.

그리고 `System.out.println(...)`이라고 점(`.`) 연산자를 이용하여 `println()` 메서드를 호출하고 있습니다.
- 메서드를 호출하고 있으므로 일반 자료형의 변수가 아니고 객체형의 변수입니다.

여기까지 종합하면 `System` 클래스의 맴버 변수 `out` 객체를 참조하고 있고, 그 참조한 객체의 `println()` 메서드를 이용해 출력 기능을 제공하고 있던 것입니다. 

참고로 현재까지 우리가 만든 패키지, 즉 폴더에 `System` 클래스가 없다라고 생각할 수 있는데, 이 클래스는 자바로 개발하는 개발자라면 다 사용해야 하는 기능이므로 자바 컴파일러가 자동을 import시켜 주고 있습니다. 

```
import java.lang.System;   // 자동 삽입
```
```
import java.util.Scanner;  // 수동 삽입
```
- 앞에 붙어 있는 `java.lang`, `java.util`은 패키지명입니다.

여기까지 자바 프로그래밍에서 사용하는 스태틱의 동작과 원리를 알아보았습니다.

### 학습 마무리 - 핵심 요약 
1. 스태틱 변수 및 스태틱 메서드는 메서드 영역에 저장되며, 프로그램 시작 전에 로드되고 프로그램 종료 시 소멸됩니다.
2. 메서드 영역 내 스태틱 영역의 변수 및 메서드는 어떤 객체에서도 접근해서 사용할 수 있습니다. 그렇기에 스태틱 변수를 전역 변수라고 부르기도 합니다.
3. 스태틱 영역은 프로그램 시작 전에(즉 `main()`보다 먼저) 로드 됩니다.
4. 메서드에 스태틱 예약어를 붙여 만들어놓으면 스태틱 영역에 만들어지기 때문에 서로 다른 클래스에서 얼마를 사용하든 간에 메모리에는 딱 한번만 올라와 있게 됩니다.
