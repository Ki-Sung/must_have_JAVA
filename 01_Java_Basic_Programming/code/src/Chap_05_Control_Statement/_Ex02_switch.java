package Chap_05_Control_Statement;

public class _Ex02_switch {
    public static void main(String[] args) {
        int n = 4;

        switch(n % 3)       // 1번 조건식
        {
        case 1:
            System.out.println("나머지가 1");
            break;
        case 2:
            System.out.println("나머지가 2");
            break;
        default:
            System.out.println("나머지가 0");
        }
    }
}
