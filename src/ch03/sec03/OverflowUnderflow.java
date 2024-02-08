package ch03.sec03;

public class OverflowUnderflow {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++; //오버플로우 발생: 최대값의 허용범위를 벗어나면 최소값으로 간다
            System.out.println("var1: " + var1);
        }

        System.out.println("=====================");

        byte var2 = -125;
        for (int i = 0; i < 5; i++) {
            var2--; //언더플로우 발생: 최소값의 허용범위를 벗어나면 최대값으로 돌아간다.
            System.out.println("var2: " + var2);
        }
        //(중요) 연산을 할 때 언더플로우나 오버플로우가 일어나면 큰 타입으로 변경
    }
}
