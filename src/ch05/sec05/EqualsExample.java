package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        //문자열 객체 (김대호라는 데이터를 가지고 있는 객체)
        String strVar1 = "김대호"; //주소: x01
        String strVar2 = "김대호"; //주소: x01
        String strVar3 = new String("김대호"); //new: 객체 생성, 주소: x02
        String strVar4 = new String("김대호"); //주소: x03

        System.out.println(strVar1);
        System.out.println(strVar3);

        //데이터가 아닌 객체 비교 -> 객체를 비교하는 것은 주소를 비교하는 것이다.
        // - (중요) 변수는 다르지만 스트링에서 값(= 데이터 = 문자열)이 동일할 경우, 주소가 같다. (효율을 위해 주소를 공유한다.)
        // - (중요) 단, 'new String'으로 객체 생성 시, 각각 다른 주소(각각 다른 객체)를 생성한다.
        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2의 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2의 참조가 다름");
        }

        // - (중요) 주소가 아닌 객체 데이터(문자열) 자체 비교를 위해서는 'equals'를 사용한다.
        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2의 문자열이 같음");
        } else {
            System.out.println("strVar1과 strVar2의 문자열이 다름");
        }

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4의 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4의 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4의 문자열이 같음");
        } else {
            System.out.println("strVar3과 strVar4의 문자열이 다름");
        }

        if (strVar1 == strVar3) {
            System.out.println("strVar1과 strVar3의 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar3의 참조가 다름");
        }

        if(strVar1.equals(strVar3)) {
            System.out.println("strVar1과 strVar3의 문자열이 같음");
        } else {
            System.out.println("strVar1과 strVar3의 문자열이 다름");
        }
    }
}