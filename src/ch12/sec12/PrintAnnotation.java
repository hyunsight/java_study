package ch12.sec12;

//어노테이션 정의

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//메소드에서만 해당 어노테이션 사용 가능하도록 지정
// - Target: 어노테이션 적용 대상
@Target({ElementType.METHOD, ElementType.FIELD}) //() 안에 여러개 써야할 경우, {} 중괄호 작성 필요
//실행 중 계속 어노테이션 정보(어떻게 처리해야 할지) 유지
// - Retention: 어노테이션 유지 정책
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
    String value() default "-"; //어노테이션으로부터 매개변수 값을 받을 수 있는데, 이때 값이 없을 때 default로 지정한 값을 받게 됨
    int number() default 15;
    
}
