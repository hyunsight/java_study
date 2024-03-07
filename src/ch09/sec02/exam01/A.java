package ch09.sec02.exam01;

public class A {
    //인스턴스 멤버 클래스 
    // - 클래스 안의 클래스 -> 중첩 클래스 -> '인스턴스 멤버 클래스'로 불림
    class B {
        //인스턴스 멤버 플래스 안에 필드, 생성자, 메소드 생성 가능
        public void method2() {}
    }

    //필드 (B 객체 대입)
    // - 인스턴스 멤버 클래스 객체 생성해서 필드 생성 가능
    B field = new B();
    
    //생성자 (B 객체 생성)
    A() {
        B b = new B();
    }

    //메소드(B객체 생성)에서도 사용 가능
    void method() {
        B b =  new B();
        b.method2(); //인스턴스 멤버 클래스 안에 생성된 메소드도 동일하게 사용 가능
    }
}
