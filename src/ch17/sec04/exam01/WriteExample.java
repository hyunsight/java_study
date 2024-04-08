package ch17.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("/Users/hyunmac/Desktop/Project/Temp/test.txt");

            //한 문자씩 출력
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            //char 배열을 이용해 여러개의 문자열을 한꺼번에 출력
            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            //String 타입을 이용해 문자열 출력
            writer.write("FGH");

            //버퍼에 잔류하는 문자들을 출력하고 버퍼를 비움
            writer.flush();

            //출력 스트림 닫아 메모리 해제
            writer.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
