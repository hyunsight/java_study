package ch03.sec04;

public class Accuracy2 {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        double result = totalPieces - number; //10 - 7 = 3 (정수)
        System.out.println("10 조각에서 남은 양: " + result);
        System.out.println("사과 1개에서 남은 양: " + result/10);
    }

}
