# 07 while문 사용하기
- 프로그래밍을 할 때 반복적으로 어떤 일을 처리하고 싶을 때 반복문을 사용합니다. 자바는 반복문으로 `while`, `do-while`, `for`문을 제공합니다. 먼저 while문을 알아봅니다.
## 1. while문이란? 
while문이란 어떤 조건이 성립하는 동안 반복 처리를 실행하는 제어문입니다. while문 소괄호 안 연산식 결과가 true이면 중괄호 안의 내용이 실행됩니다. 그리고 다시 소괄호 안 연산식 결과를 체크합니다. 이렇게 계속 반복이 됩니다.\
이때 반복 횟수를 세는 변수를 만들어 반복 횟수를 지정할 수 있습니다. 

![0-21_while_structure](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/547d6168-8dbf-41e4-a2ac-5d62c94b7dce)

조금 구체적인 형태로 코드를 구성해보았습니다.

![0-22_while_structure](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/9b22c66c-b531-433e-97c4-4143ce2f267f)

먼저 반복 횟수를 체크할 정수형의 "num" 변수를 만들고 정수 0을 값으로 대입합니다.\
그리고 while문 소괄호 안 "num 변수의 값이 5보다 작다"라는 연산식 결과가 true 이면 중괄호 안의 내용이 실행됩니다. 이때 "Development"를 출력하고 그 다음 라인에서 반복 횟수를 체크하는 변수의 값을 1증가 시킵니다.
