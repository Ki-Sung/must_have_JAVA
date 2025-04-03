# 19 정렬 알고리즘 만들기
- 버블 정렬과 삽입 정렬 알고리즘을 알아보고 구현해보도록 합시다.

## 1. 버블 정렬 
여러 데이터, 여기서는 10개의 무작위로 입력받아 입력된 데이터들을 정렬하는 방법을 알아봅니다. 정렬에는 다양한 방법이 존재합니다. 여기서는 가장 간단하면서도 유용한 버블 정렬을 알아보겠습니다. 

| 항목     | 내용    |
|--------|-------|
| 난이도    | 2 |
| 이름      | 버블 정렬 |
| 프로젝트명 | Chapter_19 / BubbleSort.java |
| 미션 | 입력된 숫자들을 정렬하라. |
| 기능 | 정렬된 배열의 결과를 출력 |
| 조작법 | - 실행 |
|      | - 숫자 10개 입력 |
|      | - 정렬된 결과 출력 |
| 라이브러리 | java.util.Scanner: 콘솔 입력 처리 |

### 1-1. 사전 지식: 버블 정렬 알고리즘
버블 정렬 알고리즘 동작 규칙은 간단합니다. 
1. 인접한 요소끼리 비교하여 더 작은 값을 앞으로, 큰 값을 뒤로 저장합니다.
2. 1번 과정을 마지막 원소까지 반복합니다.
3. 더 이상 자리를 교환하지 않을 때까지 1번 2번을 반복합니다.

예를 들어 입력된 값이 4개라고 했을 때 버블 정렬은 다음과 같이 네 번에 걸쳐서 비교를 수행하면서 값을 교환하여 정렬을 수행합니다. 

