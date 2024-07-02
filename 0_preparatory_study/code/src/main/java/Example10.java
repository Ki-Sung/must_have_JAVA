// Scanner 클래스 가져오기
import java.util.Scanner;

class Example10{
  public static void main(String[] args)
  {
    // 사용자 입력을 받기 위한 Scanner 객체 생성
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자를 입력하고 엔터를 치세요.");

    // 사용자로부터 첫 번째 숫자 입력 받기, 입력 받은 숫자 num1 변수에 저장 
    System.out.print("첫 번째 숫자: ");
    int num1 = sc.nextInt();

    // 사용자로부터 두 번째 숫자 입력 받기, 입력 받은 숫자 num2 변수에 저장 
    System.out.print("두 번째 숫자: ");
    int num2 = sc.nextInt();

    // 사칙 연산 수행
    // 덧셈
    int result1 = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result1);

    // 뺄셈
    int result2 = num1 - num2;
    System.out.println(num1 + " - " + num2 + " = " + result2);

    // 곱셈 
    int result3 = num1 * num2;
    System.out.println(num1 + " * " + num2 + " = " + result3);

    // 나머지
    int result4 = num1 % num2;
    System.out.println(num1 + " % " + num2 + " = " + result4);
  }
}