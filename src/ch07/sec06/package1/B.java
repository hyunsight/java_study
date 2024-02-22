package ch07.sec06.package1;

public class B {
    public void method() {
        //protected는 같은 패키지에 있는 클래스에서 사용 가능
        A a = new A();
        a.field = "value";
        a.method();
    }
}
