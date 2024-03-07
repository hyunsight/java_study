package ch09.sec07.exam02;

public class Home {
    private RemoteControl remoteControl = new RemoteControl() { //Tv 클래스
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    public void use1() {
        remoteControl.turnOn();
        remoteControl.turnOff();
    }
    
    public void use2() {
        RemoteControl remoteControl1 = new RemoteControl() {//에어컨 클래스
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        remoteControl1.turnOn();
        remoteControl1.turnOff();
    }

    public void use3(RemoteControl remoteControl) {
        remoteControl.turnOn();
        remoteControl.turnOff();
    }
}
