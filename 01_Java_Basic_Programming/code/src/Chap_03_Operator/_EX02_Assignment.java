package Chap_03_Operator;

public class _EX02_Assignment {
    public static void main(String[] args) {
        short num = 10;
        num += 77L;                 // 1번 - 사람의 강제 형변환이 필요하지 않음
        System.out.println(num);

        num = (short)(num + 77L);   // 2번 - 형변환 필요
        System.out.println(num);
    }
}
