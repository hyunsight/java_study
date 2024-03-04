package ch12.sec04;

public class ErrExample {
    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("1aa");
        } catch (Exception e) {
            //System.out.println(); //out은 System 클래스의 필드, println()은 System 클래스의 메소드에 해당
            System.err.println("[에러내용]");
            System.err.println(e.getMessage());
        }
    }
}
