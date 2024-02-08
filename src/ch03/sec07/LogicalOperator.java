package ch03.sec07;

public class LogicalOperator {
    public static void main(String[] args) {
        int charCode = 'A'; //자동타입변환: 65

        //65 ~ 90 (대문자 알파벳 유니코드 범위)
        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자이군요");
        }

        //97 ~ 122 (소문자 알파벳 유니코드 범위)
        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자이군요");
        }

        //참조
        System.out.println((int) 'a'); //97

        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9사이의 숫자이군요");
        }

        //참조
        System.out.println((int) '0'); //48

        System.out.println("=========================");

        int value = 6;
        //무조건 앞과 뒤의 조건을 모두 체크
        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수");
        }

        //조건 중 앞(첫번째) 것만 계산 -> 앞이 true면 뒤에 계산 안함
        if ((value % 8 == 0) || (value % 9 == 0)) {
            System.out.println("8 또는 9의 배수");
        }
    }
}
