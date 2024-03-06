package ch12.sec12;

public class Service {
    @PrintAnnotation
    public void method1() {}

    @PrintAnnotation("*") //한개의 데이터를 보낼 때 이와 같이 작성. 즉, 첫줄에 해당하는 String value()에 "*" 적용 > 'value = "*"'와 동일
    public void method2() {}

    @PrintAnnotation(value = "#", number = 20) //여러개 데이터를 보낼 때 이와 같이 작성
    public void method3() {}
}
