package ch04.sec04;

public class FloatCount {
    public static void main(String[] args) {
        //반복문에서 초기화 식 타입에 실수형은 쓰지 않음 => 부동소수점은 정확한 계산을 하지 못함
        // - 실수형을 사용할 수는 있으나, 부동소수점은 정밀하게 계산하지 못해서 실제로는 사용하지 않음
        for(float x = 0.1f; x <= 1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }
}
