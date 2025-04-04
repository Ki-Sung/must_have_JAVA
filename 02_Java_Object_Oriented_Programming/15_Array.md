# 15 배열 
- 배열은 복수의 동일한 자료형의 변수를 묶어놓은 자료구조 입니다. 대량의 데이터를 다룰 때나 차례대로 읽어들이고 싶을 때 사용합니다. 
- 이번 시간에는 자바의 배열을 알아보고, 배열을 다룰 때 사용하는 Array 클래스를 알아봅니다.

## 1. 1차원 배열 
배열은 동일한 자료형 여러 개의 값을 함께 저장할 수 있습니다. 일차원 배열과 다차원 배열이 있는데, 먼저 일차원 배열을 알아보겠습니다. 

### 1-1. 배열 선언 
이제까지 사용한 변수는 자료 한 개를 저장하는 공간이었습니다.
```
int num = 0;
```

그런데 프로그래밍을 하다 보면 자료형이 같은 자료를 여러개 반복해서 구현해야 하는 일이 생깁니다. 가령 우리 학교 한 반의 국어 점수를 기록하고 싶습니다. 우리 학교 한 반의 인원은 50명입니다. 코드로 작성하면 다음과 같이 될 겁니다. 
```
int korScore01 = 90;
int korScore02 = 80;
int korScore03 = 70;
int korScore04 = 95;
...
int korScore49 = 85;
int korScore50 = 99;
```

변수 선언이 너무 많습니다. 당연히  비효율적이고 불편합니다. 이런 때는 변수를 각각 선언하여 점수를 저장하는 것보다 한 번에 여러 점수를 저장할 수 있는 기능이 필요합니다. 이럴 때 사용하는 것이 배열입니다.

