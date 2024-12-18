# 13 패키지와 클래스 패스
- 클래스의 경로를 지정하는데 사용하는 클래스 패스와 패키지를 알아봅니다.
- 참고로, 클래스 패스는 자바 가상 머신이 클래스를 찾기 위한 탐색 경로, 패키지는 관련이 있는 클래스와 패키지를 묶어 놓은 것을 말합니다.

## 1. 클래스 패스 
자바 프로그램을 실행하려고 우리가 선행 학습 때 했던 방법을 생각해봅시다. 
```
java Exam01
```

이런 식으로 클래스를 실행시켰습니다. java가 실행되면서 자바 가상 머신이 만들어지고, Exam01 클래스 파일을 찾아서 실행시켜주는 것인데 이때 Exam01.class가 같은 폴더에 있었습니다. 

이렇게 .class 파일이 실행시키는 폴더와 같은 폴더에 있을 때는 자바 가상 머신이 클래스를 찾아서 실행를 할 때는 어려움이 없습니다. 하지만 실행시키는 폴더와 클래스 파일이 다른 폴더에 있다면 어떻게 실행시켜야 할까요? 

자바 가상 머신이 클래스를 실행시키는 방법은 아래와 같습니다. 

1. 같은 폴더에서 클래스 파일을 찾아서 실행해줍니다.
2. 경로를 지정했다면 그 경로에 있는 클래스 파일을 찾아서 실행해줍니다.
   - 경로 지정은 클래스 패스를 이용할 수 있습니다.
   - 경로 지정은 패키지를 이용할 수 있습니다.
3. 같은 폴더나 지정된 경로에서 클래스 파일을 찾지 못했다면 클래스 패스에 지정된 폴더에서 찾아서 실행해줍니다.

이번 예제는 IDE(Intelli J 혹은 이클립스)에서 코드를 작성하고 '명령 프롬프트(터미널)'에서 실행을 해보겠습니다. 

