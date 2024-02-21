package ch06.sec11.exam02;

public class Earth {
    //상수 선언 (자바에서의 진정한 상수)
    // - 상수는 항상 초기값 필요
    //상수 초기화 첫번째 방법
    static final double EARTH_RADIUS = 6400; //상수는 항상 대문자
    static final double EARTH_SURFACE_AREA;

    //상수 초기화 두번째 방법
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
