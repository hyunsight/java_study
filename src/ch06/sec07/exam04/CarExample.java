package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        //생성자 오버로딩 (여러개 생성자가 있을 때)
        // - 매개변수를 보고 생성자를 실행시킴
        Car car1 = new Car();
        System.out.println("car1.company: " + car1.company);
        System.out.println();

        //car2 생성 시, car(String model) { }이 생성
        Car car2 = new Car("자가용");
        System.out.println("car2.company:" + car2.company);
        System.out.println("car2.model:" + car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company:" + car3.company);
        System.out.println("car3.model:" + car3.model);
        System.out.println("car3.color:" + car3.color);
        System.out.println();

        Car car4 = new Car("택시", "검정", 200);
        System.out.println("car4.company:" + car4.company);
        System.out.println("car4.model:" + car4.model);
        System.out.println("car4.color:" + car4.color);
        System.out.println("car4.maxSpeed:" + car4.maxSpeed);
    }
}
