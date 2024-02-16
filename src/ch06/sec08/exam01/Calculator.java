package ch06.sec08.exam01;

public class Calculator {
    //필드 생략

    //생성자 생략

    //메소드 (기능)

    //1.전원 켜기
    // - (중요) 리턴해줄 값이 없을 때는 void 키워드를 사용
    //   : 간혹 메소드 중 별도로 return해줄 값이 없는 케이스 존재 (프린트만 해주는 등)
    //   : 이 때, void 사용
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    //2.전원 끄기
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    //3.더하기
    // - (중요) 메소드 앞에 return 값의 타입을 명시
    int plus(int x, int y) {
        int result = x + y;
        return result; //int형
    }

    //4.나누기
    double divide(int x, int y) {
        double result = (double) x / y;
        return result; //double형
    }

    //5.빼기
    int subtract(int x, int y) {
        int result = x - y;
        return result;
    }

    //6.곱하기
    int multiply(int x, int y) {
        int result = x * y;
        return result;
    }
    
    //7. 내부 클래스에서 메소드 호출 기능 (메소드 안의 메소드 호출)
    // - 내부 클래스에서 메소드 호출할 때는 별도 객체 생성 필요 없음
    void innerMethod() {
        powerOn();
        int result = plus(3, 5);
        System.out.println("내부 클래스 plus 결과: " + result);
    }
}
