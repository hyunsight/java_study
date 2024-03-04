package ch12.sec05;

import java.util.Arrays;

public class ByteToStringExample {
    public static void main(String[] args) {
        String data = "자바";

        //string => byte 배열(utf-8 로 인코딩)
        byte[] arr1 = data.getBytes();
        System.out.println("arr1: " + Arrays.toString(arr1));

        //byte 배열 => string : 네트워크 전송할때 좋음
        String str1 = new String(arr1);
        System.out.println("str1: " + str1 );
    }
}
