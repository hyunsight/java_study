package ch06.sec11.exam01;

public class Korean {
    //상수 필드 선언
    // - 인스턴스 필드와 다르게 반드시 초기화해줘야 한다.
    final String nation = "대한민국"; //첫번째 상수 필드 초기화 방법: 필드 선언 시 초기값 대입한다.
    final String ssn;

    //인스턴스 필드
    String name;

    //두번째 상수 필드 초기화 방법: 생성자에 초기값 대입한다.
    public Korean (String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
