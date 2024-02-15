package ch06.sec06;

public class CarExample2 {
    public static void main(String[] args) {
        //3가지 자동차는 각각 다른 자동차임 > 각 자동차별 필드 지정 가능
        Car myCar1 = new Car(); //첫번째 자동차 생산
        myCar1.color = "white";
        myCar1.maxSpeed = 400;
        System.out.println("myCar1 색상: " + myCar1.color);
        System.out.println("myCar1 최대속도: " + myCar1.maxSpeed);

        Car myCar2 = new Car(); //두번째 자동차 생산
        myCar2.color = "gray";
        myCar2.model = "소나타";
        System.out.println("myCar2 색상: " + myCar2.color);
        System.out.println("myCar2 모델: " + myCar2.model);

        Car myCar3 = new Car(); //세번째 자동차 생산
        System.out.println("myCar3 색상: " + myCar3.color);
    }
}
