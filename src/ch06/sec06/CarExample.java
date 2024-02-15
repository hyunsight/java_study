package ch06.sec06;

public class CarExample {
    public static void main(String[] args) {
        //설계도(class)를 바탕으로 자동차를 생산한다.

        //첫번째 자동차 생산
        // - Car: 클래스명을 타입으로 씀 > 참조 타입에 해당(객체를 저장하고 있는 타입 > 객체는 데이터를 가지고 있음 > 데이터는 설계도의 필드, 메소드임)
        // - myCar: 변수
        // - new Car(): 객체 = instance(인스턴스)
        // - new: 객체를 생성할 때 사용하는 키워드
        Car myCar = new Car(); //자동차 한대 생산
        
        //필드 값 가져오기
        // - 변수명(인스턴스명).필드명
        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed); //int default 값: 0
        System.out.println("제조회사: " + myCar.company);
        System.out.println("최대속도: " + myCar.maxSpeed);

        //필드 값 변경하기
        myCar.speed = 60;
        myCar.start = false;
        System.out.println("바뀐 현재속도: " + myCar.speed);
        System.out.println("바뀐 시동여부: " + myCar.start);

        //메소드 실행
        // - 변수명(인스턴스명).메소드명()
        myCar.run();
        myCar.stop();
    }
}
