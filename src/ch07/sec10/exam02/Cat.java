package ch07.sec10.exam02;

//추상클래스가 추상메소드가 있으면 자식 클래스 안에 필수적으로 오버라이드해야 함 (오버라이드 안할 경우, 에러 출력)

public class Cat extends Animal {
    //추상메소드는 반드시 오버라이드 해야한다.
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
