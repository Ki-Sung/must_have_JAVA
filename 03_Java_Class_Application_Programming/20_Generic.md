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
