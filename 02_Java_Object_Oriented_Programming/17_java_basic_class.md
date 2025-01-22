# 17 자바의 기본 클래스
- Object 클래스는 모든 자바 클래스의 최상위 클래스이고 이 클래스를 상속받아 기본 기능을 제공해주는 다양한 기본 클래스들이 있습니다. 
- 이번시간에는 자바의 다양한 기본 클래스를 살펴보겠습니다.

## 1. java.lang 클래스 
java.lang 패키지는 우리가 많이 사용하는 기본 클래스를 포함하는 패키지로 이 패키지에 속한 클래스들은 임포트하지 않아도 자동으로 임포트됩니다. java.lang 패키지에 포함된 주요 클래스를 살펴보면 다음과 같습니다.

| 클래스 | 설명 | 
|:---|:---|
| Object | 최상위 클래스로 기본적인 메서드를 제공합니다. |
| String, StringBuffer, StringBuilder | 문자열을 처리하는 메서드를 제공합니다. | 
| Number, Integer, Long, Float, Double | 기본형 데이터를 객체화합니다. | 
| System | 시스템 정보나 입출력을 처리하는 메서드를 제공합니다. | 
| Math | 각종 수학 함수를 제공합니다. | 
| Thread | 스레드를 처리하는 메서드를 제공합니다. | 
| Class | 실행 중에 클래스 정보를 제공합니다. |

이 패키지에 속한 모든 클래스들은 다음처럼 확인할 수 있습니다. IDE(IntelliJ) 프로젝트에서 src 밑에 External Librareis 폴더가 있습니다. 해당 폴더에서 java.base library root > java > lang으로 가면 java.lang 패키지 안에 들어있는 클래스들을 확인할 수 있습니다.

![341_java_basic_class](https://github.com/user-attachments/assets/b1a206e3-6f41-4093-a075-77a9883e0e95)

## 2. Object 클래스
Object 클래스는 모든 자바 클래스의 최상위 클래스로, 모든 자바 클래스는 Object 클래스로부터 상속을 받습니다. 그런데 우리는 클래스를 만들 때 Object 클래스를 상속받는 코드를 작성한 적이 없었습니다. 컴파일 과정에서 오른쪽과 같이 extends Object가 자동으로 사용되었기 때문입니다.

![342_extend_object](https://github.com/user-attachments/assets/08ba7951-55e1-4470-9036-9f5c67f19652)

그러므로 다음 두 코드는 의미가 같습니다. 

<img width="955" alt="343_object_means" src="https://github.com/user-attachments/assets/1af8a256-85e0-4110-9619-8cb77818c4a2" />

자바에서 제공하는 기본 클래스들도 당연히 Object 클래스를 상속받아서 만들어졌습니다.

그로므로 String 클래스 역시 Object 클래스를 상속받았습니다. IntelliJ에서 String 자료형을 선택후 Navigate 탭 > Type Hierachy를 선택합니다(혹은 mac 기준 control + h). 

![344_open_type_hierachy](https://github.com/user-attachments/assets/adf08104-aa47-4b9d-826c-3ee08f15c8d2)

우측 탐색창 쪽에 새로운 탭이 열리면서 상속 관계를 보여주는 창이 뜨게 됩니다.

String 클래스는 Object 클래스를 상속받았음을 알 수 있습니다. 

![345_class_object_hierachy](https://github.com/user-attachments/assets/62da7e97-fff9-4459-bced-553de7fcda29)

앞 장(16 예외처리)의 예제에서 ArithmeticException 클래스도 이렇게 살펴보면 다음과 같은 상속 구조를 가지고 있는 것을 확인할 수 있습니다.

![346_exception_hierachy](https://github.com/user-attachments/assets/c8e1da14-7258-482f-a525-e70ba1bc5132)

이처럼 모든 클래스가 Object 클래스를 상속받았으므로 Object 클래스의 메서드를 사용할 수 있고, 재정의할 수도 있고, Object형으로 형변환도 할 수도 있습니다.

Object 클래스의 메서드는 다음과 같습니다. 상속 계층을 보여주는 창에서 Object를 선택하면 메인 창에 정의된 메서드들이 보입니다. 

![347_object_class_method](https://github.com/user-attachments/assets/1fb4dc8e-3ea5-459f-8371-970bdaf13a2b)

다음은 Object 클래스의 주요 메서드입니다. 

| 메서드 | 설명 | 
|:---|:---|
| public String toString() | 객체의 문자 정보를 반환합니다. |
| public boolean equals(Object obj) | 두 객체가 동일한지 여부를 반환합니다. | 
| public int hashcode() | 객체의 해시 코드를 반환합니다. | 
| public Object clone() | 객체의 사본을 생성합니다. | 

Object 클래스의 메서드 중에는 재정의할 수 있는 메서드도 있고, 그렇지 않은 메서드도 있습니다. 여기서는 자주 재정의하여 사용하는 메서드 두 개만 살펴보겠습니다. 
