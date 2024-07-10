class Example06
{
  public static void main(String[] args)
  {
    // 반복문 사용전
    System.out.print(2 * 1 + " ");
    System.out.print(2 * 2 + " ");
    System.out.print(2 * 3 + " ");
    System.out.print(2 * 4 + " ");
    System.out.print(2 * 5 + " ");
    System.out.print(2 * 6 + " ");
    System.out.print(2 * 7 + " ");
    System.out.print(2 * 8 + " ");
    System.out.print(2 * 9 + " ");
    System.out.println();

    System.out.println("======================");

    // 반복문 적용: for 문 사용 - 위의 반복에서 뒤의 자리 정수만 변하게 처리
    for (int i = 1; i < 10; i = i + 1)
    {
     System.out.print(2 * i + " ");
    }
    System.out.println();
  }
}