// Scanner 클래스 가져오기
import java.util.Scanner;

class Example11 {
  public static void main(String[] args)
  {
    // 사용자 입력을 받기 위한 Scanner 객체 생성
    Scanner sc = new Scanner(System.in);

    while (true)
    {
      // 계산기 메뉴 지정 
      System.out.println("메뉴를 선택하세요.");
      System.out.println("1. 더하기");
      System.out.println("2. 빼기");
      System.out.println("3. 곱하기");
      System.out.println("4. 나누기");
      System.out.println("0. 끝내기");

      int num = sc.nextInt();
      if (num == 0)
      {
        break;
      }
      else
      {
        if (num > 4)
        {
          System.out.println("메뉴를 잘못 선택했습니다.");
          continue;
        }
        // 더하기, 빼기, 곱하기, 나누기 기능 설정
        // 숫자 입력란 
        System.out.print("첫 번째 숫자:");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자:");
        int num2 = sc.nextInt();

        // 1을 입력했을 경우 더하기 사칙연산
        if (num == 1)
        {
          int result = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + result); 
        }

        // 2를 입력했을 경우 빼기 사칙연산
        else if (num == 2)
        {
          int result = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + result);
        }

        // 3을 입력했을 경우 곱하기 사칙연산
        else if (num == 3)
        {
          int result = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + result);
        }

        // 4를 입력했을 경우 나누기 및 나머지 사칙 연산
        else if (num == 4)
        {
          int result1 = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result1);

          int result2 = num1 % num2;
          System.out.println(num1 + " % " + num2 + " = " + result2);
        }
      }
    }
    System.out.println("계산기를 종료 합니다.");
  }
}