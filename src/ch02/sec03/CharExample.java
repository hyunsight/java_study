package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        //char는 문자 또는 숫자(유니코드 값), 이 2가지로 사용 가능
        char c1 = 'A'; //문자 1개만 쓸 수 있다. 반드시 작은 따옴표로 표현
        char c2 = 65; //유니코드 값 (유니코드 값에 맞는 문자를 가져옴)
        char c3 = '가';
        char c4 = 44032; //유니코드 값

        //char 타입에서 빈문자(공백)를 표현하고 싶을 때 -> 공백도 유니코드 값을 가지고 있음
        //char c5 = ''; //이렇게 쓸 경우 에러남
        char c6 = ' '; //공백의 유니코드는 35

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c6);
    }
}
