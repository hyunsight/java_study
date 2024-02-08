package ch03.sec09;

public class BitShift {
    public static void main(String[] args) {
        int result = 1 << 3;
        System.out.println("result: " + result);

        int result2 = -8 >> 3;
        System.out.println("result2: " + result2);

        int result3 = -8 >>> 3;
        System.out.println("result3: " + result3);
    }
}
