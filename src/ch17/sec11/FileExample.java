package ch17.sec11;

import java.io.File;

public class FileExample {

    public static void main(String[] args) throws Exception {
        //file 객체 생성
        File dir = new File("/Users/hyunmac/Desktop/Project/Temp/images"); //폴더 생성
        File file1 = new File("/Users/hyunmac/Desktop/Project/Temp/file1.txt");
        File file2 = new File("/Users/hyunmac/Desktop/Project/Temp/file2.txt");
        File file3 = new File("/Users/hyunmac/Desktop/Project/Temp/file3.txt");

        //존재하지 않으면 디렉토리, 파일 생성
        if(dir.exists() == false) dir.mkdirs(); //mkdir: make-directory 약자
        if(file1.exists() == false) file1.createNewFile();
        if(file2.exists() == false) file2.createNewFile();
        if(file3.exists() == false) file3.createNewFile();

        //Temp 폴더의 내용을 출력
        File temp = new File("/Users/hyunmac/Desktop/Project/Temp");
        File[] content = temp.listFiles(); //해당 디렉토리에 있는 모든 폴더와 파일을 읽어옴

        for (File file : content) {
            if (file.isDirectory()) { //폴더라면 (폴더명만 출력)
                System.out.println(file.getName() + " ");
            } else { //파일이라면
                System.out.println(file.length() + " " + file.getName());
            }

        }
    }
}
