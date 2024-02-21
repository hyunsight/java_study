package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        //myCar.speed = -50 //private으로 설정되었으므로 불러오고 설정하기 안됨
        
        //따라서 getter, setter 사용
        myCar.setSpeed(-50);
        System.out.println("현재속도: " + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재속도: " + myCar.getSpeed());

        //스피드가 0으로 떨어지면 자동차 멈추게 하는 코드3
        //멈춤
        if(!myCar.isStop()) {
            //차가 달리고 있다면 멈춘다
            myCar.setStop(true);
        }
        System.out.println("현재속도: " + myCar.getSpeed());
    }
}