package ch06.sec14;

public class Car {
    private int speed;
    private boolean stop; //자동차의 멈춤여부

    //private method의 경우, 다른 클래스에서 사용 불가
    //따라서 getter, setter 메소드 사용
    // : 메뉴 > code > generator > getter / setter 클릭

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        //this.speed = speed;

        //스피드가 0으로 떨어지면 자동차 멈추게 하는 코드1
        // -speed가 0 미만이면 필드의 값을 0으로 변경
        if (speed < 0) {
            this.speed = 0;
            return; //메소드를 긑낸다.
        } else {
            // -speed가 0 이상이면\ 필드의 값을 매개변수 speed 값으로 변경
            this.speed = speed;
        }
    }

    //boolean 타입은 get, set 대신 is로 사용
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;

        //스피드가 0으로 떨어지면 자동차 멈추게 하는 코드2
        //차가 멈추면 speed를 0으로 만듦
        if(stop) this.speed = 0;
    }
}
