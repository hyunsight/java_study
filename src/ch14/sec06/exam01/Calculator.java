package ch14.sec06.exam01;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    //synchronized 붙일 시, 동기화로 처리됨 -> 즉, user1 스레드가 가장 먼저 실행됨
    public synchronized void setMemory1(int memory) throws InterruptedException {
        this.memory = memory;
        Thread.sleep(2000);
        //현재 실행되고 있는 스레드의 이름과 memory 필드 값 출력
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }

    public void setMemory2(int memory) throws InterruptedException {
        synchronized (this) {
            this.memory = memory;
            Thread.sleep(2000);
            //현재 실행되고 있는 스레드의 이름과 memory 필드 값 출력
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}
