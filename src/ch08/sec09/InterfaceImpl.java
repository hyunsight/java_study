package ch08.sec09;

//인터페이스 A, B는 InterfaceImpl의 조부모 격으로 보면 됨
public class InterfaceImpl implements InterfaceC {
//interface 받으려면 오버라이드 필요
    @Override
    public void methodA() {
        System.out.println("InterfaceImpl-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceImpl-methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceImpl-methodC() 실행");
    }
}
