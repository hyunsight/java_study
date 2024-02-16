package ch06.sec07.exam04;

public class Car {
    //클래스 = 설계도 (속성 + 기능)
    //1.필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //2.생성자
    // - 매개변수의 개수, 타입, 순서 중요
    // - 각각의 생성자는 3개 중 하나는 달라야 함
    // - 단, 순서의 경우, 타입도 달라야 함
    Car() {}
    Car(String model) {
//        this.model = model;
        this(model, "은색", 250);
    }
    Car(String model, String color) {
//        this.model = model;
//        this.color = color;
        this(model, color, 250);
    }
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;

    }
    
    //3.메소드
}
