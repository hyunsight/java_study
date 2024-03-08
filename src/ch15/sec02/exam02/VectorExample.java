package ch15.sec02.exam02;

import ch15.sec02.exam01.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) throws InterruptedException {
        List<Board> list = new Vector<>();
        //List<Board> list = new ArrayList<>(); //이경우, 데이터 손실 발생할 수 있음

        Thread threadA = new Thread() {
            @Override
            public void run() {
                //1000개의 board 객체 add
                for(int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };
        Thread threadB = new Thread() {
            @Override
            public void run() {
                //1000개의 board 객체 add
                for(int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };
        
        //스레드 실행
        threadA.start();
        threadB.start();
        
        //다른 작업 스레드가 모두 종료될 때까지 메인스레드를 기다리게 함
        threadA.join();
        threadB.join();

        //threadA, threadB의 작업이 완료된 후 메인스레드 다시 실행
        int size = list.size();
        System.out.println("총 객체 수: " + size);

    }
}
