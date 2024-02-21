package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
    public void method( ){
        A a = new A();
        //다른 패키지 내에 있는 필드에 접근하기
        a.field1 = 1;
        //a.field2 = 1; //같은 패키지에서만 접근 가능
        //a.field3 = 1; //같은 클래스에서만 접근 가능

        //다른 패키지 내에 있는 메소드에 접근하기
        a.method1();
        //a.method2(); //같은 패키지에서만 접근 가능
        //a.method3(); //같은 클래스에서만 접근 가능
    }
}
