# 01 온라인에서 설치 없이 자바 사용하기
- 선수 수업에서는 로컬 환경에 자바 개발 환경을 설치하는 대신, 온라인 자바 컴파일 서비스를 제공하는 repl.it을 활용합니다. 리플잇에서 자바 코드를 입력하고 컴파일하고 실행하는 방법을 알아보겠습니다.
## 1. 리플잇 환경 설정
1. 먼저 리플잇에 접속하고 가입합니다.
2. 가입 후 메일 인증을 완료하고 간단한 설문에 응답합니다(주로 어떤 언어를 사용하는지 등).
![0-1_replit_main](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/212b10b3-2c93-4cf5-9073-270781e6e59f)
3. 왼쪽 상단에 있는 "Create Repl"을 클릭 후 Template(언어)를 선택과 프로젝트 타이틀을 지정 후 Repl을 생성해줍니다.
![0-2_create_project](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/a2511410-6a62-4cc5-a7ed-07f467b9d8b4)
4. 아래와 같이 코드와 콘솔 화면이 나오면 성공입니다.
![0-3_project_home](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/7fb68c41-b19b-4c58-8eee-52de3d906143)

## 2. 리플잇 화면 구성 익히기
![0-4_screen_layout](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/ca8949bd-664d-4719-9329-adbdd51b1557)

  1) 폴더 및 파일 구조를 확인할 수 있는 탐색기창
  2) 코드 편집기창
  3) 자바 코드를 컴파일하고 실행시킬 수 있는 콘솔창
  4) 파일 추가
  5) 폴더 추가

## 3. 리플잇에서 자바 사용해보기
1. 우측 shell창을 클릭하고 "ls(리스트 조회)"를 입력, 입력하면 현재 폴더의 파일 목록을 보여줍니다.
![0-5_shell_layout](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/86c3fe84-5bf9-4fe8-b03f-5c53ce79fe36)
2. 자바 개발 도구인 JDK로 컴파일합니다. 컴파일이란 우리가 만든 텍스트 코드를 이용하여 실행할 때 사용되는 자바 바이트 코드를 만들어 주는 단계로 이해하면 됩니다. java 명령을 다음과 같이 입력합니다.
```
java Main.java
```
![0-6_java_command](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/9811958b-cece-4bd2-8b15-e549459ec48b)

3. 프롬프트가 다음 줄로 바뀌고 아무런 메시지 없이 다음 프롬프트 화면이 뜬다면 정상적으로 컴파일된 것입니다. 가장 상위 디렉토리로 가서 ls 명령어를 입력하면 컴파일 결과로 만들어진 Main.class가 보일 겁니다. Main.class 파일은 우리가 만든 코드를 실행시킬 수 있는 바이트 코드로 이루어진 파일 입니다.
```
ls
```
![0-7_java_class](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/9be511ea-9685-4c33-8829-9e63b5232fa4)

4. 해당 Main.class 파일을 실행할 때는 확장자를 입력하지 않습니다. 다만 파일명은 대소문자를 정확히 입력해주어야 합니다.
```
java Main
```
![0-8_java_main](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/fe36dcb3-090e-4e84-8b3c-03076a26bb8d)
&rightarrow; 실행결과로 화면에 "Hello world!"가 출력되었습니다. 첫 번째 자바 프로그램을 컴파일하고 실행시켰습니다. 앞으로도 Java로 코드를 만들면 `javac` or `java`를 이용하여 class를 만들고 &rarr; `java`를 이용하여 class 파일을 실행시키면 됩니다. 지금의 과정을 다시 정리하면 아래와 같습니다.

  1) 소스 파일 생성 후 코드 작성 
  2) `javac` or `java`라는 컴파일러를 이용하여 ~.java 소스 파일을 컴파일 
  3) ~.class라는 바이트 코드 생성 
  4) 이후 `java`를 이용하여 Main.class 바이트 코드를 실행

![0-9_java_run_process](https://github.com/Ki-Sung/must_have_JAVA/assets/80456601/82aef537-5e6f-4434-9674-48d2c04b1d23)
'컴파일 할때는 .java를 붙이고 실행할 때는 .class를 붙이지 않는다'라는 규칙 입니다. 
