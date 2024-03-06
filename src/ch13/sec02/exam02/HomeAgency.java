package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() { //제레닉으로 타입 준 상태에서 타입이 아직 정해지지 않았을 때 Object로 자동 지정됨
        return new Home(); //Home 객체를 리턴해줌
    }
}
