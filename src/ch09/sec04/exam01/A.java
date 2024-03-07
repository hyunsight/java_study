package ch09.sec04.exam01;

public class A {
    //생성자 안에 클래스 생성/선언 가능
    A() {
        class B {}
        B b = new B();
    }

    //메소드 안에 클래스 생성/선언 가능
    void method() {
        class B {}
        B b = new B();
    }
}
