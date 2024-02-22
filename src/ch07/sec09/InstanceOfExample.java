package ch07.sec09;

public class InstanceOfExample {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        //자동타입변환
        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }

    public static void personInfo(Person person) { //Person person = new Student()
        System.out.println("name: " + person.name);
        person.walk();

        //강제 타입 변환을 하기 전에 instanceof를 사용해 타입을 확인한다.
        // - 변수 instanceof 참조타입 (참조타입의 경우, 항상 대문자로 작성)
        // - person이 Student타입의 객체인지 확인
      
        /*
        if(person instanceof Student) {
            //person이 Student 객체를 가지고 있을 경우, 강제 타입 변환
            // - 강제 타입 변환 이유는 자식 클래스의 필드, 메소드 사용하기 위함
            Student student = (Student) person;

            //Student 객체에 있는 필드, 메소드 사용 가능 (주 목적)
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }    
        */
        
        //java 12버전 이후
        if(person instanceof Student student) {
            System.out.println("studentNo: " + student.studentNo);
            student.study();
            
        }
    }
}
