package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        //필드를 이용해 자동타입변환이 일어난다. (다형성 구현을 위한 1차)
        myCar.tire = new HankookTire(); //'Tire tire = new HankookTire()'와 동일한 의미 -> Car tire에 HankookTire를 넣어줌
        myCar.run(); //tire.roll() -> 오버라이드 된 메소드가 있으면 자식 클래스에 있는 메소드 사용
        
        // - 금호타이어로 갈아끼우고 싶을 때
        myCar.tire = new KumhoTire(); //'Tire tire = new KumhoTire()'와 동일한 의미
        myCar.run(); //tire.roll() -> 오버라이드 된 메소드가 있으면 자식 클래스에 있는 메소드 사용

        myCar.tire = new Tire(); //'Tire tire = new KumhoTire()'와 동일한 의미
        myCar.run();
    }
}
