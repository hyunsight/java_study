package ch12.sec04;

public class MeasureRunTime {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int sum = 0;
        
        for (int i = 0; i <= 1000000; i++) {
            sum += i;
        }
        
        long time2 = System.nanoTime();
        System.out.println("1-1000000의 합: " + sum);
        System.out.println("계산에 소요한 시간: " + (time2 + time1) + "나노초");
    }
}
