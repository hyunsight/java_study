package ch17.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/hyunmac/Desktop/Project/Temp/test2.db");

            //배열 이용
            byte[] array = {10, 20, 30, 40, 50};

            //범위로 전송 가능
            os.write(array, 1, 3); //20, 30, 40만 전달

            os.flush();

            os.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
