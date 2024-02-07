package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        //정밀도(double > float)
        //  - float의 경우, long 타입과 비슷하게 뒤에 F/f를 붙여줘야 함 -> 기본적으로 컴파일러는 실수 리터럴을 double타입으로 인식하므로
        //  - float의 경우, 정밀도가 낮아 표현할 수 있는 자릿수가 적음
        float var1 = 0.1234567890123456789F; //실수형은 기본 리터럴을 double 타입으로 인식하므로 float형은 F를 붙여준다.
        double var2 = 0.1234567890123456789;
        System.out.println(var1);
        System.out.println(var2);

        //가수와 지수 나눠서 작성하기
        double var3 = 3e6; // 3.0 X 10^6
        System.out.println("var3: " + var3);

        float var4 = 3e6F;
        System.out.println("var4: " + var4);
        
        double var5 = 2e-3; // 2.0 X 10^-3, ^: 제곱 표현
        System.out.println("var5: " + var5);
    }
}
