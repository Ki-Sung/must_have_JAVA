package Chap_02_Variables_Constants_DataTypeConversion;

public class _EX05_Calculation2 {
    public static void main(String[] args) {
        int num31 = 1;
        int num32 = 2;
        int result3 = num31 + num32;        // 1번 - OK

        long num41 = 1;
        long num42 = 2;
        long result4 = num41 + num42;       // 2번 - OK

        long result5 = num31 + num41;       // 3번 - OK -> 자동 형변환

        float num61 = 1.0f;                 // 4번 - f 접미사
        float num62 = 2.0f;
        float result6 = num61 + num62;      // 5번 - OK

        double num71 = 1.0;
        double num72 = 2.0;
        double result7 = num71 + num72;     // 6번 - OK

        double result8 = num61 + num71;     // 7번 - OK -> 자동 형변환
    }
}
