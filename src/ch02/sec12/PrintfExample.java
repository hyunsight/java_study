package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        System.out.println("안녕하세요.");
        System.out.println("자바입니다.");

        //N$: N번째 값은 여기에다 넣겠다는 의미 (%와 알파벳의 사이에)
        //System.out.printf("이름: %1$s, 나이: %3$d, 일자: %2$d일", "이지은", 27, 10);

        //\n: 줄바꿈 기호
        //6: 6자리의 정수를 만들겠다는 의미 (%와 알파벳의 사이에)
        //   단, '왼쪽'에 채울 숫자 없으므로 공백으로 채워짐
        //-6: 동일하게 6자리의 정수를 만들겠다는 의미
        //   단, '오른쪽'에 채울 숫자 없으므로 공백으로 채워짐
        //06: 6자리의 정수를 만들겠다는 의미 + 왼쪽 공백을 0으로 채움
        int value = 123;
        System.out.printf("상품의 가격: %d원\n", value); //정수
        System.out.printf("상품의 가격: %6d원\n", value); //정수 6자리, 왼쪽 공백
        System.out.printf("상품의 가격: %-6d원\n", value); //정수 6자리, 오른쪽 공백
        System.out.printf("상품의 가격: %06d원\n", value); //정수 6자리, 왼쪽 빈자리 0으로 채움

        //정수7자리 + 소수점 + 소수2자리 = 총 10자리, 왼쪽 공백
        //  - .2는 소수점 2자리까지 표현하겠다는 의미
        //  - 10은 소수2자 + . + 정수 7자리 의미 (정수 7자리의 경우, 숫자가 없을 시 공백으로 표현
        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
        
        //정수7자리 + 소수점 + 소수2자리 = 총 10자리, 오른쪽 공백
        //  - '-' 붙일 경우, 오른쪽 공백
        System.out.printf("반지름이 %d인 원의 넓이: %-10.2f\n", 10, area);
        
        //정수7자리 + 소수점 + 소수2자리 = 총 10자리, 왼쪽 공백 0으로 채움
        System.out.printf("반지름이 %d인 원의 넓이: %010.2f\n", 10, area);

        String name = "이지은";
        String job = "가수";
        System.out.printf("%6s|%-6s", name, job);
    }
}
