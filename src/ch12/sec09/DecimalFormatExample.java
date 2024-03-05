package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df;

        //정수 자리까지 표시
        df = new DecimalFormat("#,###");
        System.out.println(df.format(num));

        //소수 첫째자리까지 표시
//        df = new DecimalFormat("#,###.0");
        df = new DecimalFormat("#,###.00000"); //0 여러개 쓸 경우, 공백으로 채움
        System.out.println(df.format(num));
    }
}
