package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        //드라이버 객체 생성
        Driver driver = new Driver();

        //매개값으로 Bus 객체를 생성하고 driver() 메소드 호출
        Bus bus = new Bus();
        driver.drive(bus);

        //매개값으로 Car 객체를 생성하고 driver() 메소드 호출
        Car car = new Car();
        driver.drive(car);
    }
}
