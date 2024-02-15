package ch06.sec06;

public class Car {
    //클래스
    // - 클래스 = 설계도
    // - 객체의 속성과 기능은 설계도에 해당하는 class에 미리 작성해준다.
    //클래스 구성1. 필드 (= 맴버 변수, 객체의 속성을 묶은 것)
    String company = "현대"; //제조회사
    String model = "그랜져"; //자동차 모델
    boolean start = true; //시동 여부
    int speed; //현재 속도
    int maxSpeed = 360; //최대 속도
    String color = "black"; //자동차 색상

    //클래스 구성2. 생성자
    
    //클래스 구성3. 메소드 (객체의 기능, 사실상 함수와 동일)
    public void run() {
        System.out.println("차가 달립니다.");
    }
    
    public void stop() {
        System.out.println("차가 멈춥니다.");
    }
    
    //설계도인 관계로 run 버튼이 비활성화되어 있음
}
