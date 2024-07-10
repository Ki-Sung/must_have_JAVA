# 11 종합: 계산기 만들기
- 이번에는 메뉴를 구성해서 출력된 메뉴에서 사용자가 사칙연산 중 하나의 계산 기능을 선택하게 하고, 다시 사용자가 입력한 값에 따라 해당 계산만 수행하여 결과를 출력하고 다시 메뉴를 출력하는 단순한 계산기 기능을 만들어보겠습니다. 

## 1. 메뉴 출력 구현하기 
앞에서 한 방시대로 Example11.java 파일을 만들고 기본형을 만듭니다. 우선 메뉴를 출력하는 코드를 작성합니다.
```
// Scanner 클래스 가져오기
import java.util.Scanner;

class Example11 {
  public static void main(String[] args)
  {
    // 사용자 입력을 받기 위한 Scanner 객체 생성
    Scanner sc = new Scanner(System.in);

    // 계산기 메뉴 지정 
    System.out.println("메뉴를 선택하세요.");
    System.out.println("1. 더하기");
    System.out.println("2. 빼기");
    System.out.println("3. 곱하기");
    System.out.println("4. 나누기");
    System.out.println("0. 끝내기");

  }
}
```
여기까지 입력하고 컴파일 후 실행시켜 메뉴가 잘 출력되는지 확인합니다.
```
javac Example11.java
```
```
java Example11
```

![10-39_create_calculator](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/f05dacb0-af94-4a2c-86ed-7476afdb1098)

## 2. 사용자 입력 처리하기
이제 메뉴가 사용자 입력을 처리하고 계속해서 출력되도록 반복문을 이용하여 만들어줍니다. 횟수가 정해지지 않고 끝나는 조건만 있는 이런 경우에는 while문이 for문보다 더 잘 어울립니다.
```
// Scanner 클래스 가져오기
import java.util.Scanner;

class Example11 {
  public static void main(String[] args)
  {
    // 사용자 입력을 받기 위한 Scanner 객체 생성
    Scanner sc = new Scanner(System.in);

    while (true)
    {
      // 계산기 메뉴 지정 
      System.out.println("메뉴를 선택하세요.");
      System.out.println("1. 더하기");
      System.out.println("2. 빼기");
      System.out.println("3. 곱하기");
      System.out.println("4. 나누기");
      System.out.println("0. 끝내기");

      int num = sc.nextInt();
      if (num == 0)
      {
        break;
      }
      else
      {
        if (num > 4)
        {
          System.out.println("메뉴를 잘못 선택했습니다.");
          continue;
        }
        // 더하기, 빼기, 곱하기, 나누기 기능 설정
      }
    }
    System.out.println("계산기를 종료 합니다.");
  }
}
```
추가된 코드 과정은 아래와 같습니다. 
  1) while문을 이용하면 반복문을 만들고 그 안에 메뉴 출력 부분을 넣습니다.
  2) 사용자로부터 정수를 입력받습니다.
  3) 입력받은 값이 0이면 반복문을 종료합니다.
  4) 입력받은 값이 0이 아니고 메뉴의 다른 값이면 else 부분의 중괄호에서 처리합니다.
  5) 잘못된 메뉴 번호가 입력되면 메시지를 출력하고 다시 메뉴 선택을 할 수 있도록 합니다.
  6) 반복문이 종료되면 메시지를 출력하고 프로그램을 종료합니다. 

여기까지 만들고 컴파일한 후 실행시켜 반복문에서 메뉴가 잘 출력되는지, 입력을 받고 입력받은 값을 잘 처리하는지 확인합니다. 일단 입력받은 값이 0이 아닐 때 메뉴가 반복적으로 잘 출력되고, 입력받은 값이 0일 때 프로그램이 종료되면 잘 처리되고 있다고 볼 수 있습니다.
![0-40_select_menu](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/b8f89173-9244-41f5-8074-6eca14059f0e)

## 3. 기능 구현하기 
이제 해당 메뉴의 기능을 만들어주면 됩니다. if 조건문을 이용하여 선택한 메뉴에 맞는 기능을 수행할 수 있도록 코드를 추가합니다.
```
// Scanner 클래스 가져오기
import java.util.Scanner;

class Example11 {
  public static void main(String[] args)
  {
    // 사용자 입력을 받기 위한 Scanner 객체 생성
    Scanner sc = new Scanner(System.in);

    while (true)
    {
      // 계산기 메뉴 지정 
      System.out.println("메뉴를 선택하세요.");
      System.out.println("1. 더하기");
      System.out.println("2. 빼기");
      System.out.println("3. 곱하기");
      System.out.println("4. 나누기");
      System.out.println("0. 끝내기");

      int num = sc.nextInt();
      if (num == 0)
      {
        break;
      }
      else
      {
        if (num > 4)
        {
          System.out.println("메뉴를 잘못 선택했습니다.");
          continue;
        }
        // 더하기, 빼기, 곱하기, 나누기 기능 설정
        // 숫자 입력란 
        System.out.print("첫 번째 숫자:");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자:");
        int num2 = sc.nextInt();

        // 1을 입력했을 경우 더하기 사칙연산
        if (num == 1)
        {
          int result = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + result); 
        }

        // 2를 입력했을 경우 빼기 사칙연산
        else if (num == 2)
        {
          int result = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + result);
        }

        // 3을 입력했을 경우 곱하기 사칙연산
        else if (num == 3)
        {
          int result = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + result);
        }

        // 4를 입력했을 경우 나누기 사칙 연산
        else if (num == 4)
        {
          int result1 = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result1);

          int result2 = num1 % num2;
          System.out.println(num1 + " % " + num2 + " = " + result2);
        }
      }
    }
    System.out.println("계산기를 종료 합니다.");
  }
}
```
이제 컴파일 후 실행을 해보도록 하겠습니다.

![0-41_select_menu_2](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/db37cbb9-b7b5-4c94-92b0-c2bfcb876472)

우리가 의도한 대로 실행이 되는 것을 확인할 수 있습니다. 이 프로그램은 프로그램에서 원하는 대로 메뉴에 대한 숫자를 정확히 입력하지 않으면 에러가 발생할 수 있습니다. 또한 입력값을 사용자의 실수로 숫자가 아닌 공백이나 문자를 입력해도 에러가 발생합니다.

사용자의 실수로 인한 입력에도 에러가 발생하지 않도록 처리하는 것을 예외 처리라고 합니다. 이 부분은 본 내용에 가서 알아보도록 하겠습니다.

### 마무리
지금까지 배운 내용 
  - 프로그래밍 기초
  - 클래스 기초
  - 클래스 심화 
