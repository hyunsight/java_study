package ch06.sec13.exam03.package1;

public class B {
    //public void method( ){}
    // : 객체를 생성해서 사용하기 위해 쓰는 메소드
    // : 즉, 의미없는 메소드로, 테스트를 위해 생성
    public void method( ){
        A a = new A();
        //다른 클래스 내에 있는 필드에 접근하기
        a.field1 = 1;
        a.field2 = 1;
        //a.field3 = 1; //같은 클래스에서만 접근 가능

        //다른 클래스 내에 있는 메소드에 접근하기
        a.method1();
        a.method2();
        //a.method3(); //같은 클래스에서만 접근 가능
    }
}