package ch07.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //출력(생성)되는 순서
        // 1) 부모 객체가 먼저 생성/실행되므로 'super()' 실행
        // 2) 'super()' 실행 시, 부모 객체에 있는 아래 메소드가 실행되어 처음으로 Phone() 생성자 실행가 출력
        //     public Phone () {
        //        System.out.println("Phone() 생성자 실행");
        //     }
        // 3) SmartPhone(String model, String color) { } 안에 있는 'System.out.println()' 실행
        // 4) 마지막으로 아래 코드 실행
        //    System.out.println("모델: " + myPhone.model);
        //    System.out.println("색상: " + myPhone.color);
        
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
}
