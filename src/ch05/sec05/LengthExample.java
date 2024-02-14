package ch05.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506241230123"; //주민번호
        int length = ssn.length(); //문자열의 길이 출력
        
        if (length == 13) System.out.println("주민번호 자릿수가 맞습니다.");
        else System.out.println("주민번호 자릿수가 틀립니다.");
    }
}
