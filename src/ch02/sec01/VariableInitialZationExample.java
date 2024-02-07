package ch02.sec01;

public class VariableInitialZationExample {
    public static void main(String[] args) {
        //(참조) java는 끝나는 줄 라인에 꼭 세미콜론 붙이기
        //변수 선언 (메모리에 값이 할당 X)
        int value;

        value = 20; //메모리에 값이 할당된다

        //변수 선언과 동시에 메모리에 값 할당
        int value2 = 10;

        //+ : 문자열 + 변수(값) 같이 출력 가능
        System.out.println("value 값: " + value); //ctrl + d: 라인복사
        System.out.println("value 값: " + value2);
    }
}
