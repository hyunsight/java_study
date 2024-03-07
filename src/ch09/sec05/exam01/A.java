package ch09.sec05.exam01;

public class A {
    //A 클래스 자체의 인스턴스 필드, 메소드 생성
    int field1;

    void method1() {}

    //A 클래스 자체의 정적 필드, 메소드 생성
    static int field2;

    static void method2() {}

    //인스턴스 멤버 클래스
    class B {
        void method() {
            //중첩 클래스 안에서 인스턴스 멤버 클래스인 경우, 바깥 클래스 멤버에 접근 가능
            field1 = 10;
            method1();
            field2 = 10;
            method2();
        }
    }

    //정적 멤버 클래스
    static class C {
        void method() {
            //바깥 클래스에 있는 인스턴스 필드, 메소드 접근 불가능
//            field1 = 10;
//            method1();
            field2 = 10;
            method2();
        }
    }
}
