package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        //객체가 생성이 될 때 생성자가 실행이 되고 필드에 값이 할당된다.
        Korean k1 = new Korean("박자바", "011225-1234567"); //첫번째 사람 생성
        System.out.println("박자바의 nation: " + k1.nation);
        System.out.println("박자바의 name: " + k1.name);
        System.out.println("박자바의 ssn: " + k1.ssn);
        System.out.println("---------------------");

        Korean k2 = new Korean("김자바", "930525-1223242"); //두번째 사람 생성
        System.out.println("김자바의 nation: " + k2.nation);
        System.out.println("김자바의 name: " + k2.name);
        System.out.println("김자바의 ssn: " + k2.ssn);
    }
}
