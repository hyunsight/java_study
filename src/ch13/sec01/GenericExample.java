package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        /*
        Box box = new Box();
        //box는 Object 타입이므로 문자열, 숫자형 등 어떤게 오든 가능
        box.content = "문자열";
        box.content = 1; //Integer 타입
        box.content = new Bottle();

        //String content = box.content; //에러 발생 -> String 타입 대신 Object로 타입 변환하거나, (String)으로 강제 타입 변환 필요
        //단, 다른 개발자가 아래와 같이 변경할 경우, 유지 보수/히스토리 측면에서 큰 이슈 발생 여지 존재
        String content = (String)box.content;
        System.out.println(content);
        */

        System.out.println("[ 제네릭 이용한 개선 ]");

        //2. 제네릭 정의 #2
        //   - 스트링으로 정의하고자 할 때
        //   - 클래스명<정의하고자 하는 타입> ... 클래스명<정의하고자 하는 타입>();
        //   - 따라서 현재 T는 String 타입인 상태
        //제네릭: 아직 정해지지 않은 타입에 대해 그때그때 다르게 정의 가능
        //인텔리제이에서 회색글자로 나오는 부분은 생략 가능 (예시. String)
        Box<String> box = new Box<String>();
        box.content = "안녕하세요";
        String content = box.content;

        //   - 기본형의 경우, 일반 기본타입이 아닌 포장 객체 타입으로 적용 필요 (Integer, Long..)
        //   - 숫자형으로 정의하고자 할 때
        //   - 따라서 현재 T는 Integer 타입인 상태
        Box<Integer> box2 = new Box<Integer>();
        box2.content = 10;
        int content2 = box2.content;
    }
}
