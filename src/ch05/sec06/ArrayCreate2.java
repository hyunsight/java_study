package ch05.sec06;

public class ArrayCreate2 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
        }

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        //arr1[3] = 30; //Index 3 out of bounds for length 3 에러 출력: 한번 배열 데이터 수를 지정한 이후에는(한번 생성된 배열은) 추가 변경할 수 없음

        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("----------------------------");

        double[] arr2 = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println(arr2[i]);
        }

        String[] arr3 = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println(arr3[i]);
        }
    }
}
