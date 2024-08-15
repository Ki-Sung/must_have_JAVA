package Chap_04_Console_Output_Input;

public class _EX01_printf {
    public static void main(String[] args) {
        String name = "Hong Gil Dong";      // 1번 - 글자들이 저장할 때 사용하는 자료형
        int age = 20;
        double height = 175.5;

        System.out.printf("%s의 나이는 %d이고, 키는 %f입니다.\n", name, age, height);      // 2번
        System.out.printf("%s의 나이는 %d이고, 키는 %.2f입니다.\n", name, age, height);   // 3번
    }
}
