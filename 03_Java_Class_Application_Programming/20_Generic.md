# 20 제네릭
- 이번시간에는 자바에서 다루는 제네릭을 알아봅니다.
- 제네릭(generic)은 클래스, 메서드에서 사용할 자료형을 나중에 확장하는 기법입니다. 나중에라는 말은 클래스나 메서드를 선얼할 때가 아닌 사용할 때, 즉 객체를 생성할 때나 메서드를 호출할 때 정한다는 의미입니다.

## 1. 제네릭의 필요성
제네릭이 필요한 이유는 단계별 예제를 살펴보며 알아보겠습니다. 

다음 코드는 종족 클래스에서 종족별 유닛을 생산해서 저장하고 가져오는 것인데, 종족을 표현하는 클래스인 HumanCamp1 클래스와 MachineCamp1 클래스 구조가 똑같습니다.그 결과 코드가 중복된다는 단점이 있습니다. 

![424_general_code_example](https://github.com/user-attachments/assets/cfd805ca-04d0-43e2-85e5-6749c20acfb7)
![425_general_code_example_result](https://github.com/user-attachments/assets/7f4e6056-9b71-4213-a54b-93afed914a96)
