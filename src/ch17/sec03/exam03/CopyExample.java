package ch17.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

    //이미지 파일 복사
    public static void main(String[] args) {
        try {
            String originFileName = "/Users/hyunmac/Desktop/Project/Temp/test.jpg"; //원본파일
            String targetFileName = "/Users/hyunmac/Desktop/Project/Temp/test2.jpg"; //복사파일

            //입력 스트림을 이용해서 원본 파일 읽음
            InputStream is = new FileInputStream(originFileName);

            //출력 스트림을 이용해서 복사 파일을 출력
            OutputStream os = new FileOutputStream(targetFileName);

            byte[] data = new byte[1024]; //1024 바이트씩 읽어오도록 지정

            while (true) {
                int num = is.read(data);
                System.out.println("num = " + num); //이미지 파일 크기가 1024 넘으면 num이 계속 찍힘
                
                if(num == -1) break;

                os.write(data, 0, num); //읽은 바이트 수만큼 출력
            }

            os.flush();
            os.close();
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
