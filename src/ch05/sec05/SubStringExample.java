package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6); //주민번호 앞자리 출력
        System.out.println(firstNum);

        String secondNum = ssn.substring(7); //주민번호 뒷자리 출력
        System.out.println(secondNum);
    }
}
