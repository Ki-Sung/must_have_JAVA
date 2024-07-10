# 02 코드 작성 후 내용 출력하기
- 자바 코드를 직접 만들고 내용을 출력하는 몇 가지 방법을 연습해봅니다.
## 1. 클래스 기본형 만들기 
1. 간단히 코드를 작성하기 위해 "Example01.java"라는 이름으로 새로운 Java 파일을 만듭니다.
![0-10_add_new_file](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/8e33c5de-1902-497a-b3a3-4877668bb4f2)
2. 파일이 처음 만들어지면 편집기의 창은 비어 있습니다. 아래와 같은 순서로 코드를 작성합니다.
![0-11_replace_code](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/3f3567f2-5386-4457-ac7e-f1345d388dff)
   1) Main.java 파일 선택 후 편집기창 내 코드 모두 복사
   2) Example01.java 파일을 선택하고 편집기창에 내용 붙여넣기
   3) 코드 중 class 부분에 Main을 Example01로 수정\
  &rightarrow; **주의**: `Example01` 부분을 클래스명이라고 합니다. 즉 클래스명을 변경합니다. 여기서 중요한 규칙이 있는데, 해당 클래스명과 파일명이 동일해야하고, 대문자로 시작해야 합니다.

3. 3번 라인의 내용을 지우면 자바 클래스의 기본형이 됩니다. 앞으로 작성할 모든 코드는 해당 기본형을 만들고 내용을 작성합니다.
![0-12_replace_code_2](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/6975b74e-4717-4cef-87ba-37de4f6560c3)

클래스의 기본형에서 `class`, `public`, `static`, `void`, `main` 등 나머지 다른 부분은 나중에 사용하게 됩니다. 우선 이 상태를 통으로 기억하고 사용하면 됩니다(우선 사용해보면서 익숙해져 봅시다). 

## 2. 코드 작성 
이제 코드를 아래와 같이 작성해봅니다. 들여쓰기 위치에 주의해서 작성합니다.
```
public class Example01 {
  public static void main(String[] args) {
    // 화면에 내용 출력하는 예제 <-- 주석은 "//" 사용

    // 내용 출력 후 줄 바뀜
    System.out.println("Hello Java World");

    // 내용만 출력하기, 줄 안 바뀜
    System.out.print("Back-end");
    System.out.print("Programmer");

    // 내용 없이 줄바꿈만 출력
    System.out.println();
  }
}
```

`System`이 뭔지 `out`이 뭔지 다 개별적인 의미가 있지만 여기서는 이렇게 한꺼번에 사용하면 큰따옴표 "" 안의 내용을 화면에 출력해준다라고 알면됩니다.

```
System.out.println("...");
```

조금 더 알아보자면
  1) `println`처럼 ln까지 써주면 내용을 출력하고 줄바꿈을 해줍니다.
  2) ln 없이 `print`만 입력하면 줄바꿈이 생기지 않습니다.
  3) 내용을 입력하지 않고 println만 사용할 수도 있씁니다. 이 경우 줄바꿈 처리만 합니다.

기본형 안에서 문장을 입력할 때 문장의 끝을 표시하기 위해 세미콜론(;)을 문장 마지막에 입력합니다.\
슬래시(/) 두 개를 연속해서 입력하면 코드에 주석을 달수 있게 됩니다(주석은 컴팡리 대상에서 제외됩니다). 

#### To Do 
1. Replit 우측 콘솔창을 마우스로 클릭하고 다음과 같이 입력해 자바 소스 파일을 바이트 코드로 컴파일 합니다.
```
javac Example01.java
```
**주의**: 파일명은 대소문자를 정확히 입력해주어야 합니다. 컴파일 할 때는 확장자까지 입력합니다. 

2. 1~2초 커서가 깜빡이다가 프롬프트가 다음 줄로 바뀝니다. 아무런 메시지 없이 다음 프롬프트 화면이 뜨면 정상적으로 컴파일 된겁니다. ls 명령어를 입력해서 "Example01.class"가 생성되었는지 확인합니다.\
  ![0-13_check_compile](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/cab42d6c-a684-4ec1-ba69-0e982fe46fa8)

3. `java` 명령어를 이용하여 실행시켜봅니다.
```
java Example01
```
**주의**: 파일명은 대소문자를 정확히 입력해주어야 합니다. 실행할 때는 확장자를 입력하지 않습니다. 

![0-14_run_file](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/400bcbad-8df9-48f8-bc1a-215ba4aa2bdf)

코드 설명을 해보겠습니다.
  1) "Hello Java World"를 출력하고 줄 바뀜
  2) "Back-end"를 출력하고 줄이 바뀌지 않음
  3) "Programmer"를 출력 후에도 줄이 바뀌지 않음
  4) 마지막 내용 없이 줄만 바뀜 

모든 주석은 출력되지 않고 있습니다. 우리가 작성한 코드대로 실행되고 있는 것을 확인할 수 있습니다.
