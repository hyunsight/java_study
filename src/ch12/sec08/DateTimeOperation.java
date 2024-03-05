package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperation {
    public static void main(String[] args) {
        //LocalDateTime의 경우, 현재 날짜 시간 구하는 것뿐만 아니라 날짜 계산(연산)에도 많이 쓰임
        LocalDateTime now = LocalDateTime.now(); //현재 날짜 시간
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println(now.format(dft));

        LocalDateTime result1 = now.plusYears(1); //1년 뒤
        System.out.println(result1.format(dft));

        LocalDateTime result2 = now.minusMonths(2); //2개월 전
        System.out.println(result2.format(dft));

        LocalDateTime result3 = now.plusDays(7); //7일 뒤
        System.out.println(result3.format(dft));
    }
}
