package ch11.sec05;

public class ThrowExample2 {
    //main 메소드에서 trhows를 하면 JVM에서 예외를 처리해준다.
    // - main 메소드에서도 throws 가능
    // - 실제 에러나는 부분은 'Class.forName("java.lang.String2");' 여기임
    public static void main(String[] args) throws ClassNotFoundException {
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
