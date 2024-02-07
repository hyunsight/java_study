package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        //자동타입 변환

        byte byteValue = 10;
        short shortValue2 = byteValue; //자동타입 변환
        int intValue = byteValue; //자동타입 변환 -> byte타입이었던 (intValue의) 10은 int타입으로 저장된다.
        System.out.println("intValue: " + intValue);

        intValue = 50; //int타입
        long longValue = intValue; //자동타입 변환 -> int타입이었던 50은 long타입으로 저장된다.

        short shortValue = 10;
        int intValue2 = shortValue; //자동타입 변환 -> short타입이었던 10은 int타입으로 저장된다.

        //(중요)정수보다 실수의 허용범위가 더 큼 -> 정수에서 실수로 자동타입변환이 일어난다.
        long longValue2 = 100;
        //byte longValue2 = 100;
        float floatValue = longValue2;
        double doubleValue = longValue2;

        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);

        //실수끼리의 자동타입 변환
        float floatValue2 = 100.5F;
        double doubleValue2 = floatValue2;
        System.out.println("doubleValue2: " + doubleValue2);
        
        //char -> int타입 변환: 유니코드가 정수로 표현 가능하기 때문에
        char charValue = '가';
        int intValue3 = charValue; //자동타입변환('가' 본인의 유니코드 값이 int타입으로 자동 변환됨)
        //short intValue3 = charValue; //char -> short는 자동 타입 변환 불가하므로 에러 출력
        System.out.println("intValue3: " + intValue3);
    }
}
