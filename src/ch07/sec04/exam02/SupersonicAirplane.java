package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
    //상수 필드
    public static final int NORMAL = 1; //일반 비행기
    public static final int SUPERSONIC = 2; //초음속 비행기

    //인스턴스 필드
    public int flyMode = NORMAL; //비행모드(디폴트 값은 일반 비행)

    //오버라이드 (fly()를 가져와서 재정의 필요)

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC)
            System.out.println("초음속 비행입니다.");
        else
            //System.out.println("일반 비행입니다.");
            super.fly(); //부모클래스에 있는 메소드를 호출한다. (중복된 내용 방지)
    }
}
