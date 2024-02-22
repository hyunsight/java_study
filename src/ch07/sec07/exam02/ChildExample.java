package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        //자동 타입 변환
        // - 자식 객체를 부모에 넣음
        Parent parent = child;

        //메소드 호출
        // - 자동타입 변환이 일어나면 부모 클래스에 있는 필드와 메소드만 사용 가능
        // - 단, 오버라이드된 메소드는 예외적으로 자식 클래스에 있는 것을 사용
        parent.method1();
        parent.method2();
//        parent.method3();

        //필드 호출
        // - 메소드와 동일하게 자식 클래스에 있는 필드 사용 불가능
        parent.field1 = 2;
//        parent.field2 = 2;
    }
}
