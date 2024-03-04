package ch11.sec02.exam02;

public class ExceptionHandling {
    public static void main(String[] args) { 
        //자바에서 제공하는 메소드 등 작성 시 'Unhandled exception'이 출력되면 일반 에러 처리(try ... catch) 반드시 필요
//        Class.forName("java.lang.String"); //Class.forName: 클래스 찾는 것, 해당 클래스가 존재하는지 찾는다.
//        System.out.println("java.lang.String 클래스가 존재합니다.");

        //일반 예외는 반드시 예외처리 코드(try~catch)를 작성해줘야 한다. 
        // - 일반 예외 처리 시, finally는 생략 가능
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
