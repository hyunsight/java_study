package ch02.sec09;

public class OperatorExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20; //컴파일 단계에서 연산을 수행하므로 byte result1 = 30; 와 같다.
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        //byte result2 = v1 + v2; //자바에서는 연산자를 쓸 때 자동 타입 변환을 시킴 -> 따라서 v1을 int 타입으로 변환하고, v2를 int타입으로 변환시키기때문에 byte로 쓸 시 에러 출력됨
        int result2 = v1 + v2; //해결방안 1 int 타입으로 변환 후 연산됨 -> int타입으로 바꿈
        byte result3 = (byte) (v1 + v2); //해결방안 2 강제 타입 변환하여 연산 -> 강제 타입 변환을 시킴 (단, 데이터 소실될 수 있으므로 주의)
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        //int result4 = v3 + v4 + v5; //값의 허용범위가 가장 큰 값에 우선적으로 끌려가기 때문에 이경우 에러 출력됨
        long result4 = v3 + v4 + v5; //long 타입으로 변환 후 연산됨 -> (중요) 값의 허용 범위가 큰 타입으로 변환됨 (즉, byte, int, long 중 long이 가장 크므로 long이 최우선적)
        System.out.println("result4: " + result4);

        float f1 = 1.2f;
        double d1 = 3.4;
        //float result5 = f1 + d1; //double이 더 크므로 에러 출력
        double result5 = f1 + d1; //double 타입으로 변환 후 연산됨 -> 실수끼리 연산도 허용범위가 큰 타입으로 변환

        System.out.println("result5: " + result5);

        //실수, 정수
        int v9 = 10;
        //자바에서는 실수 리터럴(값 자체)을 double타입으로 인식하므로 4.0은 double타입
        //float result6 = v9 / 4.0f; //float 타입(실수)으로 변환 후 연산됨 4.0만 쓸 경우,  연산 시  double로 변환되므로 에러 출력
        double result6 = v9 / 4.0; //double 타입(실수)으로 변환 후 연산됨
        System.out.println("result6: " + result6);

        //char와 int의 연산
        char v6 = 'A'; //유니코드를 정수형으로 변환했을 때 '65'
        char v7 = 1;
        int result8 = v6 + v7; //int타입으로 변환 후 연산됨
        System.out.println("result8: " + result8);
        System.out.println("result8: " + (char)result8);

        int x = 1;
        int y = 2;
        //(중요) 정수 연산의 결과는 항상 정수 -> 결과값인 0.5에서 소수점을 버린다.
        // - (psh) int 타입(정수 타입)상태에서 먼저 연산하므로 정수값이 됨
        // - 해결방안으로는 둘 중 하나만 실수이어도 실수로 연산되므로 하나를 바꿔주면 됨
        double result = x / y; //0을 double타입 변수에 저장하므로 0.0이 출력된다
        System.out.println("result:" + result);

        //0.5를 얻기 위한 방법 1: x를 실수로, double 타입으로 바꾸는 방법
        /*
        double result9 = (double) x / y;
        System.out.println("result9:" + result9);
        */
        //0.5를 얻기 위한 방법 2: y를 실수로, double 타입으로 바꾸는 방법
        /*
        double result9 = x / (double) y;
        System.out.println("result9:" + result9);
         */
        //0.5를 얻기 위한 방법 2: x 및 y를 실수로, double 타입으로 바꾸는 방법
        /*
        double result9 = (double) x / (double) y;
        System.out.println("result9:" + result9);
        */

        double result9 = (double) (x / y); //정수끼리 먼저 연산하므로 0에서 double로 타입 변환된 후 결과값으로 들어감 -> 따라서 결과값 0.0이 됨
        System.out.println("result9:" + result9);
    }
}
