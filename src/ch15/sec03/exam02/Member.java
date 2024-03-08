package ch15.sec03.exam02;

public class Member {
    public String name;

    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        System.out.println(name.hashCode());
        //name과 age의 값이 같으면 동일한 hashCode가 리턴됨
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        //equals는 기본적으로 객체 주소 비교하나, 아래 코드 통해 값 비교하는 방향으로 작성
        // - 객체의 데이터를 비교
        // - name과 age값이 같으면 true를 리턴
        if (obj instanceof Member target) { //Object obj = new Member();
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }
}
