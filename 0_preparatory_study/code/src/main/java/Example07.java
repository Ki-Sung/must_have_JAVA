import java.awt.SystemTray;

class Example07 {
  public static void main(String[] args) {
    // 반복문: Example06 참고
    // 조건의 연산식을 충족하는 동안 중괄호 안의 내용을 실행
    for (int i = 1; i < 10; i = i + 1) {
      System.out.print(2 * i + " ");
    }
    System.out.println();

    System.out.println("======================");

    // 반복문: 구구단 2단에서 9단 출력 - 반복문 중첩을 사용하기 전
    System.out.println("반복문 중첩 사용 전");

    for (int i = 1; i < 10; i = i + 1) {
      System.out.print(2 * i + " ");
      System.out.print(3 * i + " ");
      System.out.print(4 * i + " ");
      System.out.print(5 * i + " ");
      System.out.print(6 * i + " ");
      System.out.print(7 * i + " ");
      System.out.print(8 * i + " ");
      System.out.print(9 * i + " ");
      System.out.println();
    }

    System.out.println("======================");

    // 반복문 중첩 사용 후
    System.out.println("반복문 중첩 사용 후");
    for (int i = 2; i < 10; i = i + 1) {
      System.out.print(i + "단: ");
      for (int j = 1; j < 10; j = j + 1) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}