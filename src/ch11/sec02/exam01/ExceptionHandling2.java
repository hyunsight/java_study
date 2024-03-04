package ch11.sec02.exam01;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }

    public static void printLength(String data) {
        //예외처리 코드 작성
        try { //실행할 코드 작성
            int result = data.length();
            System.out.println("문자 수" + result);
        } catch (NullPointerException e) { //catch (exception으로 잡을 에러 타입 및 매개변수) 작성 -> 에러 없을 시 실행되지 않음
            //System.out.println(e.getMessage()); //예외가 발생한 이유만 리턴
            //System.out.println(e.toString()); //예외가 발생한 이유 및 예외의 종류 리턴
            e.printStackTrace(); //예외가 발생한 이유, 예외의 종류 및 예외가 발생한 위치까지 리턴
            //System.out.println("에러가 발생했습니다.");
        } finally { //exception과 상관없이 무조건 실행되는 코드 작성
            System.out.println("[마무리 실행]");
        }
    }
}
