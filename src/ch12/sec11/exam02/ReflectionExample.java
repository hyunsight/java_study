package ch12.sec11.exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {

        Class clazz = Car.class;

        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");

            //생성자에 사용된 모든 파마리터를 가져옴
            Class[] parameters = constructor.getParameterTypes(); //배열타입인 경우, 여러개를 가져온다는 의미
            printParameters(parameters);
            System.out.println(")");
        }

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName()); //필드의 타입과 이름 출력
        }

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName() + "(");
            Class[] parameters = method.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
    }

    private static void printParameters(Class[] parameters) { //parameters: 매개변수 의미 (즉, 생성자 매개변수에 해당), 생성자 매개변수를 위한 메소드
        for (int i = 0; i < parameters.length; i++) {
            System.out.print(parameters[i].getName());

            //파라미터가 2개 이상일 때 콤마를 찍어줌
            if (i < (parameters.length - 1)) {
                System.out.print(",");
            }
        }
    }
}
