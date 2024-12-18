# 14 String 클래스 
- 자바 String 클래스에서 다루는 다양한 메서드를 알아봅니다. 
- String은 문자열을 처리하는 클래스 입니다. 우리가 여태 사용한 "Hello", "홍길동" 등은 String 클래스로 생성한 문자열 객체입니다.

## 1. String을 선언하는 두 가지 방법 
자바는 문자열을 사용할 때 String 클래스를 사용합니다. 문자열은 자바 코드에서 글자들을 큰따옴표로 묶은 값입니다.

| 구분 | 자료형 | 기호 | 예시 |
|:---|:---|:---|:---|
| 문자 | char | 작은따옴표 사용 | 'A', '가', '0', ... |
| 문자열 | String | 큰따옴표 사용 | "A", "가", "0", "홍길동", "안녕하세요?" ... |

자바에서 문자열을 생성하는 방법은 다음과 같이 두 가지입니다.

```
String str1 = new String("홍길동");
String str2 = "전우치";
```

단지 생성하는 방법에만 차이가 있는 것이 아닙니다. 자바 내부에서 이 두 문자열을 생성하고 처리하는 방법에도 차이가 납니다. 

첫 번째는 new 연산자와 문자열 리터럴 매개변수가 있는 생성자들을 이용하여 객체를 힙에 만들고 . 그참조 값을 변수에 대입하고 있습니다. 이때 객체를 무조건 새로 만듭니다. 

두 번째는 문자열 리터럴을 직접 대입하고 있습니다. 상수를 직접 대입할 수 없기 때문에 내부적으로 new String()을 호출하여 객체를 힙에 생성하고 그 참조 값을 변수에 대입해줍니다. 이때 매번 새로 만드는 것이 아니고 똑같은 문자열 리터럴로 이미 만들어져 있는 객체가 있다면 그 객체의 참조 값을 변수에 대입해줍니다. 

정말로 그런지 예제를 만들어 코드로 확인해보겠습니다. 
![249_String_Class_Use_example1](https://github.com/user-attachments/assets/93ce5d04-996f-4b14-91d0-f0a1d07ffc07)
![250_String_Class_Use_example1_result](https://github.com/user-attachments/assets/0769417d-bb43-4f3f-8bba-f5e0c8f40027)

딥버그 모드로 살펴보겠습니다. 

![251_String_Class_Use_example_deburg](https://github.com/user-attachments/assets/787b64ee-810d-411e-92a1-3f47fb9831dd)

변수 str1, 변수 str2에 담긴 객체의 참조 값은 서로 다를 것이 확실 합니다. new를 이용하여 생성된 객체는 무조건 새로 만드는 것이기 때문입니다. Intelli J에서 확인이 어렵지만, 이클립스에서 보면 우측에 id 값이 나오는데 서로 다름을 확인 할 수 있습니다. 

```
args = {String[0]@19} []
str1 = "자바프로그래밍"{@20}
str2 = "자바프로그래밍"{@26}
str3 = "자바프로그래밍"{@27}
str4 = "자바프로그래밍"{@27}
```

그리고 문자열 리터럴(소스 코드에서 문자열 값을 직접 나타내는 방법)을 직접 대입받은 `1번`str3도 처음에는 객체를 내부적으로 new를 이용하여 만들게 되므로 우측에 보듯이 참조 값이 27로 생성되어 있습니다. 

그리고 그 후 새로 만들어진 변수 str4에도 문자열 리터럴이 직접 대입됩니다. 이처럼 문자열 리터럴을 이용해 객체를 만들려고 할 때 이미 같은 문자열 리터럴을 사용하는 객체가 있으므로 그 객체의 참조 값 27을 대입시켜줍니다. 

이렇게 문자열 리터럴이 직접 대입되는 경우 새로 만들지 않고 기존 객체를 재사용하게 됩니다.

`참고` 자바는 문자열 리터럴을 직접 대입하여 만들어지는 객체를 힙의 String Constant Pool이라는 곳에서 일반 객체와 분리하여 따로 관리합니다. 

## 2. 문자열형 변수의 참조 비교
문자열의 내용을 비교하려면 어떻게 해야 할까요? 일단 생각나는 것이 비교 연산자입니다. 예를 들면 `if ( num ==3 )`이라는 코드를 사용하듯 문자열도 `if ( str1 == str2 )`로 비교할 수 있을까요? 아쉽게도 해당 방법으로는 문자열의 내용을 비교할 수 없습니다. 

조금 전까지 우리가 공부한 내용을 상기하면 문자열형의 변수에는 문자열이 아닌 문자열 객체를 참조하는 id값이 들어 있습니다. 그러므로 저 비교 연산은 변수의 값을 비교하게 되고, 그러면 참조하고 있는 id값들을 비교하게 됩니다. 우리가 원하는 객체가 가진 문자열의 내용을 비교하는 것이 아닙니다. 같은 객체인지 아닌지를 비교하게 되는 겁니다. 

예제 코드를 만들고 코드를 살펴보겠습니다. 
![252_ref_compare_example](https://github.com/user-attachments/assets/a23a5787-de86-4622-8aa6-de94b24f1147)
![253_ref_compare_example_result](https://github.com/user-attachments/assets/c30ac1f2-e3f3-48a4-8c64-1ecbe5395746)

변수의 생성은 앞의 내용과 같고 단지 비교 연산자를 이용해서 비교하는 부분이 추가되었습니다. 

`1번`에서의 비교 연산은 변수 str1과 변수 str2의 값을 비교합니다. 그리고 값은 서로 다른 객체의 id값을 가지고 있으므로 `2번`이 출력됩니다. 

변수 str3과 변수 str4에는 같은 객체의 참조 id가 들어 있고 `3번`에서 그 값을 비교하면 비교 연산의 결과로 `4번`이 출력됩니다. 
