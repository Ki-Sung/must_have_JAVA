# 09 클래스의 기초
- 자바는 객체지향 언어입니다. 프로그램을 단순히 데이터와 처리 방법으로 나누는 것이 아니라, '객체'라는 기본 단위로 나누고 객체의 상호작용으로 프로그래밍하는 방식입니다. 자바에서 객체를 만들려면 반드시 클래스를 먼저 만들어야 합니다.

## 1. 객체
먼저 객체를 간단히 정의내리면, 우리가 표현할 수 있는 실제 세계의 모든 사물들을 객체(Object)라고 합니다. 객체는 소프트웨어 분야에서만 사용하는 한정된 용어가 아닙니다. 

<img width="657" alt="115_object_example" src="https://github.com/user-attachments/assets/1e5607c6-625a-41a3-8b84-c41cf6f1205a">

이러한 객체는 눈에 보이고 만져지는 '물리적인 객체'와 보이지 않고 만져지지 않는 '개념적인 객체'로 나눌 수 있습니다.

| 개념적인 객체 | 물리적인 객체 |
|:---|:---|
| 동물 | 개, 고양이, 호랑이, 곰 |
| 자동차 | 소나타, K5, 아반떼 |

## 2. 클래스
클래스란, 간단히 말하면 프로그래밍에서 객체와 관련된 데이터와 처리 동작을 한데 모은 코드 뭉치 입니다. 그런데 현실 객체를 프로그래밍에서 전부 묘사하기에는 데이터와 처리 동작이 너무 많습니다. 그래서 어느 정도 특징적인 데이터와 동작으로 추려낼 필요가 있습니다. 이렇게 특징적인 데이터와 처리 동작을 추려내는 과정을 **추상화(abstraction)** 라고 부릅니다.

객체지향 프로그래밍에서 추상화는 객체에서 특징적인 속성과 행위를 추출하는 과정을 의미하는데, 같은 대상으로 추상화를 하더라도 목적이나 원하는 기능에 따라 여러 추상화 모델이 생성될 수 있습니다. 

<table>
    <tr>
        <th style="text-align: left;">객체</th>
        <th style="text-align: left;">목적 구분</th>
        <th style="text-align: left;">객체 구분</th>
        <th style="text-align: left;">추상화된 클래스 모델</th>
    </tr>
    <tr>
        <td rowspan="3">탈 컷</td>
        <td>개인, 이륜</td>
        <td>자전거, 오토바이</td>
        <td>Bike</td>
    </tr>
    <tr>
        <td>자동차</td>
        <td>승용차, 버스, 트럭</td>
        <td>Car</td>
    </tr>
    <tr>
        <td>운송 수단</td>
        <td>자동차, 배, 비행기</td>
        <td>Vehicle</td>
    </tr>
</table>

추상화 모델이 결정되고 객체를 추상화(일반화)할 때 다음과 같은 추상화 작업을 가지게 됩니다.
- 명사적인 특징을 뽑아내는 추상화 과정 &rarr; 맴버 변수(필드) 추출
- 동사적인 특징을 뽑아내는 추상화 과정 &rarr; 맴버 함수(메서드) 추출

추상화를 거친 클래스 예제 코드를 살펴보겠습니다. 

