package ch05.sec09;

public class ArrayCopy2 {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];
        
        //System.arraycopy(원본배열, 원본배열 인덱스(어디서부터 복사를 할건지), 새배열, 새배열 인덱스(어디서부터 붙여넣을지), 복사할 배열의 개수);
        System.arraycopy(oldStrArray, 0, newStrArray, 0, 3);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.println(newStrArray[i]);
        }
    }
}