배열 변수는 기본 자료형을 사용하더라도 다음과 같이 객체를 만드는 방법으로 선언합니다.
![272_array_structure](https://github.com/user-attachments/assets/794484d4-b604-437f-9edb-22c15832ade6)

그러므로 앞에서 사용한 변수 50개를 배열 변수 하나로 다음과 같이 선언할 수 있습니다. 
![273_array_structure_2](https://github.com/user-attachments/assets/6639d430-cd55-4784-83be-27e83a7fd22e)

`1번`korScore라고 변수명을 만듭니다.
`2번`자료형은 int로 합니다. 그리고 변수가 일반 변수가 아니고 배열이라고 [ ] 표시를 합니다. 
`3번`객체를 만듭니다.
`4번`객체의 자료형은 int형으로 합니다.
`5번`데이터 50개를 저장할 공간을 만듭니다. 

이렇게 int형 데이터 50개를 저장할 공간을 힙에 만들고 korScore는 해당 공간을 가리킵니다. 배열 요소를 구분하는 배열 인덱스는 0부터 시작합니다. 다음 그림으로 다시 이해해보도록 하겠습니다. 
![274_array_structure_3](https://github.com/user-attachments/assets/2761468a-dfe3-40ce-b5e6-411d1c0c9d28)

일상에서 그냥 0호라고 말하면 어느 집의 0호인지 알 수 없습니다. 그래서 우리는 한아름 빌라 0호, 한아름 빌라 1호 이런 식으로 이야기 합니다. 이러면 다른 사람도 어느 건물의 몇 호를 얘기하는지 알 수 있습니다.

배열도 마찬가지입니다. korScore는 저 한아름 빌라가 건물을 가리키듯 배열을 가리킵니다. 각 요소를 가리키기 위해서는 한아름 빌라 0호 대신 korScore[0] 이런 식으로 대괄호 [ ] 안에 인덱스를 써주면 됩니다. 

이제 접근 방식을 알았으니 사용은 다음과 같이 합니다. 배열 표시인 대괄호 [ ] 사이에 인덱스 값을 숫자로 입력하여 하나 하나의 배열의 요소를 변수로 사용할 수 있습니다. 
```
korScore[0] = 90;
korScore[1] = 80;
...
korScore[49] = 99;
```

이처럼 배열은 똑같은 자료형을 저장하기 위한 겁니다. 자료형은 기본 자료형부터 사용자가 만든 클래스까지 다양하므로 자료형을 적어주고 대괄호를 통해서 배열 표시를 해주고 생성할 때 몇 개인지 알려주면 됩니다. 그리고 배열 인덱스를 이용하여 개별 요소에 접근해서 사용하면 됩니다. 

일반 변수처럼 변수 먼저 선언하고 나중에 대입을 시켜줄 수도 있습니다. 
![275_array_structure_4](https://github.com/user-attachments/assets/5bc69794-4f5c-4620-b9b9-2a1d2b1e66bb)

![276_array_instance_example](https://github.com/user-attachments/assets/4e8fe507-48bf-41a3-bf04-88397f402301)
![277_array_instance_example_result](https://github.com/user-attachments/assets/df9cc612-2ce1-4309-aa30-3255fab7fcf2)

`1번`BoxA1을 정의 합니다. 이렇게 필드와 메서드가 없지만 클래스는 맞습니다. 생성된 배열은 객체이기 때문에 맴버를 가지고 있습니다. 자바에서는 배열을 사용하기 쉽게 이미 몇 가지의 편리한 멤버(메서드 및 필드)를 만들어 놓았습니다. 그중 하나가 length 맴버 변수 입니다. 

`2번`에서처럼 현재 이 배열 객체는 몇 개의 요소를 가지고 있는지 ar1.length 처럼 맴버 변수 length를 통해 알 수 있습니다.

### 1-2. 배열 사용: 기본 자료형
int형 배열을 만들고 값을 대입하고 참조하는 방법을 예제로 살펴봅니다. 
![278_int_array_example](https://github.com/user-attachments/assets/c50df891-dd61-4a73-a51e-7f189e1999b3)
![279_int_array_example_result](https://github.com/user-attachments/assets/4d0a4089-c9f2-4c22-89e8-b79a0e9f3acd)

`1번`int형 데이터를 저장할 배열을 선언합니다.

`2번`배열 요소에 접근합니다. 배열 요소는 일반 변수처럼 사용합니다. 값을 저장합니다.

`3번`배열 요소에서 값을 참조해옵니다.

### 1-3. 배열 사용: String형
String형 배열을 만들고 값을 대입하고 참조하는 방법을 예제로 살펴봅시다. 
<img width="1016" alt="280_string_array_example" src="https://github.com/user-attachments/assets/679258da-a5ce-447b-910a-4a811b42e4a5" />
<img width="1188" alt="281_string_array_example_result" src="https://github.com/user-attachments/assets/224302a7-f1f9-478d-a64c-85b255bbe5da" />

`1번`String형 데이터를 저장할 배열을 선언합니다.
`2번`문자열 리터럴로 대입하지 않고, new 연산자를 이용하여 새로운 문자열 객체를 만들어 변수에 대입하고 있습니다.
`3번`배열 name의 요소 개수만큼 반복문으로 반복합니다. `4번`배열의 개별 요소에 저장된 값을 출력합니다. `5번`배열의 개별 요소에 저장된 값은 문자열 입니다. 각 문자열의 길이를 구해서 더해줍니다.

`6번`name 배열에 저장되어 있는 모든 문자열의 총 길이를 출력합니다. 

반복문에서 `5번`을 첫 번째만 풀어보면 다음과 같습니다. 
<img width="1082" alt="282_string_array_result_1" src="https://github.com/user-attachments/assets/34f7a3ff-a80e-41f8-9dc4-9294d4d6e3db" />

### 1-4. 배열 사용: 클래스형
클래스형 배열을 만들고 값을 대입하고 참조하는 방법을 예제로 살펴봅시다. 

<img width="1012" alt="283_class_array_example" src="https://github.com/user-attachments/assets/b0e273ea-0185-410d-8b56-20a8a09cdbf9" />
<img width="1193" alt="284_class_array_example_result" src="https://github.com/user-attachments/assets/0ed9f123-1041-4e49-9b3d-f9b975c4dce5" />

해당 예제는 사용자 정의 클래스인 BoxA4의 객체를 저장하는 배열을 생성하고, 해당 배열에 객체를 초기화한 뒤, 각 객체의 속성을 출력하는 기능을 보여줍니다. 

`1번`BoxA4형 객체를 저장할 배열을 선언합니다.

`2번`BoxA4 클래스의 생성자를 이용하여 객체를 만들고 배열의 개별 요소에 객체의 참조 값을 대입합니다.

`3번`객체의 참조 변수 ar[ ]을 통해서 객체에 접근해 맴버 변수의 값을 가져와서 출력합니다. 

### 1-5. 배열 사용: 매개변수, 반환형
배열은 일반 변수처럼 메서드의 매개변수로 사용할 수도 있고 메서드의 반환형으로도 사용할 수 있습니다. 
<img width="1015" alt="285_array_in_method_example" src="https://github.com/user-attachments/assets/e8cbf149-79cd-4def-b093-e1f263bc29de" />
<img width="1191" alt="286_array_in_method_example_result" src="https://github.com/user-attachments/assets/f314e60e-27c6-4e60-9eeb-69c46f8fe8a1" />

`3번`메서드의 반환형이 int형 배열입니다. `4번`매개변수로 들어온 값으로 배열 개수를 정합니다. `5번`배열 전체를 가리킬 때는 배열의 이름만 이용합니다. 앞의 예시에서 "한아름빌라"하고 건물의 이름만 얘기하는 것과 같습니다. 

`1번`makeIntArray(5) 메서드 자리에 반환된 배열 객체가 들어오게 됩니다. 그리고 선언된 배열 변수에 해당 객체의 참조 값이 대입됩니다. `2번`배열을 인수로 넘겨줄 수도 있습니다. 역시 배열 전체를 가리키기 때문에 이름만 사용합니다. 

`6번`배열의 요소 개수만큼 반복문을 실행합니다. `7번`배열의 요소별 접근은 인덱스값을 이용해서 객체를 참조하게 됩니다. 

### 1-6. 배열 생성과 동시에 초기화
앞의 예제는 배열을 선언하고, 배열의 요소에 개별적으로 접근해 값을 대입했지만, 배열은 생성과 동시에 초기화를 할 수도 있습니다. 

![287_array_init_structure](https://github.com/user-attachments/assets/3b351d0f-47a5-4a21-8bec-0aeb29db9d2d)

뒤에 초기화하는 데이터 개수를 보고 생략된 숫자를 알 수 있습니다. 뒤에 초기화하는 데이터를 보고 당연히 배열의 초기화 값이라고 생각할 수 있습니다. 이처럼 자바 컴파일러가 유추할 수 있는 부분은 생략이 가능합니다. 

그리고 배열의 값을 초기화하지 않았을 때도 디폴트 초기화는 진행됩니다. 기본 자료형 배열은 모든 요소를 0으로 초기화되고, 객체 배열(참조 변수 배열)은 모든 요소가 null로 초기화 됩니다. 

![288_array_init_example](https://github.com/user-attachments/assets/8b681fba-4d0a-4ced-8cd0-c25c7128b705)
![289_array_init_example_result](https://github.com/user-attachments/assets/64cc859e-c865-4dcd-afed-f08977a378a9)

`1번`BoxA6를 정의합니다. 이렇게 필드와 메서드가 없어도 클래스는 맞습니다.

`2번`기본 자료형은 별도의 초기화를 하지 않아도 초기화됩니다. int형이므로 0으로 초기화됩니다.

`3번`뒤에 초기화하는 데이터 개수로 숫자를 파악할 수 있으므로 대괄호 안의 숫자를 생략할 수 있습니다. 

`4번`뒤에 초기화하는 데이터 개수로 배열임을 알 수 있고 숫자를 파악할 수 있으므로 객체의 배열 생성 부분을 생략할 수 있습니다. 

`5번`기본 자료형은 별도의 초기화를 하지 않아도 초기화됩니다. double형이므로 0.0으로 초기화 됩니다.

### 1-7. main() 메서드의 매개변수
이제 main() 메서드에 사용된 매개변수도 이해할 수 있게 되었습니다.
```
public static void main(String[] args)
{
    ...
}
```
다만 main() 메서드는 개발자가 직접 호출하는 메서드가 아니고 JVM이 프로그램을 실행할 때 불리는 메서드입니다.

그래서 메서드를 호출해 인수를 넘겨주는 방식이 아니고 '명령 프롬프트'에서 프로그램을 실행할 때 인수를 넘겨주거나 다음과 같은 방법으로 인수를 넘겨주어야 테스트를 할 수 있습니다. 

명령행에서 다음과 같이 실행하면 JVM 내부적으로 배열을 만들어서 main() 메서드에 넘겨주게 됩니다. 

![290_main_method_structure](https://github.com/user-attachments/assets/40e388ba-9541-4697-9dd9-3ee3e9156a0b)


예제를 만들어서 매개변수로 들어오는 배열의 값을 확인해보겠습니다. 

#### To-Do 01 Ex07_mainParameter 클래스를 다음과 같이 작성합니다. 
![291_main_parameter_example](https://github.com/user-attachments/assets/5c7758b9-3c4c-413f-8a72-42c6470a62e1)

#### To-Do 02 우선 IntelliJ를 실행해봅니다. 아무런 결과가 출력되지 않습니다. 매개변수가 입력되지 않았기 때문입니다. 

#### To-Do 03 main() 메서드에 매개변수를 넘겨주려면 실행창 > Modify Run Configuration을 선택합니다.
![292_run_edit_configuration](https://github.com/user-attachments/assets/183d7713-d2d9-433c-b887-48bc21fd9bce)


#### To-Do 04 Program arguments 입력창에 Apple Banana Orange 이렇게 매개변수로 사용할 데이터를 입력합니다. 그리고 하단의 OK 버튼을 누릅니다.
![293_Input_arguments](https://github.com/user-attachments/assets/ffe3e4a7-549c-4636-afae-bf57aa1061bd)

그리고 다시 실행을 누르면 다음과 같이 결과가 나옵니다. main() 메서드에 매개변수가 잘 전달되었음을 확인할 수 있습니다.

![294_Input_arguments_result](https://github.com/user-attachments/assets/e4052d53-2712-4082-a751-9e72aa3ae6f6)

이제 IntelliJ에서 그냥 실행만 해도 이 클래스의 실행은 저 값이 계속 출력됩니다. 프로그램을 실행할 때마다 조금 전에 입력한 값이 매개변수로 main()에 전달되기 때문입니다. 더 이상 매개변수의 전달이 필요없으면 아까와 같이 창을 열여서 매개변수를 지워주면 됩니다. 

## 2. for ~ each 문 
배열을 이용한 반복문을 사용하다 보면 for문 안에 항상 배열 길이만큼 반복을 하는 코드를 작성하게 됩니다. 이 부분은 컴파일러가 유추할 수 있는 부분입니다. 그래서 배열과 for문을 같이 사용할 때는 다음과 같이 기능을 제공해주고 있습니다. "향상된 기능의 for문(enhanced for문)"이라고 부릅니다.

![295_enhanced_for_example](https://github.com/user-attachments/assets/20a477ed-cd2f-4357-b7c3-f85ab6e1510f)
![296_enhanced_for_example_result](https://github.com/user-attachments/assets/50b05981-c23b-4867-9dd7-ddfceddc2076)

`1번`배열의 초기화 값이 주어져 있으므로 배열 객체의 생성 부분을 생략할 수 있습니다.

`2번` 배열에서 배열의 요소 하나씩을 자동으로 꺼내주면서 반복이 실행됩니다. 꺼내진 배열의 요소는 int e 변수에 대입됩니다. 

for ~ each문에는 기본 자료형뿐 아니라 객체 자료형을 가진 배열도 사용할 수 있습니다. 예제를 통해 살펴보겠습니다. 

![297_enhanced_for_object_example](https://github.com/user-attachments/assets/e91eb938-827f-4a07-8ad0-1fada28adf5f)
![298_enhanced_for_object_example_result](https://github.com/user-attachments/assets/163ef4d6-dc7c-4213-a6dd-75ce1d439ef4)

먼저 House 클래스를 정의합니다. 맴버 변수로 방번호를 저장할 houseNum과 이름을 저장할 name 변수를 가지고 있습니다. 변수가 다 private로 은닉화되어 있기 때문에 생성자를 통해 값을 세팅하고 게터를 통해서 값을 참조합니다. 

`1번`배열을 선언합니다. 

`2번`객체를 생성하고 배열의 개별 요소에 참조 값을 대입합니다. 

`3번`향상된 기능의 for문을 통해 모든 요소를 하나씩 꺼내서 참조합니다. `4번`, `5번`에서 게터 메서드로 객체의 맴버 변수의 값을 꺼내서 값을 비교하고 출력합니다. 

## 3. 다차원 배열
다차원 배열은 2차원, 3차원 배열 등으로 만들 수 있습니다. 이론적으로는 더 많은 차원의 배열을 만들어 사용할 수 있지만, 3차원까지는 큐브 형태로 사람이 아는 형태로 생각할 수 있지만 그 이상은 사람이 머리속으로 생각하기는 힘듭니다. 

현실에서는 1차원, 2차원 배열을 주로 사용하고, 3차원 배열도 아주 가끔사용합니다. 

### 3-1. 2차원 배열 
지금까지 사용한 1차원 배열은 다음과 같았습니다.
```
int [ ] arr1 = new int[3];
```
![300_1_dimensional_array](https://github.com/user-attachments/assets/d51a970e-337f-4b7d-b7d1-546fe13b0cb5)

그냥 0호라고 말하면 어느 집의 0호인지 알 수 없어 한아름빌라 0호, 한아름빌라 1호 이런식으로 얘기한다고 했습니다. 이제 여러 층이 있어 지하 1호는 0-1호, 지하 2호는 0-2호, 지하 3호는 0-3호, 1층의 1호는 1-1호, 1층의 2호는 1-2호 등 앞쪽의 숫자로 층을 구분할 수 있습니다.

배열도 이런 식 입니다. 배열에서도 앞쪽을 층으로 생각하고 뒤를 방으로 생각하면 됩니다. 선언은 다음과 같이 합니다. 
```
int[][] arr2 = new int[3][3];
```
![301_2_dimensional_array](https://github.com/user-attachments/assets/d49343c0-339c-48cf-b7bf-1f215d166312)
![302_2_diemsional_array_2](https://github.com/user-attachments/assets/fb3f2160-3571-4791-86d8-357431b24f46)

2차원 배열 요소 전체의 순차적 접근은 중첩된 반복문을 이용하면 쉽게 접근할 수 있습니다. 코드로 작성하면 다음과 같습니다. 
![303_2_dimensional_array_example](https://github.com/user-attachments/assets/4b27eca3-b548-40c6-ba87-29ea96006e48)
![304_2_dimensional_array_example_result](https://github.com/user-attachments/assets/6dc1fb4a-be5d-4d6c-aff9-894ffbbd4dd3)

`1번`2차원 배열을 선언합니다. 

`2번`바깥쪽 for문의 i의 값 한개당 내부의 for문이 한 바퀴씩 돕니다. `3번`각 배열 요소에 num 변수의 값을 대입합니다. `4번`num 변수의 값을 하나씩 증가시킵니다.

`5번`중첩된 for문을 통해 2차원 배열의 모든 요소의 값을 가져와서 출력합니다.

### 3-2. 2차원 배열의 실제 구조
```
int[][] arr3 = new int[3][4]
```

위 코드는 다음처럼 새 배열의 각각 길이가 4개인 배열을 가지고 있는 구조입니다.

![305_2_dimensional_array_34](https://github.com/user-attachments/assets/4c389a0b-6e07-44f7-8831-3d75d0c3d9bc)

더 구체적으로 그리면 다음과 같습니다.
![306_2_dimensional_array_structure](https://github.com/user-attachments/assets/96b55817-8efe-4e81-8033-41b9adfb4a03)

이런 구조이기 때문에 자바에서는 다음과 같은 초기화가 가능합니다. 
![307_2_dimensional_array_structure_2](https://github.com/user-attachments/assets/fdd78a03-a173-4773-ab2b-801334b499de)

![308_2_dimensional_array_example_2](https://github.com/user-attachments/assets/e753e621-1a73-4bc7-a1a5-b55a2bab6d58)
![309_2_dimensional_array_example_2_result](https://github.com/user-attachments/assets/9049b833-ef34-452a-89a6-b2c88028b511)

`1번`부분적으로 채워진 2차원 배열을 만들고 초기화합니다.

`2번`바깥쪽 배열의 크기를 이용해 반복문을 반복합니다. `3번`바깥쪽 배열의 요소 하나당 배열의 크기를 구해서 반복문을 반복합니다. `4번`배열의 개별 요소의 값을 구해와서 출력합니다.

## 4. 배열 관련 유틸리티 메서드 
여기서는 배열을 편하게 사용하게 해주는 여러 메서드를 알아보겠습니다. 

### 4-1. 배열의 초기화 메서드 
앞에서도 배열을 선언할 때 초기화 값을 이용하여 초기화를 했습니다. 그러나 배열이 엄청 클 때는 값을 직접 일일이 지정해주는 초기화 방식은 무리입니다. 그래서 배열의 초기화는 다음의 메서드를 이용하게 됩니다. 

다음 클래스에 있는 메서드를 사용하여 원하는 값으로 배열 전부 또는 일부를 채울 수 있습니다. 
```
// 두 번째 매개변수로 전달된 값으로 배열 초기화
public static void fill(int[] a, int val)

// 인덱스 fromIndex ~ (toIndex-1) 범위까지 val값으로 배열 초기화
public static void fill(int[] a, int fromIndex, int toIndex, int val)
```
&rarr; java.util.Arrays 클래스에 정의되어 있는 메서드 

### 4-2. 배열의 복사 Array 클래스 
배열 복사는 다음의 두 클래스에 있는 메서드를 사용할 수 있습니다. 
```
// original에 전달된 배열을 첫 번째 요소부터 newLength 길이만큼 복사 
public static int[] copyOf(int[] original, int newLength)

// original에 전달된 배열을 인덱스 from 부터 to 이전 요소까지 복사
public static int[] copyOfRange(int[] original, int from, int to)
```
&rarr; java.util.Arrays 클래스에 정의되어 있는 메서드

```
// 배열 src의 srcPos에서 배열 dest의 destPos로 length 길이만큼 복사
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
```
&rarr; java.util.System 클래스에 정의되어 있는 메서드

![310_array_copy_example](https://github.com/user-attachments/assets/e456556d-1af8-4782-91f0-82bba48e729b)
![311_array_copy_example_result](https://github.com/user-attachments/assets/642ec105-804e-4492-a5c7-80c8f844ba54)

`1번`java.util.Arrays 클래스를 임포트합니다. 

`2번`길이가 10인 arr1 배열은 0으로 초기화됩니다. `3번`길이가 8인 arr2 배열은 0으로 초기화됩니다. 

`4번`Arrays 클래스의 스태틱 메서드인 fill() 메서드를 이용하여 지정한 값으로 배열을 채워줄 수 있습니다.

`5번`System 클래스의 스태틱 메서드인 arraycopy() 메서드를 이용하여 기존에 만들어진 배열에 부분 복사를 할 수 있습니다.

`6번`Arrays 클래스의 스태틱 메서드인 copyOfRange() 메서드가 배열에서 부분 복사하여 반환한 객체를 배열에 대입할 수 있습니다. 

System.arraycopy()는 기존에 만들어진 배열에 복사한 값을 넣어주는 것이고, Arrays.copyOfRange()는 배열에서 부분 복사한 값을 이용하여 배열 객체를 만들어 반환하고 배열 변수에 대입을 해주는 차이점이 있습니다. 

### 4-3. 배열 내용 비교 
Arrays 클래스에는 배열을 비교해주는 equals() 메서드가 있습니다. 두 배열에 저장된 데이터의 수, 순서 그리고 내용이 같을 때 true를 반환합니다(배열의 길이가 다르면 false를 반환합니다).

![312_array_equalse_example](https://github.com/user-attachments/assets/3ae05907-4eeb-4cb5-9bbf-22389863b9df)
![313_array_equalse_example_result](https://github.com/user-attachments/assets/e7e7e4a0-69b7-4d93-97b0-458934bab0c6)

`1번`java.util.Arrays 클래스를 임포트합니다. 

`2번`배열을 선언하고 값을 직접 대입하여 초기화해줍니다. `3번`Arrays 클래스의 copyOf() 메서드를 이용하여 배열을 복사합니다. `4번`두 배열의 내용을 비교합니다. 

### 4-4. 배열의 내용 정렬
Arrays 클래스에는 배열을 내용을 정렬해주는 sort() 메서드가 있습니다. 
```
// 매개변수 a로 전달된 배열을 오름차순으로 정렬
public static void sort(int[] a)
```

![314_array_sort_example](https://github.com/user-attachments/assets/8be57494-4a0d-4756-ab11-f0ee1747071e)
![315_array_sort_example_result](https://github.com/user-attachments/assets/68c6e199-1991-4212-b30d-6178812d0715)

`1번`기존 배열 안의 값을 정렬해줍니다. `2번`향상된 기능의 for문을 이용하여 배열 안의 내용을 하나씩 꺼내서 각 변수(n, d, a)에 대입합니다. 

## 학습 마무리
### 핵심 요약
1. 배열은 복수의 동일한 자료형의 변수를 묶어놓은 자료구조입니다. 일차원 배열과 다차원 배열이 있습니다.
2. 배열을 이용한 반복문을 사용하다 보면 for문 안에 항상 배열 길이만큼 반복을 하는 코드를 작성하게 됩니다. 이 부분은 컴파일러가 유추할 수 있는 부분입니다. 이때 "향샹된 기능의 for문"을 사용합니다.
3. 배열의 초기화 메서드: `fill()`
4. 배열의 복사 메서드
   - `java.util.Arrays` 클래스에 정의되어 있는 메서드: `copyOf()`, `copyOfRange()`
   - `java.util.System` 클래스에 정의되어 있는 메서드: `arraycopy()`
5. 배열 내용 비교 메서드: `equals()`
6. 배열의 내용 정렬: `sort()`
