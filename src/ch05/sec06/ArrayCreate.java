package ch05.sec06;

public class ArrayCreate {
    public static void main(String[] args) {
        //배열의 선언 (첫번째 방법): 두번째 방법보다 더 많이 사용한다.
        // - 배열 선언과 동시에 값 할당
        int[] intArray = {1, 2, 3};
        // - 값 할당 두번째 방법
        double[] doubleArray = new double[] {0.1, 0.2, 3, 4};
        //String[] season = {"봄", "여름", "가을", "겨울"};

        //데이터 5개를 저장할 수 있는 배열을 선언 (단, 값을 할당하지 X)
        int[] intArray3 = new int[5];
        
        
        //배열의 선언 (두번째 방법)
        int intArray2[] = {1, 2, 3};
        double doubleArray2[] = {0.1, 0.2, 3, 4};
        String season2[] = {"봄", "여름", "가을", "겨울"};

        //배열 타입과 일치하게 데이터 넣어줘야함
        //String[] season = {1, "여름", "가을", "겨울"}; //에러 출력

        String[] season = {"봄", "여름", "가을", "겨울"};

        //배열의 값 읽기
        System.out.println(season[0]);
        System.out.println(season[1]);
        System.out.println(season[2]);
        System.out.println(season[3]);

        //배열의 값 수정
        season[1] = "summer";
        System.out.println("바꾼 값: " + season[1]);
        
        int[] scores = {83, 90, 87};
        
        //총합, 평균 구하기
        int sum = 0;
        
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; //합계
            double avg = (double) sum / scores.length; //정수 나누기 정수는 정수이므로 정확한 소수점을 구하기 위해 하나는 double 타입으로 변경 필요
            System.out.println("총합: " + sum + "평균: " + avg);

            //배열 선언 후 값 할당 하는 법
            String a;
            a = "dd";

            String[] season3;
            season3 = new String[] {"봄", "여름"};

            int[] arr;
            arr = new int[] {1, 3};
            
        }
    }
}