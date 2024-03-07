package ch09.sec02.exam02;

public class A {
    class B {
        //필드
        int field = 1;
        static int field2 = 2; //중첩클래스에서 사용하는 정적필드는 jdk17부터 가능

        //생성자
        B() {
            System.out.println("B-생성자 실행");
        }

        //메소드
        void method1() {
            System.out.println("B-method1 실행");
        }
        //중첩클래스에서 정적메소드도 jdk17부터 사용 가능
        static void method2() {
            System.out.println("B-method2 실행");
        }
    }

    void useB() {
        B b = new B();
        System.out.println(b.field); //b객체 인스턴스 필드 사용
        b.method1(); //b객체 인스턴스 메소드 사용

        System.out.println(B.field2); //B클래스의 정적 필드 사용 -> 정적의 경우, 클래스명으로 접근
        B.method2(); //B클래스의 정적 메소드 사용 -> 정적의 경우, 클래스명으로 접근
    }
}


