package ch13.sec03.exam01;

public class GenericExample {

    //제네릭 메소드
    public static <T> Box<T> boxing(T t) { //return 타입을 Box로 할 예정
        Box<T> box = new Box<T>();
        box.setT(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        Box<String> box2 = boxing("홍길동");
    }
}
