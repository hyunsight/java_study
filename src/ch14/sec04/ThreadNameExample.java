package ch14.sec04;

public class ThreadNameExample {
    public static void main(String[] args) {
        //스레드의 이름 얻어오기
        Thread mainThread = Thread.currentThread(); //이 코드(main 메소드)를 실행하는 스레드의 객체를 참조
        System.out.println(mainThread.getName() + "실행"); //현재 쓰테드의 이름을 불러오기

        //for문을 이용해서 스레드 3개 만들기
        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread() { //익명객체를 이용해 스레드 만들기, Thread 클래스를 상속하는 자식 클래스 (이름 없음 = 익명)
                @Override
                public void run() {
                    System.out.println(getName() + "실행"); //Thread 클래스의 getName()을 물려받아 사용 -> 스레드를 상속받고 있는 자식 클래스 안에서는 getName()으로만 써도 메소드(이름 구하기) 불러올 수 있음
                }
            };

            threadA.start(); 
            //위에 있는 mainThread 처리하고 이후 for문 안의 thread 실행
        }

        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + "실행");
            }
        };

        //스레드를 시작하기 전 이름 변경
        chatThread.setName("chat-thread");
        chatThread.start();

        //참조
        //  - 스레드의 경우, 병렬 처리 개념 -> 동시 실행이 주된 포인트 (5개의 쓰레드 한꺼번에 처리)
        //  - for문 안의 thread는 계속해서 순서가 변경될 수 있음
    }
}
