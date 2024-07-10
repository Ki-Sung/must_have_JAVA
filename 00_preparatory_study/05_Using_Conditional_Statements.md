# 05 조건문 사용하기
- 이번에는 자바에서 사용하는 제어문 중 하나인 조건문을 알아보겠습니다. 
## 1. if 조건문 
프로그램의 실행에서 어떤 연산이 주어졌을 때, 그 결과가 참이냐 거짓이냐에 따라 프로그램의 서로 다른 부분을 실행하는데 "if 조건문"을 사용합니다.\
자바에서 사용하는 조건문중 if문은 그 단어의 뜻처럼 사용하면 되는데, if를 사용한 조건문의 규칙은 아래와 같이 세 가지 입니다. 

1) 타입 1 - `if문만` 사용하기
```
if (연산식)
{
  // 연산식 결과가 참(true)이면 이 부분 실행
}
```
2) 타입 2 - `if ~ else ~` 사용하기
```
if (연산식)
{
  // 연산식 결과가 참(true)이면 이 부분 실행 
}
else
{
  // 연산식 결과가 거짓(false)이면 이 부분 실행 
}
```
3) 타입 3-1 - `if ~ else if ~ else ~` 사용하기
```
if (연산식 A)
{
  // 연산식 A의 결과가 참(true)이면 이 부분 실행 
}
else if (연산식 B)
{
  // 연산식 A의 결과가 거짓(false)이고
  // 연산식 B의 결과가 참(true)이면 이 부분 실행 
}
else
{
  // 연산식 B의 결과가 거짓(false)이면 이 부분 실행
}
```
4) 타입 3-2 - `if ~ else if ~ else ~` 사용하기
```
if (연산식 A)
{
  // 연산식 A의 결과가 참(true)이면 이 부분 실행 
}
else if (연산식 B)
{
  // 연산식 A의 결과가 거짓(false)이고
  // 연산식 B의 결과가 참(true)이면 이 부분 실행 
}
else if (연산식 C)
{
  // 연산식 B의 결과가 거짓(false)이고
  // 연산식 C의 결과가 참(true)이면 이 부분 실행 
}
else
{
  // 연산식 C의 결과가 거짓(false)이면 이 부분 실행
}
```

## 2. 코드 작성 1단계
먼저 조건의 결과를 참이나 거짓으로 판단하기 위해 결과를 출력해봅니다. 앞에서 한 방식대로 "**Example04.java**" 파일을 만들고 기본형을 만듭니다. 그리고 다음 코드를 작성합니다.
```
class Example04
{
  public static void main(String[] args)
  {
    System.out.println(2 < 3);
    System.out.println(2 > 3);

    boolean bMyCheck = (2 > 3);
    System.out.println(bMyCheck);

    // 이후 코드를 이 부분에 적습니다.
  }
}
```
코드 동작 과정 
  1) '2가 3보다 작다'라는 비교 연산 결과를 출력합니다.
  2) '2가 3보다 크다'라는 비교 연산 결과를 출력합니다.
  3) '2가 3보다 크다'라는 비교 연산 결과를 변수에 대입 후 결과를 출력합니다.
```
javac Example04.java
```
```
java Example04
```
![0-18_step1_code_for_conditional](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/f35816b1-763c-4565-b142-a3cb579981ec)

## 3. 코드 작성 2단계
이번에는 조건문을 사용해보겠습니다. 기존 "**Example04.java**" 파일에 다음 코드를 추가합니다.
```
class Example04
{
  public static void main(String[] args)
  {
    System.out.println(2 < 3);
    System.out.println(2 > 3);

    boolean bMyCheck = (2 > 3);
    System.out.println(bMyCheck);

    // 조건문 대입 1 - true 조건
    if (1 < 2)
    {
      System.out.println("Hello");
    }

    // 이후 코드를 이 부분에 적습니다.
  }
}
```
if문 괄호 안에 있는 비교 연산식 결과가 참(true)이면 중괄호 안의 코드가 실행됩니다. 하지만 연산식 결과가 false이면 중괄호 안에 있는 코드는 실행되지 않고 그냥 통과됩니다.
```
javac Example04.java
```
```
java Example04
```
![0-19_step2_code_for_conditional](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/8be1d4ba-a626-4530-b222-a85f0e4759ba)

if문 괄호안의 '1이 2보다 작다'라는 비교 연산 결과가 참(true)입니다. 따라서 중괄호 안 코드가 실행되어 마지막에 "Hello"를 출력하였습니다. 

## 4. 코드 작성 3단계
계속해서 기존 "**Example04.java**" 파일에 다음 코드를 추가합니다. 앞에서는 상수를 이용하여 비교 연산자를 수행했지만 이번에는 변수에 값을 저장하고 그 변수를 이용하여 비교 연산을 해보고자 합니다(주석 '조건문 대입 2 - false 조건'을 보시면 됩니다).
```
class Example04
{
  public static void main(String[] args)
  {
    System.out.println(2 < 3);
    System.out.println(2 > 3);

    boolean bMyCheck = (2 > 3);
    System.out.println(bMyCheck);

    // 조건문 대입 1 - true 조건
    if (1 < 2)
    {
      System.out.println("Hello");
    }

    // 조건문 대입 2 - false 조건
    int num = 3;
    if (num < 2)
    {
      System.out.println("Hi~");
    }
    // 이후 코드를 이 부분에 적습니다.
    
  }
}
```
바이트 코드로 컴파일 후 java 명령어로 실행해봅니다.
```
javac Example04.java
```
```
java Example04
```
![0-19_step2_3_code_for_conditional](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/76a563fe-86a5-4ecd-ae62-3168159004fa)

