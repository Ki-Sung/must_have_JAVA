# 06 제어문
- 제어문이란 프로그램의 진행 흐름을 필요에 따라 변경하고 싶을 때 사용합니다. 프로그램은 코드가 입력된 순서대로 실행되는데 이렇게만 해서는 단순한 동작만 처리할 수 있습니다. 상황에 따라서는 '연산 결과에 따라 다른 동작을 수행'하거나 '동일한 처리르 반복'해야 합니다. 이럴 때 제어문을 사용하게 됩니다.
- 자바에서 다루는 제어문 중 조건문과 반복문에 대해 알아봅니다. 

## 1. 조건문
조건문은 조건식의 결과가 'true'인 경우와 'false'인 경우의 두 가지 흐름을 만들어낼 수 있습니다. 자바에서 다음 세 가지 방법으로 조건을 분기시킬 수 있습니다. 
- if문을 사용한 조건 분기(제어문 사용)
- 조건 연산자를 사용한 조건 분기(연산자 사용)
- switch문을 사용한 조건 분기(제어문 사용)

### 1-1. if문 
if문을 사용하여 조건을 분기시키는 방법과 조건 연산자를 사용한 조건 분기 방법은 이미 앞(선행 학습)에서 살펴보았습니다. 다만 if문에서는 다음을 한 번 더 상기하면 좋습니다. 

