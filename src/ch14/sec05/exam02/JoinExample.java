package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
//(참조) 쓰레드 생성 시, 익명 객체 구현 방식 많이 사용됨
//단, 이번엔 익명 객체 구현 방식 대신 SumThread를 별도 생성
        SumThread sumThread = new SumThread();
        sumThread.start(); //Sumthread 실행대기상태(Runnable)

        sumThread.join(); //join() 메소드를 호출한 스레드(joinExample의 main)가 일시정지 상태가 됨

        //SumThread가 실행(run)

        //SumThread가 실행종료(terminate)가 되면 main의 일시정지 상태가 풀린다. -> 실행대기 상태

        System.out.println("1-100 합: " + sumThread.getSum());

    }
}
