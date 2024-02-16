package ch06.sec08.exam02;

public class Computer {
    //가변길이 매개변수는 항상 배열로 받음
    int sum(int ... values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            System.out.println("[" + i + "]: " + values[i]);
            sum += values[i];
        }
        return sum;
    }
}
