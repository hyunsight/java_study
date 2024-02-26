package ch08.sec11.exam02;

public class Driver {

    //매개변수로 다형성 구현 (매개변수로 Taxi, Bus 객체 및 메소드를 가져옴)
    void drive (Vehicle vehicle) { //Vehicle vehicle = new Bus(); 또는 Vehicle vehicle = new Taxi();
        vehicle.run();
    }
}
