package ch12.sec06;

public class BoxingUnboxing {
    public static void main(String[] args) {
        //박싱 (boxing) -> 포장 클래스에 값을 넣어주는 것
        Integer obj = 100;
        System.out.println("value: " + obj);

        //언박싱 (unboxing) -> 포장 클래스에 넣었던 값을 다시 기본타입으로 바꿔주는 것
        int value = obj;
        System.out.println("value: " + value);

        //연산 시의 언박싱
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
