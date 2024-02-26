package ch08.sec09;

public class ExtandsExample {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl; //자동타입변환
        ia.methodA();
        //ia.methodB(); //불가능
        //ia.methodC(); //불가능

        InterfaceB ib = impl;
        //ib.methodA(); //불가능
        ib.methodB();
        //ib.methodC(); //불가능

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}
