package ch07.sec10.exam01;

//오로지 상속만을 위한 클래스 (객체 생성 X)
public abstract class Phone {
    String owner;
    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
