package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i % 2 != 0) continue; //i가 홀수일 때, 반복문을 다시 실행하라는 의미
            System.out.println("짝수: " + i);
        }
    }
}
