package ch03.sec01;

public class IncDecOperExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        //값 자체는 전위, 후위든 증가와 감소를 한다.
        x++; //후위, 전위 모두 x자체는 1증가하도록 하므로 값 +1 됨
        System.out.println("x=" + x);
        ++x; //후위, 전위 모두 x자체는 1증가하도록 하므로 값 +1 됨
        System.out.println("x=" + x);

        y--;
        System.out.println("y=" + y);
        --y;
        System.out.println("y=" + y);

        System.out.println("=============================");

        //선대입 후증가 (z에 x값을 먼저 대입 후 x값을 증가시킨다)
        //후위연산자 변수에 대입할 때 주의
        z = x++;
        System.out.println("z=" + z); //12
        System.out.println("x=" + x); //13

        z = ++x;
        System.out.println("z=" + z); //14
        System.out.println("x=" + x); //14

        z = ++x + y++;

        System.out.println("z=" + z); //23
        System.out.println("x=" + x); //15
        System.out.println("y=" + y); //9

    }
}
