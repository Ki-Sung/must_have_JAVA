# 10 사용자 입력받아 사칙연산 결과 출력하기
- 이번에는 사용자로부터 두 점수를 입력받아 사칙 연산 결과를 출력하는 프로그램을 만들어보겠습니다.
## 1. 코드 작성 1단계 
앞에서 한 방식대로 Example10.java 파일을 만들고 기본형을 만듭니다. 그리고 일단 두 정수를 입력받는 코드를 아래와 같이 작성합니다. 
```
import java.util.Scanner;

class Example10{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자를 입력하고 엔터를 치세요.");

    System.out.print("첫 번째 숫자: ");
    int num1 = sc.nextInt();

    System.out.print("두 번째 숫자: ");
    int num2 = sc.nextInt();
  }
}
```
![0-37_code_for_input](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/5d9f1bd1-e00d-4d6b-a824-22fbcbeae64d)

우선 입력 기능을 사용하기 위해 `import java.util.Scanner;`과 `Scanner sc = new Scanner(System.in);`의 코드를 적용합니다.
  1) 입력 기능을 사용하기 위해 import 합니다.
  2) 입력 기능을 사용하기 위해 import한 Scanner를 적용합니다. `sc`는 변수명이므로 변경해도 됩니다.
  3) 사용자에게 입력하라는 안내 문구를 출력합니다.
  4) 안내 문구를 출력하고 줄바꿈을 하지 않고 프롬프트를 옆으로 놓아둡니다.
  5) 정수형 변수 `num1`에 첫 번째로 입력한 정수를 대입힙니다.
  6) 안내 문구를 출력하고 줄바꿈을 하지 않고 프롬프트를 옆으로 놓아둡니다.
  7) 정수형 변수 `num2`에 첫 번째로 입력한 정수를 대입힙니다.

## 2. 코드 작성 2단계
이제 두 변수에 정수 데이터가 저장되었으므로 두 변수를 사용해서 사칙 연산을 하고 출력만 하면 됩니다. 이어서 코드를 작성합니다. 
```
// Scanner 클래서 가져오기
import java.util.Scanner;

class Example10{
  public static void main(String[] args)
  {
    // 사용자 입력을 받기 위한 Scanner 객체 생성
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자를 입력하고 엔터를 치세요.");

    // 사용자로부터 첫 번째 숫자 입력 받기, 입력 받은 숫자 num1 변수에 저장 
    System.out.print("첫 번째 숫자: ");
    int num1 = sc.nextInt();

    // 사용자로부터 두 번째 숫자 입력 받기, 입력 받은 숫자 num2 변수에 저장 
    System.out.print("두 번째 숫자: ");
    int num2 = sc.nextInt();

    // 사칙 연산 수행
    // 덧셈
    int result1 = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result1);

    // 뺄셈
    int result2 = num1 - num2;
    System.out.println(num1 + " - " + num2 + " = " + result2);

    // 곱셈 
    int result3 = num1 * num2;
    System.out.println(num1 + " * " + num2 + " = " + result3);

    // 나머지
    int result4 = num1 % num2;
    System.out.println(num1 + " % " + num2 + " = " + result4);
  }
}
```
이제 컴파일하고 실행해봅니다.
```
javac Example10.java
```
```
java Example10
```

![0-38_code_for_result](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/d22e70df-d5ac-443d-ba4a-d9307aaaf758)

안내 문구에 따라 두 개의 정수를 입력하면 입력받은 두 정수를 이용해서 사칙 연산을 수행하고 그 결과가 출력됩니다. 
