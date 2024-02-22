package ch07.sec10.exam01;

public class PhoneExample {

    public static void main(String[] args) {
        //abstract 클래스를 객체 생성 X 
        // - 추상클래스: 상속만을 위한 클래스
//        Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("길동");
        smartPhone.turnOn(); //Phone의 메소드
        smartPhone.internetSearch(); //smartPhone의 메소드
        smartPhone.turnOff(); //Phone의 메소드
    }
}
