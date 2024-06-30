# 07 while문 사용하기
- 프로그래밍을 할 때 반복적으로 어떤 일을 처리하고 싶을 때 반복문을 사용합니다. 자바는 반복문으로 `while`, `do-while`, `for`문을 제공합니다. 먼저 while문을 알아봅니다.
## 1. while문이란? 
while문이란 어떤 조건이 성립하는 동안 반복 처리를 실행하는 제어문입니다. while문 소괄호 안 연산식 결과가 true이면 중괄호 안의 내용이 실행됩니다. 그리고 다시 소괄호 안 연산식 결과를 체크합니다. 이렇게 계속 반복이 됩니다.\
이때 반복 횟수를 세는 변수를 만들어 반복 횟수를 지정할 수 있습니다. 

![0-21_while_structure](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/547d6168-8dbf-41e4-a2ac-5d62c94b7dce)

조금 구체적인 형태로 코드를 구성해보았습니다.

![0-22_while_structure](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/9b22c66c-b531-433e-97c4-4143ce2f267f)

먼저 반복 횟수를 체크할 정수형의 "num" 변수를 만들고 정수 0을 값으로 대입합니다.\
그리고 while문 소괄호 안 "num 변수의 값이 5보다 작다"라는 연산식 결과가 true 이면 중괄호 안의 내용이 실행됩니다. 이때 "Development"를 출력하고 그 다음 라인에서 반복 횟수를 체크하는 변수의 값을 1증가 시킵니다.\
중괄호 안에 실행이 끝나면 다시 소괄호의 연산식을 체크하러 갑니다. 이렇게 반복되다 "num" 변수의 값이 증가해서 5가 되면 소괄호 안의 연산식 조건이 false가 되므로 더 이상 중괄호 안의 내용을 실행하지 않고 while 문은 끝나게 됩니다.

## 2. 코드 작성 1단계
앞에서 한 방식대로 "Example05.java" 파일을 만들고 기본형을 만듭니다. 그리고 다음 코드를 작성합니다.
```
class Example05
{
  public static void main(String[] args)
  {
    // 반복문 사용전
    System.out.println(2 * 1);
    System.out.println(2 * 2);
    System.out.println(2 * 3);
    System.out.println(2 * 4);
    System.out.println(2 * 5);
    System.out.println(2 * 6);
    System.out.println(2 * 7);
    System.out.println(2 * 8);
    System.out.println(2 * 9);
  }
}
```
위 코드는 반복문 사용전 구구단의 2단을 출력하는 코드입니다.

이제 코드를 실행해봅니다.
```
javac Example05.java
```
```
java Example05
```
![0-23_while_example](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/6bd08e0b-7268-4b51-8831-e646b8e31c39)

콘솔창에 구구단 2단의 결과가 잘 출력되었습니다. 

## 3. 코드 작성 2단계
그런데 작성한 위의 코드를 자세히 보면 출력문 안의 연산식에서 뒤 쪽의 숫자가 하나씩 증가하고 있습니다. 이렇게 같은 동작에서 조금씩 변하는 부분의 규칙을 찾을 수 있다면 반복문을 사용할 수 있습니다. 이제 규칙을 발견했으니 반복문을 만들어보겠습니다.

기존의 Example05.java 파일에서 다음 코드를 추가합니다.
```
class Example05
{
  public static void main(String[] args)
  {
    // 반복문 사용전
    System.out.println(2 * 1);
    System.out.println(2 * 2);
    System.out.println(2 * 3);
    System.out.println(2 * 4);
    System.out.println(2 * 5);
    System.out.println(2 * 6);
    System.out.println(2 * 7);
    System.out.println(2 * 8);
    System.out.println(2 * 9);

    // 코드 추가 부분 
    System.out.println("======================");

    // 반복문 사용 - 위의 반복에서 뒤의 자리 정수만 변하게 처리
    int num = 1;
    while(num < 10)
    {
      System.out.println(2 * num);
      num = num + 1;    
    }
    
  }
}
```
추가된 부분의 코드 동작은 아래와 같습니다
  1) 앞 부분의 실행 결과와 뒷부분의 실행 결과를 구분하는 구분선을 출력합니다.
  2) 반복 횟수를 기록하는 정수형 변수를 만들고 초깃값을 정숫값으로 대입시킵니다.
  3) while문 소괄호 안 연산식 결과가 true인 경우 이후 중괄호 안의 내용이 실행됩니다.
  4) 변수의 값을 이용해 구구단을 출력합니다.
  5) 반복 횟수를 증가시킵니다.
  6) 반복문의 중괄호가 끝나면 다시 while문 옆의 소괄호 안 연산식 체크가 실행됩니다.

이렇게 반복문을 적용할 수 있습니다. 지금이야 기존의 코드나 반복문이나 길이가 비슷해서 체감이 잘 안되지만 반복 횟수가 만 번 정도라면 반복문이 훨씬 효율적입니다. 기존 코드는 직접 입력을 하지 않고 복사&붙여넣기를 한다 하더라도 만 번을 반복 작업해야 하지만 반복문은 소괄호 속 연산식를 조금만 바꾸면 간단히 해결할 수 있습니다.

이제 코드를 실행해봅니다.
```
javac Example05.java
```
```
java Example05
```
![0-24_while_exampe2](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/163abd31-1fad-4ec9-8582-e3e64b2a8598)

구분선 앞 부분은 반복적인 코드의 입력에 의한 출력이고, 구분선 뒷부분은 while문에 의한 출력입니다. 반복문 적용이 잘된 것으 확인할 수 있습니다.

## 4. while문 다른 사용 방법 
다음과 같은 상황에서 while문의 불편한 점을 한번 보겠습니다.
![0-22_while_structure](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/9b22c66c-b531-433e-97c4-4143ce2f267f)

while문 중괄호 안의 코드가 길어져서 여러 줄이 되면, 그래서 화면상에서 여러 페이지가 되면 반복 횟수를 처리하는 변수가 한 화면에 보이지 않게 됩니다. 이렇게 한 동작을 처리하는 내용이 흩어져 있으면 프로그램의 로직을 파악하기 어려워집니다. 

그래서 while문은 횟수가 정해져 있는 것을 처리하기보다는 조건이 정해져 있을 경우를 처리할 때 아래와 같이 사용합니다.
![0-25_while_if](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/1637a624-3688-4856-a654-820d76de6bf0)

while의 소괄호 안에서는 연산식 결과를 체크하는데 이미 연산 절차 없이 결과가 true로 주어져있으므로 무조건 중괄호를 실행합니다. 중괄호 안에서 문장을 실행하고 if 조건문에서 소괄호 안의 연산식 결과가 true이면 break를 이용해 while의 반복을 멈추게 합니다.
