package ch17.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {

    //1. 바이트로 읽는 방법
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/hyunmac/Desktop/Project/Temp/test1.db");

            while (true) {
                int data = is.read(); //1byte씩 읽어온다.

                if(data == -1) break; //파일 끝에 도달하면 while문 빠져나감

                System.out.println(data); //읽은 데이터 출력
            }

            is.close(); //입력스트림을 닫는다. (메모리 해제)

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
