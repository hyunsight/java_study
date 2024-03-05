package ch12.sec03.exam01;

public class Member {
    public String id;
    public Member(String id) {
        this.id = id;
    }

    //객체의 주소를 비교할 때 사용
    // - 커스터밍이징해서 사용 시, 동등 비교 (객체가 달라도 내부 데이터가 같은지 비교)
    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj); //커스터마이징해서 사용 필요
        //if(obj instanceof Member target): 'Object obj = new Member()인가?' 와 동일
        // - Object obj = new Member()은 자동 타입 변환
        // - 자동 타입 변환되는가 확인할 때 많이 사용
        if(obj instanceof Member target) {
            if (id.equals(target.id)) return true; //id: 필드의 id
        }
        
        return false;
    }
}
