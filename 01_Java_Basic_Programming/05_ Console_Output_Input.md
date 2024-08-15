# 05 콘솔 출력과 입력 
- 우리는 이미 System.out.println()과 System.out.print()로 출력을 많이 해보았습니다. 그래서 이번 시간에는 출력을 간단히 정리하고, 입력을 더 살펴보겠습니다. 

## 1. 콘솔 출력 
콘솔은 컴퓨터를 대상으로 데이터를 입력 및 출력하는 장치를 총칭하는 말입니다. 대표적으로 키보드와 모니터가 콘솔 입출력 장치에 해당합니다. 

자바에서는 화면에 데이터를 출력하는 다양한 기능을 제공하는데, 이런 기능들을 메서들라고 부릅니다. 메서드 형태는 뒤에 소괄호가 붙어 있습니다. 모두 System.out과 연결해 사용합니다. 
- System.out.println()
- System.out.print()
- System.out.printf()

이 이중에서 처음 보는 printf()를 살펴보겠습니다. System.out.printf()는 문자열의 내용을 조합하여 출력하는 기능을 제공합니다. 예전 CLI(Command-Line Interface)환경에서는 정말로 많이 사용한 기능이지만, GUI(Graphical User Interface)를 사용하는 요즘에는 그 사용도가 많이 떨어졌습니다. 

사용 형식은 다음과 같습니다.
```
System.out.printf("포맷 문자열", 데이터, 데이터, 데이터, ...);
```
다음과 같이 씁니다. 

![1-64_output_printf_structure](https://github.com/user-attachments/assets/90862ac0-a980-473a-85c8-f4689023150c)

최종 출력 문자열 &rarr; `정수 : 10, 실수 : 3.14, 글자 : A, 글자들 : 홍길동`

포맷 문자열에 지정할 수 있는 서식은 다음과 같습니다. 

| 서식 지정자 | 출력의 형태 |
|:---|:---|
| %d | 10진수 정수 형태 출력  |
| %o | 8진수 정수 셩태 출력 |
| %x | 16진수 정수 형태 출력 |
| %f | 실수 출력 |
| %e | e 표기법 기반 실수 출력 |
| %g | 출력 대상에 따라서 %e 또는 %f 형태 출력 |
| %s | 문자열 출력 |
| %c | 문자 출력 |

- 참고: e 표기법이은 예를 들어 0.0000000001 이런 수를 수학에서는 보기 편하게 $$1.0 \times 10^{-10}$$ 처럼 표기합니다. 문서 작성기에서는 이런 표현이 가능하나 프로그래밍 언어에서는 저렇게 쓸 수가 없습니다. 그래서 e 문자를 사용하여 지수를 표시합니다.
  - $1.0 \times 10^{-10}$ &rarr; $1.0_e - 10$

<img width="809" alt="1-65_printf_example" src="https://github.com/user-attachments/assets/1b98aa0d-1276-484a-be0a-b31bee9f319b">
<img width="583" alt="1-66_printf_example_result" src="https://github.com/user-attachments/assets/0000c14a-bb58-4c9e-a947-94a2b62b360f">

1번 String 자료형이 나왔습니다. 글자들을 저장할 때 사용합니다. 글자들일 표현할 때는 쌍따옴표를 사용합니다. 2번 `printf()`는 줄바꿈을 하지 않습니다. 그래서 `\n` 특수 문자를 이용하여 줄바꿈을 합니다. 

3번은 실수를 출력하면 너무 길게 출력되므로, 소수점 아래 두 자리까지만 출력합니다. 

## 2. 콘솔 입력 
Scanner 클래스는 편리한 콘솔(키보드) 입력 기능을 제공합니다. Scanner 클래스는 선행 학습에서 우리가 만든 프로그램에서 메뉴 구성을 하고 메뉴를 선택할 수 있게 숫자를 입력받을 때 이미 사용해봤습니다. 이제 숫자뿐 아니라 다양한 데이터를 입력받을 수 있게, Scanner 클래스에서 제공하는 기능, 즉 메서드를 조금 더 살펴보겠습니다. 

이 메서드들은 한 번에 하나의 값만 입력받을 수도 있지만, 여러 데이터를 한 번에 입력받을 수도 있습니다. 여러 데이터가 한 번에 입력되면 입력된 내용은 공백이나 랩으로 구분하게 됩니다. 예제를 만들어 확인해보겠습니다. 

<img width="786" alt="1-67_scanner1_example" src="https://github.com/user-attachments/assets/633410b5-8526-4948-9792-3c26f57f1cad">
<img width="589" alt="1-68_scanner1_example_result" src="https://github.com/user-attachments/assets/b418c9a8-56df-4dfd-9be0-66c076f487cc">

일단 Scanner 클래스를 이용하여 입력을 받으려면 1번과 2번을 그대로 적용해주면 됩니다. 

3번에서 내용을 출력하고 입력될 때까지 프로그램 진행이 잠깐 멈추게 됩니다. 입력이 끝나고 Enter 값이 들어오면 다시 4번부터 프로그램이 진행됩니다. 

여러 숫자가 입력되면 일단 버퍼에 내용을 넣고 공백(스페이스)이나 탭으로 구분하여 4번에서 5번까지 하나씩 입력된 데이터를 변수에 대입하게 됩니다. 

이제 `netx()`와 `nextLine()` 메서드 기능을 구분할 수 있는 예제를 만들어보겠습니다. 

<img width="887" alt="1-69_scanner2_example" src="https://github.com/user-attachments/assets/abb9131b-9afe-4295-836d-59d8948e419a">
<img width="593" alt="1-70_scanner2_example_result" src="https://github.com/user-attachments/assets/e379e32d-68ed-49dc-9290-cb9fa7636541">

1번 nextLine() 메서드는 입력된 값을 Enter가 입력될 때 한 번에 줄 단위로 입력받습니다.
2번 next() 메서드는 입력받은 값을 일단 버퍼에 넣고 공백(스페이스)이나 탭으로 구분하여 입력을 구분하여 처리합니다.

### 마무리 - 핵심 요약 
1. 콘솔은 컴퓨터를 대상으로 데이터를 입력 및 출력하는 장치를 총칭합니다.
2. 자바에서 화면에 데이터를 출력하는 다양한 메서드를 제공합니다. `System.out`과 연결해 사용합니다.
3. Scanner 클래스는 편리한 콘솔(키보드) 입력 기능을 제공합니다.
