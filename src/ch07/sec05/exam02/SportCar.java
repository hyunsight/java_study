package ch07.sec05.exam02;

public class SportCar extends Car {
    @Override
    public void speedUp() {
       speed+= 10;
    }

    /*
    final 키워드로 인해 오버라이드 불가
    @Override
    public void stop () {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
    */
}
