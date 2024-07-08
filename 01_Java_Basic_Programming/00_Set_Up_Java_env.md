# 0 자바 환경 구축
- 제가 사용하는 학습 환경이 Mac OS이므로 Mac OS에서 자바 환경을 구축해봅니다. 
- 목표 
    - Homebrew 설치 
    - Open JDK 설치 
    - IntelliJ IDE 설치
    - IntelliJ 실행 

## 1. JDK란?
우리가 Java를 사용하려면 먼저 JDK가 필요합니다. JDK란 **Java Development Kit**으로 Java 프로그램을 개발하기 위해 필요한 도구 모음입니다. 
### 1-1. JDK 구성
- 자바컴파일러(javac): JDK에는 자바 소스 코드를 컴파일하여 바이트 코드로 변환하는 데 사용되는 자바 컴파일러가 포함되어 있습니다.
- 자바실행기(java): javac가 만든 클래스 파일을 해석 및 실행하는 역할을 합니다.
- jdb: 자바 디버깅 툴을 말합니다.
- JRE: Java Runtime Enviroment 라고 불리며 자바 런타임 환경을 말하며, 자바 코드를 실행하기 위한 도구들 입니다. 이 도구는 작성된 자바 코드를 JVM에게 넘겨 실행하는 역할을 합니다.
- JVML Java Virtual Machine 라고 불리며 자바 가상 머신을 말합니다. 자바가 실제로 동작하는 가상환경을 말합니다. 즉 자바 프로그램이 다양한 OS에 원할히 실행될 수 있도록 도와줍니다.
### 1-2. Open JDK 
Open JDK는 Java를 무료로 사용할 수 있는 오픈 소스 구현체를 말합니다. 우리는 이 Open JDK를 이용하여 설치하고자 합니다.\
참고로 Open JDK는 이클립스 재단에서 관리하는 “adoptium.net”이라는 사이트에서 다운로드 할 수 있습니다.

## 2. Homebrew로 Open JDK 설치
Mac의 경우 Homebrew를 사용하여 설치할 수 있습니다. 그래서 먼저 Mac 환경에 Homebrew를 설치해야합니다.

### 2-1. Homebrew 설치
먼저 Homebrew 공식 홈페이지를 접속합니다.
```
https://brew.sh/
```
![1-1_homebrew](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/b0b6a039-8ffa-46a1-a447-c518156fbe7e)

사이트로 접속하시면 **Install Homebrew**에 코드가 있는데 해당 코드를 그대로 복사하셔서 터미널 환경에 붙여넣고 엔터를 누릅니다.
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
설치가 완료되고 잘 설치가 되었는지 확인하고 싶다면 아래의 명령어를 입력합니다.
```
brew --version
```

### 2-2. Homebrew로 Open JDK 설치
터미널 환경에서 아래의 과정에 맞게 명령어를 입력합니다.

#### 1. Open JDK 저장소 추가
```
brew tap adoptopenjdk/openjdk
```

#### 2. Homebrew에서 JDK 검색
```
brew search jdk
```
![1-1_search_jdk](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/4f309bce-2f19-4a4f-b032-2b4c6016ae1f)

&rarr; 여기 모든 JDK 버전들이 나오는데, 우리는 실무에서 가장 많이 사용하는 8 버전을 설치하고자 합니다.

#### 3. homebrew에서 JDK 8 버전 설치
```
brew install --cask adoptopenjdk8
```
![1-2_install_jdk](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/49e4f1d2-292a-42b9-93e3-87103fb85037)

&rarr; `java --version` 명령어를 입력해서 위와 같이 정보가 나온다면 이상없이 설치 되어진 것 입니다. 

#### 4. 만약 에러가 발생했다면?
혹시 다른 Java 환경이 있어 에러가 난다면 우리가 설치하고자 하는 Java 8 버전으로 변경해야 합니다.
1) `JavaVirtualMachines` 환경으로 이동
    ```
    cd /Library/Java/JavaVirtualMachines
    ```
    ![1-3_install_jdk_2](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/151d13b4-9b24-439e-b24d-14a406ce95cd)

2) JDK 8 디렉토리로 이동
   ```
   cd adoptopenjdk-8.jdk
   ```
3) JDK 8 디렉토리의 Contents → Home까지 이동
   ```
   cd Contents/Home
   ```
   ![1-4_install_jdk_3](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/ae44103d-148b-4fca-bd53-07787ae7a559)

   &rarr; 현재 경로 조회 후 경로 복사
   ```
   /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
   ```

4) 현재 경로에서 Path를 복사 후 bash file로 이동
   ```
   cd ~/
   ```
   ```
   ls -al
   ```
   ![1-5_install_jdk_4](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/010d93ce-e971-4325-bd9c-92862ffde75f)

   &rarr; 만약 `.bash_profile`이 없다면 `touch .bash_profile` 이라고 명령어를 입력하여 만들기