#### Todo 01 Chapter13 프로젝트에 Apple.java와 Ex01_ClassPath.java를 다음과 같이 생성합니다.
![226_classpath_example_code_structure](https://github.com/user-attachments/assets/0fd58354-8ebf-4397-a7db-cef4c10b294b)

<img width="960" alt="224_classpath_example_class_code" src="https://github.com/user-attachments/assets/9a263c1f-3562-475a-b841-2d96ce67f616" />
<img width="955" alt="225_classpath_example_01" src="https://github.com/user-attachments/assets/d193423b-2668-4413-a762-2110a26e1fe6" />


Ex01_ClassPath(2번째 코드) 클래스에서 `1번`Apple 클래스를 이용해 객체를 생성하고 `2번`에서 메서드를 호출합니다. 두 클래스가 같은 폴더에 있기 때문에 Ex01_ClassPath 클래스에서 Apple 클래스를 사용할 수 있는 겁니다. 

이제 명령 프롬프트(터미널)환경에서 직접 실행해보겠습니다. 해당 작업은 Mac 환경을 기준으로 합니다. 

#### Todo 02 Mac에서 '터미널'을 실행해줍니다. 그리고 작업할 디렉토리로 가줍니다. 
![227_open_terminal](https://github.com/user-attachments/assets/9708ffba-218b-4aac-8cab-13a469172cb8)

#### Todo 03 이제 컴파일을 합니다. 
```
javac Ex01_ClassPath.java Apple.java
```
여기서 중요한 점은 모든 java 파일을 컴파일 해야한다는 점입니다.

컴파일이 되었으면 아래와 같이 class 파일이 생성됩니다. 
![228_check_classfile](https://github.com/user-attachments/assets/b7363d7a-6317-49f0-bf61-05e585e623e6)


#### Todo 04 이제 실행해봅니다. 
원래 `java Ex01_ClassPath` 명령어를 입력해서 실행해야 하지만, 아래와 같이 에러가 발생합니다. 
![230_run_example01_error](https://github.com/user-attachments/assets/e906445e-5dc6-4d49-adf3-0f41db46f81e)

에러의 내용은 Java 프로그램을 실행할 때 클래스 경로(classpath)에 지정된 클래스 파일을 찾을 수 없다 라고 나오는데 이때 클래스 패스 설정을 해서 아래와 같이 명령어를 입력해줍니다.
```
java -cp .. Chapter_13.Ex01_ClassPath
```
![229_run_exmaple01](https://github.com/user-attachments/assets/bdb253e3-d2ad-4e1e-abc6-71e2c1d534b3)

제대로 결과가 출력됨을 확인할 수 있습니다. 

### Todo 05 또 다른 상황을 만듭니다. 만약 아래와 같이 Apple.class 파일을 sub 디렉토리에 옮겨 봅니다.

![231_move_apple_class](https://github.com/user-attachments/assets/f3af8ec7-f15b-4b80-83a0-edd7e66fa554)

### Todo 06 다시 Ex01_ClassPath를 실행시켜봅니다.
![232_error2](https://github.com/user-attachments/assets/3cb9864d-cb5d-4cb8-809e-37ef0d953e1b)

NoClassDefFoundError: Apple 에러가 납니다. 객체를 new(객체 생성)하려고 하는데 해당 클래스 파일을 찾을 수 없다는 에러입니다. 이때도 클래스 패스를 사용하게 됩니다. java를 실행할 때, 옵션으로 클래스 패스를 지정해 클래스 패스에 지정된 폴더에서도 클래스를 찾아달라고 지정하고 실행 합니다. 

### Todo 07 아래와 같이 클래스 파일을 해당 디렉토리에 생성하도록 컴파일 하고 sub 디렉토를 클래스 경로에 추가한후 실행합니다.
![233_classpath_result1](https://github.com/user-attachments/assets/58ad13ce-8f53-4724-96f6-ea568ef1679d)

- 앞의 `.`은 현재 폴더를 클래스 패스에 포함시키라는 뜻입니다.
- 여기에서는 현재 폴더와 현재 폴더의 하위 sub 폴더까지 클래스 패스에 추가됩니다.
- 폴더들의 구분은 `:`[콜론](윈도우는 `;`[세미콜론])으로 해줍니다.
- 경로는 지금처럼 상대 경로로 지정해줄 수도 있고 절대 경로로 지정해줄수 있습니다.

아까는 클래스 파일들이 같은 폴더에 없어서 에러가 났지만, 지금은 클래스들이 같은 폴더에 있지는 않아도 클래스 패스에 있는 폴더에서 찾을 수 있기 때문에 에러가 발생하지 않습니다. 이렇게 옵션으로 클래스 패스를 매번 지정하여 실행하는 방법은 불편하기 때문에 패키지를 사용하게 됩니다. 

**`참고`**: **환경 변수로 클래스 패스 지정하기**\
클래스 패스를 옵션으로 지정하여 실행하는 것은 불편하기 때문에 영구적으로 패스를 지정할 수도 있습니다. java를 실행하기 위해 환경 변수 PATH를 설정한 기억이 있을 겁니다. 자바 클래스 패스 지정 역시 '시스템 환경 변수 편집'에서 CLASSPATH 변수를 만들어 클래스 패스로 사용할 폴더들을 등록해주면 됩니다. 

하지만 다음과 같은 문제가 있습니다. 

대규모 개발 프로젝트는 혼자서 진행이 힘들기 때문에 팀을 구성하여 작업을 진행하게 되고, 그러면 공동 작업자가 많아집니다. 더구나 한 폴더에서 작업을 하게 되면 클래스가 많아지게 되고 관리가 힘들게 됩니다. 공동 작업자가 많으면 폴더에서 클래스 파일의 이름이 중복될 수도 있습니다. 여기서도 네이밍의 문제가 나옵니다. 그래서 폴더를 나눠서 관리를 하게 되는데 불편하다고 클래스 패스를 너도 나도 등록하면 결국 클래스명이 또 다시 겹치게 됩니다. 

## 2. 패키지 
많은 클래스를 다루는 대규모 프로그램을 작성하는 경우, 이름이 같은 클래스들을 사용해야 하는 상황이 발생할 수 있습니다. 한 폴더에서 클래스 파일이 많아지면 클래스명이 충돌할 수 있는데, 충돌을 방지하는 가장 효과적인 방법은 폴더를 나누어 관리하는 것입니다.

자바에서는 패키지(package)는 관련이 있는 클래스를 묶어 폴더로 구분하여 관리하는 기법인데, 패키지를 사용하면 클래스명이 충돌하는 것도 방지할 수 있습니다. 

![234_introduce_package](https://github.com/user-attachments/assets/0c3de5bd-3022-4587-af88-6783416c69b1)

패키지를 이용하는 파일은 현재 src/Chapter13 폴더에 있습니다. 여기서 java가 실행됩니다. 패키지명은 클래스가 있는 폴더명을 단계대로 차례 차례 가리킨다고 보면 됩니다. 그래서 Banana.class는 현재 폴더 아래 com 폴더 아래 study 폴더 아래 위치하게 됩니다. 패키지를 이용하는 파일이 있는 현재 폴더와 클래스가 있는 폴더가 서로 다르기 때문에 현재 폴더에서 Banana 클래스를 이용하려면 public으로 접근 제한자가 지정되어 있어야 합니다. 

이제 예제를 이용해보겠습니다. 

#### Todo 01 Intelli J에서 'Chapter_13를 선택' &rarr; '우클릭한 후' &rarr; 'New' &rarr; 'Package'를 선택합니다.
![235_make_package](https://github.com/user-attachments/assets/4e1e9873-5913-45ac-99e8-f9cbb8a085a5)

#### Todo 02 패키지를 만드는 창이 뜨면 'com.sutdy' 입력합니다. 이렇게 입력하면 현재 Chapter13 폴더 아래 com 폴더를 만들고 그 폴더 아래 다시 study 폴더를 만들어줍니다.
![236_package_name](https://github.com/user-attachments/assets/8a913d54-0c05-48fb-a830-e8ef7202e665)

#### Todo 03 그리고 해당 폴더(패키지)안에 Banana.java 파일을 만들어줍니다.
![237_diractoty_package](https://github.com/user-attachments/assets/54a25a5e-5c8b-44a9-8823-0d08171f8239)

#### Todo 04 만든 Banana.java 파일에 아래와 같이 코드를 입력해줍니다.
![238_package_example_code1](https://github.com/user-attachments/assets/06d1925f-e0bc-4685-9fe5-f109f122a4a7)

#### Todo 05 이제 Banana 클래스를 사용하는 클래스를 만들어보겠습니다. 'Ex02_PackageUse' 클래스를 만들어 추가해줍니다. 이번에는 패키지명이 들어가면 안 됩니다. 제대로 만들어지면 아래와 같은 구조가 됩니다.
![240_diractory_package_2](https://github.com/user-attachments/assets/b986ea70-49ec-4b7b-b23b-25a509919e75)

#### Todo 06 'Ex02_PackageUse.java'에 다음과 같이 코드를 작성해줍니다.
![239_package_example_code2](https://github.com/user-attachments/assets/6fa3d4d3-a8d2-4f52-af84-62d081a0f183)
![241_package_example_code2_result](https://github.com/user-attachments/assets/e47b1b49-14cc-40b9-8107-9ef35b3949c5)

`1번`Apple 클래스는 같은 폴더에 있으므로 이전과 동일한 방법으로 사용하면 됩니다. 

`2번`Banana 클래스는 다른 폴더에 있으므로 클래스명만 사용하면 찾을 수 없기 때문에 에러가 발생합니다. 

`3번`Banana 클래스는 패키지명까지 함께 Chapter_13.com.study.Banana라고 적어주어야 합니다. 이러면 현재 폴더 아래 com 폴더, 그리고 come 폴더 아래 study 폴더에서 Banana 클래스를 찾아옵니다. 

`4번` 객체가 정상적으로 만들어지기 때문에 메서드를 호출할 수 있습니다. 

`Tip` 패키지명은 보통 삼 단계 이상으로 만듭니다. 일 단계로는 아직도 이름의 중복이 많이 발생할 수 있기 때문입니다. 그리고 패키지명은 다 소문자로 만듭니다. 그래야 클래스명과 구분할 수 있기 때문입니다. 임포트할 때 보면 소문자로 쓰여 있는 곳까지가 패키지명이 되고 마지막의 대문자로 시작하는 한 단어가 클래스명이 됩니다. 

## 3. 패키지로 문제 해결 
이제 이름이 겹치는 상황은 가정하여 어떻게 구분하여 사용하는지 예제로 만들어보겠습니다. 

우리 회사에 원의 넓이와 둘레를 구해달라는 개발 의뢰가 들어왔습니다. 마침 여유가 있는 부서가 두 군데 있었는데, area 부서와 circumference 부서 입니다. area 부서는 원의 넓이를 구하게 하고 circumference 부서는 원의 둘레를 구하게 했습니다. 이제 두 부서에서 클래스를 만들어오면 클래스를 이용하여 원의 넓이와 둘레를 구하기만 하면 될 것 같습니다. 그런데 문명의 혜택도 비슷하게 받았고, 공부도 비슷하게 한 사람들이기 때문에 작명 실력도 비슷한 것 같습니다. 

두 부서 모두 클래스명을 Circle로 만들어온 겁니다. 그런데 두 부서에서 만들어온 클래스 코드가 다 길어서 어느 한쪽을 수정하라고 하기에는 무리가 있어 보입니다. 이럴 때 패키지를 적용할 필요가 생기게 되는 겁니다. 

우리 회사는 기본적으로 패키지명을 다음과 깉이 사용하고 있습니다. 
- com.company

이제 여기에 각각의 부서를 붙여서 패키지명을 만듭니다. 원의 넓이를 구한 부서의 이름은 area이고 원의 둘레를 구한 부서의 이름은 length 입니다. 
- area 부서: com.company.area 패키지명 사용
- length 부서: com.company.circumference 패키지명 사용

이제 최종적으로 클래스명을 다음과 같이 만듭니다. 
- area 부서에서 만든 클래스: com.company.area.Circle
- length 부서에서 만든 클래스: com.company.circumference.Circle

이렇게 클래스에 패키지를 선언하고 폴더를 구성하고 사용하면 충돌이 일어나지 않게 됩니다. 

직접 예제를 만들어보겠습니다. 다음과 같이 클래스를 추가합니다. 
![242_package_example3_struceture](https://github.com/user-attachments/assets/00cffffe-fc8a-4ff2-81c8-98d3454debe5)

다음과 같이 각각의 코드를 작성해줍니다. 

- Chapter_13/come.company.area.Circle.java
![243_compay_area_circle_example](https://github.com/user-attachments/assets/4fc1174c-c75c-4c8a-9b9f-88523cafa729)
- Chapter_13/come.company.circumference.Circle.java
![244_company_circum_example](https://github.com/user-attachments/assets/eee78485-41ad-442c-b9e9-9b7e819703c7)
- Chapter_13/Ex03_CircleUsing.java
![245_ex03_class_example_code](https://github.com/user-attachments/assets/6a532875-682a-480b-af54-4139db836d8a)
![246_ex03_class_example_code_result](https://github.com/user-attachments/assets/746b850a-48da-4891-87f4-1b51a803acbb)

`1번` 넓이를 구하는 Circle 클래스는 패키지명까지 함께 Chapter_13.com.company.area.Circle 이라고 적어주어야 합니다. 

`2번` 둘레를 구하는 Circle 클래스는 패키지명까지 함께 Chapter_13.com.company.circumference.Circle 이라고 적어주어야 합니다. 

처음에는 클래스명이 Circle로 같아 같은 폴더에서는 에러가 발생하겠지만, 이렇게 패키지를 이용하여 물리적인 폴더를 구분하여 저장하고 사용하면 서로 충돌이 발생하지 않게 됩니다. 대신 **패키지명.클래스명**으로 코드가 길어지는 사소한 단점이 있습니다. 

## 4. 임포트 
그런데 이렇게 매번 패키지명을 붙여서 사용하게 되면 불편합니다. 클래스명이 같아서 충돌이 일어나는 경우가 아니라면 이번 예제처럼 임포트를 사용하게 됩니다. 이번에도 패키지명을 입력하지 말고 클래스명만 입력하여 Ex04_ImportUse 클래스를 추가합니다. 코드를 다음과 같이 작성합니다. 

![247_ex04_code](https://github.com/user-attachments/assets/64e41b47-e5db-44c4-9d48-2a6d84be64de)
![248_ex04_code_result](https://github.com/user-attachments/assets/f8aec2d1-b290-4ff2-9f4f-8f728490f065)

`1번`사용하고자 하는 클래스를 패키지명하고 같이 써서 임포트를 합니다. `2번`이렇게 임포트한 클래스는 패키지명 없이 사용할 수 있습니다. 

임포트할 클래스가 많을 때는 위와 같이 하나씩 임포트하는 것 또한 불편합니다. 그래서 여러 클래스를 한꺼번에 임포트해야 할 필요가 있습니다. 다음과 같이 작성하면 같은 패키지에 있는 클래스를 한 번에 임포트할 수 있습니다. 
```
import com.study.*;
```

다행인 것은 컴파일 과정을 거치면서 실제로 사용되는 것만 임포트된다는 겁니다. 

## 5. 자바에서 기본 제공하는 패키지와 클래스 
자바에서 기본으로 제공해주는 많은 패키지와 클래스는 다음과 같이 여러 가지가 있습니다. 

이미 몇 가지는 사용해보았습니다.

- java.util.Scanner
- java.util.Random
- java.lang.System

java.lang.System은 System.out.println(...) 메서드를 사용할 때 이용한 클래스 입니다. 앞에서도 잠깐 언급했는데, java.lang 패키지만 예외적으로 임포트가 필요 없고, 클래스명만 적어서 사용할 수 있습니다. 그 덕분에 이 패키지에 포함된 String 클래스도 별도의 임포트 작업 없이 여태 사용할 수 있었습니다. 

이런 패키지가 없다면 화면 출력이나 키보드 입력 등 자주 사용하는 기능조차도 개발자가 직접 구현해야 합니다. 자바가 제공하는 기본 패키지는 java로 시작하며, 확장 패키지는 javax로 시작합니다. 

| 패키지명 | 패키지에 포함된 클래스 |
|:---|:---|
| java.lang | 기본적인 클래스 |
| java.io | 입출력 관련 클래스 |
| java.net | 네트워크 관련 클래스 |
| java.util | 유틸리티 관련 클래스 |
| java.math | 수치 연산 관련 클래스 |
| java.text | 텍스트, 숫자, 날짜 등의 국제화 관련 클래스 |
| java.time | 자바 8이 지원하는 날짜 및 시간을 처리하는 클래스 |

### 학습 마무리 - 핵심 요약
1. 클래스 패스는 자바 가상 머신이 클래스를 찾는 탐색 경로입니다.
2. 패키지는 관련이 있는 클래스를 묶어 폴더로 구분하여 관리하는 기법인데, 패키지를 사용하면 클래스명이 충돌하는 것도 방지할 수 있습니다.
3. 매번 패키지명을 붙여서 사용하게 되면 불편합니다. 클래스명이 같아서 충돌이 일어나는 경우가 아니라면 임포트를 해서 사용하면 편리합니다.
