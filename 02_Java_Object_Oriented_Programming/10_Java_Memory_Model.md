# 10 자바의 메모리 모델 
- 자바에서 사용하는 메모리 모델의 구조를 이해하면 자바 프로그래밍에 큰 도움이 됩니다. 이번 시간에는 자바에서 사용하는 메모리 모델의 구조를 알아보겠습니다.

## 1. 자바의 메모리 모델
`java.exe`가 실행되면서 자바 가상 머신이 만들어집니다. 이때 자바는 메모리 공간 활용의 효율성을 높이기 위해 메모리 공간을 여러 영역으로 나누게 됩니다. 자세한 내용은 자바 기술 문서에서 참고할 수 있습니다. 너무 자세한 범위까지 알 필요는 없으므로 우리에게 꼭 필요한 개념까지만 알고있으면 됩니다(아래의 공식 문서는 JAVA 17 기준입니다). 

<img width="1790" alt="133_java_document_se17" src="https://github.com/user-attachments/assets/4aa15579-345e-401e-853f-05424926735c">

[JAVA 17 Document](https://docs.oracle.com/javase/specs/jvms/se17/html/jvms-1.html)

자바 프로그램은 실행되면서 확보한 메모리 영역을 크게 메서드 영역, 스택 영역, 힙 영역으로 구분하여 사용합니다. 

<img width="900" alt="134_runtime_data_area" src="https://github.com/user-attachments/assets/e7729ae4-06aa-4220-b864-c50794c571fe">

#### 메서드 영역 
프로그램 실행에 대한 코드, 스태틱(Static) 변수 및 메서드, 런타임 상수 풀이 메서드 영역(Method Area)에 생성됩니다. 이 영역에 저장된 내용은 프로그램 시작 전에 로드되고 프로그램 종료 시 소멸됩니다. 런타임 상수 풀(Runtime Constant Pool)에는 컴파일 타임에 알려진 숫자 리터럴부터 런타임에 확인되어야 하는 메서드 및 필드 참조에 이르기까지 여러 종류의 상수가 포함됩니다.

#### 스택 영역
메서드가 호출되면 지역 변수, 매개변수가 프레임 형태로 생성되어 스택 영역(Stack Area)으로 쌓였다가 사라집니다. 이때 프레임 형태를 불투명한 빈 박스(Box) 형태로 이해하면 됩니다. 하나의 박스 안에서는 다른 박스 안의 내용을 알 수 없습니다. 그러므로 프레임 영역을 벗어난 다른 메서드의 변수들은 서로 참조할 수 없습니다. 앞서 변수의 사용 가능 범위에서 배운 내용이 프레임 형태로 적용됩니다. 

#### 힙 영역 
클래스의 객체(인스턴스), 배열이 new 연산자에 의해 힙 영역(Heap Area)에 동적으로 생성됩니다. 그리고 생성된 객체는 자동 저장소 관리 시스템인 가비지 컬렉터(Garbage Collector)에 의해 사용이 없음이 확인되면 자동으로 제거됩니다. C/C++과 달리 자바에서는 이렇게 자동으로 메모리 관리를 해줍니다.
