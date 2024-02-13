package ch04.sec04;

public class SumFrom1To100 {
    public static void main(String[] args) {
        //1 ~ 100 까지의 합계 구하기
        int sum = 0; //초기값의 경우, for문 밖에서 정의해야 함 (for문 안에 넣을 경우, sum값이 계속해서 초기화됨)

        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100까지의 합: " + sum);
    }
}
