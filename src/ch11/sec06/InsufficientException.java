package ch11.sec06;

//커스터마이징 예외
// - 잔고 부족 예외 클래스 
// - 예외 클래스의 경우, 클래스명 끝에 Exception으로 지어주면 좋음
// - 일반 예외의 경우, extends Exception, 실행 예외의 경우, extends RunTimeException
public class InsufficientException extends Exception {
    //생성자 2개 작성
    // - 매개변수 있는 것, 매개변수 없는 것
    public  InsufficientException() {}

    public  InsufficientException(String message) {
        //부모 클래스인 Exception class > 최상단인 Throwable classs 실행
        // - exception의 상단, 즉 사실상 최상단은 'Throwable'임
        super(message); //예외 메시지로 만들어 주기 위해 -> 예외 객체의 공통 메소드인 getMessage();의 리턴값으로 사용하기 위해
    }

}
