package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(15);

        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        System.out.println();

        RemoteControl.changeBattery();
    }
}
