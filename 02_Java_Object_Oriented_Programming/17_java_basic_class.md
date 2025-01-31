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
|Class | 실행 중에 클래스 정보를 제공합니다. |

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

### 2-2. equals() 메서드 
Object 클래스에 정의되어 있는 equals() 메서드 원형은 다음과 같습니다. 
```
public boolean equals(Object obj) {
    return (this == obj);
}
```

자신과 매게변수로 들어온 객체의 주솟값 자체를 비교하여 같은지 아닌지를 반환합니다. 

이러면 참조하고 있는 변수의 id(주솟값)끼리 비교가 됩니다. 이 메서드도 메서드의 원형 그대로 사용하는 것은 의미가 없고, 보통은 오버라이딩으로 재정의하여 객체 안 변수의 값끼리 비교하는데 많이 사용됩니다. 

![354_equals_example1](https://github.com/user-attachments/assets/66286b4f-8889-4013-a29c-d1519ca39495)
![355_equals_example1_result](https://github.com/user-attachments/assets/555ac191-86f7-407f-bc9e-2bd46ec1debe)

`1번`새로운 객체를 만들고 변수에 대입합니다. 

`2번`새로운 객체를 만들고 변수에 대입합니다.

`3번`두 객체를 비교합니다. Book5 클래스에는 equals 메서드가 재정의되어 있지 않기 때문에 Object 메서드에서 상속받은 그대로 사용하게 됩니다. 그 결과 주소 비교를 하게 되고 둘은 서로 다른 주소에 생성된 객체이기 때문에 false를 반환합니다. 

이제 우리가 비교해보고 싶은 내용 비교를 할 수 있도록 다음과 같이 equals() 메서드를 오버라이드해서 재정의하고 다시 실행해봅시다. 예제는 새로 만듭니다. 

![356_equals_example2](https://github.com/user-attachments/assets/b37dca81-7935-4bdc-ac48-0b433d83af8d)
![357_equals_example2_result](https://github.com/user-attachments/assets/55330f3b-b0ca-4f7a-bd2d-c36f553b7178)

`1번`Object 클래스의 equals() 메서드를 오버라이드하여 Book6 클래스 안의 author 변수의 값을 비교하도록 오버라이드로 재정의했습니다. 

`2번`이제 equals() 메서드는 객체의 주소를 비교하는 것이 아니고 객체 안에 들어 있는 String 변수의 가ㅓㅂㅅ을 비교하여 그 결과를 반환합니다.

## 3. 래퍼 클래스
자바는 기본 데이터형(정수형, 문자형, 논리형)에 대응하는 클래스를 마련해놓았습니다. 이 클래스들은 래퍼 클래스(wrapper class)라고 합니다. 래퍼 클래스란 기본 자료형에 대해서 객체로서 인식되도록 '포장'을 했다는 뜻입니다. 이때 단순히 객체화만 한 것이 아니고 다양한 메서드도 추가했습니다. 

| 메서드 | 설명 | 
|:---|:---|
| boolean | Boolean |
| byte | Byte | 
| char | Character | 
| int | Integer | 
| long | Long | 
| float | Float | 
| double | Double |

기본 자료형 대신 래퍼 클래스를 사용하는 이유는 다음과 같습니다.
- 클래스가 제공하는 편리한 메서드 사용(값 변환, 형 변환, 진법 변환)
- 클래스가 제공하는 상수 사용(MIN_VALUE, MAX_VALUE)
- 메서드 매개변수의 형이 Object여서 기본 자료형을 사용 못하고 클래스 형태인 래퍼로 남겨야 할 때 사용(컬렉션 프레임워크)

### 3-1. Number 클래스 
java.lang.Number 클래스는 모든 수치형 래퍼 클래스가 상속하는 추상 클래스입니다. 그래서 Number 클래스를 상속한 래퍼 클래스는 모두 다음의 추상 메서드가 다 구현이 되어 있습니다. 
- byteValue()
- shortValue()
- intValue()
- longValue()
- floatValue()
- doubleValue()

수치형 래퍼 클래스인 Byte, Short, Integer, Long, Float, Double에서 이 메서드들을 사용하면 다른 형으로 변환한 값을 얻을 수 있습니다. 즉 래퍼 객체에 저장된 값을 원하는 기본 자료형 값으로 변환할 수 있습니다. 

수치형을 다른 수치형 자료로 형변환하는 메서드를 사용해봅시다. 

![358_number_class_example](https://github.com/user-attachments/assets/fde6cd12-789d-4fcc-af25-ebba9ef8c474)
![359_number_class_example_result](https://github.com/user-attachments/assets/1cfe945a-7e06-4e8e-8b15-dbceec1cb4b4)

자바 4까지는 `1번`처럼 생성자에 기본 데이터형의 값 또는 변수를 매개변수로 받았습니다(Integer() 생성자는 디프리케이트(더 이상 사용하지 않음)되었습니다).

자바 5부터는 `2번`처럼 클래스의 스태틱 메서드를 이용합니다. `3번`래퍼 클래스의 객체는 지정된 값을 원하는 기본 자료형값으로 변환할 수 있습니다. 

### 3-2. 문자열 변환 
수치형의 래퍼 클래스인 Byte, Short, Integer, Long, Float, Double에는 각각 문자열을 수치형으로 변환하는 메서드가 있습니다. 

| 클래스 | 메서드 | 기능 | 
|:---|:---|:---|
| Byte | parseByte() | 문자열을 byte형으로 변환 |
| Short | parseShort() | 문자열을 short형으로 변환 |
| Integer | parseInt() | 문자열을 int형으로 변환 |
| Long | parseLong() | 문자열을 long형으로 변환 |
| Float | parseFloat() | 문자열을 float형으로 변환 |
| Double | parseDouble() | 문자열을 double형으로 변환 |

문자열을 수치형으로 형변환하는 메서드를 사용해봅시다.

![360_parse_xxx_example](https://github.com/user-attachments/assets/7bc936cb-66a5-4446-9077-c42a075f340b)
![361_parse_xxx_example_result](https://github.com/user-attachments/assets/ca636085-5ef7-4eb6-8b60-c8cec69dac79)

`1번`문자열을 int형으로 변환합니다. `2번`문자열을 double형으로 변환합니다.
##### `Tip` 클래스명, 메서드명을 사용하고 있기 때문에 parseInt는 스태틱 메서드 입니다. 그리고 이 메서드와 try ~ catch문을 이용하면 예전 프로젝트에서, 입력받은 내용이 숫자인지 검사하는 로직도 아주 간단하게 구현할 수 있습니다. 

### 3-3. 오브젝트의 비교 
래퍼 클래스의 오브젝트끼리 비교하려면 == 대신 equals() 메서드를 사용해야 합니다. 모든 래퍼 클래스의 equals() 메서드는 객체 안의 기본형 데이터를 비교하는 것으로 메서드의 기능이 재정의 되어 있습니다. 
```
Integer a = new Integer(10);
Integer b = new Integer(20);
boolean c = a.equals(b);
```

오브젝트들의 형과 값이 동일하면 true를 반환합니다. 

### 3-4. 다양한 static 메서드들 
래퍼 클래스에는 유용한 메서드들이 다양하게 구현되어 있습니다. 
![362_util_method_example](https://github.com/user-attachments/assets/ccc7a5bd-b83d-49bc-ae4b-0b172a343bff)
![363_util_method_example_result](https://github.com/user-attachments/assets/564e9b33-5a32-4e48-96cd-501a35da6ea5)

`1번`은 메서드의 오버로딩 입니다. 같은 메서드명인데 매개변수가 다릅니다. 이렇게 다양한 형태의 데이터로 래퍼 클래스의 객체를 만들 수 있습니다.

`2번`둘 중의 큰수를 구합니다. `3번`들 중에 작은 수를 구합니다. `4번`두 수의 합을 구합니다. 

`5번`정수를 2진수로 표현합니다. `6번`정수를 8진수로 표현합니다. `7번`정수를 16진수로 표현합니다.

