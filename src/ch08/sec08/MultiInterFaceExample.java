package ch08.sec08;

public class MultiInterFaceExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("www.naver.com");
    }
}
