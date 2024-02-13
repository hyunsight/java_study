package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        //자동차 속도 출력하는 기능
        // - 세가지의 기능 존재 1. 증속, 2. 감속, 3. 중지 -> 스캐너를 이용해 입력받음

        Scanner scanner = new Scanner(System.in);
        boolean run = true; //현재 자동차가 달리는 중인지 상태값
        int speed = 0; //현재 속도

        //무한반복 -> 현재 run이 true이므로
        while (run) {
            //메뉴 생성
            System.out.println("------------------");
            System.out.println("1. 종속 | 2. 감속 | 3. 중지");
            System.out.println("------------------");

            //스캐너로 값을 입력받음
            // - 라인 이동 단축키: alt + shift + 방향키
            System.out.print("선택: ");
            String strNum = scanner.nextLine(); //입력받은 값을 저장
            
            if(strNum.equals("1")) { //(중요) String 타입은 값을 비교할 때 '='아닌 'equals'를 사용
                //1. 증속: speed를 올림
                speed++;
                System.out.println("현재속도 = " + speed);
            } else if (strNum.equals("2")) {
                //2. 감속: speed를 내림
                speed--;
                System.out.println("현재속도 = " + speed);
            } else {
                //3. 중지: 프로그램 종료시킴 -> run이 false일 때
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
