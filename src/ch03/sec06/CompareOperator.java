package ch03.sec06;

public class CompareOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        char char1 = 'A'; //65
        char char2 = 'B'; //66
        boolean result4 = (char1 < char2); //int형으로 자동타입 변환이 일어나기 때문에 비교 연산 및 boolean 결과 산출 가능
        System.out.println("result4: " + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4); //double형으로 자동타입 변환이 일어나기 때문에 비교 연산 및 boolean 결과 산출 가능
        System.out.println("result5: " + result5);

        //float와 double 비교 시 주의사항 
        //  - 부동소수점을 사용하기 때문에 정밀한 값이 산출되지 않아 비교 결과 값 false로 출력
        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        System.out.println("result6: " + result6);

        //해결책: 강제타입 변환을 시켜서 타입을 길게 만든다.
        boolean result7 = (num5 == (float) num6); //또는 double로 강제타입 변환시켜도 무방
        System.out.println("result7: " + result7);

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = str1.equals(str2);
        boolean result9 = !str1.equals(str2);
        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);
    }
}