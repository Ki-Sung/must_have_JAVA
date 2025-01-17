# 16 예외 처리
- 컴파일 오류는 없었지만, 프로그램 실행 시에 에러가 발생할 수 있습니다. 그리고 에러의 발생으로 프로그램이 비정상적으로 종료될 수도 있습니다. 
- 자바에서는 이런 상황을 예외 상황이라 하고 이를 처리하기 위한 예외 처리 방법을 제공합니다.

## 1. 예외와 에러 
우리가 프로그래밍을 할 때 코드에 문법적 오류가 있다면 InteliJ(혹은 다른 IDE)에서 바로 확인이 되거나 컴파일시에 에러가 발생하기 때문에 개발자가 해당 에러를 고칠 수 있습니다. 컴파일 에러는 개발 환경에서 대부분 오류 처리를 하게 됩니다. 그래야 컴파일이 되니까요. 그런데 컴파일 시에는 에러가 발생하지 않았지만 실행 중에 에러가 발생할 수도 있습니다. 예를 들면 나누기인데 사용자가 나누는 수로 0을 입력한 경우입니다. 이렇게 에러는 컴파일 에러(compile error)와 런타임 에러(runtime error)가 발생할 수 있습니다. 

![316_exception_structure](https://github.com/user-attachments/assets/1722cfa5-c494-4a00-9865-ec8540afebf7)

프로그램 실행 중에 발생하는 런타임 에러는 자바 가상 머신에서 발생하는 시스템 에러로 예측하기 어려운 경우도 있고, 반면에 예측할 수 있는 것도 있습니다. 시스템 에러는 사용 가능한 메모리가 부족하다거나, 운영체제에서 발생한 에러로 프로그램이 영향을 받게 되는 경우입니다. 이러한 시스템 에러는 개발자가 프로그램에서 제어할 수 없습니다. 

예측이 가능한 런타임 에러를 예외(exception)라고 부릅니다. 그리고 개발자가 다음과 같은 목적을 위해 제어하고 처리를 합니다. 

1. 프로그램 정상 종료
2. 예외 발생 시 무시하고 프로그램 계속 실행

자바에서 제공하는 에러에 대한 전체 클래스를 간단히 나타내면 다음과 같습니다. 프로그램에서 처리하는 예외 클래스의 최상위 클래스는 Exception 클래스 입니다. 그리고 모든 예외 타입은 클래스로서 서로 상속 관계입니다.

![317_exception_structure2](https://github.com/user-attachments/assets/017e53c9-249a-4bf6-af95-4648fd717701)

## 2. 예외 종류 
예외는 다음과 같이 실행 예외와 일반 예외로 한번 더 구분됩니다. 
- 실행 예외
  - 예외 처리를 하지 않아도 컴파일할 수 있는 비검사형 예외(unchecked exception)
  - 실행 단계에서 체크
- 일반 예외
  -  예외 처리를 하지 않으면 컴파일 오류가 발생하므로 꼭 처리해야 하는 검사형 예외(checked exception)
  -  컴파일 단계에서 체크
 
이처럼 예외를 구분하는 이유는 프로그램 성능 때문입니다. 모든 상황에서 예외 처리를 하면 프로그램의 성능 저하 문제로 이어지기 때문에 일반 예외는 컴파일러가 확실히 확인하고, 실행 예외는 개발자가 판단하여 예외를 처리하든지 처리가 안 되었다면 자바 가상 머신에 처리를 맡기게 됩니다. 

- 대표적인 실행 예외

| 실행 예외 | 발생 이유 | 
|:---|:---|
| ArtithmeticException | 0으로 나누기와 같은 부적절한 산술 연산을 수행할 때 발생합니다. |
| IllegalArgumentException | 메서드에 부적절한 매개변수를 전달할 때 발생합니다. | 
| IndexOutOfBoundException | 배열, 벡터 등에서 범위를 벗어난 인덱스를 사용할 때 발생합니다. | 
| NoSuchElementException | 요구한 원소가 없을 때 발생합니다. | 
| NullPointerException | null값을 가진 참조 변수에 접근할 때 발생합니다. | 
| NumberFormatException | 숫자로 바꿀수 없는 문자열을 숫자로 변환하려 할 때 발생합니다. | 

- 대표적인 일반 예외

| 일반 예외 | 발생 이유 | 
|:---|:---|
| ClassNotFoundException | 존재하지 않는 클래스를 사용하려고 할 때 발생합니다. | 
| NoSuchFieldException | 클래스가 명시한 필드를 포함하지 않을 때 발생합니다. | 
| NoSuchMethodException | 클래스가 명시한 메서드를 포함하지 않을 때 발생합니다. | 
| IOException | 데이터 읽기 쓰기 같은 입출력 문제가 있을 때 발생합니다. | 

### To Do 일반 예외와 실행 예외를 살펴보기 
#### 01 Ex01_ExceptionCase 클래스를 만들어 다음과 같이 코드를 입력합니다.
![318_exception_case_example](https://github.com/user-attachments/assets/d87b3681-be1b-4d0d-8fa6-db37ee5112c7)

`1번`입력되는 숫자가 0일 때만 11번 라인에서 수학적 오류로 예외가 발생합니다. 사용자의 입력 값에 따라 에러가 발생할 수도 있고 발생하지 않을 수도 있습니다. 그렇기 때문에 이런 실행 예외는 개발자에게 판단과 처리를 맡깁니다. 개발자가 처리를 안한 경우 자바 가상 머신은 예외 발생 시 프로그램을 안정적으로 종료시킵니다.

`2번`의 코드 자체는 문법적 오류가 없이 잘 작성되었습니다. 그러나 참조할 MyBook 클래스가 컴파일을 할 때나 실행 중에 없다면 무조건 에러가 발생하게 됩니다. 그렇기 때문에 이런 일반 예외는 무조건 예외 처리를 해주어야 합니다. 

#### 02 저장하고 컴파일 하세요. 그러면 에러가 납니다. 현재 MyBook() 정의가 없어 그렇습니다. 
![319_exception_case_example_result_error1](https://github.com/user-attachments/assets/7c4c3137-fdeb-4086-a77a-603b058b855b)

#### 03 앞에서 작성한 코드에서 `2번` 14라인만 주석 처리하고 컴파일하고 실행해보겠습니다.
#### 04 실행이 되면 콘솔창에서 숫자 0을 입력해봅니다. 다음과 같은 에러가 발생합니다.
![320_exception_case_example_result_error2](https://github.com/user-attachments/assets/4c1bdbf7-229a-46d1-ae84-e15dc49b3657)

&rarr; ArithmeticException(0으로 나누기와 같은 부적절한 산술 연산 수행시 발생하는 실행 예외)이 발생합니다.

#### 05 다시 실행하고 이번에는 문자 A를 입력해봅니다. 다음과 같은 에러가 발생합니다. 
![321_exception_case_example_result_error3](https://github.com/user-attachments/assets/14b09d94-efe1-48f3-a7d2-e5b501fe92a7)

이것이 실행 예외입니다. 발생하지 않을 수도 있기에 별도의 예외 처리를 하지 않아도 컴파일은 되지만, 실행 시 이런 값이 입력된다면 이렇게 비정상적인 종료를 하게 됩니다. 

## 3. 예외 처리하기 
예외 처리 진행 형식은 다음과 같습니다.
```
try
{
    JAVA 코드
}
catch (예외 타입 1 e)
{
    예외 1 발생 시 이 부분 실행
}
catch (예외 타입 2 e)
{
    예외 2 발생 시 이 부분 실행
}
finally
{
    이 부분은 마지막에 무조건 실행 
}
```

다음과 같이 일부분을 생략하고 작성할 수도 있습니다. 
```
try
{
    JAVA 코드
}
catch (예외 타입 e)
{
    예외 발생 시 이 부분 실행
}

try
{
    JAVA 코드
}
finally 
{
    이 부분은 마지막에 무조건 실행 
}
```

### 3-1. try ~ catch
앞에서 작성한 코드의 예외는 두 개이므로 다음과 같이 코드를 추가하여 예외를 처리해주도록 합니다. 
![322_try_catch_example](https://github.com/user-attachments/assets/39da1abb-6467-4a34-9d5e-c31345385a0f)

`2번`에서 `5번`까지 예외 처리를 위해 try문의 중괄호로 묶었습니다. 이 부분을 실행하다 예외가 발생하면 해당 예외에 대한 catch문이 실행되게 됩니다. if ~ else if ~ else if ~ 와 비슷하다고 생각하면 됩니다.

`1번` java.util.InputMismatchException을 `8번`에 사용하는 InputMismatchException을 위해 먼저 임포트합니다. 입포트 없이 `8번`을 사용하면 컴파일 에러가 발생합니다. 

`6번`catch문은 `3번`에서 수학적인 처리에 대한 예외가 발생하면 실행됩니다. `7번`예외에 대한 간단한 메시지를 문자열로 받아옵니다.
![325_try_catch_example_result3](https://github.com/user-attachments/assets/93b0fe6b-26fd-4a6a-a98b-0a3a14fa1e50)

`8번`catch문은 `2번`에서 입력값이 정수가 아니어서 데이터의 형변환에 대한 예외가 발생하면 실행됩니다. `10번`예외에 대한 자세한 메시지를 출력합니다. 
![323_try_catch_example_result1](https://github.com/user-attachments/assets/50acfec2-c01c-4b03-b6a7-0f8344b29b5c)

이처럼 예외가 발생한 지점에서 catch문으로 실행 지점이 이동하게 됩니다. 그러므로 예외가 발생하면 `4번`과 `5번`은 실행되지 않습니다.

실행을 하고 콘솔청에서 문자 A를 입력해봅니다. `2번`에서 입력 시 예외가 발생하고, `8번`catch문이 실행되고 `9번`에서 에러 메시지를 얻어서 출력해줍니다. 결과에서 보듯이 `4번`과 `5번`코드는 실행되지 않았습니다. 
![324_try_catch_example_result2](https://github.com/user-attachments/assets/68ecc1bf-2b2e-4489-8b45-821f203d7591)

### 3-2. finally 
예외가 발생해도 바로 앞 예제의 `5번`을 무조건 실행하고 싶다면 다음과 같이 finally문을 추가하고 그쪽으로 코드를 이동해주어야 합니다. 

<img width="898" alt="326_finally_example" src="https://github.com/user-attachments/assets/7322f7e0-d0f3-44c3-aaf4-daf0dcb75f7c" />


예외가 발생해도 반드시 실해되어야 하는 문장이라면 위 코드와 같이 finally문 안에 작성을 해주면 됩니다. try문을 실행하다 예외가 발생하면 예외 발생 지점에서 catch문으로 실행이 이동하게 되지만 catch 영역이 실행되고 맨 마지막에 finally문의 내용이 반드시 실행됩니다. 

실행을 하고 콘솔창에 문자 A를 입력해봅니다. `1번`이나 `2번`에서 입력 시 예외가 발생해도 `3번`은 반드시 실행되면서 내용이 출력됩니다.

<img width="900" alt="327_finally_example_result" src="https://github.com/user-attachments/assets/ad97864e-e9cd-41a7-b743-9c7917b7ff9f" />

### 3-3. 예외처리 합치기
예외 상황에 대해서 catch문 하나당 예외 하나를 처리할 수도 있지만, catch문 하나에서 여러 예외를 한꺼번에 처리할 수도 있습니다. 
<img width="883" alt="328_catch_concat_example" src="https://github.com/user-attachments/assets/c7a314ed-34ab-48dd-ab4e-a567a4337bbb" />
<img width="870" alt="329_catch_concat_example_result" src="https://github.com/user-attachments/assets/a386de1d-7a0f-4fe0-b3cc-1ca97b2c3e5d" />

실행을 하고 콘솔창에서 문자 A를 입력해보니 예상대로 예외 처리가 작동합니다. 

`1번` 여러 Exception을 버티컬 바(`|`)를 이용해 지정하고 있습니다(`|`는 or 연산자입니다).

`2번` 여러 상황에 대한 자세한 메시지 처리 대신, 모든 상황을 간단한 메시지로 한 번에 처리하고 있습니다. 

`3번` finally를 꼭 통하지 않더라도 try ~ catch 문에 의해 비정상적인 종료는 방지되었으므로 그 뒤에 이렇게 사용하면 이 내용을 예외가 발생해도 출력할 수 있습니다.

### 3-4. 모든 예외 한 번에 처리하기 
어떤 예외가 발생할지 모를 때 모든 예외의 최상위 클래스를 이용해서 예외를 처리해줄 수 있습니다. 클래스의 다형성에서 배운 '자식 클래스의 객체는 부모 클래스형의 변수에 대입할 수 있다'가 적용되어 모든 예외를 처리할 수 있게 됩니다.

<img width="899" alt="330_exception_example" src="https://github.com/user-attachments/assets/5cae4730-ef94-4905-b884-4a8cdc51bfb3" />
<img width="880" alt="331_exception_example_result" src="https://github.com/user-attachments/assets/29d84169-54c5-4741-84a7-5290eca54971" />

A를 입력한 결과 예상대로 예외 처리가 작동합니다. 

예외를 한 번에 다 처리하려면 `1번`의 Exception 클래스나 Throwable 클래스를 사용할 수 있습니다. 모든 예외 Exception 클래스를 상속받은 것이기 때문에 다형성에서 배운 것 처럼 수많은 예외 클래스들은 `1번`의 매개변수 Exception e에 대입이 될 수 있습니다.
