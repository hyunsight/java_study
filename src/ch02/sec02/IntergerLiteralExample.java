package ch02.sec02;

public class IntergerLiteralExample {
    public static void main(String[] args) {
        //2진수(0과 1로 작성): 1011 => 0b를 붙여서 작성
        int var1 = 0b1011;
        System.out.println(var1);

        //8진수(0~7사이의 숫자로 작성): 206 => 0을 붙여서 작성
         int var2 = 0206;
        System.out.println(var2);
        
        //16진수(0~9사이의 숫자, a~f까지의 문자로 작성): b3 => 0x를 붙여서 작성
        int var3 = 0xb3;
        System.out.println(var3);
    }
}