(주석 '조건문 대입 2 - false 조건')의 if문 괄호 안의 '변수 num에 저장된 값이 2보다 작다'라는 비교 연산 결과는 거짓(false)입니다(num 변수에는 3이 저장됨). 그에 따라 이후 라인에 있는 코드는 실행되지 않고 그냥 통과되었기에 결과를 출력하는 콘솔창에는 "Hi~"가 출력되지 않았습니다. 

## 5. 코드 작성 4단계
계속해서 기존 "**Example04.java**" 파일에 다음 코드를 추가합니다. 이번에는 연산 결과를 구하고 그 값을 다시 비교하는 연산을 합니다. 
```
class Example04
{
  public static void main(String[] args)
  {
    System.out.println(2 < 3);
    System.out.println(2 > 3);

    boolean bMyCheck = (2 > 3);
    System.out.println(bMyCheck);

    // 조건문 대입 1 - true 조건
    if (1 < 2)
    {
      System.out.println("Hello");
    }

    // 조건문 대입 2 - false 조건
    int num = 3;
    if (num < 2)
    {
      System.out.println("Hi~");
    }
    
    // 조건문 대입 3 - 연산 결과를 구하고 그 값을 다시 비교 연산
    // 비교연산등호 '=='는 같다 라는 의미
    int num2 = 4;
    if ((num2 % 2) == 1)
    {
      System.out.println("나머지가 1이면 출력된다.");
    }
    
    // 이후 코드를 이 부분에 적습니다.
    
  }
}
```
(조건문 대입 3 - 연산 결과를 구하고 그 값을 다시 비교 연산)의 if문 괄호 안에서 또 다른 소괄호 속 나머지를 구하는 연산이 먼저 수행되고 결과가 나옵니다. 그 결과가 1이랑 같은지를 비교하게 됩니다. 그 결과가 참(true)이면 중괄호 안의 코드가 실행됩니다.\
순서대로 표현하면 아래와 같이 변하게 됩니다. 연산의 우선 순위는 우리가 예전에 수학 시간에 배웠던 것처럼 괄호를 사용하는 것이 제일 먼저 계산됩니다.

`if ((num2 % 2) == 1)` &rightarrow; `if((4 % 2) == 1)` &rightarrow; `if(0 == 1)` &rightarrow; `if(false)`

바이트 코드로 컴파일 후 java 명령어로 실행해봅니다.
```
javac Example04.java
```
```
java Example04
```

![0-19_step2_3_4_code_for_conditional](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/45d1cc10-f9b9-40d8-9c7e-bd66a5751871)

최종으로 수행되는 비교 연산 결과가 거짓(false)이기에 중괄호 안에 코드는 실행되지 않고 그냥 통과 됩니다.

## 6. 코드 작성 5단계
계속해서 기존 "**Example04.java**" 파일에 다음 코드를 추가합니다. 이번에는 if문과 함께 사용할 수 있는 else문을 사용해봅니다. 
```
class Example04
{
  public static void main(String[] args)
  {
    System.out.println(2 < 3);
    System.out.println(2 > 3);

    boolean bMyCheck = (2 > 3);
    System.out.println(bMyCheck);

    // 조건문 대입 1 - true 조건
    if (1 < 2)
    {
      System.out.println("Hello");
    }

    // 조건문 대입 2 - false 조건
    int num = 3;
    if (num < 2)
    {
      System.out.println("Hi~");
    }
    
    // 조건문 대입 3 - 연산 결과를 구하고 그 값을 다시 비교 연산
    // 비교연산등호 '=='는 같다 라는 의미
    int num2 = 4;
    if ((num2 % 2) == 1)
    {
      System.out.println("나머지가 1이면 출력된다.");
    }
    
    // 조건문 대입 4 - if else문 대입
    if ((num2 % 2) == 1)
    {
      System.out.println("나머지가 1: 홀수");
    }
    else
    {
      System.out.println("나머지가 1이 아님, 0: 짝수");
    }
  }
}
```
(조건문 대입 4 - if else문 대입)의 if문의 비교 연산 결과가 참(ture)이면 그 아래 중괄호 영역이 실행됩니다. 거짓(false)이라면 else문 아래 중괄호 영역이 실행됩니다. 

바이트 코드로 컴파일 후 java 명령어로 실행해봅니다.
```
javac Example04.java
```
```
java Example04
```

![0-20_step5_code_for_conditional](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/e95e4785-4b33-4ec2-9cff-e6acb0ddc071)

if문에서 비교 연산 결과가 거짓(false)이기에 else 영역의 중괄호 라인이 실행되어 해당 내용이 화면에 출력되었습니다.  
`if ((num2 % 2) == 1)` &rightarrow; `if((4 % 2) == 1)` &rightarrow; `if(0 == 1)` &rightarrow; `if(false)` -> `else` -> `나머지가 1이 아님, 0: 짝수`
