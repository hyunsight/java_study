package ch12.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");
//        Student s2 = new Student(1, "김하서");

        //"홍길동" string 동일하므로 주소가 같음 
        //따라서 주소가 주는 해시코드 또한 같음
        System.out.println("s1의 해시코드: " + s1.hashCode());
        System.out.println("s2의 해시코드: " + s2.hashCode());

        //동등 객체와 동등 비교는 다른 개념
        // - 동등 객체는 hashCode가 동일하고 데이터가 같을 때를 의미
        if(s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                //동등 객체: hashCode가 같으면서 데이터가 같은 객체
                System.out.println("동등 객체입니다.");
            } else {
                System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
            }
        } else {
            System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
        }
    }
}
