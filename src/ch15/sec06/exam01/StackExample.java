package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>(); //Stack은 Vector를 extends하고 있음

        //Stack에서 데이터 넣는 것은 push, 빼는 것은 pop
        // - 100 객체 > 50 객체 > 500 객체 > 10 객체를 순서대로 컵에 쌓는다고 생각하면 됨
        coinBox.push(new Coin(100)); //각각의 Coin 객체임
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        //동전 빼기
        // - isEmpty(): 비어있냐?, 비어있으면 true / 비어있지 않으면 false
        while (!coinBox.isEmpty()) { //비어있지 않으면 반복
            Coin coin = coinBox.pop();
            System.out.println("꺼낸 동전: " + coin.getValue());
        }
    }
}
