# 20 제네릭
- 이번시간에는 자바에서 다루는 제네릭을 알아봅니다.
- 제네릭(generic)은 클래스, 메서드에서 사용할 자료형을 나중에 확장하는 기법입니다. 나중에라는 말은 클래스나 메서드를 선얼할 때가 아닌 사용할 때, 즉 객체를 생성할 때나 메서드를 호출할 때 정한다는 의미입니다.

## 1. 제네릭의 필요성
제네릭이 필요한 이유는 단계별 예제를 살펴보며 알아보겠습니다. 

다음 코드는 종족 클래스에서 종족별 유닛을 생산해서 저장하고 가져오는 것인데, 종족을 표현하는 클래스인 HumanCamp1 클래스와 MachineCamp1 클래스 구조가 똑같습니다.그 결과 코드가 중복된다는 단점이 있습니다. 

![424_general_code_example](https://github.com/user-attachments/assets/cfd805ca-04d0-43e2-85e5-6749c20acfb7)
![425_general_code_example_result](https://github.com/user-attachments/assets/7f4e6056-9b71-4213-a54b-93afed914a96)

그래서 앞에서 배운 '자식 클래스의 객체는 부모 클래스형의 변수에 대입할 수 있다.'를 이용해 다음과 같이 코드를 고쳐보겠습니다.

![426_general_code_2_example](https://github.com/user-attachments/assets/19a7e507-39a6-4981-8cd4-d48e59a66286)
![427_general_code_2_example_result](https://github.com/user-attachments/assets/5550095c-2a69-4f2c-8fd2-c36976c5a78a)

HumanCamp1 클래스와 MachineCamp1 클래스 구조가 똑같으므로 Camp2로 합치기로 하고 어떤 자식 클래스라도 받아들일 수 있게 `1번`에서 매개변수의 자료형을 Object로 만들었습니다. 

그로 인해 `2번`에서처럼 객체를 꺼내올 때 형변환이 필요하게 됩니다. 꺼낼 때 약간 불편하긴 하지만 코드는 잘 작동합니다. 하지만 이는 컴파일러의 오류 발견 가능성을 낮추는 결과로 이어집니다. 

다음 코드를 보겠습니다. 

![428_general_code_3_example](https://github.com/user-attachments/assets/a886c1fb-cfaa-4ec5-9e79-8afb02782f81)

`1번`에서 우리가 만든 유닛을 생성해서 넣어줘야 하는데, 실수로 스트링 객체를 생성해서 넣어주었습니다. 매개변수가 Object 타입이고, 우리도 객체를 생성해 넣어준 것이기 때문에 문법적으로 오류는 나지 않습니다. 

하지만 `2번`에서 꺼낼 때 에러가 발생합니다. 꺼내 쓰는 임장에선 당연히 게임 유닛이 들어 있을 거라고 생각하기 때문에 형변환을 하게 되고, 그때 에러가 나게 됩니다. 

지금 이 코드의 문제는 프로그래머 실수가 컴파일 과정에서 발견되지 않는다는 것입니다. 다음처럼 실행하고 나서야 에러를 발견하게 됩니다.

![429_general_code_3_result](https://github.com/user-attachments/assets/0ab4f90b-b1d8-48f0-af92-b02d35ed912b)

그런데 이 코드를 위처럼 사용하지 않고 다음처럼 사용해보겠습니다. 실행해보면 에러 조차 발생하지 않습니다. 

![430_general_code_4](https://github.com/user-attachments/assets/e72f0500-ec6a-44bd-b286-4bffb9aa3f2f)
![431_general_code_4_result](https://github.com/user-attachments/assets/5cd5b208-5a74-47f7-a184-356649b69fdb)

에러는 발생하지 않았지만 원하는 결과는 아닙니다. 이처럼 실행할 때 에러가 발생하지 않으면 프로그래머는 코드에 이상이 없다고 생각할 수 있습니다. 에러가 없다고 생각해 실제 서비스를 하게 되고, 그때 에러가 발견되면 큰 문제가 될 수 있습니다. 

이처럼 제네릭을 적용하기 이전의 코드는 객체를 돌려받을 때 형변환을 잊지 말고 해야한다는 불편함이 있고, 코드 진행상 프로그래머가 실수를 해도 그 실수가 드러나지 않을 수도 있다는 잠재적 위험이 존재합니다.