![1-71_if_statement_structure](https://github.com/user-attachments/assets/40e0216f-b496-4789-bb65-265fec839e43)

앞에서도 언급했지만 해석하는 습관도 중요합니다. 
- x가 1보다 크면 중괄호 안의 내용을 실행한다. &larr; 이것은 사람의 생각입니다.
- x > 1을 비교 연산합니다. 그리고 if문은 조건식의 연산 결과가 true 이면 중괄호 안의 내용을 실행합니다. &larr; 컴퓨터의 동작 순서입니다.

if문이 조건식의 결과를 만들어내는 것이 아니고 조건식 결과를 단순히 체크만 하는 겁니다.  

그리고 앞에서 설명하지 않은 내용이 하나 있는데, if문이 실행되는 중괄호 안의 영역에서 실행되는 수행문이 하나만 있다면 중괄호는 생략할 수 있습니다. 

![1-72_if_statement_exmaple](https://github.com/user-attachments/assets/2f42367d-6207-4db6-bc86-3f21ba9051a1)


![1-73_if_statement_example_result](https://github.com/user-attachments/assets/e2ab3a8d-38e7-4fd2-85c3-2d1877d06c4b)

"1번"은 우리가 처음 배운 방식입니다. 그래서 정상 출력됩니다. if문의 중괄호 안의 실행 문장이 이렇게 한 문장밖에 없다면 중괄호를 생략할 수 있습니다. num의 값이 100으로 50보다 크므로 "2번"이 실행되고 내용이 출력됩니다. "3번"처럼 같은 줄에 작성할 수도 있습니다. 역시 내용이 출력됩니다. 

"4번", "5번", "6번"에서 원래 "5번"이 없다고 가정합시다. 그러면 num 변수의 값이 50보다 작다는 명제는 거짓이므로 "6번"이 실행되지 않습니다. 그런데 갑자기 num 변수의 값이 궁금해서 "5번"을 추가했습니다. 이러면 문제가 발생합니다. 이 if문은 중괄호가 없기 때문에 "5번"만 if문의 실행 영역으로 판단합니다. 그런데 관계가 없어진 "6번"의 들여쓰기 레벨이 자동으로 앞으로 나오지 않기 때문에 우리는 if문에 여전히 속해 있다고 착각을 하게 됩니다. 하지만 "6번"은 그냥 출력문이기 때문에 그냥 출력이 됩니다. 

그래서 처음 자바의 if문을 사용하시는 분들은 가급적 중괄호를 생략하지 않는 편이 좋습니다. 코드를 작성하다 보면 위에서처럼 디버깅 메시지를 출력하는 코드를 넣게 되는 경우가 많은데, 이때 이미 중괄호가 있다면 아무 문제도 없지만, 중괄호가 생략되어 있으면 중괄호를 추가해줘야 하는데, 처음 사용하시는 분들은 이걸 자주 까먹습니다. 그러면 지금처럼 의도와 다른 결과를 만들게 됩니다. 

### 1-2. switch문
switch문을 사용하면 많은 선택지를 가지는 '분기 처리'를 할 수 있습니다. 조건식의 결과와 일치하는 case문에 작성된 문장을 실행합니다. 조건식의 값이 어떤 case와도 맞지 않으면 default로 넘어가게 됩니다. 그리고 각 case의 마지막에는 break문을 사용해서 선택한 처리만을 실행하도록 합니다. 

![1-74_switfh_statement_structure](https://github.com/user-attachments/assets/2f17bee0-74e8-4bf1-8589-14690ea9b3cd)

#### switch문 기본 사용법
switch문 기본 사용법을 예제를 만들어 살펴보겠습니다. 

![1-75_switch_statement_example_1](https://github.com/user-attachments/assets/dc87c895-ba31-4933-9374-7d4fe4aceca2)
![1-76_switch_statement_example_1_ressult](https://github.com/user-attachments/assets/e7433a8c-48af-4952-a53d-1fcd18ce8f68)

"1번" switch문의 조건식에는 이렇게 연산식을 넣어줄 수도 있고 그냥 변수만 넣어줄 수도 있습니다. 조건의 분기가 많을 때는 if문을 사용한 조건 분기보다 편하게 사용할 수 있습니다. 

#### break문을 생략하기
switch문에 break가 없을 때는 다음과 같이 실행됩니다. 앞 예제의 코드에서 break문 두 개를 주석 처리하고 다시 실행해봅니다.

![1-77_switch_statement_execpet_break](https://github.com/user-attachments/assets/64db1c2e-9583-475b-821b-1e5899a6225d)

switch문 안의 모든 case문 내용이 전부 실행되었습니다.

이런 점을 조금 응용하여 다음과 같은 에제를 간편히 만들 수도 있습니다. 

![1-78_switch_statement_example_2](https://github.com/user-attachments/assets/575f8f36-2675-4e15-9754-3d654ee541cd)
![1-79_switch_statement_example_2_ressult](https://github.com/user-attachments/assets/9ee847ea-63f1-4c6d-ba0e-3113b7c66376)

case 1 부터 5까지 break문을 없애 "주중"이 출력되도록 했습니다. 이와 같이 여러 개의 값을 묶어서 처리할 수도 있습니다. 

*참고 - break 효과: break는 반복문과 switch문에서만 사용할 수 있습니다. 실행 흐름을 중단시키고 해당 중괄호 밖으로 빠져나갑니다.

#### 조건식에 스트링 사용하기 
그리고 java 7 이후로 자바도 switch문에 스트링을 사용할 수 있습니다. 예제로 확인해보겠습니다. 

![1-80_switch_statement_example_3](https://github.com/user-attachments/assets/ba2a0eb3-705b-4a32-a8f5-d49ccb3b773a)
![1-81_switch_statement_example_3_ressult](https://github.com/user-attachments/assets/122ed079-8d9d-4fc2-a9b6-1add9bad2e55)

switch문의 조건식에 이렇게 스트링 변수나 스트링 값을 사용할 수 있습니다.

## 2. 반복문 
반복문은 어떤 조건이 성립되는 동안 반복 처리를 실행하는 제어문입니다. 자바에서 반복문을 다음 세 가지 방법으로 만들 수 있습니다. 
- for문을 이용한 반복
- while문을 이용한 반복
- do-while문을 이용한 반복

### 2-1. for 문을 이용한 반복 
반복문도 중괄호 안의 영역에서 실행되는 수행문이 하나만 있으면 중괄호를 생략할 수 있습니다. 그러나 처음 코드를 접하신 분들이라면 가급적 생략하지 않고 사용하는 것을 권장드립니다. 예제를 보겠습니다. 

![1-82_for_statement_example1](https://github.com/user-attachments/assets/98c4e71b-0e7a-4ca9-87d5-af4e1a1c96e0)
![1-83_for_statement_example1_result](https://github.com/user-attachments/assets/c7ef58de-c216-4bf4-9dec-8839f895fe93)

"1번" 구구단의 2단을 2 * 2 부터 출력하고 있습니다. 

"2번" 구구단의 3단을 3 * 2 부터 출력하고 있습니다. for 문에서 실행하는 문장이 한 줄이라 중괄호를 생략한 모습입니다. 

"3번" 구구단의 4단을 4 * 2 부터 출력하고 있습니다. 역시 for 문에서 실행하는 문장이 한 줄이라 중괄호를 생략했고 같은 줄에다 작성까지 했습니다. 실행은 잘 되지만 보통 이렇게 사용하지 않습니다. 

"4번" 구구단의 5단을 5 * 2 부터 출력하고 있습니다. 주석에 적은 것처럼 i 변수의 값이 궁금해서 "5번"을 추가할 수도 있습니다. 주석을 풀면 "6번"이 for문과 관계가 없어집니다. 그래서 i 변수가 선언되지 않았다고 에러를 냅니다. 저 i 변수는 for문 안에서만 사용할 수 있기 때문입니다.

![1-84_for_statement_example1_error_result](https://github.com/user-attachments/assets/b9a5ec18-d687-4047-8aaf-93f623fde478)

### 2-2. for 문 요소의 생략, 응용 
for문을 구성하는 요소는 상황에 따라 생략할 수 있습니다. 증감식에는 보통 `++` 등 단항식을 이용하는데 구체적인 산술 연산식을 작성할 수도 있습니다. 

![1-85_for_extension_example](https://github.com/user-attachments/assets/d23cb3de-95b0-4b48-97a3-9c10bbc71d60)
![1-86_for_extension_example_result](https://github.com/user-attachments/assets/cb74ce05-7348-451d-af6f-4e9c48b6bab6)

실행 결과를 보면 세 for문 모두 10보다 작은 정수 중에서 2의 배수를 잘 출력하고 있습니다. 

"1번" for문 안에 초기식을 생략했습니다. 변수는 for문 바깥에서 선언한 i를 사용하고 있습니다."2번" 2로 나누어서 0인 경우만 출력하므로 짝수, 또는 2의 배수를 출력하는 문장입니다. 

"3번" i 변수의 값을 0으로 다시 초기화 합니다. "4번" for문 안에 초기식, 증감식을 생략했습니다. for문 바깥에서 선언한 i 변수를 for문 안에서 사용합니다. "5번" for문 안의 중괄호 안에 있는 조건식에서 검사하는 변수의 값을 증가시키고 있습니다. 

"6번" 증감식은 단항식만 사용할 수 있는 것이 아니라 상황에 맞는 식을 구성할 수 있습니다. 

### 2-3. while문을 이용한 반복
while문은 반복의 횟수보다는 처리 조건이 정해져 있을 때, for문은 반복의 횟수가 정해져 있을 때 사용하면 좋습니다. 

다음은 while문과 if 조건문을 섞어 사용해본 예제입니다. 
![1-87_while_exmaple](https://github.com/user-attachments/assets/d9f594ff-a7b6-4738-8bf1-f370cee54d3c)
![1-88_while_exmaple_result](https://github.com/user-attachments/assets/604e5b6b-eb13-484f-920d-6d79a093a4b5)

"1번" num 변수의 값을 먼저 증가시키고, num 변수에 값이 100보다 작은지 비교 연산을 합니다.

"2번" 5의 배수가 아니거나 7의 배수가 아닌지를 검사합니다. "3번" 아래 코드를 실행하지 않고 다시 while문의 조건식을 검사하러 위로 올라갑니다. "2번"의 조건 비교문이 어렵다면, "4번"과 "5번" 처럼 이해하기 쉽게 나눠서 비교할 수 있습니다. 

"6번" 5와 7의 배수인 경우에만 count 변수의 값을 증가시킵니다. "7번" 5와 7의 공배수를 출력합니다. 

"8번" 100보다 작은 정수 중에서 5와 7의 공배수의 총 개수를 출력합니다.

