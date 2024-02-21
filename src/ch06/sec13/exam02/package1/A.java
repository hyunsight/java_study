package ch06.sec13.exam02.package1;

public class A {
    //필드 선언
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    //같은 클래스 내에서 생성자 앞에 접근제한자를 붙일 경우
    //생성자
    public A(boolean b) {}
    A(int b) {} //같은 클래스, 같은 패키지에서 접근 가능
    private A(String b) {} //무조건 같은 클래스 안에서만 접근 가능
}
