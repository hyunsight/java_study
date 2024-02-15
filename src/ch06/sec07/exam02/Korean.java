package ch06.sec07.exam02;

public class Korean {
    //필드 (속성)
    String nation = "대한민국";
    String name;
    String ssn; //주민번호

    //생성자
    Korean(String name, String ssn) {
        //(중요) 자바에서의 this는 '현재 객체'를 가르킨다.
        // - 즉, 이 객체가 가지고 있는 필드를 의미한다.
        // - 'this' 안써도 무방하나, 명확하게 해주기 위해 사용
        // - 특히, 생성자의 매개변수의 이름과 필드의 이름이 동일할 때 사용한다.
        //   : 매개변수와 필드명이 동일할 경우, this를 안쓰면 name = name의 값이 제대로 출력되지 않음 (이유는 필드의 이름을 매개변수의 이름으로 동일하게 처리하기 때문에)
        this.name = name; //n 변수의 값을 name 필드에 넣어준다.
        this.ssn = ssn; //s 변수의 값을 ssn 필드에 넣어준다.
    }
    
    //메소드 생략
}
