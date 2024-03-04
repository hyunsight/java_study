package ch12.sec06;


public class ValueCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println(obj1 == obj2); //포장 클래스는 참조 타입이므로 객체 주소를 비교 -> 따라서 false로 값 출력
        System.out.println(obj1.equals(obj2)); //실제 값을 비교

        //예외: -128 ~ 127 사이의 숫자는 값 자체를 비교 (Integer, Short, Byte인 경우에만)
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println(obj3 == obj4); //실제 값을 비교
        System.out.println(obj3.equals(obj4)); //실제 값을 비교

    }

}
