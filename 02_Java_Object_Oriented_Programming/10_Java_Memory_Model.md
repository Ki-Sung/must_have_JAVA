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

## 2. 디버깅하며 배우는 스택 영역 관리
매개변수와 지역 변수가 스택의 영역에서 어떻게 처리되는지 예제로 살펴보겠습니다.

#### To Do 01 - 먼저 프로젝트를 아래와 같이 만들고 클래스 파일도 만들어 줍니다. 
![135_memory_stack_code_1](https://github.com/user-attachments/assets/7348a4a8-a42c-4e7a-a63a-d2fbf6560668)

#### To Do 02 - 코드를 아래와 같이 Ex01_MemoryInStack.java에 작성 합니다. 
![136_memory_stack_code_2](https://github.com/user-attachments/assets/bad4b937-c082-4a3f-86a5-3c708d9a6b7c)

스택 영역에서 변수가 어떻게 처리되는지 확인하려면 디버깅 코드로 들어가야 합니다. 디버깅 모드에서 정지를 하려면 브레이크포인트가 필요합니다. 브레이크포인트를 설정해봅시다. 

#### To Do 03 - IntelliJ에서 4번 코드 라인 빈 공간으로 커서를 갖다 대고 좌클릭을 합니다.
![137_setup_breakpoint](https://github.com/user-attachments/assets/c7f30edc-5609-4221-9b70-b4529d78a7bc)

코드 라인 빈 빈 공간을 좌클릭하게 되면 위와 같이 해당 코드 라인에 빨강색으로 표시된 것이 보일 겁니다.

브레이크 포인트가 잘 지정되었으니 디버그 모드로 실행을 해서 스택 영역에서 변수가 어떻게 처리되는지 확인하겠습니다. 

#### To Do 04 - IntelliJ에서 Run 탭에 Debug 'Ex01_MemoryInStack'을 클릭해줍니다. 
![138_run_debuger](https://github.com/user-attachments/assets/5e0f10ad-4c6b-4b62-8235-88f1a7cf554e)

이렇게 하면 디버그 모드로 변환됩니다.

프로그램은 우리가 브레이크포인트를 설정한 4번 라인까지 실행되고 5번 라인에 멈춰 있습니다. 아직 5번 라인이 실행된 것은 아닙니다.

전체 화면을 보면 "1번" Ex01_MemoryInStack.main() 메서드가 호출되면서 main() 메서드에 관한 프레임이 스택 영역에 생성되었습니다. 아래쪽의 "3번"은 해당 프레임만의 스택 영역 상황을 표시해줍니다(역기서 하나의 프레임은 하나의 빈 박스 정도로 이해하면 됩니다).

정리하면 main() 메서드가 실행되면서 main() 메서드에서 사용될 매개변수와 지역 변수를 처리할 프레임이 스택 영역에 생성되고 "4번" 매개변수 args가 프레임안에 생성된 것 입니다.

![139_debug_mode](https://github.com/user-attachments/assets/7b0894eb-de32-48e7-88a2-defe68418633)

프로그램의 진행은 다음의 메뉴 아이콘이나 `F7`, `F8`을 눌러 사용할 수 있습니다.
![140_step_into_step_out](https://github.com/user-attachments/assets/ab477cba-ee39-4327-9466-8f49b02511ea)

`F7`, `F8` 명령은 일반적인 코드 진행은 똑같고 메서드를 만났을 때 처리가 다릅니다. 
- `F7` Step Into: 메서드가 있으면 그 메서드 내부 코드로 진입합니다. 
- `F8` Step Over: 메서드를 만나면 메서드 내부 코드로 진입하지 않고 결과만 반환받아 실행한 뒤 다음 줄로 넘어갑니다.

#### To Do 05 - 우리는 `F7` 키를 한번 누릅니다. 5번 라인이 실행되면서 num1 변수가 int형으로 만들어지고 10을 대입받습니다. 아래의 Debugger를 보면 num1 변수가 스택 영역에서 생성되고 정수 10이 대입되어 있습니다.

![141_step_into_1](https://github.com/user-attachments/assets/7aa3c69d-3706-41e9-8681-475ce44c4360)


#### To Do 06 - `F7` 키를 한번 더 누릅니다. 6번 라인이 실행되면서 num2 변수가 int형으로 만들어지고 20을 대입 받습니다. 아래의 Debugger를 보면 num2 변수가 스택 영역에서 생셩되고 정수 20이 대입되어 있습니다.
![142_step_into_2](https://github.com/user-attachments/assets/2756d4c3-f5ea-4578-b7f7-61c628383a38)

#### To Do 07 - `F7` 키를 또 한번 더 누릅니다. adder 메서드 안으로 들어가게 되면서 12번 라인이 실행되는데, Debugger의 왼쪽을 보게 되면 "1번" adder() 메서드에 대한 프레임이 스택에 쌓이게 됩니다. 그리고 "2번" 12번 라인이 실행되면서 "3번" 매개변수 n1과 n2가 스택 영역에 생성됩니다.

![143_into_method](https://github.com/user-attachments/assets/b5c39dd2-0d48-4764-aec5-12b9666f5f4d)

이전 스택의 내용이 스택에서 없어진 것은 아닙니다. IntelliJ의 Debugger 모드는 현재 프레임의 스택 내용만을 보여주기 때문에 앞서 스택에 쌓여 있는 프레임 내용은 보이지 않는 것뿐입니다. 이전 스택은 Debugger 모드 왼쪽 창에 선택해서 볼 수 있습니다.

![144_before_stack](https://github.com/user-attachments/assets/5f99eb5f-4c52-4e4c-93d7-69b311293533)

#### To Do 08 - 계속 진행을 위해 `F7` 키를 한번 더 누릅니다. 12번 라인이 실행되면서 result 변수가 int형으로 만들어지고 더하기 연산의 결과 30을 대입받습니다. Debugger 창을 보면 result 변수가 스택 영역에 생성되고 정수 30이 대입되어 있습니다.

![145_step_into_3](https://github.com/user-attachments/assets/ad7b59f5-313c-4704-b85d-645da7fe5f75)

#### To Do 08 - `F7` 키를 한번 더 누릅니다. return에 의해 adder() 메서드의 진행이 끝났기 때문에adder() 메서드를 호출한 곳으로 실행 포인트가 다시 돌아와 있습니다. 그리고 Debugger 창을 보면 Ex01_MemoryInStack.adder 프레임이 스택 영역에서 사라진 것을 볼 수 있습니다. 그리고 바로옆 결과 창에Ex01_MemoryInStack.main 프레임의 여태까지의 스택 상황을 다시 보여주고 있습니다.

![146_step_into_4](https://github.com/user-attachments/assets/ddc83dc7-d493-4088-9375-d7df0e1510ba)

#### To Do 09 - `F7` 키를 한번 더 누르면 실행 포인트가 다음 줄로 이동합니다. 

![147_step_into_5](https://github.com/user-attachments/assets/50fd1f0b-e8fe-4ac2-9110-1a29ae9876db)

#### To Do 10 - `F7` 키를 한번 더 누르면 내용을 출력하고 더 실행시킬 내용이 없기 때문에 실행 포인트가 main() 메서드의 마지막 중괄호까지 이동합니다. 

![148_step_into_6](https://github.com/user-attachments/assets/b33c360c-433b-443f-9a19-a72910a9b34d)

#### To Do 11 - `F7` 키를 한번 더 누릅니다. main의 중괄호까지 실행이 끝났기 때문에 Ex01_MemoryInStack.main 프레임이 스택 영역에서 제거됩니다. 이렇게 스택 영역에 아무것도 남아있지 않게 되면 프로그램은 종료됩니다. 

![149_step_into_7](https://github.com/user-attachments/assets/66f5aa8d-6e7c-4041-bddb-cd313207a286)

지금까지의 과정을 그림으로 그려보면 아래와 같습니다. 

![150_ java_memory_structure](https://github.com/user-attachments/assets/394a2b24-2ff4-4b3b-85cb-90ae1e690958)

앞에서 메서드 영역을 설명할 때 스태틱(static) 변수 및 스태틱(static) 메서드가 메서드 영역에 저장되며, 프로그램 시작 전에 로드되고 프로그램 종료 시 소멸된다고 했습니다. 해당 사항을 상기하면서 위의 그림을 봐주세요. 코드가 메서드 영역에 다 로딩이 되면 그중에서 스태틱으로 지정된 변수와 메서드를 찾아 메서드 영역 내 스태틱 영역으로 옮겨줍니다. 그래서 main() 메서드는 static 지시자가 붙어 있기 때문에 스태틱 영역에 위치하게 됩니다. 이때 스태틱 변수가 있다면 값이 여기서 대입됩니다. 아직 프로그램이 시작하기 전입니다.

그리고 JVM은 무조건 메서드 영역 내 스태틱 영역에서 main() 메서드를 첫 메서드로 실행 시킵니다. 만약 스태틱 영역에 옮겨진 main()이 없다면 프로그램은 실행되지 않습니다. 그래서 우리가 실행시키려고 "1번" JVM에 전달한 클래스에는 main() 메서드가 반드시 있어야 하고 public으로 접근 가능해야 합니다. 그래야 자바 프로그램이 실행됩니다. 

<img width="624" alt="151_static_main_method" src="https://github.com/user-attachments/assets/584627d3-efe9-406f-a893-d95cf12a0134">

왜 모든 프로그램에서 위와 같이 "2번" static 지시자가 쓰였는지, 왜 메서드 이름이 "3번" main인지, 앞에 "1번" public은 왜 붙어있는지 아시겠지요? 

스태틱(static)은 자바의 메모리 모델 구조가 이렇게 만들어졌기에 단지 먼저 추려내져야 하는 변수와 메서드가 있다면 static 지시자 표시를 하여 메모리의 특정 영역에 따로, 그리고 미리 로딩시켜놓은 것 뿐입니다. 
