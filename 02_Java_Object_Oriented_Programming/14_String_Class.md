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

## 3. 문자열형 변수의 내용 비교
비교 연산자로는 내용을 비교할 수 없다는 것을 알았습니다. 그러면 문자열의 내용을 비교하려면 어떻게 해야 할까요? String 클래스는 많은 메서드를 제공하는데 그중 내용을 비교하는 메서드도 있습니다. 

내용을 단순히 '같다'를 비교할 때는 String 클래스의 equals() 메서드를 사용합니다. 그리고 내용이 비교되는 대상보다 '크다', '같다', '작다'를 비교할 때는 compareTo() 메서드를 사용합니다.

예제를 통해서 사용법을 알아보겠습니다. 

![254_contents_compare_example](https://github.com/user-attachments/assets/6a8d2fbe-cc1c-4432-9a97-e8e88ecf1ea6)
![255_contents_compare_example_resutl](https://github.com/user-attachments/assets/b1c08c89-9334-417d-9a3e-8592e07065c0)

`1번`, `2번`, `3번`에서 생성된 객체는 문자열 리터럴이 다르기 때문이 아니고 new에 의해서 만들어졌기 때문에 서로 다른 객체입니다. 

String 클래스의 equals 메서드에 의해서 비교되면 객체의 참조 id를 비교하는 것이 아니라 객체 안에 들어 있는 문자열의 내용을 비교해줍니다. 그래서 `4번` 메서드 호출의 결과는 문자열의 내용이 다르므로 `5번`이 실행됩니다.

`6번` A.compareTo(B)는 사전순으로 비교합니다. 어떤 문자열이 사전의 앞쪽에 나오는지를 비교해 그 결과를 정수로 반환해줍니다. 값이 0이면 서로 동일한 값이고, 값이 음수이면 A가 사전순으로 앞쪽에 있다는 겁니다. 반대로 결과가 양수이면 A가 사전순으로 B보다 뒤쪽에 있다라는 결과입니다. 그래서 `6번`의 반환값을 체크하면 자바는 대소문자를 구분하기 때문에 `7번`이 실행됩니다. 대문자 A로 시작하는 문자열이 소문자 a로 시작되는 문자열보다 사전순으로 앞쪽에 있기 때문입니다. 

`8번` compareToIgnoreCase() 메서드를 사용하면 모든 문자를 대소문자 구분없이 비교해줍니다. 그래서 `9번`이 실행됩니다. 

## 4. String 클래스 메서드
프로그래밍에서 문자열은 매우 많이 사용됩니다. 그래서 String 클래스는 문자열을 다루는 많은 메서드를 제공합니다. 
### 4-1. 문자열 합치기 
concat() 메서드로 두 문자열을 연결할 수 있습니다. 

<img width="853" alt="256_conacat_string_example_1" src="https://github.com/user-attachments/assets/c55b5ded-cef7-4a72-8c55-35d99847fa85" />
<img width="936" alt="257_conacat_string_example_1_result" src="https://github.com/user-attachments/assets/b4f7f03d-f8b7-4eeb-8f21-0eed0a8003bb" />

`1번` 변수와 변수를 이용하여 문자열을 합칠 수 있습니다. str1의 문자열의 str2 문자열을 합쳐서 새로운 문자열을 반환해줍니다. 

`2번`문자열 리터럴에 메서드를 바로 사용할 수도 있습니다. 

### 4-2. 문자열에서 문자 찾기
indexOf() 메서드는 문자열에서 매개변수로 돌아온 문자열의 위치를 찾을 수 있습니다. 

![258_indexOf_string_example](https://github.com/user-attachments/assets/2a7f6a39-f69e-468d-8d8e-ebc69094020e)
![259_indexOf_string_example_result](https://github.com/user-attachments/assets/f1bfcb5b-9021-4298-b0c0-ae08169216c0)

다음은 문자열에서 개별 문자들의 개별 위치를 나타내는 인텍스 값을 보여줍니다. 

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 |
|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|
| A | p | p | l | e | B | a | n | a | n | a | O | r | a | n | g | e |

`1번`indexOf() 메서드로 a가 처음 나오는 위치를 찾아옵니다. 참고로 대소문자를 구분합니다. 그러므로 첫 번째 소문자 위치인 6이 반환됩니다.

`2번`indexOf() 메서드에 찾을 문자와 찾기 시작할 위치를 지정하여 문자를 찾을 수 있습니다. 여기서는 8이 반환됩니다.

### 4-3. 문자열 자르기
substring() 메서드로 문자열에서 특정 위치의 문자열을 잘라낼 수 있습니다. 

![260_substring_example](https://github.com/user-attachments/assets/8e302aaf-0067-4fe9-92cf-956d1443d9fa)
![261_substring_example_result](https://github.com/user-attachments/assets/0446fa29-4ebf-4e2f-9bb1-e71f7abb4f99)

다음은 문자열에서 개별 문자들의 개별 위치를 나타내는 인텍스 값을 보여줍니다. 

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 |
|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|:---|
| A | p | p | l | e | **B** | a | n | a | n | a | **O** | r | a | n | g | e |

`1번`Banana 문자열이 시작하는 위치를 찾아옵니다. `2번`Orange 문자열이 시작하는 위치를 찾아옵니다.

`3번`substring(5, 11)은 5부터 10까지의 문자열을 반환합니다. `4번`substring(11)은 11부터 문자열의 끝까지 문자열을 반환합니다. 

### 4-4. 문자열의 길이 구하기 
length() 메서드로 문자열의 길이를 알아볼 수 있습니다. 

![262_string_length_example](https://github.com/user-attachments/assets/c5fa1b4b-c2b3-4b0d-b50d-633e0ef2cfa9)
![263_string_length_example_result](https://github.com/user-attachments/assets/b6229558-9c18-43d4-9a2e-097bc5cfb982)

`1번`length() 메서드를 이용하여 문자열의 길이를 구해옵니다.

`2번`charAt() 메서드를 이용하여 문자열에서 해당 인덱스의 문자를 가져올 수 있습니다.

`참고`: charAt() 메서드는 "8장 계산기 만들기" 프로젝트에서 사용자 키보드에 입력한 값을 비교할 때 사용해본적이 있습니다. 

### 4-5. 기본 자료형의 값을 문자열로 바꾸기
클래스 메서드를 이용하여 기본 자료형의 값을 문자열로 바꿀 수 있습니다. 다음은 메서드의 오버로딩 입니다. 
```
static String valueOf(boolean b)
static String valueOf(char b)
static String valueOf(double b)
static String valueOf(float b)
static String valueOf(int b)
static String valueOf(long b)
```

다음은 double형 자료를 String.valueOf()에 인수로 주는 코드입니다. 
```
double e = 2.718281;
String se = String.valueOf(e);
```

### 4-6. 자주 사용되는 String 클래스의 메서드들 
앞에서 살펴본 메서드 외에도 String 클래스에는 다음과 같은 메서드들이 있습니다. 
| 메서드 | 설명 | 
|:---|:---|
| boolean contains(String s) | 문자열 s를 포함하는지 조사합니다. |
| boolean startsWith(String s) | 시작하는 문자열이 s인지 조사합니다. |
| boolean endsWith(String s) | 끝나는 문자열이 s인지 조사합니다. |
| boolean isEmpty() | 문자열의 길이가 0이면 true를 반환합니다. |
| String toLowerCase() | 문자열을 모두 소문자로 변환합니다. |
| String toUpperCase() | 문자열을 모두 대문자로 변환합니다. |
| String trim() | 문자열 앞뒤에 있는 공백을 제거한 후 반환합니다. |
