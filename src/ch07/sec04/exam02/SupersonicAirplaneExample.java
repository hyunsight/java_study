package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff(); //부모클래스에서 상속된 내용으로 실행
        sa.fly(); //자식클래스에서 오버라이드된 내용으로 실행

        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly(); //자식클래스에서 오버라이드된 내용으로 실행

        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly(); //자식클래스에서 오버라이드된 내용으로 실행

    }
}
