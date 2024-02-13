package ch04.sec03;

public class SwitchExpression {
    public static void main(String[] args) {
        char grade = 'B';

        //Switch Expression
        // - break문 작성 없이 사용 가능
        // - case문 중괄호 안에 실행문이 하나만 있을 때는 중괄호를 생략할 수 있음
        switch (grade) {
//            case 'A', 'a' -> {
//                System.out.println("우수 회원입니다.");
//            }
            case 'A', 'a' -> System.out.println("우수 회원입니다.");

            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }
    }
}
