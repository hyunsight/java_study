package ch08.sec02;

public interface RemoteControl {
    //필드 상수 선언
    int MAX_VOLUME = 10; //public static final 생략됨
    int MIN_VOLUME = 0;

    //추상메소드
    // - interface 내에서 추상 메소드 생성 시, public 외 private 등 강한 접근 제한 쓰면 안 됨
    // - (중요) 반드시 오버라이드 필요함
    public void turnOn(); //abtract가 생략됨
}
