package ch02.sec13;

import java.util.Scanner; //이게 있어야 Scanner 사용 가능

public class ScannerExample {
    public static void main(String[] args) {
        //1. Scanner 객체 생성
        //   - java에서 객체 생성 시에는 new라는 키워드를 사용해 객체 생성
        //   - 참조타입 변수명 = new 객체
        //   - Scanner 타입(참조타입)의 객체를 생성하겠다는 의미 (Scanner(타입) 변수 = 객체)
        //   - (참조) 타입과 객체명이 동일
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력:");
        //2. scanner에서 값 입력받기
        String strX = scanner.nextLine();
        //System.out.println("내가 입력한 x값:" + strX);

        System.out.print("y값 입력:");
        String strY = scanner.nextLine();

        int result = Integer.parseInt(strX) + Integer.parseInt(strY);
        System.out.println("X + Y =" + result);

        //계속 입력을 받을 수 있게 만들고 q를 입력했을 때 프로그램이 끝나도록 만들기
        //   - 즉, q를 입력했을 때 프로그램이 끝나도록 만들기
        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();

            // data에 입력된 값이 q인가?
            //   - 참고로 string 비교할 때, 그냥 'data == q'를 쓰면 안 됨 (이유는 객체 수업 시)
            if (data.equals("q")) {
                break; //while문 중단
            }
            System.out.println("출력 문자열: " + data);
        }
        //while문 탈출 후 찍는 문자
        System.out.println("프로그램 종료");
    }
}