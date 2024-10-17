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

스태틱(static)은 자바의 메모리 모델 구조가 이렇게 만들어졌기에 단지 먼저 추려내져야 하는 변수와 메서드가 있다면 static 지시자 표시를 하여 메모리의 특정 영역에 따로, 그리고 미리 로딩시켜놓은 것 뿐입니다. 그리고 이 영역의 변수 및 메서드는 어떤 객체에서도 접근해서 사용할 수 있습니다. 그렇기에 스태틱 변수를 전역 변수라고 부르기도 합니다. 스태틱의 동작 원리에 대해서는 이후 예제를 살펴보며 자세히 알아보겠습니다. 

여기서는 프로그램이 진행됨에 따라 스택 영역에 메서드의 프레임이 쌓이고 그 프레임 안에서 지역 변수들이 생겨났다 사라졌다를 하다가 모든 메서드의 프레임이 스택 영역에서 사라지면 프로그램이 종료된다는 것만 이해하면 됩니다. 

## 3. 디버깅하며 배우는 힙 영역 원리 
이번에는 객체 변수가 스택 영역과 힙 영역에서 어떻게 처리되는지를 알아보겠습니다. 

#### To Do 01 - Book.java와 Ex02_MemoryInHeep1.java 파일을 추가 후 Book 클래스와 Ex02_MemoryInHeep1 클래스의 코드를 작성합니다. 

