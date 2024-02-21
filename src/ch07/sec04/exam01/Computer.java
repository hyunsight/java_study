package ch07.sec04.exam01;

public class Computer extends Calculator{

    //메뉴 > code > override 사용
    // - 상속 관계에서만 override 사용 가능
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
