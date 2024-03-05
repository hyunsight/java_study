package ch12.sec03.exam03;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone (String company, String os) {
        this.company = company;
        this.os = os;
    }

    //객체의 정보를 출력할 때 사용 (객체의 주소가 아닌)
    @Override
    public String toString() {
        return company + ", " + os;
    }
}
