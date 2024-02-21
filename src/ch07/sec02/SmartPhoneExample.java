package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        //부모클래스인 Phone으로부터 상속받은 필드 사용 가능 
        // - 따라서 myPhone(자식클래스 안의 객체). 에 사용 가능
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
        //자식클래스인 SmartPhone 클래스의 필드 읽기
        // - 자식클래스인 SmartPhone에 있는 필드로 상속과 상관없이 원래부터 사용 가능
        System.out.println("와이파이 상태: " + myPhone.wifi);

        //부모클래스인 Phone으로부터 상속받은 메소드 사용 가능
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요, 저는 김자바입니다.");
        myPhone.sendVoice("네, 반갑습니다.");
        myPhone.hangUp();

        //SmartPhone의 메소드 사용 (상속과 상관없음)
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