5) bash file을 편집기로 들어가 환경 설정 - 여기서 vim 편집기 사용
   ```
   sudo vi .bash_profile
   ```
   설치된 Open JDK 8 버전의 Contents/home 경로가 JAVA_HOME으로 들어가게 되고 추가로 PATH가 bin 경로가 설정 됩니다.
   ```
   // 편집기 맨 아래 아래의 코드 입력 
   export JAVA_HOME=/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
   export PATH=${PATH}:$JAVA_HOME/bin
   ```
   &rarr; 오타 확인 후 저장 후 나가기 `wq`

6) 수정된 bash file 적용하기
   ```
   source .bash_profile 
   ```

   &rarr; 적용 후 `java --version` 명령어를 입력해서 위와 같이 정보가 나온다면 이상없이 설치 되어진 것 입니다. 

## 3. Homebrew로 Intelli J IDE 설치
통합 개발 환경(Integrated Development Enviroment)을 제공하는 Intelli J를 설치하여 자바 프로그래밍에 활용하도록 하겠습니다.\
(책에는 "eclipse"를 설치하고 되어 있지만, 여기서는 "Intelli J"를 설치하도록 하겠습니다.)
### 3-1. brew에서 Intelli J 설치 
#### 1. 먼저 brew에서 Intelli J를 검색해봅니다.
```
brew search intellij
```
![1-6_install_ide](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/e42af161-43f3-4322-924a-97c6ab742c82)

&rarr; 여러 Intelli J가 나오는데 우리는 무료 버전인 Intelli J-ce를 설치하고자 합니다. 

#### 2. brew에서 설치
```
brew install --cask intellij-idea-ce
```
<img width="1497" alt="1-7_install_ide_2" src="https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/ad22ecf3-42a1-4f97-b2e3-355d94b6e4d8">

&rarr; 설치가 완료되면 위와 같이 어플리케이션이 생성 됩니다. 설치가 완료되었습니다.

### 3-2. Intelli J 실행해보기 
이제 환경 설정은 모두 끝이 났습니다. 이제 IDE를 실행해봅시다. 

#### 1. Intelli J 실행

![1-8_iuse_ide_1](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/e1d80055-69b0-488d-a9fb-c5679d93eee8)

실행 후 Projects를 클릭하고, New Project를 클릭해 새로운 프로젝트를 생성합니다. 

#### 2. Project 생성

![1-9_use_ide_2](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/39669645-27d5-4862-a184-198926fe8b35)

프로젝트 명, 프로젝트를 저장할 경로 설정, JDK 버전 설정까지 한 후 프로젝트 생성을 누릅니다. 

#### 3. Project 생성 후 실행

프로젝트 생성 후 최초 코드가 생성되는데 Intelli J 기준 오늘쪽 맨 상단 재생 버튼이 있는데, 이 버튼을 누르면 해당 코드가 실행됩니다. 한번 실행 시켜 봅니다.

![1-10_use_ide_3](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/7b234353-3f3c-4f58-ae5a-dcf69d76081e)

&rarr; 실행 했을 때 아래 터미널에서 “Hello world!”가 제대로 출력됬다면 모든 준비는 완료된 것입니다. :) 

## 4. Intelli J 사용 - 최초 코드 입력 
### 4-1. IDE - Intelli J 구성
![1-11_ide_structure](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/99e01ac6-be45-4bf8-8cc3-562b3226615b)

### 4-2. 자바 코드 작성해보기
#### 1. src 디렉토리에서 New &rarr; Package 클릭
![1-12_use_idea_4](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/08d0d8e6-bde8-414e-8cde-599aaadbfefe)

#### 2. 새로운 패키지 지정 - chap_01
![1-13_open_package](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/6ef4f824-805c-454a-8d27-cf57161e85a7)

#### 3. 새로 생성된 Package에 Java Class 추가
![1-14_open_class](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/35f8c48d-a832-4bdf-b513-d6848dcdda4e)

&rarr; class 명은 "_01_HelloWorld"로 설정합니다. 

이렇게 설정이 완료되면 아래와 같이 편집기에 자동으로 코드가 생성됩니다. 이제 코드를 작성할 준비를 마쳤습니다. 

![1-15_read_code](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/0e3111d5-deae-426f-9d23-d02e980f519a)

#### 4. 코드 작성 후 실행 
아래의 코드를 직접 입력해봅니다. 
```
package chap_01;

public class _01_HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello World!!");
    }
}
```
코드를 입력했으면 실행을 시켜봅니다. 오른쪽 상장 실행 버튼을 클릭하거나 `control + r`을 입력합니다.

![1-16_run_code](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/213eca2b-8ce4-405d-971e-f9300f2b1d04)

&rarr; 아래 콘솔창에 "Hello World!!"가 출력되면 정상적으로 코드가 실행된 것입니다. (만약 안됬다면 오타가 없는지 확인해보세요)

잠깐 설명을 드리면 주로 `public static void main (String[] args)`의 중괄호 안에 코드가 실행됩니다. 그리고 이 중괄호 안에 `System.out.println();`이라는 코드가 있는데, 이는 소괄호 안에 내용을 한 줄 출력해달라는 의미입니다.

## 마무리
이렇게 Java 환경 설정 부터 기본 코드까지 작성해보았습니다. :) 이제 본격적으로 Java의 세계로 들어가봅시다.
