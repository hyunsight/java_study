package ch13.sec01;

public class Box<T> {
    //타입으로 어떤걸 줄지 결정하지 못하는 케이스 존재
    //이 때 타입에 'Object'를 줌 (Object는 어떤 클래스 상관없이 최상위 부모클래스이므로)
//    public Object content;

    //[ 제네릭 이용한 개선 ]
    //1. 제네릭 정의
    //   - A ~ Z까지 아무거나 사용
    //   - 클래스 옆에 <타입명> 추가
    //T: 타입이 아무것도 정해지지 않았을 때
    public T content;
}
