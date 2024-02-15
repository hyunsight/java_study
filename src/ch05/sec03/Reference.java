package ch05.sec03;

public class Reference {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = arr2; //'메모리의 (저장된) 값'을 복사한다 = '주소'를 복사한다 (참조 타입의 경우) = '얕은 복사'. 단, 기본 타입의 경우, '데이터' 자체를 저장하고 있으므로 '데이터'를 복사한다.

        System.out.println(arr1); //자바에서는 배열 프린트할 시, 배열의 주소가 출력됨
        System.out.println(arr2);
        System.out.println(arr3);

        //참조 타입은 항상 주소를 비교한다.
        System.out.println(arr1 == arr2); //false
        System.out.println(arr2 == arr3); //true
    }
}
