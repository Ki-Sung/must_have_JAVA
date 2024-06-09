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
