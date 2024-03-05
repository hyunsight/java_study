package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    //오버라이드 내용에 따라 hashCode() 결정
    @Override
    public int hashCode() {
        //hashCode() 메소드는 객체의 메모리 주소를 이용해서 해시코드를 생성해준다. (앱 해시코드 연상)
        //String name = "홍길동"이므로 s1, s2 객체의 name 필드가 참조하는 주소가 같으므로
        //hashCode도 같은 결과를 리턴해준다.
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    //동등비교 (객체가 달라도 데이터가 같은지 확인)
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target) {
            //두 객체의 no 필드와 name 필드의 값을 비교
            if (no == target.getNo() && name.equals(target.getName())) return true;
        }

        return false;
    }
}
