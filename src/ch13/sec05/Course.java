package ch13.sec05;

public class Course {
    //모든 사람이 수강신청 가능
    public static void registerCourse1(Applicant<?> applicant) {
        //클래스 이름 출력
        // - .getClass().getSimpleName() : 클래스 이름 가져오기
        System.out.println(applicant.kind.getClass().getSimpleName() + "가 course1 등록");
    }
    
    //학생만 수강신청 가능
    //Student 클래스와 Student 클래스의 하위 클래스만 타입으로 올 수 있다. (MiddleStudent, HighStudent)
    // - Applicant<? extends Student>: 같은 Student 또는 Student 하위 클래스만 올 수 있음
    public static void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "가 course2 등록");
    }

    //직장인 및 일반인만 수강신청 가능
    //Worker 클래스와 Worker 클래스의 부모(상위) 클래스만 타입으로 올 수 있다.
    public static void registerCourse3(Applicant<? super Worker> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "가 course3 등록");
    }
}
