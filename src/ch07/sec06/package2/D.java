package ch07.sec06.package2;

import ch07.sec06.package1.A;

//다른 패키지에 있는 클래스를 가지고 오려면 import 필요
// - 가지고 오려는 클래스명 작성 후 ctrl + space 누르면 됨
public class D extends A {
    //생성자
    public D() {
        super(); //부모클래스의 생성자를 호출 (생략 가능 - 컴파일 거치면서 super() 자동으로 생성)
    }

    public void method1() {
        //상속관계일 때 protected 접근제한자가 있는 부모클래스의 필드와 메소드를 사용할 수 있음
        // - this를 활용해서 가져다 쓰는 것은 가능
        this.field = "value"; //this.field의 경우, 상속 받은 필드를 가리킴
        this.method(); //this.method()의 경우, 상속 받은 메소드를 가리킴
        super.field = "value"; //super 활용해서도 상속 받은 필드를 가져올 수 있음
        super.method(); //super 활용해서도 상속 받은 메소드를 가져올 수 있음
    }

    public void method2() {
        // - (중요) 단, 직접 객체를 생성해서 사용은 불가
//        A a = new A();
//        a.field = "value";
//        a.method();
    }
}
