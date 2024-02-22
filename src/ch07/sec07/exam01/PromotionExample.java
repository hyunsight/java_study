package ch07.sec07.exam01;

//여러개 클래스 생성 가능 (단, 많이 사용하지는 않음)

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}
public class PromotionExample {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        //자동타입변환
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e; //바로 아래의 자식 클래가 아니더라도 상속 관계이므로 문제없이 자동 타입 변환 일어남

        B b1 = d;
        C c1 = e;

//    B b2 = e;
//    C c2 = d;
    }
}

