package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {
            int num = (int)(Math.random() * 6) + 1; //1~6까지 랜덤한 숫자 만들기
            System.out.println(num);

            if (num == 6) break; //num이 6이면 반복문을 나온다.
            System.out.println("break문 아래 코드");
        }
    }
}
