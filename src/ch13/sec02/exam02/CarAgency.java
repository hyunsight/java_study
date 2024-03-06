package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent() {
        return new Car(); //Car 객체를 리턴해줌
    }
}
