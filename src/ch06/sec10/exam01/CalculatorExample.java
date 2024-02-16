package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        //인스턴스를 생성해서 접근해야 하는 필드와 메소드 => 인스턴스 멤버
        //Calculator calc = new Calculator();
        //calc.pi = 10;
        //calc.plus(1, 2);

        //인스턴스(객체)를 생성하지 않고 접근할 수 있는 필드와 메소드 => 정적 멤버
        //정적 멤버는 클래스명으로 접근

        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}
