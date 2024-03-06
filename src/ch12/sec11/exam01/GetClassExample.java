package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) throws ClassNotFoundException {
        //class 객체를 생성하는 3가지 방법

        //첫번째 방법
        Class clazz = Car.class;

        //두번째 방법
        Class clazz2 = Class.forName("ch12.sec11.exam01.Car");

        //세번째 방법
        Car car = new Car();
        Class clazz3 = car.getClass();

        System.out.println("패키지: " + clazz.getPackage().getName());
        System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
        System.out.println("클래스 전체 이름: " + clazz.getName());
    }
}
