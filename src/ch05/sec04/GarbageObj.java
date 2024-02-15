package ch05.sec04;

public class GarbageObj {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; //String 객체를 쓰레기 객체로 만듦

        String kind1 = "자동차";
        String kind2 = kind1; //주소의 복사 (kind1과 kind2의 주소가 동일)
        kind1 = null; //String 객체는 쓰레기 객체가 되지 않음
    }
}
