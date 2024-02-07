package ch02.sec01;

//class명은 항상 파스칼케이스, 대문자로 시작 (예시. VariableExchangeExample)
//변수명/함수명은 항상 카멜케이스, 단어끊을 때마다 대문자로 사용 (예시. newTodoList)
public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        System.out.println("x:" + x + ",y:" + y);

        //두 변수의 값을 교환하는 방법 (임시변수 추가/사용하여 교환)
        int temp = x; //temp: 3
        x = y; //x: 5
        y = temp; //y: 3
        System.out.println("값 교환 후 x:" + x + ",y:" + y);
    }
}