![152_make_class_book](https://github.com/user-attachments/assets/4e600c8e-77d1-4053-8d0b-e5462849e426)

![153_make_class_heepmemory](https://github.com/user-attachments/assets/296676b0-8e04-40ef-b050-5b4aab6b8e5b)

이전에는 `.java` 파일 하나에 여러 클래스를 만들었는데, 이번 예제에서는 각각의 `.java` 파일로 클래스를 만들었습니다. 

#### To Do 02 - 이제 Deburg 모드로 실행해봐야 하니 Ex02_MemoryInHeep1.java 코드의 3번째 코드 라인 빈 곳에 좌클릭하여 Breakpoint를 설정해줍니다. 

![154_debug_mode](https://github.com/user-attachments/assets/545a34bd-326c-4040-89e0-a460b1d322a5)

#### To Do 03 - 이제 디버그 모드를 설정해줍니다. Mac OS 기준 맨 상단 메뉴에서 [Run] &rarr; [Debug 'Ex02_MemoryInHeep1.java'] 선택

![155_start_debug_mode](https://github.com/user-attachments/assets/52440c13-937a-4590-81d7-10d87ef2a1b5)

![156_step_into_1](https://github.com/user-attachments/assets/1defaaed-736d-4e39-a859-1742e5d00919)

#### To Do 04 - `F7` 키를 한 번 눌러줍니다. 
코드에 객체를 만들어 Book 클래스형 book1 변수에 대입해주고 있습니다. 실제로는 어떻게 되는지 확인해보겠습니다. 

5번 라인이 실행되면서 수행되는 동작들이 꽤 많습니다. 먼저 new 연산자와 Book() 생성자를 이용하여 객체를 힙 영역에 만듭니다. 그리고 객체를 참조할 수 있게 객체를 관리하는 내부적인 표에 자기 위치를 등록시켜 줍니다. 

예를 들면 다음과 같습니다. 
| id | class | 힙 위치 |
|:---|:---|:---|
| 695 | String[0] | 0x ~~~~~~~~(메모리 주소) |
| 697 | Book | 0x ~~~~~~~~(메모리 주소) |

생성되는 객체 크기는 클래스마다 천차만별이라 힙 영역에서 동적으로 만들어 저장합니다. 스택 영역에서는 기본 자료형처럼 정해진 크기의 값들만 저장하게 됩니다. 

객체는 만들어졌고 book1 변수는 스택 영역에 만들어집니다. 그리고 값으로는 크기가 천차만별인 객체를 직접 대입받지 않고 그 객체를 참조할 수 있는 id값을 대입받습니다(그래서 참조 변수라고도 부릅니다). id값은 정해진 크기의 값이기 때문에 스택 영역에 변수의 값으로 대입할 수 있습니다.

#### To Do 05 - Debugger에서 확인해보면, 객체 안의 클래스 맴버 변수인 num은 따로 값을 넣지 않았지만 0으로 초기화되어 있습니다. 

![157_initialize_value](https://github.com/user-attachments/assets/55249e2c-9eb8-49ac-90b0-a8d75df3136d)

#### To Do 06 - `F7` 키를 한 번 눌러줍니다. 같은 방식으로 Book 클래스형의 객체가 힙 영역에 만들어지고 스택 영역에 만들어진 변수 book2가 참조할 수 있도록 참조 값을 대입시켜 줍니다. 

#### To Do 07 - Debugger에서 book2를 클릭하여 펼치면 객체 안의 클래스 맴버 변수인 num은 따로 값을 넣지 않았지만 0으로 초기화되어 있습니다.
![158_step_into_2](https://github.com/user-attachments/assets/632d642c-a21f-486a-a254-59493b6f15dd)

여기서 스택 영역 main 프레임 안에 생성된 변수들을 확인하면 book1과 book2가 참조하는 id값이 다릅니다. 이를 통해 힙 영역의 서로 다른 객체를 참조하고 있다는 것을 확인할 수 있습니다. 

#### To Do 08 - `F7` 키를 다시 한번 눌러줍니다. 코드 8라인이 실행되면서 book1의 맴버 변수에 값이 대입됩니다.
![159_step_into_3](https://github.com/user-attachments/assets/063bbfc8-d7e3-4a80-91dd-b58b0029b43d)

#### To Do 09 - `F7` 키를 다시 한번 눌러줍니다. 코드 9라인이 실행되면서 book2의 맴버 변수에 값이 대입되고 있습니다.
![160_step_into_4](https://github.com/user-attachments/assets/a28a5217-eba1-46fa-8a66-759e96aedc34)

#### To Do 10 - `F7` 키를 다시 한번 눌러줍니다. 코드 11라인이 실행되면서 book1의 맴버 변수의 값을 출력합니다. 힙 영역에서 만들어져 있는 객체의 맴버 변수에 값을 잘 대입하고 잘 가져옵니다.
![161_step_into_5](https://github.com/user-attachments/assets/8db040a0-0137-4845-9619-b249a46e402a)

![162_step_into_5_result](https://github.com/user-attachments/assets/40c80ce2-12ed-481c-b459-09e3f29e28f9)

#### To Do 11 - `F7` 키를 다시 한번 눌러줍니다. 12라인이 실행되면서 book2의 맴버 변수의 값을 출력합니다. 힙 영역에서 만들어져 있는 객체의 맴버 변수에 값을 잘 대입하고 잘 가져옵니다.
![163_step_into_6](https://github.com/user-attachments/assets/352a9b2b-ca07-49e9-816b-cc02b7c66cb2)

![164_step_into_6_result](https://github.com/user-attachments/assets/0590cb7e-0221-42cd-ae0c-cc267f2769ff)

#### To Do 12 - `F7` 키를 다시 한번 눌러줍니다. 코드 14라인이 실행되면서 book1에 null을 대입합니다. 이렇게 null을 대입하는 것을 참조를 끊는다라고 표현합니다. 스택 영역의 변수와 힙 영역의 객체 간에 참조 관계를 끊는 것입니다.
![165_step_into_7](https://github.com/user-attachments/assets/1f2d10e8-57c7-4e4b-9b47-0937398079b7)

#### To Do 13 - `F7` 키를 다시 한번 눌러줍니다. 코드 15라인이 실행되면서 book2에 null을 대입하고 참조 관계를 끊습니다. 
![166_step_into_8](https://github.com/user-attachments/assets/4dc8182e-8434-4c45-8232-5f54e45a78f9)

이렇게 참조를 끊을 때 힙 영역의 객체가 바로 사라지는 것은 아닙니다. 스택 영역에 있는 변수에 더는 힙 영역의 객체를 참조하지 않는다고 표시만 한 것입니다.

가비지 컬렉터가 메모리 관리를 위해 수행될 때 힙의 객체를 발견하고 이 객체를 사용하는 스택 영역의 변수를 찾아보고 아무것도 참조하는 것이 없다고 결론이 나면 그때 자동으로 제거를 하기 위해 제거 표시를 해줍니다(제거 X, 제거 표시 O).

> #### 참고: 가비지 컬렉션
> 가비지 컬렉션(garbage collection)이 수행되는 동안에는 모든 스레드가 멈추게 됩니다. 그래서 가비지 컬렉션의 실행 타이밍은 시스템의 성능에 영향을 미치지 않도록 별도의 알고리즘으로 계산되어 실행됩니다. 그러므로 가비지 컬렉션은 한 번도 발생하지 않을 수 있습니다. 가비지 컬렉션을 강제로 발생시키는데 다음 코드를 사용합니다. 
> ```
> System.gc()
> ```
> 가비지 컬렉션이 발생하면, 소멸 대상이 되는 인스턴스는 결정되지만 곧바로 실제 소멸로 이어지지는 않습니다. 그리고 인스턴스의 실제 소멸로 이어지지 않은 상태에서도 프로그램이 종료될 수 있습니다. 종료가 되면 어차피 객체는 운영체제에 의해 소멸됩니다.
> 
> 따라서 반드시 객체의 소멸을 이끄는 finalize() 메서드가 반드시 호출되기 원한다면 아래에서 보이는 코드를 추가로 삽입해야 합니다.
> ```
>System.runFinalization()
> ```
> 가비지 컬렉션의 단점으로는 프로그래머가 객체가 필요 없어지는 시점을 알더라도 메모리에서 직접 해제할 수 없고, 가비지 컬렉션의 알고리즘이 메모리 해제 시점을 계속 추적하고 판단하게 되므로 추가적인 시스템 비용이 발생하게 된다는 것입니다.
> 
> 가비지 컬렉션이 실행되는 시각이나 수행 시간을 알 수 없습니다. 이런 점은 실시간 시스템에서 프로그램이 예측 불가능하게 잠시라도 정지할 수 있어 매우 위험합니다.
> 
> 그래서 위의 메서드들은 가급적 호출하지 않는 프로그램에 작성해야 합니다.

#### To Do 14 - `F7` 키를 다시 한번 눌러줍니다. main() 메서드의 중괄호까지 다 실행하고 스택 영역의 모든 프레임이 사라지면서 프로그램이 종료됩니다. 그러면 이 프로그램에서 만든 힙 영역의 모든 객체는 가비지 컬렉터가 제거하지 않아도 자동으로 제거됩니다.
![167_step_into_9](https://github.com/user-attachments/assets/d8834105-735d-4d01-9efd-89da2edb15f3)

프로그램이 수행 중일 때는 가비지 컬렉터에 의해 메모리 관리가 되지만 이처럼 종료가 되면 운영체제 차원에서 힙 영역의 모든 객체를 제거하고 메모리를 회수합니다. 
