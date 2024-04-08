package ch17.sec06;

import java.io.*;

public class CharacterConvertStreamExample {

    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다.");
        String result = read();
        System.out.println(result);
    }

    public static void write(String str) throws Exception {
        //출력 스트림 생성
        OutputStream os = new FileOutputStream("/Users/hyunmac/Desktop/Project/Temp/test1.txt");

        //보조 스트림 생성
        Writer writer = new OutputStreamWriter(os, "UTF-8");

        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception {
        //입력 스트림
        InputStream is = new FileInputStream("/Users/hyunmac/Desktop/Project/Temp/test1.txt");

        //보조 스트림
        //- [참조] 보조 스트림을 쓸 때 while문을 별도로 작성하지 않아도 됨 (알아서 해줌)
        Reader reader = new InputStreamReader(is, "UTF-8");

        char[] data = new char[100]; //100개씩 문자열을 읽음
        int num = reader.read(data);
        reader.close();

        String str = new String(data, 0, num);

        return str; //텍스트 파일에서 읽어온 데이터를 리턴
    }

}
