package ch07.sec08.exam01;

public class Car {
    //필드로 다형성(오버라이드 + 자동타입변환)을 구현하는 방법
    //필드에서 자동타입 변환이 발생되도록 한다.
    public Tire tire;

    public void run () {
        //타이어를 갈아끼우고 싶을 때
        tire.roll(); //여기서 오버라이드됨 (다형성 구현을 위한 2차)
    }
}
