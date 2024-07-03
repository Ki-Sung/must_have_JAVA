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

1. Open JDK 저장소 추가
```
brew tap adoptopenjdk/openjdk
```

2. Homebrew에서 JDK 검색
```
brew search jdk
```
![1-1_search_jdk](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/4f309bce-2f19-4a4f-b032-2b4c6016ae1f)

&rarr; 여기 모든 JDK 버전들이 나오는데, 우리는 실무에서 가장 많이 사용하는 8 버전을 설치하고자 합니다.

3. homebrew에서 JDK 8 버전 설치
```
brew install --cask adoptopenjdk8
```
![1-2_install_jdk](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/49e4f1d2-292a-42b9-93e3-87103fb85037)

&rarr; `java --version` 명령어를 입력해서 위와 같이 정보가 나온다면 이상없이 설치 되어진 것 입니다. 

4. 만약 에러가 발생했다면?\
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
