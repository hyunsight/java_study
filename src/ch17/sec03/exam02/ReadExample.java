package ch17.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {

    //2. 배열로 읽는 방법
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/hyunmac/Desktop/Project/Temp/test2.db");

            byte[] data = new byte[3]; //3byte씩 읽어오도록 지정
            //byte[] data = new byte[100];

            while (true) {
                int num = is.read(data); //데이터를 3byte씩 배열 형태로 읽어옴
                System.out.println("num = " + num); //num은 읽은 수치 (3byte)

                if(num == -1) break; //파일 끝에 도달 시 while문 빠져나감

                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }

            is.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
