class Example04
{
  public static void main(String[] args)
  {
    System.out.println(2 < 3);
    System.out.println(2 > 3);

    boolean bMyCheck = (2 > 3);
    System.out.println(bMyCheck);

    // 조건문 대입 1 - true 조건
    if (1 < 2)
    {
      System.out.println("Hello");
    }

    // 조건문 대입 2 - false 조건
    int num = 3;
    if (num < 2)
    {
      System.out.println("Hi~");
    }
    
    // 조건문 대입 3 - 연산 결과를 구하고 그 값을 다시 비교 연산
    // 비교연산등호 '=='는 같다 라는 의미
    int num2 = 4;
    if ((num2 % 2) == 1)
    {
      System.out.println("나머지가 1이면 출력된다.");
    }
    
    // 조건문 대입 4 - if else문 대입
    if ((num2 % 2) == 1)
    {
      System.out.println("나머지가 1: 홀수");
    }
    else
    {
      System.out.println("나머지가 1이 아님, 0: 짝수");
    }
  }
}