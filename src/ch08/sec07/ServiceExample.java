package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {
        Service service = new ServiceImpl();

        service.defaultMethod1();
        System.out.println();

        service.defaultMethod2();
        System.out.println();

        //static이므로 class명으로 호출
        Service.staticMethod1();
        System.out.println();

        Service.staticMethod2();
    }
}
