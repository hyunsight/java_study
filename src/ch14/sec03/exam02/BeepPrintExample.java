package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) throws InterruptedException{
        //스레드 생성 방법 1
        Thread thread = new Thread(new Runnable() { //생성자의 매개변수로 익명 구현 객체 전달
            @Override
            public void run() {
                //멀티스레드로 동시 실행시키고 싶은 코드를 run() 메소드에 입력
                for (int i = 0; i < 5; i++) {
                    System.out.println("띵");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        
        thread.start(); //스레드 실행

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i = 0; i < 5; i++) {
            toolkit.beep(); //비트음 발생
            Thread.sleep(500); //1초 = 1000, 한번찍고 잠깐 쉬게 한다는 의미 (0.5초 뒤 나머지 찍음)
        }
    }
}
