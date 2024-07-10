# 07 for 문 사용하기 
- 자바에서 반복문으로 while, do ~ while, for문을 제공한다고 했습니다. 그리고 앞에서 while문을 알아보았습니다. 이번 시간에는 for문을 알아봅시다.
## 1. for 문
for문은 반복 횟수가 정해져 있을 때, 사용하기 적합한 반복문입니다. 형식은 아래와 같습니다. 
![0-26_for_basic](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/adbb5601-0410-4207-b7df-1a212c5146f3)

조금 구체적인 형태인 코드는 아래와 같습니다. 
![0-27_for_basic2](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/14ba500c-0604-4079-828d-960120d14717)

먼저 "1" 초기식 부분에 반복 횟수를 체크할 정수인 i 변수를 만들고 정수 0을 초깃값으로 대입합니다.\
"2" 연산식 부분에서 조건의 결과를 확인합니다. 연산 결과가 true이면 "3" 중괄호 안의 문장이 실행됩니다. 그리고 "4" 증감식에서 반복 횟수를 체크하는 변수의 값을 증가시킵니다. 이 코드는 콘솔창에 "Development"를 다섯 번 출력하게 됩니다.

이처럼 반복 횟수가 정해진 경우 반복 처리 내용이 한 줄에 표시되므로 로직을 파악하기 편하다는 장점이 있습니다.

## 2. 코드 작성 1단계
앞에서 한 방식대로 "Example06.java" 파일을 만들고 기본형을 만듭니다. 그리고 다음 코드를 작성합니다.
```
class Example06
{
  public static void main(String[] args)
  {
    // 반복문 사용전
    System.out.print(2 * 1 + " ");
    System.out.print(2 * 2 + " ");
    System.out.print(2 * 3 + " ");
    System.out.print(2 * 4 + " ");
    System.out.print(2 * 5 + " ");
    System.out.print(2 * 6 + " ");
    System.out.print(2 * 7 + " ");
    System.out.print(2 * 8 + " ");
    System.out.print(2 * 9 + " ");
    System.out.println();
  }
}
```
중괄호안의 `System.out.println()`를 이용하여 단순하게 연산 결과를 출력합니다. 앞의 예제에서는 너무 여러 줄에 걸쳐 출력되었기에 이번에는 println()이 아니고 print()문을 사용하여 줄을 바꾸지 않고 있습니다. 다만 그렇게만 출력하면 숫자가 전부 다 붙어 출력되므로 숫자와 숫자 사이에 스페이스 한 칸을 띄어주어 출력을 하고 있습니다.

이제 코드를 컴파일하고 실행해봅시다
```
javac Example06.java
```
```
java Example06
```
![0-28_for_example1](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/890dc528-6409-41ad-a3f6-63cc30a3d521)

콘솔창에 구구단 2단의 결과가 잘 출력된 것을 볼 수 있습니다. 

## 3. 코드 작성 2단계
중괄호 안의 출력문 안의 연산식에서 뒤 쪽의 숫자가 하나씩 증가하고 있는 규칙을 찾을 수 있고, 반복 횟수를 알고 있기 때문에 이번에는 for문을 적용해보겠습니다.

기존의 Example06.java 파일에서 다음 코드를 추가합니다.

```
class Example06
{
  public static void main(String[] args)
  {
    // 반복문 사용전
    System.out.print(2 * 1 + " ");
    System.out.print(2 * 2 + " ");
    System.out.print(2 * 3 + " ");
    System.out.print(2 * 4 + " ");
    System.out.print(2 * 5 + " ");
    System.out.print(2 * 6 + " ");
    System.out.print(2 * 7 + " ");
    System.out.print(2 * 8 + " ");
    System.out.print(2 * 9 + " ");
    System.out.println();

    System.out.println("======================");

    // 반복문 적용: for 문 사용 - 위의 반복에서 뒤의 자리 정수만 변하게 처리
    for (int i = 1; i < 10; i = i + 1)
    {
     System.out.print(2 * i + " ");
    }
    System.out.println();
  }
}
```
코드 동작의 순서는 아래와 같습니다. 
  1) 앞 부분의 실행 결과와 뒷부분의 실행 결과를 구분하는 구분선을 출력합니다.
  2) 반복 횟수가 정해진 경우 반복 처리를 위한 내용이 for()문, 한 줄에 표시됩니다.
  3) 반복 횟수를 기록하는 정수형 변수를 i를 만들고 정수 0을 초깃값으로 대입합니다.
  4) 연산식 결과가 true인 경우 이후 중괄호 안의 내용이 실행됩니다.
  5) 변수의 값을 이용해 구구단을 출력합니다.
  6) 반복문의 중괄호가 끝나면 다시 for()문 라인에서 뒷부분인 증감식이 실행됩니다.

이렇게 반복문을 적용할 수 있습니다. 반복 횟수를 증가시키고 싶다면 역시 중간 연산식 조건만 바꾸면 됩니다.

이제 코드를 컴파일하고 실행해봅시다
```
javac Example06.java
```
```
java Example06
```
![0-29_for_exampl2](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/7a6e6f25-ab76-4484-8fe2-b935a7fa1c7f)

구분선 앞 부분은 반복적인 코드의 입력에 의한 출력이고, 구분선 뒷부분 for문에 의한 출력입니다. 반복문 적용이 잘된 것을 확인할 수 있습니다.