![116_class_structure](https://github.com/user-attachments/assets/42950965-e202-407a-9c23-eec3bf5654c4)

이렇게 어떤 객체를 "1번" 자바 클래스 파일에 "2번" 데이터 필드로, "3번" 동작은 메서드로 추상화해서 기술하는 것을 '클래스를 정의한다'라고 말합니다.

더 자세한 클래스 구조는 다음과 같습니다. 

![117_class_structure_2](https://github.com/user-attachments/assets/d7afba00-27dd-4cf2-8a57-a16321913466)

## 3. 객체와 클래스 
클래스는 객체를 프로그래밍에서 사용하려고 추상화해서 기술해놓은 설계도입니다.

그러므로 프로그래밍에서 사용하려면 설계도를 기초로 실체를 만들 필요가 있습니다 실체화된 것을 객체(Object)라고 하며, 실체화하는 작업을 '객체(Object)를 생성한다' 또는 '인스턴스화 한다(instantiate)' 등으로 말합니다. 

소프트웨어 세계에서 객체는 클래스라는 설계도대로 구현한 것을 메모리에 탑재해 메모리 주소를 부여한 것을 의미합니다. 

|  | 설계도 |  | 객체 생성(인스턴스화) |  | 실물 |
|:---|:---|:---|:---|:---|:---|
| 실생활 | 자동차 설계도 | &rarr; | 공장 | &rarr; | (생상된) 자동차 |
| 프로그래밍 | 클래스 | &rarr; | new | &rarr; | (메모리에 적재된) 값 |

실제로 클래스를 객체로 만드는 코드는 아래와 같습니다.

<img width="981" alt="118_class_to_obejct" src="https://github.com/user-attachments/assets/05756352-e605-4a37-90f1-1698cc32e7ea">

`myBook`이라는 변수를 만드는데 변수의 자료형을 `Book`이라는 클래스형으로 합니다. 그리고 `Book` 클래스의 `Book()` 생성자를 이용해서 `new`해서(새로 만들어서) 생성된 객체를 메모리에 적재하고 변수 `myBook`에 대입시킵니다. 

기본 자료형의 변수를 만들 때와 비교해봅시다. 

<img width="998" alt="119_basic_datatype_variable" src="https://github.com/user-attachments/assets/d9c74c9c-1dba-4b12-8344-7ef12288bd14">

`num`이라는 변수를 만드는데 변수의 자료형을 기본 자료형인 `int`형으로 합니다. 그리고 상수 풀에서 5를 복사해서 변수 `num`에 대입시킵니다. 

상수야 이미 알고 있던 것이니 미리 상수 풀에 만들어놓을 수 있었지만, `Book`이라는 클래스를 모든 프로그래머가 아는 것도 아니고 사용하는 것도 아니니 필요한 프로그래머가 `new`로 새로 객체를 만들어서 사용해라 정도의 의미로 생각하면 됩니다. 

간단하게 에제를 만들어 확인해보겠습니다. 

#### To Do 1 - 프로젝트를 Chapter09_1 이름으로 만듭니다.
#### To Do 2 - NpcUse 클래스를 추가합니다.
#### To Do 3 - NpcUse.java 파일을 열고 새로운 클래스를 하나 더 추가합니다. 새로운 클래스 추가는 직접 코드를 타이핑해 입력합니다.

<img width="1133" alt="120_chapter09_1_example" src="https://github.com/user-attachments/assets/ba88987b-0fde-475f-9556-b3e6ffce3571">

#### To Do 4 - 아직 내용은 없지만 우리가 해당 프로젝트를 실행하려면 명렁 프롬프트에 아래와 같이 입력합니다.
```
java NpcUse
```
실제로 인텔리제이를 사용하면 실행 버튼만 클랙해서 확인해도 되지만, 실제제 사용을 할 때는 위와 같이 명령어를 입력합니다. 이렇게 입력하고 `enter`를 치면 자바는 java.exe를 실행시켜 자바 가상 머신을 만들고 NpcUse라는 클래스를 찾습니다. 그리고 그 안에 있는 `main()`을 실행시킵니다. 

이것이 실제 자바 프로그램이 실행되는 순서입니다. 그러므로 `.java` 파일의 이름과 `main()`이 들어있는 클래스명은 똑같아야 합니다. 

그리고 지금처럼 `.java` 파일 하나에 다른 class도 추가해줄 수 있습니다. `main()` 메서드만 파일 이름과 같은 class 안에 존자하면 됩니다.

`.java` 파일을 저장하면 인텔리제이가 자동으로 컴파일을 한다고 했습니다. `.java` 파일이 하나이더라도 작성한 클래스 개수만큼 `.class` 파일이 생성되는 것을 확인할 수 있습니다.

<img width="376" alt="121_class_compile" src="https://github.com/user-attachments/assets/e10050ab-6be7-49fe-bb38-7ecc3a697115">

#### To Do 5 - 이제 클래스의 내용을 작성합니다. 
<img width="1017" alt="122_class_example_code" src="https://github.com/user-attachments/assets/0359bbd2-b1cb-42c7-8837-1d64fc656ce9">

"1번" Npc 클래스를 정의합니다. "2번" Npc 클래스에서 데이터로 사용할 필드를 정의합니다(어떤 변수에 어떤 데이터 타입을 넣을지). "3번" Npc 클래스에서 기능으로 사용할 메서드를 정의합니다.

"5번" 자료형이 Npc 클래스형인 `saram1` 변수로 만듭니다. "6번" 객체의 필드는 `.(dot)`을 이용하여 접근합니다. 객체의 맴버 변수 `name`에 값을 대입합니다. "7번" 객체의 맴버 변수 `hp`에 값을 대입합니다. "8번" 객체의 맴버 변수에 대입된 값을 출력합니다. 

"9번" 객체의 메서드를 호출해 기능을 동작시켜봅니다. 

객체의 맴버 변수와 메서드의 사용법은 우리가 계속 사용해왔던 변수 사용법과 같습니다. 앞에 객체의 변수명과 `.`을 입력하고 그 뒤에 맴버들을 불러주면 됩니다.

int형의 변수를 얼마든지 만들 수 있듯이 해당 예제에서 Npc 클래스형의 변수도 필요한 만큼 만들 수 있습니다. 이렇게 만들어진 객체들은 설계도만 같지 각각 만들어져 서로 다른 메모리에 저장됩니다. 

그리고 Npc 클래스의 메서드에는 `static`이 없습니다. 우리가 그동안 만든 메서드에는 `static`이 붙어 있었습니다. 이렇게 `new`를 통해 새로 만들어지는 객체에서 사용하는 메서드에는 `static`을 붙이지 않습니다. 

#### To Do 6 - 프로그램을 실행해봅니다.
<img width="941" alt="123_class_example_result" src="https://github.com/user-attachments/assets/3e7424a0-292b-48e4-9f83-564808f8be23">

- 참고: 클래스는 메서드만 가지고 있을 수도 있고, 필드만 가지고 있을 수도 있습니다. 필드만 가지고 있을 경우 데이터 저장용으로 많이 사용됩니다.

여기까지 정리하면 다음과 같습니다.
1. 객체 생성에 `new`연산자를 사용합니다.
2. 다른 객체의 맴버에는 `.(dot)`을 이용하여 접근합니다.

## 4. 오버로딩 
오버로딩(Overloading)이란 하나의 클래스 내에 매개변수 개수나 자료형은 다르지만 메서드명이 같은 메서드를 여러개 정의하는 것을 말합니다. 동일하거나 유사한 일을 수행하는 메서드가 전달받는 매개변수에 따라 각기 다른 연산을 하는 경우 유용합니다. 

아래의 예제를 통해 오버로딩이 어떻게 사용되는지 살펴보겠습니다.

![124_overloading_example](https://github.com/user-attachments/assets/03714cf5-b3a3-4e15-aa77-79280bded492)
![125_overloading_result](https://github.com/user-attachments/assets/449b3f34-d34a-4fec-94b1-af5da8ab113f)

`Calc`클래스는 다양한 더하기 기능을 구현해놓은 클래스입니다. 그런데 모든 메서드명이 `add()`로 똑같습니다. 매개변수 개수가 다르거나, 매개변수 자료형이 다를 뿐입니다.

"1번" 자료형이 `Calc` 클래스형인 `calc` 변수로 만듭니다(객체 선언).
"2번" 객체의 `add()` 메서드를 호출합니다. 매개변수 두 개가 int형 입니다.
"3번" 객체의 `add()` 메서드를 호출합니다. 매개변수 한 개가 int형 입니다.
"4번" 객체의 `add()` 메서드를 호출합니다. 매개변수 두 개가 double형 입니다.

int를 더하나 double을 더하나 둘 다 같은 더하기 입니다. 여기서 메서드명을 `add`로 하고 싶은데 같은 이름이라 불가능하다면 메서드명을 짓기가 매우 불편해집니다. 실제로 이것이 불가능한 C 언어에서는 `add()`기능을 하는 함수를 `add_int()`, `add_doulbe()`처럼 짓습니다. 유사한 일을 수행하는 메서드마다 구분되는 메서드명을 각각 정의하는 것은 생각보다 쉽지 않습니다. 

이렇게 자바에서는 메서드명과 매개변수까지 합쳐서 메서드를 구분해줍니다(메서드명과 매개변수를 합쳐서 시그니처(signature)라고 합니다). 그렇기 때문에 같은 이름의 메서드를 사용할 수 있는 겁니다. 우리가 이미 잘 사용하고 있던 메서드 중에 오버로딩이 적용되어 있던 메서드가 있습니다. 
```
System.out.println();          // 매개변수 없이 줄바꿈만 출력 
System.out.println(1);         // 정수값 출력 
System.out.println("홍길동");    // 문자열 출력 
```

## 5. 생성자
생성자(constructor)란 객체 생성을 할 때만 호출하는 특수한 메서드 입니다. new 연산자가 객체의 생성자를 이용하여 객체를 생성해줍니다. 

<img width="981" alt="118_class_to_obejct" src="https://github.com/user-attachments/assets/e147483e-2d2c-4eb3-ae5b-869528019294">

생성자의 특징은 다음과 같습니다. 
- 생성자명은 클래스명과 동일합니다.
- 메서드이지만 반환형이 없는 형태입니다.

그리고 클래스를 정의할 때 생성자를 기술하지 않으면 매개변수가 없는 생성자가 자동으로 만들어집니다. 이것을 디폴트 생성자라고 합니다.

디폴트 생성자는 다음과 같은 특징을 가집니다. 
- 생성자명이 클래스명과 동일합니다.
- 메서드이지만 변환형이 없습니다.
- 매개변수가 없습니다.
- 특별히 수행하는 기능도 없습니다.

![126_defualt_constructor](https://github.com/user-attachments/assets/b47920a4-0e92-4e38-b939-c281f8b612c9)

디폴트 생성자는 이와 같은 특성 때문에 프로그래머가 굳이 정의하지 않아도 컴파일러가 클래스명만 보고 자동으로 만들어줄 수 있습니다. 그래서 디폴트 생성자는 보통 생략하고 만드는 경우가 많습니다. 

그런데 앞서 언급했던 오버로딩의 대표적인 예가 바로 생성자입니다. 생성자의 오버로딩을 이용하면 클래스의 객체 변수가 만들어질 때 다양한 방식으로 변숫값을 초기화할 수 있습니다.

다음 예제 코드를 살펴보겠습니다. 

![127_constructor_example_code](https://github.com/user-attachments/assets/e5280764-e696-43c8-9a88-9fd371ac7f30)
![128_constructor_example_code_result](https://github.com/user-attachments/assets/46c9c89a-b12f-4524-9150-8aa0e57a68ea)

"1번" 자동으로 생기는 생성자에는 아무런 기능이 없으므로 직접 만들고 코드처럼 객체가 생성될 때 변수에 값을 대입하여 초기화해줍니다.

"2번" 생성자를 오버로딩해서 매개변수가 있는 생성자를 만듭니다. "3번" 매개변수로 값을 받아 맴버 변수의 값을 초기화해줍니다. 

"4번" 맴버 변수의 값을 출력해주는 메서드를 만듭니다.

"5번" 디폴트 생성자와 new 연산자를 이용하여 객체를 만듭니다. "6번" 오버로딩된 생성자와 new 연산자를 이용해서 객체를 만듭니다. 이때 생성자의 매개변수로 값을 넘겨 생성되는 객체의 맴버 변수의 값을 초기화할 수 있습니다. "7번" 객체의 맴버 변수에 직접 값을 대입합니다. "8번" 객체의 메서드를 호출합니다.

주의할 점이 있습니다. 매개변수가 있는 생성자를 오버로딩해서 만들면 디폴트 생성자가 자동으로 만들어지지 않습니다. 생성자를 오버로딩해서 만들고, 디폴트 생성자는 만들지 않았을 때 다음과 같이 객체를 생성하면 에러가 발생합니다.

이럴 때는 디폴트 생성자에 아무 기능이 없더라도 디폴트 생성자도 꼭 명시적으로 만들어주어야 합니다. 

## 6. 접근 제한자
앞의 예제에서 `ConstructorUse`클래스에서 `Book`클래스의 맴버 변수나 메서드에 대해서 별다른 제한 없이 .(dot)을 이용해 접근해서 사용했습니다. 

![129_use_dot_contact_class](https://github.com/user-attachments/assets/060e9275-bada-47c2-9e0f-cdf235ce5987)

그러나 변수나 메서드에 접근 제한자를 지정하면 이런 접근을 제한할 수 있습니다. 자바에서 사용하는 접근 제한자를 정리하면 다음과 같습니다.

| 접근 제한자 | 설명 | 
|:---|:---|
| public | 퍼블릭. 외부 클래스 어디에서나 접근 가능 |
| protected | 프로텍티드. 같은 패키지\* 내부와 상속 관계의 클래스에서만 접근 가능 |
| (아무것도 표시 안 함) | 디폴트. 같은 패키지 내부에서만 접근 가능 |
| private | 프라이빗. 같은 클래스 내부에서만 접근 가능 |

&#8251; 여기서 패키지는 클래스가 위치한 폴더라고 해석해도 됩니다.

이렇게 private를 적용하면 클래스 외부에서 클래스 내부로의 변수와 메서드에 대한 접근을 제한할 수 있습니다. 이러한 것을 객체지향 프로그래밍에서 정보 은닉화(information hiding)라고 부릅니다. 

그런데 private으로 맴버 변수 접근 제한을 했더라도 해당 맴버 변수를 사용할 수 있는 메서드를 제공해서 프로그램 의도에 맞게 맴버 변수의 값을 사용하도록 유도할 수도 있습니다. private 맴버 변수에 값을 대입하는 메서드를 세터(setter), 값을 가져오는 메서드를 게터(getter)라고 부릅니다. 

접근 제한자를 이용한 정보 은닉, 그리고 getter, setter를 이용한 올바른 값의 전달을 코드로 살펴보겠습니다. 

![130_private_example_code](https://github.com/user-attachments/assets/725666b1-1abc-401f-9b97-7f87c6888af0)
![131_private_example_code_result](https://github.com/user-attachments/assets/19368515-cc8b-4d18-b1a3-cbe6ebeedbc2)

"1번" `Student1`클래스의 맴버 변수는 접근 제한자가 따로 지정되지 않았기 때문에 접근 제한 상태는 `default` 상태입니다. 같은 패키지(폴더)안의 클래스에서 언제든지 변수에 접근하여 사용할 수 있습니다. 

"2번" `Student2`클래스의 `name`변수는 `public`으로, `age`변수는 `private`으로 접근 제한자를 지정했습니다. "3번" `age` 변수는 다른 클래스에서 접근할 수 없기 때문에 변수의 값을 다른 클래스에서 가져갈 수 있게 "4번"에서 getter로 `getAge()`메서드를 제공해주고 있습니다.

"5번"에서 값을 대입하는 `segAge()` 메서드를 제공해주고 있습니다. 

이렇게 getter, setter를 지정하여 변수에 접근하는 이유는 값 대입 시 부적절한 값의 대입을 막기 위함입니다. 이 예제의 코드에서도 "6번"에서 부적절한 나이를 대입하지 못하게 체크합니다. getter도 필요시 변수의 값을 바로 전달하지 않고 가공하여 전달할 수 있는 장점이 있습니다.

`Student2`클래스에서 생성자나 getter, setter 등의 메서드에서 `this`를 사용합니다. 

![132_use_this](https://github.com/user-attachments/assets/213d22d4-4c06-42e8-9f0c-d74b0dc2ddcd)

앞서 공부한 오버로딩에서 메서드명을 지을 때도 보았지만, 유사한 의미로 사용되는 변수마다 이름을 각각 정의하는 것은 생각보다 쉽지 않습니다. 그래서 보통은 같은 이름을 사용하는데 맴버 변수임을 구분해주기 위해 `this`를 사용합니다. 

위 코드의 `public Student2(String name, int age)` 생성자의 매개변수와 클래스의 맴버 변수명이 같습니다. 생성자 안에서 이름이 서로 겹칩니다. 그래서 `this` 지시어를 붙여 클래스의 맴버 변수임을 표시해 구분했습니다.

"7번"에서 생성한 `student1` 객체 변수의 맴버 변수는 접근 제한자가 특별히 지정되지 않았기 때문에 `default` 상태라 접근이 가능합니다. 그래서 "8번"과 "9번"에서 .(dot) 연산자를 통해서 직접 접근해 값을 대입합니다. 이렇게 맴버 변수로의 직접 접근을 허용하면 "9번"에서처럼 부적절한 값이 대입될 수 있습니다. 하지만 컴파일 과정에서 에러는 발생하지 않습니다. 논리적으로 부적절한 값이지 int형 변수에 정수를 대입한 것이 잘못은 아니기 때문입니다. 

따라서 직접 접근을 허용하지 않도록 클래스를 설계할 필요가 있습니다. 모든 변수를 `private`으로 선언해야 하는 것은 아니지만, 필요한 경우에는 `private`으로 선언하고 getter, setter를 활용해 오류를 막을 수 있습니다. 이러한 클래스 설계를 가리켜 '정보 은닉'이라 합니다. 

"10번"에서 맴버 변수에 값을 직접 대입하고 있습니다. `name`은 `public`으로 지정되어 있기 때문에 가능합니다. "11번"에서는 직접 대입하면 에러가 발생합니다. `age`는 `private`으로 지정되어 있기 때문입니다. 그래서 "12번"처럼 setter를 사용해서 값을 대입합니다. 그런데 부적절한 값이라 "6번"에서 걸러집니다. 메시지를 출력하고 0으로 강제 대입됩니다. 그래서 "13번" 실수로 -10을 대입하면 에러를 발생시키지 않고 0을 출력합니다. 

### 마무리 - 핵심 요약 
1. 클래스란 프로그래밍에서 객체와 관련된 데이터와 처리 동작을 한데 모은 코드 뭉치입니다.
2. 실체화된 클래스를 객체(Object)라고 하며, 실체화하는 작업을 '객체(Object)를 생성한다' 또는 '인스턴스화한다'고 말합니다.
3. 추상화란 실제 객체로부터 특징적인 데이터와 처리 동작을 추려내는 과정입니다.
4. 오버로딩이란 하나의 클래스 내에 매개변수 개수나 자료형은 다르지만 메서드명은 같은 메서드를 여러개 정의하는 것을 말합니다.
5. 클래스에서 접근 제한자는 변수나 메서드에 접근을 제한합니다.
6. `private` 접근 제한자를 적용하면 클래스 외부에서 클래스 내부로의 변수와 메서드에 대한 접근을 제한할 수 있습니다. 이러한 것을 객체지향 프로그램에서 '정보 은닉화'라고 합니다.
