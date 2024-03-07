package ch09.sec04.exam02;

public class A {
    void useB() {
        class B {
            //필드
            int field1 = 1;
            static int field2 = 2; //정적필드 jdk17부터 사용 가능

            //생성자
            B() {
                System.out.println("B-생성자 실행");
            }

            void method1() {
                System.out.println("B-method1 실행");
            }

            //jdk17부터 사용 가능
            static void method2() {
                System.out.println("B-method2 실행");
            }
        }

        B b = new B();
        //인스턴스 필드, 메소드 사용
        System.out.println(b.field1);
        b.method1();

        //정적 필드, 메소드 사용
        System.out.println(B.field2);
        B.method2();
    }
}
