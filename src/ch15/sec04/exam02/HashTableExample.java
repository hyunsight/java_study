package ch15.sec04.exam02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new Hashtable<>();
        //Map<String, Integer> map = new HashMap<>(); //이경우, synchronized 걸리지 않아 데이터 손실 발생할 수 있음

        Thread threadA = new Thread() {
            @Override
            public void run() {
                //1000개의 데이터 추가
               for (int i = 1; i <= 1000; i++) {
                   map.put(String.valueOf(i), i); //valueOf: 정수타입을 스트링타입으로 바꿔주는 역할
               }
            }
        };
        Thread threadB = new Thread() {
            @Override
            public void run() {
                //1000개의 데이터 추가
                for (int i = 1001; i <= 2000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        //스레드 총 3개 실행됨 (main 포함)
        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        int size = map.size();
        System.out.println("총 엔트리 수: " + size);
    }
}
