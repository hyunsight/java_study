package ch16.sec03;

public class LambdaExample {

    public static void main(String[] args) {
        Person person = new Person();
        person.action1((name, job) -> {
            System.out.println(name + "이 " + job + "을 합니다.");

        });

        //코드 한 줄인 경우, 중괄호 생략 가능
        person.action2((word) -> System.out.println(word + "라고 말합니다."));

    }

}
