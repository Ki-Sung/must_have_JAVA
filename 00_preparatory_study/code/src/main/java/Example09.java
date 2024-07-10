class Example09 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i = i + 1) {
      // 짝수이면 이후 실행을 건너뛰기
      if (i % 2 == 0) 
      {
        continue;
      }

      // 특정한 조건이 되면 멈추기
      if (i > 10)
      {
        break;
      }
      System.out.println(i);

    }
      
    // break으로 멈추면 여기로 실행 이동 
    System.out.println("반복문 종료");
  }
}