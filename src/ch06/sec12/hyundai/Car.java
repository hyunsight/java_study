package ch06.sec12.hyundai;

//다른 패키지에 있는 클래스를 객체로 생성하는 경우, 필수적으로 import 작성 필요

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;
import ch06.sec12.kumho.*; //.*: 모든 것을 선택한다는 의미
import ch06.sec12.kumho.project.*;

public class Car {
    Test t = new Test();
    ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();

    //Tire로 클래스명이 동일할 때 Tire친 후 컨트롤 + 스페이스바 입력해서 찾기
    // - 클래스 이름이 동일하기 때문에 명시적으로 아래와 같이 작성 필요 (import 대신 full name 가져오기)
    ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();

    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
    RainTire tire5 = new RainTire();
}
