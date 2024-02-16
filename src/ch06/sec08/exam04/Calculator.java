package ch06.sec08.exam04;

public class Calculator {
    //1. 정사각형의 너비 구하는 메소드
    double areaRectangle(double width) {
        return width * width;
    }

    //메소드 오버로딩
    // - 메소드 이름은 무조건 동일해야 함
    // - 메소드 매개변수의 경우, 타입 / 개수 / 순서(타입이 다를때) 중 하나가 달라야 함
    // - 메소드 오버로딩 사용 이유는 기능 본질 자체는 같으나, 공식(코드)이 다를 때 사용

    //2. 직사각형의 너비 구하는 메소드
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
