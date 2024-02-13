package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        //scanner를 이용해 q를 입력받으면 프로그램 종료를 시킴
        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print("입력: ");
            inputString = scanner.nextLine(); //값 입력받음
            System.out.println(inputString); //입력받은 값 출력
        } while (!inputString.equals("q")); //inputString이 "q"가 아니라면
        
        System.out.println("프로그램 종료");
    }
}
