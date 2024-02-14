package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123"; //주민번호
        char sex = ssn.charAt(6); //성별을 뽑아온다.

        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
        }
    }
}
