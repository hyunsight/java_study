package ch07.sec07.exam02;

public class Child extends Parent{
    int field2 = 0;

    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }

    public void method3() { //자식 클래스가 가지고 있는 method
        System.out.println("Child-method3()");
    }
}
