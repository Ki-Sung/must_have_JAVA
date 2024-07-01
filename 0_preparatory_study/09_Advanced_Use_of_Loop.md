# 09 반복문 고급 사용
- 반복문은 무조건 반복만 하는 것이 아니라 조건에 따라 건너뛰거나 혹은 어떤 조건이 되면 중단시킬 수도 있습니다. 조건에 따라 반복문의 실행을 건너뛸 때는 `continue`를 사용하고, 조건에 따라 반복문을 중지시킬 때는 `break`를 사용합니다.
## 1. while문에서 break, continue 사용하기
while문에서 `continue`가 사용되면 그 이후의 문장은 실행하지 않고 조건을 검사하는 연산식으로 바로 이동하게 됩니다.

![0-31_advance_loop](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/dcb008ed-a4f1-49c7-9014-13ae2af2a112)

while문에서 `break`가 사용되면 while문의 실행을 그 즉시 중지하고 반복문 이후의 문장을 실행하기 위해 중괄호를 빠져 나갑니다.

![0-32_advance_loop_break](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/51da3079-f8b3-47f7-aa6a-835ddc572231)

## 2. 코드 작성
앞에서 한 방식대로 Example08.java 파일을 만들고 기본형을 만듭니다. 그리고 아래와 같이 코드를 작성합니다.

```
class Example08 {
  public static void main(String[] args) {
    int num = 0;
    while (true)
    {
      num = num + 1;

      // 짝수이면 이후 실행을 건너뛰기
      if (num % 2 == 0)
      {
        continue;
      }

      // 특정한 조건이 되면 멈추기 
      if (num > 10)
      {
        break;
      }
      
      System.out.println(num);
    }
    
    // break로 멈추면 여기로 실행 이동
    System.out.println("while문 종료");
  }
}
```
코드 동작 순서는 아래와 같습니다. 
  1) 반복 횟수를 체크하는 정수형 변수 num을 만들고 초깃값으로 정수 0을 대입합니다.
  2) num 변수의 값을 1 증가시킵니다.
  3) 2로 나누어 나머지가 0이면 짝수입니다. 짝수인지 체크합니다.
  4) 반복문의 이후 실행을 건너뛰고 while문의 연산식 결과를 체크하기 위해 while문 라인으로 이동합니다.
  5) 반복문을 중지하기 위해 num 변수에 지정된 값이 10보다 큰 지 검사합니다.
  6) while문을 중지하고 마지막 코드 라인으로 이동합니다.

이제 코드를 컴파일하고 실행해봅니다. 

```
javac Example08.java
```
```
java Example08
```
![0-33_run_code_for_advance_loop](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/d1dbbd79-30c6-4ff5-804b-4f0aaf0d8705)

실행 결과로 10보다 작은 정수 중에 홀수만 출력되었습니다.
## 3. for 문에서 break, continue 사용하기
for문에서 continue가 사용되면 그 이후의 문장은 실행하지 않고 증감식으로 바로 이동하게 됩니다.

![0-34_advance_loop_continue_2](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/693608b5-fdaf-4afd-b12b-c1d5d50b1ae6)

for문에서 break가 사용되면 for문의 실행을 그 즉시 중지하고 반복문 이후의 문장을 실행하기 위해 중괄호를 빠져 나갑니다.

![0-35_advance_loop_break_2](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/5feb7719-150c-44f2-acd0-e1fb9b4d3f11)

## 4. 코드 작성
앞에서 한 방식대로 Example09.java 파일을 만들고 기본형을 만듭니다. 그리고 아래와 같이 코드를 작성합니다.
```
class Example09 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i = i + 1) {
      // 짝수이면 이후 실행을 건너뛰기
      if (i % 2 == 0) 
      {
        continue;
      }

      // 특정한 조건이 되면 멈추기
      if (i > 10)
      {
        break;
      }
      System.out.println(i);

    }
      
    // break으로 멈추면 여기로 실행 이동 
    System.out.println("반복문 종료");
  }
}
```

코드 실행 순서는 다음과 같습니다. 
  1) 초기식에 i를 만들고 1로 초기화 합니다.
  2) 횟수 증감을 위해 조건 체크 연산식에 `i <= 10`를 지정하여 10 이하일 때까지 반복합니다.
  3) i가 짝수인 경우 `continue`문을 통해 이후 실행을 건너뜁니다.
  4) i가 11 이상이 되면 `break`문을 통해 반복문을 종료합니다.
  5) i가 홀수이고 10 이하인 경우 해당 값을 출력합니다.
  6) 반복문이 종료되면 "반복문 종료" 메시지를 출력합니다.

이제 코드를 컴파일하고 실행해봅시다
```
javac Example09.java
```
```
java Example09
```

![0-36_run_code_for_advance_loop_2](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/5ee8e0a9-d435-47c9-99f6-b6cc65d88f86)

실행 결과로 10보다 작은 정수 중에서 홀수만 출력된 것을 볼 수 있습니다.
