package ch07.sec08.exam02;

public class Driver {
    //메소드의 매개변수를 통해 자동타입변환이 일어남
    public void drive(Vehicle vehicle) { //= Vehicle vehicle = new Bus()
        vehicle.run();
    }
}
