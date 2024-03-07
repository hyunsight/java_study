package ch09.sec03.exam02;

public class A {
    static class B {
         int field1 = 1;
         static int field2 = 2; //중첩클래스에서 정적 필드 jdk17부터 사용 가능
  
  //생성자      
         B() {
             System.out.println("B-생성자 실행");
         }
         
         //메소드
        void method1() {
            System.out.println("B-method1 실행");
        }
        
        //중첩클래스에서 정적 메소드 jdk17부터 사용 가능
        static void method2() {
            System.out.println("B-method2 실행");
        }
    }
}
