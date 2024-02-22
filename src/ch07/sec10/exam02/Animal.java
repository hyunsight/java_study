package ch07.sec10.exam02;

public abstract class Animal {
    //일반 메소드 구현
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    //추상(abstract) 메소드 구현 -> 선언부만
    // - 오버라이드용으로 사용 -> 다형성을 위해 오버라이드하므로 주 목적은 '다형성'임
    // - 중괄호 없음
    public abstract void sound();
}
