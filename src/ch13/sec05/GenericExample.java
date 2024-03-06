package ch13.sec05;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        //모든 사람 등록 가능
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

        //학생만 등록 가능
        // Course.registerCourse2(new Applicant<>(new Person())); //에러 발생
        // Course.registerCourse2(new Applicant<>(new Worker())); //에러 발생
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        //직장인 및 일반인만 등록 가능
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        // Course.registerCourse3(new Applicant<Student>(new Student())); //에러 발생
        // Course.registerCourse3(new Applicant<HighStudent>(new HighStudent())); //에러 발생
        // Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent())); //에러 발생

        //(참조) ArrayList<String>도 제네릭으로 사용한 것임
        ArrayList<Course> arr1 = new ArrayList<Course>();
        List<Course> arr2 = new ArrayList<Course>(); //위와 동일한 문장 (Array만 생략 가능)
    }
}
