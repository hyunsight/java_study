package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int result1 = myCom.sum(1, 2, 3);
        System.out.println("result1: " + result1);

        int result2 = myCom.sum(1, 2, 3, 4);
        System.out.println("result2: " + result2);

        int result3 = myCom.sum(1, 2);
        System.out.println("result3: " + result3);

        //매개변수에 배열을 주는 방법
        //- 가변길이 매개변수는 배열을 받을 수 있다.
        int result4 = myCom.sum(new int[] {1, 2, 3, 4});
        System.out.println("result4: " + result4);

    }
}
