package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>(); //Queue는 LinkedList와 같이 사용 (Queue와 LinkedList는 부모가 같음)

        //메세지 넣기
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "이지은"));
        messageQueue.offer(new Message("sendKakaoTalk", "김자바"));

        //메세지를 하나씩 꺼내기
        while (!messageQueue.isEmpty()) {
            //비어있지 않다면 반복
            Message message = messageQueue.poll(); //꺼내기
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaoTalk":
                    System.out.println(message.to + "님에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}
