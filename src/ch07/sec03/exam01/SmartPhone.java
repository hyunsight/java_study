package ch07.sec03.exam01;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        //부모 객체의 생성자를 실행해준다 (부모 생성자의 매개변수가 없다면 생략 가능): 생략하면 컴파일 시 자동 추가됨
        // - 단, 부모 생성자의 매개변수가 있다면 생략 불가능
        // - SmartPhone()의 매개변수를 그대로 super()의 매개변수로 넣어줌
        super(model, color);

//        this.model = model;
//        this.color = color;

        System.out.println("SmartPhone(String model, String color) 생성자 실행");
    }
}