![398_buble_sort_algorithm](https://github.com/user-attachments/assets/0ed817e6-6302-4c92-a6d0-ed5220f000bf)

버블 정렬은 배열을 순차탐색하여 i, i+1번째 요소를 비교하여 큰 것을 뒤로 이동시키는 겁니다. 

단계가 한 번 처리될 때 마다 가장 큰 수가 배열 마지막에 위치하게 됩니다. 그래서 다음 탐색부터는 마지막 요소는 비교 및 교환을 안 해도 됩니다. 

정렬할 요소가 4개라면 위 그림처럼 4번의 단계를 걸쳐서 비교하여 정렬하게 되며, 각 단계별로 비교를 반복적으로 수행하면 됩니다. 즉, 중첩된 반복문과 같은 방식입니다. 

### 1-2. 프로젝트 생성
#### To Do 01 - Chapter_19로 프로젝트를 만들고 BuubleSort 클래스를 만들어 추가합니다. 
![399_chapter19_project_setup](https://github.com/user-attachments/assets/eea05ad4-cf8d-46be-9efa-e18077c0b6a8)

#### To Do 02 - 입력 처리에서 Scanner 클래스를 사용하겠습니다. 배열을 선언하고 정수 10개를 입력받아 배열에 저장하는 코드를 만들고 입력이 잘되는지 테스트해봅시다.

![400_bubble_sort_example_step1](https://github.com/user-attachments/assets/63a9387d-a4bb-45fb-9607-b3018a95efca)

`1번`입력 스트림을 처리하는 스캐너 클래스를 정의합니다. 

`2번`입력된 정수 10개를 처리하는 배열을 정의합니다. 

`3번`반복문을 사용해 정수 10개를 입력받습니다. 

`4번`입력된 값을 배열에 제대로 저장했는지 반복문으로 배열의 요소를 출력해 확인합니다.

#### To Do 03 - 실행시켜 입력된 값이 잘 출력되는지 확인합니다.
![401_bubble_sort_example_step1_result](https://github.com/user-attachments/assets/a5783faa-792f-41c7-9253-447b29315c78)

### 1-3. 입력 처리 코드를 메서드로 분리하기
#### To Do 01 - 테스트가 끝난 입력 처리 부분을 메서드로 분리합니다. 이때 매개변수로 배열을 사용합니다.

![402_bubble_sort_example_step2](https://github.com/user-attachments/assets/13d3db62-9c8e-4708-a312-f5995c266e27)

`5번`입력된 정수 10개를 처리하기 위한 배열을 정의합니다. `6번`메서드에 배열의 참조 변수를 매개변수로 넘깁니다.

`1번`매개변수로 배열을 사용합니다. 힙에는 객체가 하나 만들어져 있지만, 그 객체를 참조하는 참조 변수는 이렇게 여려개가 될 수 있습니다. 

`2번`입력 스트림을 처리하는 스캐너 클래스를 정의합니다. 

`3번`반복문을 사용해 정수 10개를 입력받습니다. 

`4번`입력된 값을 배열에 제대로 저장했는지 반복문으로 배열의 값을 출력하여 확인합니다. 

#### To Do 02 - 실행시켜 입력된 값이 잘 출력되는지 확인합니다.
![403_bubble_sort_example_step2_result](https://github.com/user-attachments/assets/abeec8fd-2524-46a7-8ed3-fb9d253ac7b3)

### 1-4. 입력된 값 정렬하기 
이제 사용자가 입력한 값들을 정렬하는 코드를 앞에서 본 이론대로 만들어봅시다. 

![404_bubble_sort_example_step3](https://github.com/user-attachments/assets/f43a73ac-8341-4679-98d8-8d76eaf5eaae)

`1번`바깥의 for문을 입력된 숫자만큼 반복되도록 만듭니다. 

`2번`단계별로 반복 횟수를 한 번씩 줄어들게 설정합니다. 

`3번`비교하는 배열의 두 값 중 앞 쪽의 숫자가 크면 임시 변수를 이용하여 값을 서로 바꿉니다.

### 1-5. 전체 코드 
#### To Do 01 - 위 코드를 적용하여 전체 코드를 다음과 같이 완성합니다.

![405_bubble_sort_example_whole_code](https://github.com/user-attachments/assets/202bbe7c-c963-4c48-87a9-1a5849586535)

`1번`정수 10개를 무작위로 입력 받습니다. 

`2번`버블 정렬을 구현한 메서드에 배열의 참조 변수를 넘겨서 정렬합니다.

`3번`정렬된 결과를 출력합니다.

#### To Do 02 - 실행시켜 입력된 값이 잘 출력되는지 확인합니다.
![406_bubble_sort_example_whole_code_result](https://github.com/user-attachments/assets/7f0fa84f-c4ed-4533-8bf7-eeb015b84334)

## 2. 퀴즈: 삽입 정렬 
정렬 관련 알고리즘은 앞에서 소개한 버블 정렬 외에도 다양합니다. 그중에서도 퀵 정렬, 삽입 정렬 등은 버블 정렬과 마찬가지로 간단한 알고리즘입니다. 

이번에는 삽입 정렬 동작 방식을 알아보고자 합니다. 아래의 내용에 힌트도 제공되니 직접 구현해보고 나서 제시된 전체 코드와 비교해보세요. 

### 2-1. 사전 지식: 삽입 정렬 알고리즘
삽입 정렬은 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 적절한 자신의 위치를 찾아 삽입하는 정렬입니다. 

동작 규칙은 간단합니다. 

1. 인덱스 0은 정렬되어 있다고 가정합니다. 그래서 현 위치는 인덱스 1부터 시작합니다.
2. 현 인덱스의 값과 바로 앞 인덱스의 값을 비교하여 더 작은 값을 앞으로, 큰 값을 뒤로 저장합니다.
3. 2번 과정을 반복하다가 바로 앞에 있는 값이 더 작다면 현 위치를 뒤로 옮깁니다(인덱스 +1 위치로).
4. 마지막 인덱스까지 2번 3번을 반복합니다.

예를 들어 입력된 값이 5개라고 했을 때, 삽입 정렬은 다음과 같이 네 번에 걸쳐서 비교를 수행하면서 정렬을 수행합니다. 

![407_insert_sort_algorithm](https://github.com/user-attachments/assets/e7431637-7faa-4797-b285-72185d73666d)

![408_insert_sort_algorithm_first_step](https://github.com/user-attachments/assets/92130da1-f832-4027-8199-26750177c6e0)

5와 3을 비교합니다. 3이 작으므로 둘의 위치를 임시 변수를 이용하여 바꾸어줍니다. 

![409_insert_sort_algorithm_first_step_result](https://github.com/user-attachments/assets/c6f30c84-c419-4ebe-91b6-6bbd4c6cfac7)

![410_insert_sort_algorithm_second_step](https://github.com/user-attachments/assets/44010a66-9d78-4e76-ba08-8a8cba85e6a1)

먼저 5와 1을 비교합니다. 1이 작으므로 둘의 위치를 임시 변수를 이용하여 바꾸어줍니다. 

![411_insert_sort_algorithm_second_step_2](https://github.com/user-attachments/assets/eb0f4a59-c3ad-4e39-8722-9ce1f9846f65)

다시 3과 1을 비교합니다. 역시 1이 작으므로 둘의 위치를 임시 변수를 이용하여 바꾸어줍니다. 

![412_insert_sort_algorithm_second_step_result](https://github.com/user-attachments/assets/3a4f6c3f-e24f-4220-8ef6-70073c0a5df0)

![413_insert_sort_algorithm_third_step](https://github.com/user-attachments/assets/93db2cfd-b665-4590-bcdd-b5af905de461)

먼저 5와 4를 비교합니다. 4가 작으므로 둘의 위치를 임시 변수를 이용하여 바꾸어줍니다.

![414_insert_sort_algorithm_third_step_2](https://github.com/user-attachments/assets/7585e26f-cf73-47c3-8e17-f7b920976816)

다시 3과 4를 비교합니다. 4가 크므로 위치 변경 없이 그대로 빈 자리에 입력해줍니다. 

![415_insert_sort_algorithm_third_step_result](https://github.com/user-attachments/assets/fe3e9f2d-01cf-4498-8861-59543c9c36ff)

![416_insert_sort_algorithm_forth_step_1](https://github.com/user-attachments/assets/11de2209-acc5-48fc-a976-e14d349467cc)

먼저 5와 2를 비교합니다. 2가 작으므로 임시 변수를 이용하여 둘의 위치를 바꾸어줍니다. 

![417_insert_sort_algorithm_forth_step_2](https://github.com/user-attachments/assets/28cc179f-b262-485f-aba2-11e74e14c065)

그리고 4와 2를 비교합니다. 2가 작으므로 임시 변수를 이용하여 둘의 위치를 바꾸어줍니다. 

![418_insert_sort_algorithm_forth_step_3](https://github.com/user-attachments/assets/fafb5455-cbeb-4128-9f29-766c17d0b226)

그리고 3과 2를 비교합니다. 2가 작으므로 임시 변수를 이용하여 둘의 위치를 바꾸어줍니다. 

![419_insert_sort_algorithm_forth_step_4](https://github.com/user-attachments/assets/af8a1d0b-5f20-4e42-9d2d-ecd4971fbebc)

다시 1과 2를 비교합니다. 2가 크므로 위치 변경 없이 그대로 빈 자리에 입력해줍니다. 

![420_insert_sort_algorithm_forth_step_result](https://github.com/user-attachments/assets/0f94e0a8-6d63-4c06-93b7-c453a212aff5)
