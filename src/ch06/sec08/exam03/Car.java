package ch06.sec08.exam03;

public class Car {
    //필드
    int gas; //기름의 양 (기름 저장)

    //메소드
    //1. 기름 주유하는 메소드
    void setGas(int gas) {
        //this는 현재 객체를 의미 > 현재 객체는 car를 의미 > 즉, 필드의 gas를 의미
        // - 따라서 매개변수 값을 필드 (gas)에 넣어줌
        this.gas = gas;
    }

    //2. 기름이 있는지 없는지 출력하는 메소드
    boolean isLeftGas() {
        // - this.gas라 작성해도 무방
        if (gas == 0) {
            System.out.println("기름이 없습니다.");
            return false;
        } else {
            System.out.println("기름이 있습니다.");
            return true;
        }
    }

    //3. 자동차가 달리면서 기름을 소진하는 메소드
    void run() {
        // - while(true): 무한반복
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다. (gas 잔량: " + gas + ")");
                //차가 달릴 때마다 기름을 1씩 소진시킴
                gas = gas - 1; //gas -= 1과 동일
            } else { //기름이 없으면
                System.out.println("멈춥니다.");
                return; //void 타입이어 return 작성하지 않아도 되나, void 메소드를 (한 부분에서) 종료시키고 싶을 때 사용
            }
        }
    }
}