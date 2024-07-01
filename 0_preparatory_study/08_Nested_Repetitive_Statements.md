# 08 반복문의 중첩 
- 반복문은 앞에서 본 것처럼 하나만 단독으로 사용할 수도 있지만, 반복문 안에 반복문이 있을 수도 있습니다. 이럴 경우 반복문의 중첩이라는 표현을 사용합니다.
## 1. for문의 중첩
아래의 예제를 보면 반복문 안의 내용이 기존 반복문을 만들었을 때처럼 반복문을 적용할 수 있는 내용입니다.
```
class Example07
{
  public static void main(String[] args)
  {
    // 반복문: Example06 참고
    // 조건의 연산식을 충족하는 동안 중괄호 안의 내용을 실행 
    for (int i = 1; i < 10; i = i + 1)
    {
      System.out.print(2 * i + " ");    
    }
    System.out.println();

    System.out.println("======================");

    // 반복문: 구구단 2단에서 9단 출력
    for (int i = 1; i < 10; i = i + 1)
    {
      // 반복문 안에서 반복문을 적용할 대상이 또 있음
      System.out.print(2 * i + " ");
      System.out.print(3 * i + " ");
      System.out.print(4 * i + " ");
      System.out.print(5 * i + " ");
      System.out.print(6 * i + " ");
      System.out.print(7 * i + " ");
      System.out.print(8 * i + " ");
      System.out.print(9 * i + " ");
      System.out.println();
    }
    
  }
}
```
## 2. for 중첩 코드 작성
Example06에서 반복문으로 만든 것과 똑같은 방법으로 "반복문: 구구단 2단에서 9단 출력" 부분을 반복문으로 바꿀 수 있습니다. 들여쓰기에 신경써서 변경 처리를 하면 다음과 같이 코드를 추가할 수 있습니다.
```
class Example07 {
  public static void main(String[] args) {
    // 반복문: Example06 참고
    // 조건의 연산식을 충족하는 동안 중괄호 안의 내용을 실행
    for (int i = 1; i < 10; i = i + 1) {
      System.out.print(2 * i + " ");
    }
    System.out.println();

    System.out.println("======================");

    // 반복문: 구구단 2단에서 9단 출력 - 반복문 중첩을 사용하기 전
    System.out.println("반복문 중첩 사용 전");

    for (int i = 1; i < 10; i = i + 1) {
      System.out.print(2 * i + " ");
      System.out.print(3 * i + " ");
      System.out.print(4 * i + " ");
      System.out.print(5 * i + " ");
      System.out.print(6 * i + " ");
      System.out.print(7 * i + " ");
      System.out.print(8 * i + " ");
      System.out.print(9 * i + " ");
      System.out.println();
    }

    System.out.println("======================");

    // 반복문 중첩 사용 후
    System.out.println("반복문 중첩 사용 후");
    for (int i = 2; i < 10; i = i + 1) {
      for (int j = 1; j < 10; j = j + 1) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}
```
"반복문 중첩 사용 후" 아래의 코드 동작 과정을 살펴봅니다.
  1) 반복 횟수를 기록하는 정수형 변수 `i`를 만들고 정수 `2`를 초깃값으로 대입합니다.
  2) 반복 횟수를 기록하는 정수형 변수 `j`를 만들고 정수 `1`을 초깃값으로 대입합니다.

반복 의사를 분명히 알고 있는 곳에서 사용하는 변수이므로 특별히 긴 이름을 사용하지 않고 관례적으로 i, j를 사용합니다. 

그리고 초깃값은 무조건 0부터 시작하는 것이 아니고 해당 예제에서 보는바와 같이 필요에 따라 바뀔 수 있습니다. 여기서는 2단부터 출력하기 위해 첫 번째 초깃값에 2, 두 번째 초깃값에 1을 대입했습니다. 

이제 코드를 컴파일하고 실행해봅시다
```
javac Example07.java
```
```
java Example07
```
![0-30_nested_repetitive](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/1a3071cb-b3d2-4b97-82b2-c3852fb90e57)

이렇게 중첩된 반복문을 사용하면 구구단을 더 쉽게 출력할 수 있습니다. 
