package Chapter_09.Chapter09_2;

class Calc {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a) {
        return a + 1;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingUse {
    public static void main(String[] args) {
        Calc calc = new Calc();                       // 1번 - Calc 클래스 객체 선언
        int nRtn1 = calc.add(3, 9);             // 2번 - 객체의 첫 번째 add() 메서드 호출
        int nRtn2 = calc.add(3);                      // 3번 - 객체의 첫 번째 add() 메서드 호출
        double nRtn3 = calc.add(3.0, 9.0);      // 4번 - 객체의 첫 번째 add() 메서드 호출

        System.out.println("Rtn1 = " + nRtn1);
        System.out.println("Rtn2 = " + nRtn2);
        System.out.println("Rtn3 = " + nRtn3);
    }
}
