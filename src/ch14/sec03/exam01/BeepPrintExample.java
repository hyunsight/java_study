package ch14.sec03.exam01;

import ch11.sec06.InsufficientException;

import java.awt.*;

public class BeepPrintExample {
    //싱글 스레드 -> main이라는 하나의 스레드만 실행
    //  - 현재까지 작성한 예제코드들이 싱글 스레드에 해당
    public static void main(String[] args) throws InterruptedException{
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        for(int i = 0; i < 5; i++) {
            toolkit.beep(); //비트음 발생
            Thread.sleep(500); //1초 = 1000, 한번찍고 잠깐 쉬게 한다는 의미 (0.5초 뒤 나머지 찍음)
        }

        for(int i = 0; i <5; i++) {
            System.out.println("띵");
            Thread.sleep(500);
        }
    }
}
