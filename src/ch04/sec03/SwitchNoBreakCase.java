package ch04.sec03;

public class SwitchNoBreakCase {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8; //8 ~ 11시 랜덤한 시간
        System.out.println("[현재시간: " + time + "시]");

        switch (time) { //(중요) switch(값) -> 값으로 실수형, boolean 타입 사용 불가
            case 8:
                System.out.println("출근합니다.");
                break; //(중요) break문 필수적으로 작성 -> break 문이 없을 경우, switch문에서 빠져나오지 않고 default까지 쭉 찍음
            case 9:
                System.out.println("회의를 합니다.");
                break;
            case 10:
                System.out.println("업무를 봅니다.");
                break;
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
