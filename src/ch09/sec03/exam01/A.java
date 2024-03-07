package ch09.sec03.exam01;

public class A {
    //정적 멤버 클래스
    static class B {
    }

    //필드에서 b객체 사용
    B field = new B();
    static B field2 = new B();

    //생성자에서 b객체 사용
    A() {
        B b = new B();
    }

    //메소드에서 b객체 사용
    void method1() {
        B b = new B();
    }

    static void method2() {
        B b = new B();
    }
}
