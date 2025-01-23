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

### 2-1. toString() 메서드
Object 클래스에 정의되어 있는 toString() 메서드의 원형은 다음과 같습니다. 
```
public String toString() {
    return getClass().getName() + "0" + Integer.toHexString(hashCode());
}
```

생성된 객체의 클래스명과 해시 코드를 보여줍니다. 이 메서드는 메서드의 원형 그대로 사용하는 것은 의미가 없고, 보통은 객체 정보를 String으로 바꿔서 사용할 때 많이 사용됩니다. 우리가 자주 사용하는 String 클래스에는 이미 오버라이딩하여 재정의를 해놓고 있습니다. String 클래스는 클래스명과 해시 코드를 보여주는 대신 안에 들어 있는 문자열 내용을 반환해줍니다. 

예제를 통해서 살펴보겠습니다. 

![348_toString_example1](https://github.com/user-attachments/assets/21c7fe91-b943-4c1f-877a-97452ed915e0)

System.out.println() 메서드는 매개변수로 들어오는 객체의 toString() 메서드를 내부적으로 호출해서 반환받는 값을 출력해줍니다. 즉, 오버라이딩으로 미리 재정의되어 있지 않았다면 상속 받았던 원형 그대로 toString() 메서드가 호출되고, 그 결과로 객체의 클래스명과 해시 코드를 출력합니다. 

그러나 String 클래스는 오버라이딩으로 미리 재정의가 되어 있었기에 다음과 같은 결과를 출력합니다. 

![349_toString_example1_result](https://github.com/user-attachments/assets/759de717-00d7-44f9-a443-f6db8258c646)

비교를 위해 우리가 만든 객체를 출력해보겠습니다. 예제에 다음과 같이 작성하고 실행합니다. 

![350_toString_example2](https://github.com/user-attachments/assets/4683ab39-87ac-42ad-b7dd-f95ed4f748c8)
![351_toString_example2_result](https://github.com/user-attachments/assets/3f8664e5-2429-4b14-8160-191f548792cb)

`1번`우리가 만든 클래스를 이용하여 객체를 생성합니다. `2번`참조 변수의 맴버 변수의 값을 출력합니다. `3번`객체 자체를 출력합니다. 

`3번`에서 System.out.println() 메서드는 객체 자체가 매개변수로 주어졌기 때문에 객체 안의 toString() 메서드를 찾습니다. 재정의된 메서드가 아니고 상속받은 그대로의 원형이 있기 때문에 클래스명과 해시 코드가 출력될 겁니다. 

String 클래스의 경우와 마찬가지로 우리 객체를 출력할 때 지금처럼 **클래스명@해시 코드** 대신 그 안의 author 변수의 값을 출력하고 싶습니다. 

이럴 때 Object 객체의 toString() 메서드를 오버라이딩으로 재정의하여 사용하면 됩니다. 

![352_toString_example3](https://github.com/user-attachments/assets/70f7ea2f-67d4-4299-aba6-0b67358ffeed)
![353_toString_example3_result](https://github.com/user-attachments/assets/1fd0add5-6fe9-4148-b90c-0b077ec21e73)

`1번`toString() 메서드를 오버라이딩하여 author 변수의 값을 반환하도록 재정의합니다.

`2번`참조 변수를 이용하여 객체의 맴버 변수의 값을 가져와서 출력합니다. `3번`참조 변수를 이용하여 객체 자체를 출력합니다. 

이제는 System.out.println() 메서드에 매개변수로 객체 자체를 넘겨도 객체가 가지고 있는 문자열이 출력됩니다. 


